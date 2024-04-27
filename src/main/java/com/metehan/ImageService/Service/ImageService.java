package com.metehan.ImageService.Service;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.command.PushImageCmd;
import com.github.dockerjava.core.DockerClientBuilder;
import com.metehan.ImageService.Entity.Image;
import com.metehan.ImageService.Repository.ImageCrudRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.time.LocalDateTime;


@Service
@RequiredArgsConstructor
public class ImageService {

    private final ImageCrudRepository  imageCrudRepository;
    public void pushImage(String imageName, String tag, MultipartFile imageFile) {

        //todo check if image already exist
        //todo check if current user authorized to access and make change in the repository

        Image newImage = Image.builder()
                .tag(tag)
                .name(imageName)
                .creationTimestamp(LocalDateTime.now())
                .build();

        imageCrudRepository.save(newImage);


        try{

            DockerClient dockerClient = DockerClientBuilder.getInstance().build();

            InputStream imageDataStream = imageFile.getInputStream();
            String result = dockerRegistryService.pushImage(imageDataStream);
        }catch (Exception ex){
            System.out.println("hello wrold");
        }

        // Push image data to Docker registry

        PushImageCmd pushImageCmd = dockerClient.pushImageCmd(imageName)
                .withTag(tag)
                .withAuthConfig(dockerClient.authConfig())
                .withImageStream(imageFile.getInputStream());



    }
}

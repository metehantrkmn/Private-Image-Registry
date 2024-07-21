package com.metehan.ImageService.Service;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.command.InspectImageResponse;
import com.github.dockerjava.core.DefaultDockerClientConfig;
import com.github.dockerjava.core.DockerClientBuilder;
import com.metehan.ImageService.Entity.ImageMetaData;
import com.metehan.ImageService.Entity.User;
import com.metehan.ImageService.Exception.NoSuchUserExists;
import com.metehan.ImageService.Repository.ImageCrudRepository;
import com.metehan.ImageService.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.util.List;

import com.github.dockerjava.api.model.Image;


@Service
@RequiredArgsConstructor
public class MyImageService {

    private final ImageCrudRepository  imageCrudRepository;
    private final UserRepository userRepository;
//
//    public void pushImage(String imageName, String tag, MultipartFile imageFile) {
//
//        //todo check if image already exist
//        //todo check if current user authorized to access and make change in the repository
//
//        ImageMetaData newImage = ImageMetaData.builder()
//                .tag(tag)
//                .creationTimestamp(LocalDateTime.now())
//                .build();
//
//        imageCrudRepository.save(newImage);
//
//    }
//
//    public ResponseEntity extractMetadata(byte[] imageData) {
//        try {
//            // Create Docker client
//            DockerClient dockerClient = createDockerClient();
//
//            // Load image into Docker client and get image ID
//            String imageId = loadImage(dockerClient, imageData);
//
//            // Inspect image to retrieve metadata
//            InspectImageResponse inspectImageResponse = inspectImage(dockerClient, imageId);
//
//            // Extract metadata from inspect response
//            List<String> repoTags = inspectImageResponse.getRepoTags();
//            if (!repoTags.isEmpty()) {
//
//                // Extract username, repository name, and tag from the first repo tag
//                String repoTag = repoTags.get(0);
//                String[] parts = repoTag.split("/");
//                String username = parts[0];
//                String repoNameWithTag = parts[1];
//                String[] repoNameAndTag = repoNameWithTag.split(":");
//                String repoName = repoNameAndTag[0];
//                String tag = repoNameAndTag[1];
//
//
//
//            } else {
//                // Handle case where no repo tags are found
//                return null;
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
//
//    private DockerClient createDockerClient() {
//        DefaultDockerClientConfig config = DefaultDockerClientConfig.createDefaultConfigBuilder().build();
//        return DockerClientBuilder.getInstance(config).build();
//    }
//
//    private String loadImage(DockerClient dockerClient, byte[] imageData) {
//        try (InputStream imageInputStream = new ByteArrayInputStream(imageData)) {
//            dockerClient.loadImageCmd(imageInputStream).exec();
//
//            // After loading the image, inspect it to get its ID
//            List<Image> images = dockerClient.listImagesCmd().exec();
//            if (!images.isEmpty()) {
//                // Assuming the loaded image is the first one in the list
//                return images.get(0).getId();
//            } else {
//                // Handle case where no images are found
//                return null;
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
//
//    private InspectImageResponse inspectImage(DockerClient dockerClient, String imageId) {
//        return dockerClient.inspectImageCmd(imageId).exec();
//    }

}

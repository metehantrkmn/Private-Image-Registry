package com.metehan.ImageService.Service;


import com.github.dockerjava.core.DefaultDockerClientConfig;
import com.github.dockerjava.core.DockerClientConfig;
import com.github.dockerjava.transport.DockerHttpClient;
import com.metehan.ImageService.Configuration.DockerClientConfiguration;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DockerClientService {


    private final DefaultDockerClientConfig defaultDockerClientConfig;
    private final DockerHttpClient dockerHttpClient;

}

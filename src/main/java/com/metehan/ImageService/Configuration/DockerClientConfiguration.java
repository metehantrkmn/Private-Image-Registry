package com.metehan.ImageService.Configuration;

import com.github.dockerjava.core.DefaultDockerClientConfig;
import com.github.dockerjava.core.DockerClientConfig;
import com.github.dockerjava.httpclient5.ApacheDockerHttpClient;
import com.github.dockerjava.transport.DockerHttpClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;

@Configuration
public class DockerClientConfiguration {

    @Value("${docker.client.host}")
    private String dockerHost;

    @Value("${docker.client.tls-verify}")
    private boolean tlsVerify;

    @Value("${docker.client.cert-path}")
    private String certPath;

    @Value("${docker.client.registry-username}")
    private String registryUsername;

    @Value("${docker.client.registry-password}")
    private String registryPassword;

    @Value("${docker.client.registry-email}")
    private String registryEmail;

    @Bean
    public DockerClientConfig dockerClientConfig() {
        return DefaultDockerClientConfig.createDefaultConfigBuilder()
                .withDockerHost(dockerHost)
                .withDockerTlsVerify(tlsVerify)
                .withDockerCertPath(certPath)
                .withRegistryUsername(registryUsername)
                .withRegistryPassword(registryPassword)
                .withRegistryEmail(registryEmail)
                .build();
    }

    @Bean
    public DockerHttpClient dockerHttpClient(){
        return new ApacheDockerHttpClient.Builder()
                .dockerHost(dockerClientConfig().getDockerHost())
                .sslConfig(dockerClientConfig().getSSLConfig())
                .maxConnections(100)
                .connectionTimeout(Duration.ofSeconds(30))
                .responseTimeout(Duration.ofSeconds(45))
                .build();
    }
}

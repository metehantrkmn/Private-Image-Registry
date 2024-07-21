package com.metehan.ImageService.Service;

import org.springframework.stereotype.Service;

@Service
public class MetadataService {

    public String extractRepository(String requestURI) {
        // Extracts the repository name from the request URI
        // Assuming the request URI is something like /v2/repositoryname/tags/list
        String[] parts = requestURI.split("/");
        if (parts.length > 2) {
            return parts[2];
        }
        return null;
    }

    public String extractTag(String requestURI) {
        // Extracts the tag from the request URI
        // Assuming the request URI contains the tag
        // Note: Docker API does not always provide tag in URL, may need custom extraction logic
        String[] parts = requestURI.split(":");
        if (parts.length > 1) {
            return parts[1];
        }
        return "latest"; // Default to "latest" if no tag is specified
    }

    public void logRepositoryAndTag(String repository, String tag) {
        // Log the repository and tag information
        System.out.println("Repository: " + repository + ", Tag: " + tag);
    }

}

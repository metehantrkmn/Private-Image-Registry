package com.metehan.ImageService.Controller.Request;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Data
public class PushImageRequest {

    private String imageName;
    private String tag;
    private MultipartFile dockerFile;

}

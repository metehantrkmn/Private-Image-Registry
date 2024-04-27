package com.metehan.ImageService.Controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ImageController {


    @PostMapping("v1/images/push")
    public ResponseEntity handleImagePush(){

        return ResponseEntity.ok().body("ok");
    }

}

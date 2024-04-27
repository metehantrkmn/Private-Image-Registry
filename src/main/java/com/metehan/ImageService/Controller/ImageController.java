package com.metehan.ImageService.Controller;


import com.metehan.ImageService.Controller.Request.PushImageRequest;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class ImageController {


    @PostMapping("v1/image/push")
    public ResponseEntity handleImagePush(@RequestBody PushImageRequest request){

        return ResponseEntity.ok().body("ok");
    }

    @GetMapping("/v1/image/pull")
    public ResponseEntity handleImagePull(){

        return ResponseEntity.ok().body("ok");
    }

    @DeleteMapping("/v1/image/delete")
    public ResponseEntity deleteImage(){
        return ResponseEntity.ok().body("ok");
    }

    @GetMapping("/v1/image/list")
    public ResponseEntity getImages(){

        return ResponseEntity.ok().body("ok");
    }

    @GetMapping("/v1/image/inspect")
    public ResponseEntity InspectImage(){

        return ResponseEntity.ok().body("ok");
    }

    @PostMapping("/v1/image/promote")
    public ResponseEntity promoteImagesBetween(){
        return ResponseEntity.ok().body("ok");
    }

}

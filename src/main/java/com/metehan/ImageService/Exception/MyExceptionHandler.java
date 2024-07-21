package com.metehan.ImageService.Exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(value = {NoSuchUserExists.class})
    public ResponseEntity handleNoSuchUser(Exception ex){
        return ResponseEntity.badRequest().body(ex.getMessage());
    }

}

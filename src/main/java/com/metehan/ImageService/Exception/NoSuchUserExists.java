package com.metehan.ImageService.Exception;

public class NoSuchUserExists extends RuntimeException{

    public NoSuchUserExists(String message) {
        super(message);
    }

    public NoSuchUserExists(String message, Throwable cause) {
        super(message, cause);
    }
}

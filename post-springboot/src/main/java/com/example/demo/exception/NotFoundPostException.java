package com.example.demo.exception;

public class NotFoundPostException extends RuntimeException {

    public NotFoundPostException(String err){
        super(err);
    }
}

package com.example.demo.exception;

public class DuplicatedPostException extends RuntimeException {

    public DuplicatedPostException(String err){
        super(err);
    }
}

package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorApi {
    private int status;
    private String error;
    private String detail;
}

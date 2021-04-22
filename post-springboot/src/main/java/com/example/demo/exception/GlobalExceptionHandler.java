package com.example.demo.exception;

import com.example.demo.dto.ErrorApi;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(NotFoundPostException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public ErrorApi handleNotFoundPostException(NotFoundPostException exp){
        ErrorApi errorApi = new ErrorApi();
        errorApi.setStatus(HttpStatus.NOT_FOUND.value());
        errorApi.setError("Not Found Post Exception");
        errorApi.setDetail(exp.getMessage());

        return errorApi;
    }

    @ExceptionHandler(DuplicatedPostException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ErrorApi handleDuplicatedPostException(DuplicatedPostException exp){
        ErrorApi errorApi = new ErrorApi();
        errorApi.setStatus(HttpStatus.BAD_REQUEST.value());
        errorApi.setError("Duplicated Post Exception");
        errorApi.setDetail(exp.getMessage());

        return errorApi;
    }

}

package com.example.demo.exception;

import com.example.demo.dto.ErrorApi;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
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

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ErrorApi handleInvalidArgumentException(MethodArgumentNotValidException exp){
        ErrorApi errorApi = new ErrorApi();
        errorApi.setStatus(HttpStatus.BAD_REQUEST.value());
        errorApi.setError("Binding request issue");

        BindingResult bindingResult = exp.getBindingResult();

        String errorMsg = "";
        for (FieldError fieldError : bindingResult.getFieldErrors()){
            errorMsg += fieldError.getDefaultMessage();
        }

        errorApi.setDetail(errorMsg);

        return errorApi;
    }


    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ErrorApi handleAllException(Exception exp){
        ErrorApi errorApi = new ErrorApi();
        errorApi.setStatus(HttpStatus.BAD_REQUEST.value());
        errorApi.setError("Something wrong");
        errorApi.setDetail(exp.getMessage());

        return errorApi;
    }

}

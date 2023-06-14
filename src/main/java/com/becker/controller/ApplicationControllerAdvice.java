package com.becker.controller;

import com.becker.exception.RecordNotFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApplicationControllerAdvice {

    @ExceptionHandler(RecordNotFoundException.class)
    public String handleNotFoundException(RecordNotFoundException ex){

        return ex.getMessage();
    }
}

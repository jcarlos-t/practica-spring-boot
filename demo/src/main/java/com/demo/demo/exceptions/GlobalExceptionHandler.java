package com.demo.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RestaInvalidaException.class)
    public ResponseEntity<String> handleRestaInvalida(RestaInvalidaException ex) {
        return new ResponseEntity<>("Error 400: " + ex.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
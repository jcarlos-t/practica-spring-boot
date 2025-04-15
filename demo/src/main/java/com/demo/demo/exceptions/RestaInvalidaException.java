package com.demo.demo.exceptions;

public class RestaInvalidaException extends RuntimeException {
    public RestaInvalidaException(String mensaje) {
        super(mensaje);
    }
}
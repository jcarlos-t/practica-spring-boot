package com.demo.demo.service;

import com.demo.demo.exceptions.RestaInvalidaException;
import org.springframework.stereotype.Service;

@Service
public class RestaService {
    public int restar(int a, int b) {
        if (a == b) {
            throw new RestaInvalidaException("‘a’ no puede ser igual a ‘b’");
        }
        if (a < b) {
            throw new RestaInvalidaException("‘a’ no puede ser menor que ‘b’");
        }
        return a - b;
    }
}

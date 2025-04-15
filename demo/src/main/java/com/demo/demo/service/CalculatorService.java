package com.demo.demo.service;

import com.demo.demo.controller.CalculatorControler;
import com.demo.demo.domain.repository.CalculatorRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CalculatorService {
    public Double divide (Long a, Long b) {
        if(a==null || b==null){
            throw new IllegalArgumentException("a y b no pueden ser nulos");

        }
        if(b==0){
            throw new ArithmeticException("Division by zero no permitida");
        }
        return a / (double) b;
    }

    public Double resta(Long a, Long b) {
        if(a==b){
            throw new IllegalArgumentException("a y b no pueden ser iguales");
        }
        if(a<b){
            throw new ArithmeticException("a no puede ser menor que b");
        }
        return (double) (a-b);
    }
}

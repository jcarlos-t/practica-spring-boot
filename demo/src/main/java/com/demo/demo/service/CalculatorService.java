package com.demo.demo.service;

import com.demo.demo.controller.CalculatorControler;
import com.demo.demo.domain.repository.CalculatorRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CalculatorService {
    @Autowired
    private CalculatorRepository repository;

    public Double divide(Long a, Long b) {
        return (double) (a/b);
    }
}

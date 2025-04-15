package com.demo.demo.controller;


import com.demo.demo.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorControler {

    @Autowired
    private CalculatorService service;

    @GetMapping("/divide/{a}/{b}")
    public Double divide(@PathVariable Long a, @PathVariable Long b) {
        return service.divide(a, b);
    }
}

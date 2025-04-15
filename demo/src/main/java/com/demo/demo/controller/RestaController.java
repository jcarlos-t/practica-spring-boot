package com.demo.demo.controller;

import com.demo.demo.service.RestaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/resta")
public class RestaController {

    private final RestaService restaService;

    public RestaController(RestaService restaService) {
        this.restaService = restaService;
    }

    @GetMapping("/{a}/{b}")
    public ResponseEntity<Integer> restar(@PathVariable int a, @PathVariable int b) {
        int resultado = restaService.restar(a, b);
        return ResponseEntity.ok(resultado);
    }
}

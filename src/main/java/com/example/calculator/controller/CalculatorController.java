package com.example.calculator.controller;

import com.example.calculator.service.CalculatorService;
import com.example.calculator.service.IllegalNumberException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @ExceptionHandler(value = IllegalNumberException.class)
    public ResponseEntity<String> illegalNumberHandler(IllegalNumberException e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }

    @GetMapping("/calculator")
    public String calculator() {
        String result = calculatorService.calculator();
        return String.format(result);
    }

    @GetMapping("/plus")
    public String plus(@RequestParam("n1") int n1, @RequestParam("n2") int n2) {
        int result = calculatorService.plus(n1, n2);
        return String.format(n1 + " + " + n2 + " = " + result);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam("n1") int n1, @RequestParam("n2") int n2) {
        int result = calculatorService.minus(n1, n2);
        return String.format(n1 + " - " + n2 + " = " + result);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam("n1") int n1, @RequestParam("n2") int n2) {
        int result = calculatorService.multiply(n1, n2);
        return String.format(n1 + " * " + n2 + " = " + result);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam("n1") int n1, @RequestParam("n2") int n2) {
        int result = calculatorService.divide(n1, n2);
        return String.format(n1 + " / " + n2 + " = " + result);
    }
}


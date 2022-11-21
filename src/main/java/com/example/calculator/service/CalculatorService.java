package com.example.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String calculator() {
        return new String("Добро пожаловать в калькулятор!");
    }

    public int plus(int n1, int n2) {
        return n1 + n2;
    }

    public int minus(int n1, int n2) {
        return n1 - n2;
    }

    public int multiply(int n1, int n2) {
        return n1 * n2;
    }

    public int divide(int n1, int n2) {
        if (n2 == 0) {
            throw new IllegalNumberException("Can't divide by zero");
        }
        return n1 / n2;
    }


}

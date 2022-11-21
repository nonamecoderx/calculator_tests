package com.example.calculator;

import com.example.calculator.service.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTests {
    private final CalculatorService calculatorService = new CalculatorService();

    @Test

    public void testPlus() {
        int n1 = 13;
        int n2 = 14;
        int result = 27;
        Assertions.assertEquals(result,calculatorService.plus(n1,n2));
    }
    @Test
    public void testMinus() {
        int n1 = 5;
        int n2 = 4;
        int result = 1;
        Assertions.assertEquals(result,calculatorService.minus(n1,n2));
    }
    @Test
    public void testMultiply() {
        int n1 = 5;
        int n2 = 6;
        int result = 30;
        Assertions.assertEquals(result,calculatorService.multiply(n1,n2));
    }
    @Test
    public void testDivide() {
        int n1 = 10;
        int n2 = 2;
        int result = 5;
        Assertions.assertEquals(result,calculatorService.divide(n1,n2));
    }
    @Test
    public void testDivideNull() {
        int n1 = 10;
        int n2 = 0;
        int result = 0;
        Assertions.assertEquals(result,calculatorService.divide(n1,n2));
    }
}

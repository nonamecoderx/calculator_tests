package com.example.calculator;

import com.example.calculator.service.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

public class CalculatorParameterizedTests {
    private final CalculatorService calculatorService = new CalculatorService();

    @ParameterizedTest
    @MethodSource("testPlusArguments")
    public void testPlus(int n1, int n2, int  result){
        Assertions.assertEquals(result,calculatorService.plus(n1,n2));
    }
    @ParameterizedTest
    @MethodSource("testMinusArguments")
    public void testMinus(int n1, int n2, int  result){
        Assertions.assertEquals(result,calculatorService.minus(n1,n2));
    }
    @ParameterizedTest
    @MethodSource("testMultiplyArguments")
    public void testMultiply(int n1, int n2, int  result){
        Assertions.assertEquals(result,calculatorService.multiply(n1,n2));
    }
    @ParameterizedTest
    @MethodSource("testDivideArguments")
    public void testDivide(int n1, int n2, int  result){
        Assertions.assertEquals(result,calculatorService.divide(n1,n2));
    }

    public static List<Arguments> testPlusArguments(){
        return List.of(Arguments.of(5,5,10),Arguments.of(6,6,12));
    }
    public static List<Arguments> testMinusArguments(){
        return List.of(Arguments.of(5,5,0),Arguments.of(6,4,2));
    }public static List<Arguments> testMultiplyArguments(){
        return List.of(Arguments.of(5,5,25),Arguments.of(6,6,36));
    }public static List<Arguments> testDivideArguments(){
        return List.of(Arguments.of(5,5,1),Arguments.of(6,3,2));
    }
}

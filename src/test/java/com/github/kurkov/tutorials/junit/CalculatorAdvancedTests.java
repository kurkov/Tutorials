package com.github.kurkov.tutorials.junit;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Aleksey Kurkov. Created on 06.12.2016
 */
public class CalculatorAdvancedTests {

    private Calculator calculator = new Calculator();

    private int firstNumber;
    private int secondNumber;

    @Before
    public void setUp() throws Exception {
        firstNumber = 100;
        secondNumber = 200;
        calculator.setFirstNumber(firstNumber);
        calculator.setSecondNumber(secondNumber);
    }

    @Test
    public void shouldCreateCalculatorWithSetUpValues() {
        assertEquals(firstNumber, 100);
        assertEquals(secondNumber, 200);
    }

    @Test
    public void shouldReturnCorrectSum() {
        assertEquals(300, calculator.calculateSum());
    }
}
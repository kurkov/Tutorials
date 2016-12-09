package com.github.kurkov.tutorials.junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Test class for {@link Calculator}
 *
 * @author Aleksey Kurkov. Created on 06.12.2016
 * @version 1.0
 */
public class CalculatorTests {

    private Calculator calculator = new Calculator(10, 20);

    @Test
    public void shouldCreateCalculatorInstance() {
        assertNotNull(calculator);
    }

    @Test
    public void shouldReturnCorrectSum() {
        assertEquals(30, calculator.calculateSum());
    }
}
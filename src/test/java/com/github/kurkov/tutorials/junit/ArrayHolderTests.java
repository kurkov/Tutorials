package com.github.kurkov.tutorials.junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test class for {@link ArrayHolder}
 *
 * @author Aleksey Kurkov. Created on 06.12.2016
 * @version 1.0
 */
public class ArrayHolderTests {

    ArrayHolder arrayHolder = new ArrayHolder();

    @Test
    public void shouldCreateDefaultArrayTest() {
        assertEquals(arrayHolder.toString(), "[1, 2, 3, 4, 5]");
    }

}
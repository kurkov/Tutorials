package com.github.kurkov.tutorials.junit;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

import static org.junit.Assert.assertArrayEquals;

/**
 * Simple test class that demonstrates {@link Assert} in action
 *
 * @author Aleksey Kurkov. Created on 09.12.2016
 * @version 1.0
 */
public class AssertionTests {

    @Test
    public void shouldDemonstrateAssertionsTest() {
        Integer first = 1;
        Integer second = 2;
        Integer repeatFirst = 1;

        Integer[] expectedIntegerArray = {1, 2, 3, 4, 5};
        Integer[] resultIntegerArray = {1, 2, 3, 4, 5};

        assertEquals(first,repeatFirst);

        assertNotNull(second);

        assertSame(first, repeatFirst);

        assertArrayEquals(expectedIntegerArray, resultIntegerArray);
    }

}

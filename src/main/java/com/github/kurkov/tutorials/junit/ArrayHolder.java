package com.github.kurkov.tutorials.junit;

import java.util.Arrays;

/**
 * This is simple class that contains array of integers
 *
 * @author Aleksey Kurkov. Created on 06.12.2016
 * @version 1.0
 */
public class ArrayHolder {

    private int[] integers;

    public ArrayHolder() {
        this.integers = new int[]{1, 2, 3, 4, 5};
    }

    public int[] getIntegers() {
        return integers;
    }

    public void setIntegers(int[] integers) {
        this.integers = integers;
    }

    @Override
    public String toString() {
        return Arrays.toString(integers);
    }
}

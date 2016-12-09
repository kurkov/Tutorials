package com.github.kurkov.tutorials.junit;

import org.junit.*;

/**
 * Test class to demonstrate annotations in action
 *
 * @author Aleksey Kurkov. Created on 09.12.2016
 * @version 1.0
 */
public class AnnotationTests {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("This method has been executed first...");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("This method has been executed last...");
    }

    @Before
    public void before() {
        System.out.println("Before each test");
    }

    @After
    public void after() {
        System.out.println("After each test");
    }

    @Test
    public void simpleTest() {
        System.out.println("This is simple test");
    }

    @Ignore
    @Test
    public void ignoreTest() {
        System.out.println("This test will be ignored");
    }
}
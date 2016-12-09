package com.github.kurkov.tutorials.junit;

import junit.framework.TestResult;
import junit.framework.TestSuite;
import org.junit.Test;

/**
 * Demonstration of {@link TestSuite}
 *
 * @author Aleksey Kurkov. Created on 06.12.2016
 * @version 1.0
 */
public class TestSuiteDemo {

    TestSuite testSuite = new TestSuite(CalculatorTests.class, CalculatorAdvancedTests.class);
    TestResult result = new TestResult();

    @Test
    public void testSuiteInAction() {
        testSuite.run(result);
        System.out.println("Amount of test cases: " + testSuite.countTestCases());
        testSuite.setName("SimpleTestSuite");
        System.out.println("Name of Test Suite: " + testSuite.getName());
    }
}

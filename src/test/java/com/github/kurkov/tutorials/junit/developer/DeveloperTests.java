package com.github.kurkov.tutorials.junit.developer;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test class for class {@link Developer}
 *
 * @author Aleksey Kurkov. Created on 08.12.2016
 * @version 1.0
 */
public class DeveloperTests {

    Developer developer = new Developer();
    DeveloperLogic logic = new DeveloperLogic();

    @Before
    public void setUp() throws Exception {
        developer.setFirsName("Simple");
        developer.setLastName("Developer");
        developer.setSpecialty("Java");
        developer.setSalary(2000_00);
    }

    @Test
    public void shouldCreateDeveloperInstanceTest() {
        assertEquals("Simple", developer.getFirsName());
        assertEquals("Developer", developer.getLastName());
        assertEquals("Java", developer.getSpecialty());
        assertEquals(2000_00, developer.getSalary());
    }

    @Test
    public void shouldCalculateAnnualSalaryTest() {
        assertEquals(24_000_00, logic.calculateAnnualSalary(developer));
    }

    @Test
    public void shouldCalculateHourRateTest() {
        assertEquals(12_50, logic.calculateHourRate(developer));
    }
}
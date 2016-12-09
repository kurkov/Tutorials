package com.github.kurkov.tutorials.junit.developer;

/**
 * Business logic for class {@link Developer}
 *
 * @author Aleksey Kurkov. Created on 08.12.2016
 * @version 1.0
 */
public class DeveloperLogic {

    public int calculateHourRate(Developer developer) {
        return developer.getSalary() / 20 / 8;
    }

    public int calculateAnnualSalary(Developer developer) {
        return developer.getSalary() * 12;
    }
}

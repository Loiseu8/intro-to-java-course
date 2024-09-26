package com.cbfacademy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class YearTest {
    @Test
    public void testNonLeapYearDivisibleBy100() {
        Year year = new Year();
        assertFalse(year.isLeap(1700));
    }

    @Test
    public void testLeapYearDivisibleBy400() {
        Year year = new Year();
        assertTrue(year.isLeap(2000));
    }

    @Test
    public void testNonLeapYearNotDivisibleBy4() {
        Year year = new Year();
        assertFalse(year.isLeap(2001));
    }

    @Test
    public void testLeapYearDivisibleBy4ButNotBy100() {
        Year year = new Year();
        assertTrue(year.isLeap(2004));
    }
}

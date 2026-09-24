package com.example.maven_github_demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class GradedCalculator1Test {

    @Test
    void testTotal() {
        assertEquals(225, GradedCalculator1.calculateTotal(75, 68, 82));
    }

    @Test
    void testAverage() {
        assertEquals(75.0, GradedCalculator1.calculateAverage(75, 68, 82));
    }

    @Test
    void testPass() {
        assertTrue(GradedCalculator1.isPass(75.0));
    }

    @Test
    void testFail() {
        assertFalse(GradedCalculator1.isPass(35.0));
    }
}

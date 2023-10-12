package com.aleksei;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuarterOfTheYearTest {
    @Test
    public void Test() {
        assertEquals(1, QuarterOfTheYear.quarterOf(3));
        assertEquals(3, QuarterOfTheYear.quarterOf(8));
        assertEquals(4, QuarterOfTheYear.quarterOf(11));
    }

}
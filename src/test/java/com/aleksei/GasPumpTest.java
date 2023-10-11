package com.aleksei;


import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

class GasPumpTest {
    @Test
    public void testSomething1() {
        assertTrue(GasPump.zeroFuel(50, 25, 2));
    }
    @Test
    public void testSomething2() {
        assertFalse(GasPump.zeroFuel(100, 50, 1));
    }
}
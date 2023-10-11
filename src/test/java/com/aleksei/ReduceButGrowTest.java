package com.aleksei;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

class ReduceButGrowTest {
    @Test
    public void testSomething() {
        assertEquals(6, ReduceButGrow.grow(new int[]{1,2,3}));
        assertEquals(16, ReduceButGrow.grow(new int[]{4,1,1,1,4}));
        assertEquals(64, ReduceButGrow.grow(new int[]{2,2,2,2,2,2}));
    }
}
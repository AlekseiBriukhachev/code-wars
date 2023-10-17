package com.aleksei;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class OddOrEvenTest {
    @Test
    public void exampleTest1() {
        assertEquals("odd", OddOrEven.oddOrEven(new int[] {2, 5, 34, 6}));
    }
    @Test
    public void exampleTest2() {
        assertEquals("even", OddOrEven.oddOrEven(new int[] {0}));
    }
    @Test
    public void exampleTest3() {
        assertEquals("odd", OddOrEven.oddOrEven(new int[] {0, 1, 4}));
    }
    @Test
    public void exampleTest4() {
        assertEquals("even", OddOrEven.oddOrEven(new int[] {0, -1, -5}));
    }
}
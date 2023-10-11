package com.aleksei;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

class PlayingWithDigitsTest {
    @Test
    public void Test1() {
        assertEquals(1, PlayingWithDigits.digPow(89, 1));
    }
    @Test
    public void Test2() {
        assertEquals(-1, PlayingWithDigits.digPow(92, 1));
    }
    @Test
    public void Test3() {
        assertEquals(2, PlayingWithDigits.digPow(695, 2));
    }
    @Test
    public void Test4() {
        assertEquals(51, PlayingWithDigits.digPow(46288, 3));
    }
}
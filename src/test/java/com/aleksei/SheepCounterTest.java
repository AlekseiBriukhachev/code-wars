package com.aleksei;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class SheepCounterTest {
    @Test
    public void testSomething() {
        assertEquals("", SheepCounter.countingSheep(0));
        assertEquals("1 sheep...", SheepCounter.countingSheep(1));
        assertEquals("1 sheep...2 sheep...", SheepCounter.countingSheep(2));
        assertEquals("1 sheep...2 sheep...3 sheep...", SheepCounter.countingSheep(3));
    }
}
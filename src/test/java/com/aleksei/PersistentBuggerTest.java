package com.aleksei;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersistentBuggerTest {
    @Test
    public void basicTests1() {
        assertEquals(3, PersistentBugger.persistence( 39), "Incorrect answer for n=39" );
    }
    @Test
    public void basicTests2() {
        assertEquals(0, PersistentBugger.persistence(  4), "Incorrect answer for n=4"  );
    }
    @Test
    public void basicTests3() {
        assertEquals(2, PersistentBugger.persistence( 25), "Incorrect answer for n=25" );
    }
    @Test
    public void basicTests4() {
        assertEquals(4, PersistentBugger.persistence(999), "Incorrect answer for n=999");
    }
}
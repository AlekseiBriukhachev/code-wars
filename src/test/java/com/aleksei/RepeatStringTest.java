package com.aleksei;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class RepeatStringTest {
    @Test
    public void test4a() {
        assertEquals("aaaa", RepeatString.repeatStr(4, "a"));
    }
    @Test public void test3Hello() {
        assertEquals("HelloHelloHello", RepeatString.repeatStr(3, "Hello"));
    }
    @Test public void test5empty() {
        assertEquals("", RepeatString.repeatStr(5, ""));
    }
    @Test public void test0kata() {
        assertEquals("", RepeatString.repeatStr(0, "kata"));
    }
}
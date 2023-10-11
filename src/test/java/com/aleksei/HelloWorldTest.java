package com.aleksei;


import org.junit.*;

import static org.junit.Assert.assertEquals;

class HelloWorldTest {
    @Test
    public void testHelloWorld() throws Exception {
        assertEquals("hello world!", HelloWorld.greet());
    }

}
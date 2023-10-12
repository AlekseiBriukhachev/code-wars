package com.aleksei;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BasicMathOperationsTest {
    @Test
    public void testBasics()
    {
        System.out.println("Basic Tests");
        assertThat(BasicMathOperations.basicMath("+", 4, 7), is(11));
        assertThat(BasicMathOperations.basicMath("-", 15, 18), is(-3));
        assertThat(BasicMathOperations.basicMath("*", 5, 5), is(25));
        assertThat(BasicMathOperations.basicMath("/", 49, 7), is(7));
    }
}
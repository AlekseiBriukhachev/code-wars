package com.aleksei;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonalizedMessageTest {
    @Test
    public void basicTests() {
        assertEquals("For inputs \"Daniel\" and \"Daniel\"", "Hello boss", PersonalizedMessage.greet("Daniel", "Daniel"));
        assertEquals("For inputs \"Greg\" and \"Daniel\"", "Hello guest", PersonalizedMessage.greet("Greg", "Daniel"));
    }
}
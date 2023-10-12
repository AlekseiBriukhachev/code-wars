package com.aleksei;

public class PersonalizedMessage {
    public static String greet(String name, String owner) {
        return name.equalsIgnoreCase(owner) ? "Hello boss" : "Hello guest";
    }
}

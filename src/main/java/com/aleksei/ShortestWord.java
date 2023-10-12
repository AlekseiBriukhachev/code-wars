package com.aleksei;

import java.util.Arrays;

public class ShortestWord {
    public static int findShort(String s) {
//        int minLength = Integer.MAX_VALUE;
//        String[] strArr = s.split(" ");
//        for (String str : strArr) {
//            if (minLength > str.length()) {
//                minLength = str.length();
//            }
//        }
//        return minLength;
        return Arrays.stream(s.split(" "))
                .mapToInt(String::length)
                .min()
                .orElse(0);
    }
}

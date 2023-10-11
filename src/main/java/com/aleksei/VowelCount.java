package com.aleksei;

import java.util.stream.IntStream;

public class VowelCount {
    public static int getCount(String str) {
        char[] letters = str.toCharArray();
        return (int) IntStream.range(0, letters.length)
                .filter(i -> str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
                .count();

        //another solution

        //return str.replaceAll("[^aeiou]","").length();
    }
}

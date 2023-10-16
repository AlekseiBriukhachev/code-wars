package com.aleksei;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SheepCounter {
    public static String countingSheep(int num) {
//        String res = "";
//        if (num > 0) {
//            for (int i = 1; i <= num; i++) {
//                res += i + " sheep...";
//            }
//        }
//        return res;
        return IntStream.rangeClosed(1, num)
                .mapToObj(i -> i + " sheep...")
                .collect(Collectors.joining());
    }
}

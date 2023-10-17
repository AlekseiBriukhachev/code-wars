package com.aleksei;

import java.util.Arrays;

public class CountingSheep {
    public int countSheeps(Boolean[] arrayOfSheeps) {
            return (int) Arrays.stream(arrayOfSheeps)
                    .filter(e -> e != null)
                    .filter(Boolean::valueOf)
                    .count();
//        int counter = 0;
//        for (Boolean sheep : arrayOfSheeps) {
//            if (sheep) {
//                counter++;
//            }
//        }
//        return counter;
    }
}

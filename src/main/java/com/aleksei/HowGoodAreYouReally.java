package com.aleksei;

import java.util.Arrays;

public class HowGoodAreYouReally {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
//        int avrGrade = 0;
//        int sum = 0;
//        for (int i = 0; i < classPoints.length; i++) {
//            sum += classPoints[i];
//        }
//        avrGrade = sum / classPoints.length;
//        return yourPoints > avrGrade;
        int avrGrade = (int) Arrays.stream(classPoints)
                .average()
                .orElse(0);

        return yourPoints > avrGrade;
    }
}

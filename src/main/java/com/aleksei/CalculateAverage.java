package com.aleksei;

import java.util.Arrays;

public class CalculateAverage {
    public static double find_average(int[] array) {
        return Arrays.stream(array)
                .average()
                .orElse(0);
    }
}

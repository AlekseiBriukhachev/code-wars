package com.aleksei;

public class PositiveNegative {
    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) return new int[0];
        int count = 0;
        int sum = 0;
        for (int n : input) {
            if (n > 0) {
                count++;
            } else {
                sum += n;
            }
        }
        return new int[]{count, sum};
    }
}

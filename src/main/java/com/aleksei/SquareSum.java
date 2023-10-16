package com.aleksei;

import java.util.Arrays;

public class SquareSum {
    public static int squareSum(int[] n) {
        return Arrays.stream(n).map(i -> (i * i)).sum();
    }
}

package com.aleksei;

import java.util.stream.IntStream;

public class CountByX {
    public static int[] countBy(int x, int n) {
//        int[] resultArray = new int[n];
//        for (int i = 0; i < n; i++) {
//            resultArray[i] = (i + 1) * x;
//        }
//        return resultArray;
        return IntStream.range(0, n)
                .map(i -> ++i * x)
                .toArray();
    }
}

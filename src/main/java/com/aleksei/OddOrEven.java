package com.aleksei;

import java.util.Arrays;

public class OddOrEven {
    public static String oddOrEven(int[] array) {
//        if (array.length == 1 && array[0] == 0) return "even";

        return Arrays.stream(array).sum() % 2 == 0 ? "even": "odd";
//        return array.length > 1 &&
//                (IntStream.range(0, array.length).sum() % 2 == 0 ||  ? "odd" : "even";
    }
}

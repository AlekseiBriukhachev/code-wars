package com.aleksei;

import java.util.Arrays;

public class InvertValues {
    public static int[] invert(int[] array) {
        return Arrays.stream(array).map(j -> j * -1).toArray();
    }
}

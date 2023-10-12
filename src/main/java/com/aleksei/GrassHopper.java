package com.aleksei;

import java.util.stream.IntStream;

public class GrassHopper {
    public static int summation(int n) {
        return n > 0 ? IntStream.rangeClosed(0, n).sum() : 0;
    }
}

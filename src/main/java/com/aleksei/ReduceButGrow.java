package com.aleksei;

public class ReduceButGrow {
    public static int grow(int[] x) {
        int mulNum = 1;
        for (int i = 0; i < x.length; i++) {
            mulNum *= x[i];
        }
        return mulNum;
    }
}

package com.aleksei;

public class XO {
    public static boolean getXO(String str) {
        int xCount = (int) str.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> c == 'x' || c == 'X')
                .count();
        int oCount = (int) str.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> c == 'o' || c == 'O')
                .count();
        return xCount == oCount;
    }
}

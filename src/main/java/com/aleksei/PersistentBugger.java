package com.aleksei;

public class PersistentBugger {
    public static int persistence(long n) {
        int persistence = 0;

        while (n >= 10) {
            int product = 1;
            while (n > 0) {
                product *= n % 10;
                n /= 10;
            }
            n = product;
            persistence++;
        }

        return persistence;
    }
}

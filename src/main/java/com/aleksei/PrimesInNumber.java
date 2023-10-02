package com.aleksei;

public class PrimesInNumber {
    public static String factors(int n) {
        StringBuilder sb = new StringBuilder();
        int divisor = 2;
        while (n > 1) {
            int count = 0;
            while (n % divisor == 0) {
                n /= divisor;
                count++;
            }
            if (count > 0) {
                sb.append("(").append(divisor);
                if (count > 1) {
                    sb.append("**").append(count);
                }
                sb.append(")");
            }
            divisor++;
        }
        return sb.toString();
    }
}

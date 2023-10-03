package com.aleksei;

public class PlayingWithDigits {
    public static long digPow(int n, int p) {

       String numberString = String.valueOf(n);
       long sum = 0;


        for (int i = 0; i < numberString.length(); i++) {
            int digit = Character.getNumericValue(numberString.charAt(i));
            sum += Math.pow(digit, p + i);
        }

        return (sum % n == 0) ? (sum / n) : -1;
        
        //Another solution

//        int[] digits = String.valueOf(n).chars().map(Character::getNumericValue).toArray();
//        int sum = IntStream.range(0, digits.length)
//        .map(i -> (int) Math.pow(digits[i], i + p))
//        .sum();
//        return sum % n == 0 ? sum / n : -1;
    }
}

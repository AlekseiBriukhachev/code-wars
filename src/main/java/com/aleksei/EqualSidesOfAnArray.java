package com.aleksei;

public class EqualSidesOfAnArray {
    public static int findEvenIndex(int[] arr) {
        int totalSum = 0;
        int leftSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i];
            if (leftSum == totalSum) {
                return i;
            }
            leftSum += arr[i];
        }
        return -1;

        //Another better solution

        //return IntStream.range(0, arr.length)
        //				.filter(n -> IntStream.of(arr).limit(n).sum() == IntStream.of(arr).skip(n + 1).sum())
        //				.findFirst().orElse(-1);
    }
}

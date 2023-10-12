package com.aleksei;

import java.util.List;

public class MixedSum {
    public int sum(List<?> mixed) {
//        int sum = 0;
//        for (int i = 0; i < mixed.size(); i++) {
//            int convertedInt = 0;
//            if (mixed.get(i) instanceof String) {
//                convertedInt = Integer.parseInt((String) mixed.get(i));
//                sum += convertedInt;
//            } else {
//                sum += (int) mixed.get(i);
//            }
//        }
//        return sum;
        return mixed.stream()
                .mapToInt(element -> {
                    if (element instanceof String) {
                        try {
                            return Integer.parseInt((String) element);
                        } catch (NumberFormatException e) {
                            return 0; // Handle non-integer Strings as 0 or throw an exception.
                        }
                    } else if (element instanceof Integer) {
                        return (int) element;
                    }
                    return 0; // Handle other types as 0 or throw an exception.
                })
                .sum();
    }
}

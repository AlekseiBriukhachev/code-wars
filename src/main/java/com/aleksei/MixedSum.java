package com.aleksei;

import java.util.List;

public class MixedSum {
    public int sum(List<?> mixed) {
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

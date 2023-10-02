package com.aleksei;

import java.util.List;

public class ListFiltering {
    public static List<Object> filterList(List<Object> list) {
        return list.stream()
                .filter(e -> e instanceof Number)
                .toList();
    }
}

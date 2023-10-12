package com.aleksei;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnoughIsEnough {
    public static int[] deleteNth(int[] elements, int maxOccurrences) {
//
//        int[] tempArray = new int[elements.length];
//
//        for (int i = 0; i < elements.length; i++) {
//            int counter = 0;
//            tempArray[i] = elements[i];
//            for (int j = 0; j < elements.length; j++) {
//                if (elements[i] == elements[j]) {
//                    if (counter < maxOccurrences) {
//                        counter++;
//                    } else {
//                        tempArray[j] = 0;
//                        break;
//                    }
//                }
//            }
//        }
//        return tempArray;
        if (maxOccurrences < 1) {
            return new int[0];
        }

        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int element : elements) {
            int count = countMap.getOrDefault(element, 0);
            if (count < maxOccurrences) {
                result.add(element);
                countMap.put(element, count + 1);
            }
        }

        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }

        return resultArray;

    }
}

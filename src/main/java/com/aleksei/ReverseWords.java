package com.aleksei;

public class ReverseWords {
    public static String reverseWords(final String original) {
//        if (original == null || original.isEmpty()) {
//            return original;
//        }
//
//        return Arrays.stream(original.split(" "))
//                .map(word -> new StringBuilder(word).reverse().toString())
//                .collect(Collectors.joining(" "));
        if (original == null || original.length() == 0) {
            return original;
        }

        // Split the input string by spaces to get individual words
        String[] words = original.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (String word : words) {
            // Reverse the current word and append it to the result
            reversed.append(reverseWord(word)).append(" ");
        }

        // Remove the trailing space and return the result
        return reversed.toString().trim();
    }

    private static String reverseWord(String word) {
        char[] characters = word.toCharArray();
        int left = 0;
        int right = characters.length - 1;

        while (left < right) {
            // Swap characters at left and right indices
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;

            left++;
            right--;
        }

        return new String(characters);
    }
}

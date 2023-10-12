package com.aleksei;

public class TotalPoints {
    public static int points(String[] games) {
        int result = 0;
        for (String game : games) {
            String[] splitScore = game.split(":");
            int x = Integer.parseInt(splitScore[0]);
            int y = Integer.parseInt(splitScore[1]);
            if (x > y) {
                result += 3;
            } else if (x == y) {
                result += 1;
            }
        }
        return result;
    }
}

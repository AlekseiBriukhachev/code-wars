package com.aleksei;

public class RockPaperScissor {
    public static String rps(String p1, String p2) {
        if ((p1.equalsIgnoreCase("rock") && p2.equalsIgnoreCase("scissors"))
        || (p1.equalsIgnoreCase("scissors") && p2.equalsIgnoreCase("paper"))
        || (p1.equalsIgnoreCase("paper") && p2.equalsIgnoreCase("rock"))) {
            return "Player 1 won!";
        } else if ((p1.equalsIgnoreCase("scissors") && p2.equalsIgnoreCase("rock"))
                || (p1.equalsIgnoreCase("paper") && p2.equalsIgnoreCase("scissors"))
                || (p1.equalsIgnoreCase("rock") && p2.equalsIgnoreCase("paper"))) {
            return "Player 2 won!";
        } else {
            return "Draw!";
        }
    }
}

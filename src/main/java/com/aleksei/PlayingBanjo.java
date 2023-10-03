package com.aleksei;

public class PlayingBanjo {
    public static String areYouPlayingBanjo(String name) {

        return name.substring(0, 1).equalsIgnoreCase("r") ?
                name + " plays banjo" :
                name + " does not play banjo";
    }
}

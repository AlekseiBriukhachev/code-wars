package com.aleksei;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

class PlayingBanjoTest {
    @Test
    public void PeopleThatPlayBanjo() {
        assertEquals( "Martin does not play banjo", PlayingBanjo.areYouPlayingBanjo("Martin"));
        assertEquals( "Rikke plays banjo", PlayingBanjo.areYouPlayingBanjo("Rikke"));
        assertEquals( "rolf plays banjo", PlayingBanjo.areYouPlayingBanjo("rolf"));
        assertEquals( "bravo does not play banjo", PlayingBanjo.areYouPlayingBanjo("bravo"));
    }
}
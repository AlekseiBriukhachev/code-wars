package com.aleksei;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RockPaperScissorTest {
    @Test
    public void test1() {
        System.out.println("Fixed Tests Player 1 won!");
        assertEquals("Player 1 won!", RockPaperScissor.rps("rock", "scissors"));
        assertEquals("Player 1 won!", RockPaperScissor.rps("scissors", "paper"));
        assertEquals("Player 1 won!", RockPaperScissor.rps("paper", "rock"));
    }
    @Test
    public void test2() {
        System.out.println("Fixed Tests Player 2 won!");
        assertEquals("Player 2 won!", RockPaperScissor.rps("scissors", "rock"));
        assertEquals("Player 2 won!", RockPaperScissor.rps("paper", "scissors"));
        assertEquals("Player 2 won!", RockPaperScissor.rps("rock", "paper"));
    }
    @Test
    public void test3() {
        System.out.println("Fixed Tests Draw!");
        assertEquals("Draw!", RockPaperScissor.rps("scissors", "scissors"));
        assertEquals("Draw!", RockPaperScissor.rps("paper", "paper"));
        assertEquals("Draw!", RockPaperScissor.rps("rock", "rock"));
    }
}
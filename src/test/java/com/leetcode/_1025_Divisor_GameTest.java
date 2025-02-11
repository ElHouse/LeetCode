package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1025_Divisor_GameTest {


    private final _1025_Divisor_Game divisor_game = new _1025_Divisor_Game();

    @Test
    public void case1() {
        assertTrue(divisor_game.divisorGame(2));
    }

    @Test
    public void case2() {
        assertTrue(divisor_game.divisorGame(4));
    }

    @Test
    public void case3() {
        assertFalse(divisor_game.divisorGame(3));
    }

}
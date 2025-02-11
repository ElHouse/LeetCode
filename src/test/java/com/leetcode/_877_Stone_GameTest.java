package com.leetcode;

import com.leetcode._877_Stone_Game;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _877_Stone_GameTest {


    private final _877_Stone_Game stoneGame = new _877_Stone_Game();


    @Test
    public void test() {

        assertTrue(stoneGame.stoneGame(new int[]{5, 3, 4, 5}));
        assertTrue(stoneGame.stoneGame(new int[]{3,7,2,3}));

        assertTrue(stoneGame.stoneGame(new int[]{1, 1, 1, 99, 1 ,1}));
        assertTrue(stoneGame.stoneGame(new int[]{3,7}));

    }

}
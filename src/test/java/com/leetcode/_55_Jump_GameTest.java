package com.leetcode;

import com.leetcode._55_Jump_Game;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _55_Jump_GameTest {


    private final _55_Jump_Game jumpGame = new _55_Jump_Game();

    @Test
    public void test1() {
        assertTrue(jumpGame.canJump(new int[]{2, 0}));
    }

    @Test
    public void test() {
        assertTrue(jumpGame.canJump(new int[]{2, 3, 1, 1, 4}));
    }

    @Test
    public void test2() {
        assertFalse(jumpGame.canJump(new int[]{3, 2, 1, 0, 4}));
    }

    @Test
    public void test3() {
        assertFalse(jumpGame.canJump(new int[]{10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4}));
    }

    @Test
    public void test4() {
        assertTrue(jumpGame.canJump(new int[]{10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4}));
    }


    @Test
    public void test41() {
        assertTrue(jumpGame.canJump(new int[]{5, 0, 0, 0, 0, 5, 0, 0, 0, 0, 99}));
    }

    @Test
    public void test4121() {
        assertTrue(jumpGame.canJump(new int[]{2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 99}));
    }


    @Test
    public void test7() {
        assertFalse(jumpGame.canJump(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 0, 99}));
    }

    @Test
    public void test5() {

        int[] array = new int[9999];
        int count = 0;
        for (int i = 9997; i >= 0; i--) {
            array[count++] = i;
        }

        assertFalse(jumpGame.canJump(array));
    }
}
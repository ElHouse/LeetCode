package com.leetcode;

import com.leetcode._45_Jump_Game_II;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _45_Jump_Game_IITest {


    private final _45_Jump_Game_II jumpGameIi = new _45_Jump_Game_II();

    @Test
    void jump() {
        assertEquals(2, jumpGameIi.jump2(new int[]{2, 3, 1, 1, 4}));
    }


    @Test
    void jump1() {
        assertEquals(2, jumpGameIi.jump2(new int[]{2, 3, 0, 1, 4}));
    }


    @Test
    void jump2() {
        assertEquals(3, jumpGameIi.jump2(new int[]{2, 3, 0, 0, 4, 0, 0, 3, 1}));
    }


    @Test
    void jump3() {
        assertEquals(5, jumpGameIi.jump2(new int[]{2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 99}));
    }

    @Test
    void jump4() {
        assertEquals(2, jumpGameIi.jump2(new int[]{1, 99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 99}));
    }


    @Test
    void jump6() {
        assertEquals(2, jumpGameIi.jump2(new int[]{1,99,10,9,8,7,6,5,4,3,2,1,0,0,0,99}));
    }

    @Test
    void jump7() {
        assertEquals(0, jumpGameIi.jump2(new int[]{0}));
    }


    @Test
    public void test5() {

        int[] array = new int[9999];
        int count = 0;
        for (int i = 9997; i >= 0; i--) {
            array[count++] = i;
        }

        assertEquals(0, jumpGameIi.jump2(array));
    }

}
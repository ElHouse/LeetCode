package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _771_Jewels_and_StonesTest {

    _771_Jewels_and_Stones jewelsAndStones = new _771_Jewels_and_Stones();

    @Test
    public void case1() {
        String J = "bc";
        String S = "aaabbbcccd";

        assertEquals(6, jewelsAndStones.numJewelsInStones(J, S));
    }



    @Test
    public void case2() {
        String J = "poiuytrewq";
        String S = "aaabbbcccd";

        assertEquals(0, jewelsAndStones.numJewelsInStones(J, S));
    }


    @Test
    public void case3() {
        String J = "a";
        String S = "aaabbbcccd";

        assertEquals(3, jewelsAndStones.numJewelsInStones(J, S));
    }

    @Test
    public void case4() {
        String J = "aJjXcvbnmÑLKJHGFDSAQWERTYUIOPqwertyuiop";
        String S = "aaaaabbbbbcccccdddddeeeeefffffggggghhhhhiiiiijjjjj";

        assertEquals(30, jewelsAndStones.numJewelsInStones(J, S));
    }


    @Test
    public void case5() {
        String J = "aA";
        String S = "aA";

        assertEquals(2, jewelsAndStones.numJewelsInStones(J, S));
    }



    @Test
    public void case6() {
        String J = null;
        String S = null;

        assertEquals(0, jewelsAndStones.numJewelsInStones(J, S));
    }


    @Test
    public void case7() {
        String J = "";
        String S = "";

        assertEquals(0, jewelsAndStones.numJewelsInStones(J, S));
    }
}
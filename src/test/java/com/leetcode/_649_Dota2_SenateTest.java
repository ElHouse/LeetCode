package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _649_Dota2_SenateTest {


    private final _649_Dota2_Senate dota2Senate = new _649_Dota2_Senate();


    @Test
    public void test01() {
        assertEquals("Radiant", dota2Senate.predictPartyVictory("RD"));
    }

    @Test
    public void test02() {
        assertEquals("Dire", dota2Senate.predictPartyVictory("RDD"));
    }


    @Test
    public void test03() {
        assertEquals("Dire", dota2Senate.predictPartyVictory("DDDDDDDDDDDDDDDDDDDDDD"));
    }
    @Test
    public void test04() {
        assertEquals("Radiant", dota2Senate.predictPartyVictory("RRRRRRRRRRRRRRRRRRRRRRR"));
    }

    @Test
    public void test05() {
        assertEquals("Radiant", dota2Senate.predictPartyVictory("RRRRRRRRRRRRRRRRRRRRRRRDDDDDDDDDDDDDDDDDDDDDD"));
    }



}
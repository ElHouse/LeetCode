package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _838_Push_DominoesTest {


    _838_Push_Dominoes pushDominoes = new _838_Push_Dominoes();


    @Test
    public void test00(){
    }


    @Test
    public void test01(){

        assertEquals("RR.L", pushDominoes.pushDominoes2("RR.L"));
        assertEquals("LL.RR.LLRRLL..", pushDominoes.pushDominoes2(".L.R...LR..L.."));
        assertEquals("LL.RR", pushDominoes.pushDominoes2(".L.R."));
        assertEquals("LL", pushDominoes.pushDominoes2(".L"));
        assertEquals("RR", pushDominoes.pushDominoes2("R."));
        assertEquals("RRRRRRRRRRR", pushDominoes.pushDominoes2("R.........."));
        assertEquals("LLLLLLL", pushDominoes.pushDominoes2("......L"));
        assertEquals(".", pushDominoes.pushDominoes2("."));
        assertEquals("RRR.L", pushDominoes.pushDominoes2("R.R.L"));
        assertEquals("LLLL", pushDominoes.pushDominoes2("L.LL"));
        assertEquals(".RRRR", pushDominoes.pushDominoes2(".RR.."));



        StringBuilder sb = new StringBuilder("R");
        sb.repeat(".",100_00);

        StringBuilder expected = new StringBuilder("R");
        expected.repeat("R",100_00);
        assertEquals(expected.toString(), pushDominoes.pushDominoes2(sb.toString()).toString());

    }

    @Test
    public void test02(){

        assertEquals("RR.L", pushDominoes.pushDominoes("RR.L"));
        assertEquals("LL.RR.LLRRLL..", pushDominoes.pushDominoes(".L.R...LR..L.."));
        assertEquals("LL.RR", pushDominoes.pushDominoes(".L.R."));
        assertEquals("LL", pushDominoes.pushDominoes(".L"));
        assertEquals("RR", pushDominoes.pushDominoes("R."));
        assertEquals("RRRRRRRRRRR", pushDominoes.pushDominoes("R.........."));
        assertEquals("LLLLLLL", pushDominoes.pushDominoes("......L"));
        assertEquals(".", pushDominoes.pushDominoes("."));
        assertEquals("RRR.L", pushDominoes.pushDominoes("R.R.L"));
        assertEquals("LLLL", pushDominoes.pushDominoes("L.LL"));
        assertEquals(".RRRR", pushDominoes.pushDominoes(".RR.."));



        StringBuilder sb = new StringBuilder("R");
        sb.repeat(".",100_00);

        StringBuilder expected = new StringBuilder("R");
        expected.repeat("R",100_00);
        assertEquals(expected.toString(), pushDominoes.pushDominoes(sb.toString()).toString());

    }




}


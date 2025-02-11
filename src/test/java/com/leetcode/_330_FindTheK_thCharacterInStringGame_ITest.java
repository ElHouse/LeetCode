package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _330_FindTheK_thCharacterInStringGame_ITest {

    _330_FindTheK_thCharacterInStringGame_I findTheKThCharacterInStringGameI = new _330_FindTheK_thCharacterInStringGame_I();

    @Test
    public void test1() {
        assertEquals('b', findTheKThCharacterInStringGameI.kthCharacter(5) );
        assertEquals('c', findTheKThCharacterInStringGameI.kthCharacter(10) );

    }

}
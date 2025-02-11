package com.leetcode;

import com.leetcode._330_FindTheK_thCharacterInStringGame_I;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _330_FindTheK_thCharacterInStringGame_ITest {

    _330_FindTheK_thCharacterInStringGame_I findTheKThCharacterInStringGameI = new _330_FindTheK_thCharacterInStringGame_I();

    @Test
    public void test1() {
        assertEquals('b', findTheKThCharacterInStringGameI.kthCharacter(5) );
        assertEquals('c', findTheKThCharacterInStringGameI.kthCharacter(10) );

    }

}
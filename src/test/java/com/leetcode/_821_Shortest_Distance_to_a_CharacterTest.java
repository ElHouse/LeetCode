package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class _821_Shortest_Distance_to_a_CharacterTest {

    _821_Shortest_Distance_to_a_Character shortestDistanceToACharacter = new _821_Shortest_Distance_to_a_Character();

    @Test
    public void case1() {

        String S = "loveleetcode";
        char   C = 'e';
        String result = "[3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]";

        assertEquals(result, Arrays.toString( shortestDistanceToACharacter.shortestToChar(S, C)));
    }

}
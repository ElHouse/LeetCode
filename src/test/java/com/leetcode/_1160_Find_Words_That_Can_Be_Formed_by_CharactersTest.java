package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1160_Find_Words_That_Can_Be_Formed_by_CharactersTest {


    private final _1160_Find_Words_That_Can_Be_Formed_by_Characters findWordsThatCanBeFormedByCharacters = new _1160_Find_Words_That_Can_Be_Formed_by_Characters();

    @Test
    public void case0() {

        assertEquals(0, findWordsThatCanBeFormedByCharacters.countCharacters(null, null));
    }

    @Test
    public void case1() {

        String[] words = {"cat", "bt", "hat", "tree"};
        String chars = "atach";

        assertEquals(6, findWordsThatCanBeFormedByCharacters.countCharacters(words, chars));
    }

    @Test
    public void case2() {

        String[] words = {"hello", "world", "leetcode"};
        String chars = "welldonehoneyr";

        assertEquals(10, findWordsThatCanBeFormedByCharacters.countCharacters(words, chars));
    }


    @Test
    public void case3() {

        String[] words = {"hello", "world", "leetcode"};
        String chars = "well";

        assertEquals(0, findWordsThatCanBeFormedByCharacters.countCharacters(words, chars));
    }
}
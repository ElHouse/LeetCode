package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _648_Replace_WordsTest {

    _648_Replace_Words replace_words = new _648_Replace_Words();


    @Test
    public void case1() {

//		String[] dict     = {"cat", "bat", "rat"};
        List<String> dict = new ArrayList<>();
        dict.add("cat");
        dict.add("bat");
        dict.add("rat");
        String sentence = "the cattle was rattled by the battery";

        assertEquals("the cat was rat by the bat", replace_words.replaceWords(dict, sentence));

    }
}
package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _819_Most_Common_WordTest {

    _819_Most_Common_Word most_common_word = new _819_Most_Common_Word();

    @Test
    public void case1() {

        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};

        assertEquals("ball", most_common_word.mostCommonWord(paragraph, banned));

    }


    @Test
    public void case2() {

        String paragraph = "Bob hit a ball the the ! the , the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};

        assertEquals("the", most_common_word.mostCommonWord(paragraph, banned));

    }


    @Test
    public void case3() {

        String paragraph = "was";
        String[] banned = {"hit"};

        assertEquals("was", most_common_word.mostCommonWord(paragraph, banned));

    }


    @Test
    public void case4() {

        String paragraph = "Bob hit a a a ball, the hit BALL flew far after it was hit .";
        String[] banned = {"hit", "the", "it", "ball"};

        assertEquals("a", most_common_word.mostCommonWord(paragraph, banned));

    }

    @Test
    public void case45() {

        String paragraph = "Bob. hIt, baLl";
        String[] banned = {"bob", "hit"};

        assertEquals("ball", most_common_word.mostCommonWord(paragraph, banned));

    }


    @Test
    public void case46() {

        String paragraph = "a, a, a, a, b,b,b,c, c";
        String[] banned = {"a"};

        assertEquals("b", most_common_word.mostCommonWord(paragraph, banned));

    }


    @Test
    public void case47() {

        String paragraph = "abc abc? abcd the jeff!";
        String[] banned = {"abc", "abcd", "jeff"};

        assertEquals("the", most_common_word.mostCommonWord(paragraph, banned));

    }

}
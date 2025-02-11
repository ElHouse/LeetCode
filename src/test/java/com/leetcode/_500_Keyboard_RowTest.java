package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _500_Keyboard_RowTest {

    _500_Keyboard_Row keyboardRow = new _500_Keyboard_Row();

    @Test
    public void case1() {

        String[] words = {"Hello", "Alaska", "Dad", "Peace"};

        keyboardRow.findWords(words);
    }
}
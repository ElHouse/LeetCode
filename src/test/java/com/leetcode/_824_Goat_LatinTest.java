package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _824_Goat_LatinTest {

    _824_Goat_Latin goatLatin = new _824_Goat_Latin();

    @Test
    public void case1() {
        String S = "I speak Goat Latin";
        assertEquals("Imaa peaksmaaa oatGmaaaa atinLmaaaaa", goatLatin.toGoatLatin(S));
    }

    @Test
    public void case2() {
        String S =  "The quick brown fox jumped over the lazy dog";
        assertEquals("heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa", goatLatin.toGoatLatin(S));
    }
}
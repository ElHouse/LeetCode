package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _2390_Removing_Stars_From_a_StringTest {

    private final _2390_Removing_Stars_From_a_String removingStarsFromAString = new _2390_Removing_Stars_From_a_String();

    @Test
    public void test01() {

        assertEquals("lecoe", removingStarsFromAString.removeStars("leet**cod*e"));

    }

    @Test
    public void test02() {

        assertEquals("", removingStarsFromAString.removeStars("erase*****"));

    }


    @Test
    public void test03() {

        assertEquals("lecoe", removingStarsFromAString.removeStars("leet**cod*e"));

    }


    @Test
    public void test04() {

        assertEquals("Code", removingStarsFromAString.removeStars("*******Code"));

    }


    @Test
    public void test05() {

        assertEquals("Code", removingStarsFromAString.removeStars("abcabca*******Code"));

    }


}
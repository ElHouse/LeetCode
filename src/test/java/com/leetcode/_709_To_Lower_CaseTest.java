package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _709_To_Lower_CaseTest {

    _709_To_Lower_Case to_lower_case = new _709_To_Lower_Case();

    @Test
    public void case0() {

        assertEquals(null, to_lower_case.toLowerCase(null));

    }

    @Test
    public void case1() {

        String result = "acr";
        String str    = "ACR";

        assertEquals(result, to_lower_case.toLowerCase(str) );

    }

    @Test
    public void case2() {

        String result = "2222";
        String str    = "2222";

        assertEquals(result, to_lower_case.toLowerCase(str) );

    }

    @Test
    public void case3() {

        String result = "hola y adios ";
        String str    = "Hola Y ADIos ";

        assertEquals(result, to_lower_case.toLowerCase(str) );

    }


    @Test
    public void case4() {

        String result = " uju ";
        String str    = " UjU ";

        assertEquals(result, to_lower_case.toLowerCase(str) );
    }
}
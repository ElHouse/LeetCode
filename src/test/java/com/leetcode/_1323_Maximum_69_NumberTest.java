package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1323_Maximum_69_NumberTest {

private final _1323_Maximum_69_Number maximum69Number = new _1323_Maximum_69_Number();

    @Test
    public void test01(){
        assertEquals(9969, maximum69Number.maximum69Number(9669));
    }

    @Test
    public void test02(){
        assertEquals(9999, maximum69Number.maximum69Number(9996));
    }

    @Test
    public void test03(){
        assertEquals(9999, maximum69Number.maximum69Number(9999));
    }


    @Test
    public void test04(){
        assertEquals(9, maximum69Number.maximum69Number(6));
    }


    @Test
    public void test05(){
        assertEquals(96, maximum69Number.maximum69Number(66));
    }

    @Test
    public void test06(){
        assertEquals(9, maximum69Number.maximum69Number(9));
    }


    @Test
    public void test07(){
        assertEquals(96666669, maximum69Number.maximum69Number(66666669));
    }

}
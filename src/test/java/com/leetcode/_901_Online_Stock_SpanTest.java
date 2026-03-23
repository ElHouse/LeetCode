package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _901_Online_Stock_SpanTest {

    @Test
    public void test01() {
        _901_Online_Stock_Span onlineStockSpan1 = new _901_Online_Stock_Span();


        assertEquals(1, onlineStockSpan1.next(100));
        assertEquals(1, onlineStockSpan1.next(80));
        assertEquals(1, onlineStockSpan1.next(60));
        assertEquals(2, onlineStockSpan1.next(70));
        assertEquals(1, onlineStockSpan1.next(60));
        assertEquals(4, onlineStockSpan1.next(75));
        assertEquals(6, onlineStockSpan1.next(85));

    }

    @Test
    public void test02() {
        _901_Online_Stock_Span onlineStockSpan1 = new _901_Online_Stock_Span();


        assertEquals(1, onlineStockSpan1.next(7));
        assertEquals(2, onlineStockSpan1.next(34));
        assertEquals(1, onlineStockSpan1.next(1));
        assertEquals(2, onlineStockSpan1.next(2));;

    }

    @Test
    public void test03() {
        _901_Online_Stock_Span onlineStockSpan1 = new _901_Online_Stock_Span();


        assertEquals(1, onlineStockSpan1.next(31));
        assertEquals(2, onlineStockSpan1.next(41));
        assertEquals(3, onlineStockSpan1.next(48));
        assertEquals(4, onlineStockSpan1.next(59));
        assertEquals(5, onlineStockSpan1.next(79));

    }


}
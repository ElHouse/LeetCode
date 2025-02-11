package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _228_Summary_RangesTest {

    private final _228_Summary_Ranges summaryRanges = new _228_Summary_Ranges();

    @Test
    public void test1() {

        List<String> expected = new ArrayList<>();
        expected.add("0->2");
        expected.add("4->5");
        expected.add("7");
        assertLinesMatch(expected, summaryRanges.summaryRanges(new int[]{0, 1, 2, 4, 5, 7}));
    }

    @Test
    public void test2() {

        List<String> expected = List.of("0", "2->4", "6", "8->9");
        assertLinesMatch(expected, summaryRanges.summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9}));
    }

}
package com.hackerRank;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _22_Next_Greater_Element_with_Position_OffsetTest {
    _22_Next_Greater_Element_with_Position_Offset nextGreaterElementWithPositionOffset = new _22_Next_Greater_Element_with_Position_Offset();

    @Test
    public void test01() {
        nextGreaterElementWithPositionOffset.findNextGreaterElementsWithDistance(List.of(2, 1, 2, 4, 3));
    }
}
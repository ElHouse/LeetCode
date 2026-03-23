package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _346_Moving_Average_from_Data_StreamTest {


    @Test
    public void test01() {

        _346_Moving_Average_from_Data_Stream movingAverageFromDataStream = new _346_Moving_Average_from_Data_Stream(3);
        assertEquals(1, movingAverageFromDataStream.next(1));
        assertEquals(5.5, movingAverageFromDataStream.next(10));
        assertEquals(4.666666666666667, movingAverageFromDataStream.next(3));
        assertEquals(6.0, movingAverageFromDataStream.next(5));
    }


    @Test
    public void test02() {

        _346_Moving_Average_from_Data_Stream movingAverageFromDataStream = new _346_Moving_Average_from_Data_Stream(3);
        assertEquals(1, movingAverageFromDataStream.next(1));
        assertEquals(5.5, movingAverageFromDataStream.next(10));
        assertEquals(4.666666666666667, movingAverageFromDataStream.next(3));
        assertEquals(6.0, movingAverageFromDataStream.next(5));
    }


}
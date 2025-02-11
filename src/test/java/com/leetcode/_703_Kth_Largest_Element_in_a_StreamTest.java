package com.leetcode;

import com.leetcode.pendientes._703_Kth_Largest_Element_in_a_Stream;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _703_Kth_Largest_Element_in_a_StreamTest {


    @Test
    public void test01() {


        int[] array = new int[]{4, 5, 8, 2};

        _703_Kth_Largest_Element_in_a_Stream KthLargest = new _703_Kth_Largest_Element_in_a_Stream(3, array);

        assertEquals(4, KthLargest.add(3));
        assertEquals(5, KthLargest.add(5));
        assertEquals(5, KthLargest.add(10));
        assertEquals(8, KthLargest.add(9));
        assertEquals(8, KthLargest.add(4));

    }


    @Test
    public void test02() {


        int[] array = new int[]{7, 7, 7, 7, 8, 3};

        _703_Kth_Largest_Element_in_a_Stream KthLargest = new _703_Kth_Largest_Element_in_a_Stream(4, array);

        assertEquals(7, KthLargest.add(2));
        assertEquals(7, KthLargest.add(10));
        assertEquals(7, KthLargest.add(9));
        assertEquals(8, KthLargest.add(9));

    }



    @Test
    public void test03() {


        int[] array = new int[]{7};

        _703_Kth_Largest_Element_in_a_Stream KthLargest = new _703_Kth_Largest_Element_in_a_Stream(1, array);

        assertEquals(7, KthLargest.add(2));
        assertEquals(9, KthLargest.add(9));

    }




}
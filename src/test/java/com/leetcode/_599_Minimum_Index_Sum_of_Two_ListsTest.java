package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _599_Minimum_Index_Sum_of_Two_ListsTest {

    _599_Minimum_Index_Sum_of_Two_Lists minimumIndexSumOfTwoLists = new _599_Minimum_Index_Sum_of_Two_Lists();

    @Test
    public void case1() {

        System.out.println("#################### case1 ");
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};

        minimumIndexSumOfTwoLists.findRestaurant(list1, list2);

        assertEquals("[Shogun]", Arrays.toString(minimumIndexSumOfTwoLists.findRestaurant(list1, list2)) );

    }

    @Test
    public void case2() {
        System.out.println("#################### case2 ");
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"KFC", "Shogun", "Burger King"};

        assertEquals("[Shogun]", Arrays.toString(minimumIndexSumOfTwoLists.findRestaurant(list1, list2)) );

    }


    @Test
    public void case3() {
        System.out.println("#################### case3 ");
        String[] list1 = {"Shogun", "KFC", "Burger King"};
        String[] list2 = {"KFC", "Shogun", "Burger King"};

        assertEquals("[Shogun, KFC]", Arrays.toString(minimumIndexSumOfTwoLists.findRestaurant(list1, list2)) );

    }


    @Test
    public void case4() {
        System.out.println("#################### case4 ");
        String[] list1 = {"Shogun", "KFC", "Burger King", "KFC","A"};
        String[] list2 = {"KFC", "Shogun", "Burger King","A","A"};

        assertEquals("[KFC]", Arrays.toString(minimumIndexSumOfTwoLists.findRestaurant(list1, list2)) );

    }

    @Test
    public void case5() {
        System.out.println("#################### case5 ");
        String[] list1 = {"Tapioca Express","Shogun", "KFC", "Burger King", "KFC"};
        String[] list2 = {"Tapioca Express", "KFC", "Shogun", "Burger King"};

        assertEquals("[KFC]", Arrays.toString(minimumIndexSumOfTwoLists.findRestaurant(list1, list2)) );

    }


    @Test
    public void case6() {
        System.out.println("#################### case6 ");
        String[] list1 = {"Tapioca Express","Shogun", "KFC", "Burger King"};
        String[] list2 = {"Tapioca Express", "KFC", "Shogun", "Burger King"};

        assertEquals("[Tapioca Express]", Arrays.toString(minimumIndexSumOfTwoLists.findRestaurant(list1, list2)) );

    }

    @Test
    public void case7() {
        System.out.println("#################### case7 ");
        String[] list1 = {"Tapioca Express1","Shogun2", "KFC3", "Burger King4"};
        String[] list2 = {"Tapioca Express", "KFC", "Shogun", "Burger King"};

        assertEquals("[]", Arrays.toString(minimumIndexSumOfTwoLists.findRestaurant(list1, list2)) );

    }
}
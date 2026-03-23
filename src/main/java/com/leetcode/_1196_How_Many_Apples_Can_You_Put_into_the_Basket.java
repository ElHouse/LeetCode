package com.leetcode;


import java.util.Arrays;

/*

You have some apples and a basket that can carry up to 5000 units of weight.

Given an integer array weight where weight[i] is the weight of the ith apple, return the maximum number of apples you can put in the basket.

 */
public class _1196_How_Many_Apples_Can_You_Put_into_the_Basket {


    public int maxNumberOfApples(int[] weight) {

        int count = 0;
        int max = 5000;
        Arrays.sort(weight);

        for (int i = 0; i < weight.length; i++) {

            if (max - weight[i] >= 0) {
                max -= weight[i];
                count++;
            } else {
                break;
            }
        }

        return count;
    }


}

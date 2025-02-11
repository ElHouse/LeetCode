package com.leetcode;

public class _605_Can_Place_Flowers {

    //	Runtime: 1 ms, faster than 100.00% of Java online submissions for Can Place Flowers.
//	Memory Usage: 39 MB, less than 100.00% of Java online submissions for Can Place Flowers.
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int count = 0;
        boolean flag = false;

        for (int i = 0; i < flowerbed.length; i++) {

            if (flowerbed[i] == 1) flag = true;
            else if (flowerbed[i] == 0) {

                if (flag) flag = false;
                else {

                    if (flowerbed.length == i + 1) {
                        flag = true;
                        count++;
                    } else if (flowerbed[i + 1] == 0) {
                        flag = true;
                        count++;
                    }
                }
            }
        }

        return count >= n;
    }


}

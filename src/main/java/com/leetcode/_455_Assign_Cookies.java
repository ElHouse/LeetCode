package com.leetcode;

import java.util.Arrays;

/*
Assume you are an awesome parent and want to give your children some cookies. But, you should give each child at most one cookie.

Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will be content with; and each cookie j has a size s[j]. If s[j] >= g[i], we can assign the cookie j to the child i, and the child i will be content. Your goal is to maximize the number of your content children and output the maximum number.


 */
public class _455_Assign_Cookies {


    public int findContentChildren(int[] g, int[] s) {

        int count = 0;
        int j = 0;

        Arrays.sort(g);
        Arrays.sort(s);

        for (int i = 0; i < g.length && j < s.length; i++) {

            for (; j < s.length; j++) {

                if (g[i] <= s[j]) {
                    count++;
                    j++;
                    break;
                }
            }
        }

        return count;
    }


}

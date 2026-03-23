package com.leetcode;

import java.util.HashMap;
import java.util.Map;
/*
You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A".



Example 1:

Input: jewels = "aA", stones = "aAAbbbb"
Output: 3
Example 2:

Input: jewels = "z", stones = "ZZ"
Output: 0


Constraints:

1 <= jewels.length, stones.length <= 50
jewels and stones consist of only English letters.
All the characters of jewels are unique.
 */
public class _771_Jewels_and_Stones {

     public int numJewelsInStones2(String jewels, String stones) {

        if (jewels == null || stones == null) return 0;
        if (jewels.isEmpty() || stones.isEmpty()) return 0;

        Map<Character, Integer> map = new HashMap<>();
        int result = 0;

        for (int i = 0; i < stones.length(); i++) {
            map.put(stones.charAt(i), map.getOrDefault(stones.charAt(i), 0) + 1);
        }


        for (int i = 0; i < jewels.length(); i++) {
            result += map.getOrDefault(jewels.charAt(i), 0);
        }

        return result;
    }


    //	Runtime: 1 ms, faster than 94.07% of Java online submissions for Jewels and Stones.
//	Memory Usage: 34.6 MB, less than 100.00% of Java online submissions for Jewels and Stones.
    public int numJewelsInStones(String J, String S) {

        if (J == null || S == null) return 0;
        if (J.isEmpty() || S.isEmpty()) return 0;

        int count = 0;
        char[] jewels = J.toCharArray();
        char[] mine = S.toCharArray();


        for (int i = 0; i < mine.length; i++) {

            for (int x = 0; x < jewels.length; x++) {
                if (jewels[x] == mine[i]) count++;

            }
        }

        System.out.println(count);

        return count;
    }


}

package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class _1941_Check_if_All_Characters_Have_Equal_Number_of_Occurrences {


    public boolean areOccurrencesEqual(String s) {

        Map<Character, Integer> map = new HashMap<>();
        int count = 0;
        int prev = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (var key : map.keySet()) {
            if (count == 2) {
                return false;
            }

            if (prev != map.get(key)) {
                prev = map.get(key);
                count++;
            }
        }

        return !(count == 2);
    }

}

package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class _2260_Minimum_Consecutive_Cards_to_Pick_Up {


    public int minimumCardPickup(int[] cards) {

        Map<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < cards.length; i++) {

            if (!map.containsKey(cards[i])) {
                map.put(cards[i], i);
            } else {
                int index = map.get(cards[i]);
                min = Math.min(min, i - index + 1);
                map.put(cards[i], i);
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }


}

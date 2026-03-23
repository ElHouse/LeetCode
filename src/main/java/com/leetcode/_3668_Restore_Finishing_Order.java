package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class _3668_Restore_Finishing_Order {


    public int[] recoverOrder(int[] order, int[] friends) {

        int[] response = new int[friends.length];
        Set<Integer> map = new HashSet<>();

        for (int i = 0, j = 0; i < friends.length; i++) {
            map.add(friends[i]);
        }

        for (int i = 0, j = 0; i < order.length; i++) {
            if (map.contains(order[i])) {
                response[j++] = order[i];
            }
        }

        return response;
    }


}

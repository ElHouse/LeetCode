package com.leetcode;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class _45_Jump_Game_II {

    public int jump(int[] nums) {

        if (nums.length == 1) return 0;

        Queue<Integer> cola = new ArrayDeque<>();
        Map<Integer, Integer> paths = new HashMap<>();
        int count = 1;
        int min = Integer.MAX_VALUE;

        for (int i = nums.length - 2; i >= 0; i--) {

            if (nums[i] >= nums.length - 1 - i) {
                paths.put(i, count);
                if (i == 0) return 1;
                cola.add(i);
            }
        }

        if (!cola.isEmpty()) {
            cola.add(Integer.MAX_VALUE);
        }

        while (!cola.isEmpty()) {
            Integer aux = cola.poll();

            if (aux == Integer.MAX_VALUE) {
                count++;
                if (!cola.isEmpty()) cola.add(Integer.MAX_VALUE);
            } else {
                for (int i = aux - 1; i >= 0; i--) {

                    if (nums[i] >= aux - i) {

                        if (!cola.contains(i) && !paths.containsKey(i)) {
                            cola.add(i);
                            paths.put(i, count);
                            if (i == 0) {
                                min = Math.min(min, count + 1);
                            }

                        }
                    }
                }
            }


        }


        return min == Integer.MAX_VALUE ? 0 : min;
    }

    public int jump2(int[] nums) {

        if (nums.length == 1) return 0;

        Queue<Integer> cola = new ArrayDeque<>();
        int count = 1;
        int maxRangeI = Integer.MAX_VALUE;

        for (int i = nums.length - 2; i >= 0; i--) {

            if (nums[i] >= nums.length - 1 - i) {

                if (i < maxRangeI) {
                    maxRangeI = i;
                }
                if (i == 0) return 1;
            }
        }

        if (maxRangeI == Integer.MAX_VALUE){
            return 0;
        }

        cola.add(maxRangeI);
        cola.add(Integer.MAX_VALUE);

        while (!cola.isEmpty()) {
            Integer aux = cola.poll();

            if (aux == Integer.MAX_VALUE) {
                count++;
            } else if (maxRangeI == 0) {
                break;
            } else {

                for (int i = aux - 1; i >= 0; i--) {

                    if (nums[i] >= aux - i) {

                        if (i < maxRangeI) {
                            maxRangeI = i;
                        }
                    }
                }

                cola.add(maxRangeI);
                cola.add(Integer.MAX_VALUE);

            }
        }

        return count;
    }


}

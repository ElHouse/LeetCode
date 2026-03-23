package com.leetcode;

import java.util.*;


public class _1207_Unique_Number_of_Occurrences {


    public boolean uniqueOccurrences(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        Set<Integer> set = new HashSet<>(map.values());


        return map.size()==set.size();
    }


    //	Runtime: 1 ms, faster than 99.74% of Java online submissions for Unique Number of Occurrences.
	//	Memory Usage: 34.6 MB, less than 100.00% of Java online submissions for Unique Number of Occurrences.
    public boolean uniqueOccurrences2(int[] arr) {

        if (arr == null) return false;
        if (arr.length == 1) return true;

        List<Integer> nums = new ArrayList<>();
        Arrays.sort(arr);


        int numAux = arr[0];
        int count = 1;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] != numAux) {
                if (nums.contains(count)) {
                    return false;
                } else {
                    nums.add(count);
                }
                count = 1;
                numAux = arr[i];
            } else {
                count++;
            }

        }

        if (nums.contains(count)) {
            return false;
        }


        return true;
    }


}

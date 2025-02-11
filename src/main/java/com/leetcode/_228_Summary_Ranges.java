package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _228_Summary_Ranges {


    public List<String> summaryRanges(int[] nums) {

        String flecha = "->";

        if (nums == null)
            return Collections.emptyList();

        List<String> response = new ArrayList<>(nums.length);

        for (int i = 0; i < nums.length; i++) {

            StringBuilder sb = new StringBuilder();
            int aux = i;
            while (i + 1 < nums.length && nums[i] + 1 == nums[i + 1]) {
                i++;
            }

            sb.append(nums[aux]);

            if (aux != i) {
                sb.append(flecha);
                sb.append(nums[i]);
            }
            response.add(sb.toString());
        }

        return response;
    }


}

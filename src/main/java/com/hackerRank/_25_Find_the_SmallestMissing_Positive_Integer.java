package com.hackerRank;

import java.util.Collections;
import java.util.List;

public class _25_Find_the_SmallestMissing_Positive_Integer {


    public int findSmallestMissingPositive(List<Integer> orderNumbers) {
        int n = orderNumbers.size();

        for (int i = 0; i < n; i++) {
            while (
                    orderNumbers.get(i) != null &&
                            orderNumbers.get(i) > 0 &&
                            orderNumbers.get(i) <= n &&
                            !orderNumbers.get(orderNumbers.get(i) - 1).equals(orderNumbers.get(i))
            ) {
                int correctIndex = orderNumbers.get(i) - 1;
                int temp = orderNumbers.get(i);
                orderNumbers.set(i, orderNumbers.get(correctIndex));
                orderNumbers.set(correctIndex, temp);
            }
        }

        int count = 1;
        int firstIndex = orderNumbers.indexOf(count++);

        if (firstIndex == -1) {
            return 1;
        }

        for (int i = firstIndex + 1; i < orderNumbers.size(); i++) {
            if (count != orderNumbers.get(i)) {
                return count;
            }
            count++;
        }

        return orderNumbers.size() + 1 - (firstIndex);
    }




}

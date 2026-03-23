package com.hackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _43_Minimum_Plans_to_Reach_Target_Bandwidth {


    public int findMinimumPlansForBandwidth3(List<Integer> planSizes, int targetBandwidth) {
        // Write your code here

        int count = 0;
        int auxSuma = 0;
        List<Integer> list = new ArrayList<>(planSizes);
        Collections.sort(list);

        for (int i = list.size() - 1; i >= 0; ) {
            int num = list.get(i);
            if (num < 0) {
                i--;
                continue;
            }
            if (targetBandwidth >= auxSuma + num) {
                count++;
                auxSuma += num;
                if (auxSuma == targetBandwidth) {
                    return count;
                }
            } else {
                i--;
            }
        }

        return auxSuma == targetBandwidth ? count : -1;
    }
    int result = Integer.MAX_VALUE;


    public int findMinimumPlansForBandwidth(List<Integer> planSizes, int targetBandwidth) {
        // Write your code here
        result = Integer.MAX_VALUE;
        int count = 0;
         List<Integer> list = new ArrayList<>(planSizes);
        Collections.sort(list);

        for (int i = list.size() - 1; i >= 0; i--) {
            backTracking(list, targetBandwidth, 0, i, count + 1);
        }

        return result != Integer.MAX_VALUE ? result : -1;
    }


    private void backTracking(List<Integer> list, int target, int suma, int index, int count) {

        if(count > result){
            return;
        }

        for (int i = index; i >= 0; ) {

            int num = list.get(i);

            if ( num>0 && target >= suma + num) {
                if (target == suma+num) {
                    result = Math.min(result, count);
                }
                backTracking(list, target, suma+num, i, count + 1);
            }
            i--;
        }
    }

}

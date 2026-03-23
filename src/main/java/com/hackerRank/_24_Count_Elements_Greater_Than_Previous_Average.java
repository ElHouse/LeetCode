package com.hackerRank;

import java.util.List;

public class _24_Count_Elements_Greater_Than_Previous_Average {


    public int countResponseTimeRegressions(List<Integer> responseTimes) {
        // Write your code here

        if (responseTimes == null || responseTimes.isEmpty()) return 0;

        int count = 0;
        double suma = responseTimes.get(0);

        for (int i = 1; i < responseTimes.size(); i++) {

            double promedio = suma / (double) i;
            if (promedio < responseTimes.get(i)) {
                count++;
            }

            suma += responseTimes.get(i);
        }


        return count;
    }


}

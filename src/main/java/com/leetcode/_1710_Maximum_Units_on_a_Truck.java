package com.leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

/*You are assigned to put some amount of boxes onto one truck. You are given a 2D array boxTypes, where boxTypes[i] = [numberOfBoxesi, numberOfUnitsPerBoxi]:

numberOfBoxesi is the number of boxes of type i.
numberOfUnitsPerBoxi is the number of units in each box of the type i.
You are also given an integer truckSize, which is the maximum number of boxes that can be put on the truck. You can choose any boxes to put on the truck as long as the number of boxes does not exceed truckSize.

Return the maximum total number of units that can be put on the truck.
 */
public class _1710_Maximum_Units_on_a_Truck {

    public int maximumUnits(int[][] boxTypes, int truckSize) {

        int response = 0;
        int size = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);

        pq.addAll(Arrays.asList(boxTypes));

        while (size < truckSize && !pq.isEmpty()) {

            int[] aux = pq.poll();

            if (size + aux[0] < truckSize) {
                size += aux[0];
                response += aux[0] * aux[1];
            } else {
                int val = truckSize - size;
                size += val;
                response += (val) * aux[1];
            }
        }

        return response;
    }

}

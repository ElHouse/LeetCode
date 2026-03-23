package com.hackerRank;

import java.util.List;
import java.util.PriorityQueue;

public class _36_Maximum_Number_of_Non_Overlapping_Intervals {


    public int maximizeNonOverlappingMeetings(List<List<Integer>> meetings) {

        int count = 0;
        int min = -1;
        PriorityQueue<List<Integer>> pq = new PriorityQueue<>((a, b) -> a.get(1) - b.get(1));
        pq.addAll(meetings);


        while (!pq.isEmpty()){

            List<Integer> aux = pq.poll();
         System.out.println(aux);

            if(min <= aux.get(0) ){
                count++;
                min = aux.get(1);
            }
        }

        return count;
    }
}

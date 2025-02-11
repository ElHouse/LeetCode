package com.leetcode;

public class _3386_Button_with_Longest_Push_Time {


    public int buttonWithLongestTime(int[][] events) {

        int longest = events[0][1];
        int index = events[0][0];


        for (int i = 1; i < events.length; i++) {

            int aux = events[i][1] - events[i - 1][1];

            if (aux > longest) {
                longest = aux;
                index =  events[i][0];
            }else if (aux == longest) {
                index = Math.min(index, events[i][0]);
            }
        }

        return index;


    }

}

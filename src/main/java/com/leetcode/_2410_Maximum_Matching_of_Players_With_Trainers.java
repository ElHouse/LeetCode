package com.leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

/*
You are given a 0-indexed integer array players, where players[i] represents the ability of the ith player. You are also given a 0-indexed integer array trainers, where trainers[j] represents the training capacity of the jth trainer.

The ith player can match with the jth trainer if the player's ability is less than or equal to the trainer's training capacity. Additionally, the ith player can be matched with at most one trainer, and the jth trainer can be matched with at most one player.

Return the maximum number of matchings between players and trainers that satisfy these condition
 */
public class _2410_Maximum_Matching_of_Players_With_Trainers {

    public int matchPlayersAndTrainers(int[] players, int[] trainers) {

        int j = 0;
        int count = 0;

        Arrays.sort(players);
        Arrays.sort(trainers);

        for (int i = 0; i < players.length && j < trainers.length; i++) {

            for (; j < trainers.length; j++) {
                if (players[i] <= trainers[j]) {
                    count++;
                    j++;
                    break;
                }
            }
        }


        return count;
    }

    public int matchPlayersAndTrainers2(int[] players, int[] trainers) {

        int i = 0;
        int count = 0;

        Arrays.sort(players);

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int t : trainers) {
            pq.add(t);
        }

        while (!pq.isEmpty() && i < players.length) {

            Integer trainer = pq.poll();

            if (players[i] <= trainer) {
                i++;
                count++;
            }
        }


        return count;
    }
}

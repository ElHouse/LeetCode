package com.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _841_Keys_and_Rooms {
/*

There are n rooms labeled from 0 to n - 1 and all the rooms are locked except for room 0. Your goal is to visit all the rooms. However, you cannot enter a locked room without having its key.

When you visit a room, you may find a set of distinct keys in it. Each key has a number on it, denoting which room it unlocks, and you can take all of them with you to unlock the other rooms.

Given an array rooms where rooms[i] is the set of keys that you can obtain if you visited room i, return true if you can visit all the rooms, or false otherwise.



Example 1:

Input: rooms = [[1],[2],[3],[]]
Output: true
Explanation:
We visit room 0 and pick up key 1.
We then visit room 1 and pick up key 2.
We then visit room 2 and pick up key 3.
We then visit room 3.
Since we were able to visit every room, we return true.
Example 2:

Input: rooms = [[1,3],[3,0,1],[2],[0]]
Output: false
Explanation: We can not enter room number 2 since the only key that unlocks it is in that room.
*/

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {

        if(rooms == null || rooms.isEmpty()) return false;

        int count = 0;
        boolean[] keyRooms = new boolean[rooms.size()];
        keyRooms[0] = true;
        Queue<Integer> keys = new LinkedList<>();
        keys.add(0);
        count++;
        while (!keys.isEmpty()) {


            int aux = keys.poll();
            List<Integer> room = rooms.get(aux);

            for (int i = 0; i < room.size(); i++) {
                int key = room.get(i);
                if (!keyRooms[key]) {
                    keyRooms[key] = true;
                    keys.add(key);
                    count++;
                }

            }


        }


        return count == rooms.size();
    }


}

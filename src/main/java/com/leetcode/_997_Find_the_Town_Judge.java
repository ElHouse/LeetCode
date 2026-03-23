package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
In a town, there are n people labeled from 1 to n. There is a rumor that one of these people is secretly the town judge.

If the town judge exists, then:

The town judge trusts nobody.
Everybody (except for the town judge) trusts the town judge.
There is exactly one person that satisfies properties 1 and 2.
You are given an array trust where trust[i] = [ai, bi] representing that the person labeled ai trusts the person labeled bi. If a trust relationship does not exist in trust array, then such a trust relationship does not exist.

Return the label of the town judge if the town judge exists and can be identified, or return -1 otherwise.
 */
public class _997_Find_the_Town_Judge {

    public int findJudge(int n, int[][] trust) {


        int[] peopleTrust = new int[n];

        Map<Integer, List<Integer>> mapRelacion = new HashMap<>();
        int count = 0;
        int judge = -1;

        for (int i = 1; i <= n; i++) {
            mapRelacion.put(i, new ArrayList<>());
        }

        for (int i = 0; i < trust.length; i++) {

            peopleTrust[trust[i][1]-1]++;

            mapRelacion.get(trust[i][0]).add(trust[i][1]);
        }

        for (Integer key : mapRelacion.keySet()) {

            if (mapRelacion.get(key).isEmpty()) {
                count++;
                if (count > 1) {
                    return -1;
                }
                if (peopleTrust[key-1 ] == n - 1) {
                    judge = key;
                }
            }
        }

        return judge;
    }


}

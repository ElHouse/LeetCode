package com.hackerRank;

import java.util.*;
import java.util.stream.Collectors;

public class _09_count_triplets_1 {




    public long countTriplets(List<Long> arr, long r) {

        long response = 0;
        Map<Long, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < arr.size(); i++) {
            if (!map.containsKey(arr.get(i))) {
                map.put(arr.get(i), new ArrayList<>());
            }
            map.get(arr.get(i)).add(i);
        }

        for (int i = 0; i < arr.size(); i++) {

            long num = arr.get(i);

            if (r != 1) {

                int finalI = i;
                List<Integer> a = map.getOrDefault(num * r, new ArrayList<>())
                        .stream()
                        .filter(n -> n > finalI)
                        .toList();

                if (a.isEmpty()) continue;

                int finalJ = a.getFirst();

                List<Integer> b = map.getOrDefault(num * r * r, new ArrayList<>())
                        .stream()
                        .filter(n -> n > finalJ)
                        .toList();

                response += (long) a.size() * b.size();
            } else {

                List<Integer> list = map.getOrDefault(num, new ArrayList<>());

                long fact = list.size() - i + 2;

                response += fact;
                System.out.println(response);
            }
        }

        return response;
    }


}

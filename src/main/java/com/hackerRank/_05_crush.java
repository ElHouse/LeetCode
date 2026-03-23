package com.hackerRank;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/*Starting with a 1-indexed array of zeros and a list of operations, for each operation add a value to each array element between two given indices, inclusive. Once all operations have been performed, return the maximum value in the array.
 */
public class _05_crush {


    public long arrayManipulation3(int n, List<List<Integer>> queries) {

        long response = 0;

        long[] array = new long[n+2];

        for (List<Integer> query : queries) {
            int num = query.get(query.size() - 1);
            int from = query.get(0) - 1;
            int to = query.get(1);

            for (int i = from; i < to; i++) {
                array[i] += num;
            }
        }

        for (int i = 0; i < array.length; i++) {
            response = Math.max(response, array[i]);
        }

        long current = 0;

        for (int i = 1; i <= n; i++) {
            current += array[i];
            if (current > response) {
                response = current;
            }
        }

        return response;
    }

    public long arrayManipulation(int n, List<List<Integer>> queries) {

        long[] arr = new long[n + 2];

        for (List<Integer> query : queries) {
            int a = query.get(0) - 1;
            int b = query.get(1);
            int k = query.get(query.size() - 1);

            arr[a] += k;
            arr[b + 1] -= k;
            System.out.println(Arrays.toString(arr));
        }

        long max = 0;
        long current = 0;

        for (int i = 1; i <= n; i++) {
            current += arr[i];
            if (current > max) {
                max = current;
            }
        }

        return max;
    }


}

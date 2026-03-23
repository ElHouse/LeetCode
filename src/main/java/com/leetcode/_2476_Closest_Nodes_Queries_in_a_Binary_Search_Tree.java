package com.leetcode;

import com.leetcode.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class _2476_Closest_Nodes_Queries_in_a_Binary_Search_Tree {

    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {

        List<List<Integer>> response = new ArrayList<>();
        if (root == null) return response;

        List<Integer> list = new ArrayList<>();
        toList(root, list);

        int[] array = list.stream().mapToInt(Integer::intValue).toArray();

        for (int i = 0; i < queries.size(); i++) {

            int aux = queries.get(i);
            int index = searchBinay(array, aux);

            if (array[index] == aux) {
                response.add(List.of(aux, aux));
            } else if (array[index] > aux) {
                int a = index - 1 >= 0 ? array[index - 1] : -1;
                int b = array[index];
                response.add(List.of(a, b));
            } else {
                int a = array[index];
                int b = index + 1 <= array.length - 1 ? array[index + 1] : -1;
                response.add(List.of(a, b));
            }
        }


        return response;
    }


    public int searchBinay(int[] array, int number) {

        int left = 0;
        int right = array.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (array[mid] == number) {
                return mid;
            }

            if (array[mid] > number) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public void toList(TreeNode root, List<Integer> lista) {

        if (root == null) return;

        if (root.left != null) toList(root.left, lista);
        lista.add(root.val);
        if (root.right != null) toList(root.right, lista);
    }

}

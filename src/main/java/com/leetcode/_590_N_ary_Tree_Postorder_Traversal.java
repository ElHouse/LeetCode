package com.leetcode;

import com.leetcode.structure.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class _590_N_ary_Tree_Postorder_Traversal {


    //	Runtime: 5 ms, faster than 15.46% of Java online submissions for N-ary Tree Postorder Traversal.
//	Memory Usage: 49.5 MB, less than 16.22% of Java online submissions for N-ary Tree Postorder Traversal.
    public List<Integer> postorder(Node root) {

        List<Integer> result = new ArrayList<>();
        Stack<Node> pila = new Stack<>();

        Stack<Node> pila22 = new Stack<>();
        pila.add(root);

        while (!pila.isEmpty()) {

            Node aux = pila.pop();

            pila22.add(aux);
            if (aux.children != null) {
                for (Node n : aux.children) {
                    pila.add(n);
                }
            }

        }

        while (!pila22.isEmpty()) {

            Node aux = pila22.pop();

            result.add(aux.val);
            System.out.print(aux.val + " ");

        }
        return result;
    }


}

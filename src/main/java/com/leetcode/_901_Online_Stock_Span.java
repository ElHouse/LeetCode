package com.leetcode;

import java.util.Stack;

public class _901_Online_Stock_Span {

    private final Stack<Integer> pila;
    private int borradoCount;
    private int borradoCompleto;

    public _901_Online_Stock_Span() {
        pila = new Stack<>();
        borradoCount = 0;
        borradoCompleto =0;
    }

    public int next(int price) {

        if (pila.isEmpty()) {
            pila.add(price);
            return 1;
        } else {
            System.out.println(pila.toString() + "       borradoCount> " + borradoCount);
            boolean borro = false;
            boolean superBorro = false;

            while (!pila.isEmpty() && pila.peek() < price) {
                borradoCount++;
                pila.pop();
                borro = true;
            }

            if(pila.isEmpty()){
                borradoCompleto += borradoCount;
                superBorro = true;
            }

            pila.add(price);

            if (!borro) {
                return 1;
            } else {
                if(superBorro){
                    return 1 + borradoCompleto;
                }

                if (pila.peek() == price && pila.size() == 1) {
                    return 1 + borradoCount;
                } else {
                    return 1 + borradoCount;
                }
            }
        }
    }

}

package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class _346_Moving_Average_from_Data_Stream {

    private int size;
    private Queue<Integer> cola;
    private double suma;

    public _346_Moving_Average_from_Data_Stream(int size) {
        cola = new LinkedList<>();
        this.size = size;
        this.suma = 0;
    }

    public double next(int val) {

        suma += val;
        cola.add(val);

        while (cola.size() > size) {
            suma -= cola.poll();
        }

        return suma / cola.size();
    }
}

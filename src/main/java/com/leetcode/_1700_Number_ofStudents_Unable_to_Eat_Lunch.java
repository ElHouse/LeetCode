package com.leetcode;

import java.util.*;

public class _1700_Number_ofStudents_Unable_to_Eat_Lunch {


    public int countStudents(int[] students, int[] sandwiches) {

        int count = 0;
        Set<String> seen = new HashSet<>();
        Queue<Integer> estudiantes = new LinkedList<>();
        Queue<Integer> comida = new LinkedList<>();


        for (int s : students) {
            estudiantes.add(s);
        }

        for (int s : sandwiches) {
            comida.add(s);
        }

        seen.add(comida.toString());

        while (!comida.isEmpty() && !estudiantes.isEmpty()) {

            int student = estudiantes.poll();

            if (comida.peek() == student) {
                comida.poll();
                count++;
            } else {
                estudiantes.add(student);
            }

            if (seen.contains(estudiantes.toString())) {
                break;
            } else {
                seen.add(estudiantes.toString());
            }

        }


        return students.length - count;

    }
}

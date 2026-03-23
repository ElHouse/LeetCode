package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1700_Number_ofStudents_Unable_to_Eat_LunchTest {

    _1700_Number_ofStudents_Unable_to_Eat_Lunch numberOfStudentsUnableToEatLunch = new _1700_Number_ofStudents_Unable_to_Eat_Lunch();

    @Test
    public void countStudents() {

        int[] students = new int[]{1, 1, 0, 0};
        int[] sandwiches = new int[]{0, 1, 0, 1};

        assertEquals(0, numberOfStudentsUnableToEatLunch.countStudents(students, sandwiches));
    }


    @Test
    public void countStudents01() {

        int[] students = new int[]{1, 1, 1, 0, 0, 1};
        int[] sandwiches = new int[]{1, 0, 0, 0, 1, 1};

        assertEquals(3, numberOfStudentsUnableToEatLunch.countStudents(students, sandwiches));
    }

    @Test
    public void countStudents02() {

        int[] students = new int[]{1, 1, 1, 1, 1, 1};
        int[] sandwiches = new int[]{0, 0, 0, 0, 0, 0};

        assertEquals(6, numberOfStudentsUnableToEatLunch.countStudents(students, sandwiches));
    }

    @Test
    public void countStudents03() {

        int[] students = new int[]{1, 1, 1, 1, 1, 1};
        int[] sandwiches = new int[]{1, 0, 0, 0, 0, 0};

        assertEquals(5, numberOfStudentsUnableToEatLunch.countStudents(students, sandwiches));
    }

    @Test
    public void countStudents04() {

        int[] students = new int[]{1,0 };
        int[] sandwiches = new int[]{1};

        assertEquals(1, numberOfStudentsUnableToEatLunch.countStudents(students, sandwiches));
    }

    @Test
    public void countStudents05() {

        int[] students = new int[]{0 };
        int[] sandwiches = new int[]{0, 1};

        assertEquals(0, numberOfStudentsUnableToEatLunch.countStudents(students, sandwiches));
    }
}
package com.leetcode;

import java.util.Stack;

public class _735_Asteroid_Collision {

/*
We are given an array asteroids of integers representing asteroids in a row. The indices of the asteriod in the array represent their relative position in space.

For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.

Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.



Example 1:

Input: asteroids = [5,10,-5]
Output: [5,10]
Explanation: The 10 and -5 collide resulting in 10. The 5 and 10 never collide.
Example 2:

Input: asteroids = [8,-8]
Output: []
Explanation: The 8 and -8 collide exploding each other.
Example 3:

Input: asteroids = [10,2,-5]
Output: [10]
Explanation: The 2 and -5 collide resulting in -5. The 10 and -5 collide resulting in 10.
*/


    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> right = new Stack<>();//+
        Stack<Integer> left = new Stack<>();//-

        for (int i = 0; i < asteroids.length; i++) {

            if (asteroids[i] > 0) {
                right.add(asteroids[i]);
            } else {

                if (right.isEmpty()) {
                    left.add(asteroids[i]);
                } else {

                    int l = Math.abs(asteroids[i]);
                    boolean destroy = false;
                    while (!right.isEmpty()) {

                        int r = right.peek();

                        if (l > r) {
                            right.pop();
                        } else if (l < r) {
                            destroy = true;
                            break;
                        } else {
                            right.pop();
                            destroy = true;
                            break;
                        }
                    }

                    if (!destroy) {
                        left.add(asteroids[i]);
                    }
                }
            }
        }

        int[] result = new int[right.size() + left.size()];


        for (int i = result.length - 1; i >= 0; i--) {

            int val;

            if (!right.isEmpty()) {
                val = right.pop();
            } else {
                val = left.pop();
            }

            result[i] = val;
        }

        return result;
    }


}

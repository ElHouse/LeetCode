package com.leetcode;

public class _875_Koko_Eating_Bananas {

    int limit;

    public int minEatingSpeed(int[] piles, int h) {
        limit = h;
        int left = 1;
        int right = 0;

        for (int bananas : piles) {
            right = Math.max(right, bananas);
        }

        while (left <= right) {
            int mid = left + (right - left) / 2;
            System.out.println("---------------------------------mid>"+mid);
            if (check(mid, piles)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            System.out.println("right>"+right);
            System.out.println("left>"+left);
        }

        return left;
    }

    public boolean check(double k, int[] piles) {
        int hours = 0;
        for (double bananas : piles) {
            hours += Math.ceil(bananas / k);
        }
        System.out.println("hours>"+hours);
        System.out.println("hours <= limit>"+(hours <= limit));

        return hours <= limit;
    }

}

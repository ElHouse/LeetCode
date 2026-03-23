package com.leetcode;

import java.util.PriorityQueue;

/*
Design a system that manages the reservation state of n seats that are numbered from 1 to n.

Implement the SeatManager class:

SeatManager(int n) Initializes a SeatManager object that will manage n seats numbered from 1 to n. All seats are initially available.
int reserve() Fetches the smallest-numbered unreserved seat, reserves it, and returns its number.
void unreserve(int seatNumber) Unreserves the seat with the given seatNumber.
 */
public class _1845_Seat_Reservation_Manager {

    private final PriorityQueue<Integer> pq;

    public _1845_Seat_Reservation_Manager(int n) {
        pq = new PriorityQueue<>();

        for (int i = 1; i <= n; i++) {
            pq.add(i);
        }
    }

    public int reserve() {
        return pq.poll();
    }

    public void unreserve(int seatNumber) {

        pq.add(seatNumber);
    }
}

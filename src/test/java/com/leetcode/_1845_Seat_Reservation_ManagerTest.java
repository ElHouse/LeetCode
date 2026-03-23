package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _1845_Seat_Reservation_ManagerTest {



    @Test
    public void test01(){
        _1845_Seat_Reservation_Manager seats = new _1845_Seat_Reservation_Manager(5);

        assertEquals(1, seats.reserve());
        assertEquals(2, seats.reserve());
        seats.unreserve(2);
        assertEquals(2, seats.reserve());
        assertEquals(3, seats.reserve());
        assertEquals(4, seats.reserve());
        assertEquals(5, seats.reserve());
        seats.unreserve(2);
    }

}
package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _225_Implement_Stack_using_QueuesTest {

    private final _225_Implement_Stack_using_Queues implementStackUsingQueues = new _225_Implement_Stack_using_Queues();


    @Test
    public void case1() {
        _225_Implement_Stack_using_Queues case1 = new _225_Implement_Stack_using_Queues();
        case1.push(1);
        case1.push(2);
        case1.push(3);
        case1.push(4);
        case1.push(5);
        case1.push(6);


        System.out.println(case1.pop());
        System.out.println(case1.pop());

        case1.push(10);
        case1.push(11);

        System.out.println(case1.pop());
        System.out.println(case1.pop());
        System.out.println(case1.pop());
        System.out.println(case1.pop());

    }
}
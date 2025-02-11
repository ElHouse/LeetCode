package com.leetcode.pendientes;

public class _29_Divide_Two_Integers {


    //TODO Terminar

    public int divide(long dividend, long divisor) {


        int count = 0;
        int suma = 0;

        boolean negativoDivisor = (divisor < 0) ? true : false;
        boolean negativoDividend = (dividend < 0) ? true : false;

        if (negativoDivisor) {
            divisor *= -1;
        }
        if (negativoDividend) {
            dividend *= -1;
        }

        while (suma < dividend) {

            count++;  suma += divisor;
        }

        if(suma!=dividend) count--;


        return negativoDivisor ? count * -1 : count;
    }

}

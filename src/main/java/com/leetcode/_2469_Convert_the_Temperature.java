package com.leetcode;

public class _2469_Convert_the_Temperature {


    public double[] convertTemperature(double celsius) {
        return new double[]{celsius+ 273.15, celsius * 1.80 + 32.00};
    }


}

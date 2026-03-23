package com.leetcode;

public class _3280_Convert_Date_to_Binary {


    public String convertDateToBinary(String date) {

        String[] parts = date.split("-");
        StringBuilder sb = new StringBuilder();

        sb.append(Integer.toBinaryString(Integer.parseInt(parts[0])));
        sb.append("-");
        sb.append(Integer.toBinaryString(Integer.parseInt(parts[1])));
        sb.append("-");
        sb.append(Integer.toBinaryString(Integer.parseInt(parts[2])));

        return sb.toString();
    }
}

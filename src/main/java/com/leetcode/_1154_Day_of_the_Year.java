package com.leetcode;


public class _1154_Day_of_the_Year {

    public int dayOfYear(String date) {

        if (date == null) return 0;

        int anio = Integer.parseInt(date.substring(0, 4));
        int mes = Integer.parseInt(date.substring(5, 7));
        int dia = Integer.parseInt(date.substring(8, 10));

        boolean biciesto = (anio % 4 == 0) && ((anio % 100) != 0 || (anio % 400) == 0);

        int[] diasPorMes = new int[]{31, (biciesto) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


        int dias = 0;

        if (mes > 1) {
            for (int i = 0; i < mes - 1; i++) {
                dias += diasPorMes[i];

            }
        }

        dias += dia;
        return dias;
    }

}

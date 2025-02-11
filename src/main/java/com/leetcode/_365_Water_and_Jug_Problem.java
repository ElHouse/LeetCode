package com.leetcode;

import java.util.HashSet;

public class _365_Water_and_Jug_Problem {

    HashSet<String> paths = null;
    String coso = "-";
    boolean encontado = false;

    public boolean canMeasureWater(int x, int y, int target) {

        if(x+y<target){
            return false;
        }

        encontado = false;
        paths = new HashSet<>();


        canMeasureWater(x, y, target, 0, 0);
        return encontado;
    }


    private void canMeasureWater(int xMaximo, int yMaximo, int target, int x, int y) {


        if ((x + y) == target) {
            encontado = true;
            return;
        }

        if (paths.contains(x + coso + y)) {
            return;
        }

        paths.add(x + coso + y);

        //llenar X
        if (x < xMaximo) {
            canMeasureWater(xMaximo, yMaximo, target, xMaximo, y);
        }
        //llenar Y
        if (y < yMaximo) {
            canMeasureWater(xMaximo, yMaximo, target, x, yMaximo);
        }


        //pasar a X
        if (x < xMaximo && y > 0) {
            int espacio = xMaximo - x;
            canMeasureWater(xMaximo, yMaximo, target, Math.min(xMaximo, x + y), Math.max(0, y - espacio));
        }
        //pasar a y
        if (y < yMaximo && x > 0) {
            int espacio = yMaximo - y;
            canMeasureWater(xMaximo, yMaximo, target, Math.max(0, x - espacio), Math.min(yMaximo, x + y));
        }


        //vaciar X
        if (x > 0) {
            canMeasureWater(xMaximo, yMaximo, target, 0, y);
        }
        //vaciar Y
        if (y > 0) {
            canMeasureWater(xMaximo, yMaximo, target, x, 0);
        }
    }

}

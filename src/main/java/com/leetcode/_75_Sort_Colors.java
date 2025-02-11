package com.leetcode;

public class _75_Sort_Colors {


    public void sortColors(int[] nums) {

        int last = 1;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            imprimir(nums);

            if (nums[i] != count) {

                if (last < i) {
                    last = i + 1;
                }

                for (; last < nums.length; last++) {
                    if (nums[last] == count) {
                        int aux = nums[i];
                        nums[i] = nums[last];
                        nums[last] = aux;
                        break;
                    }
                }

                if (last >= nums.length) {
                    count++;
                    last = i--;
                }
            }

        }

        imprimir(nums);
    }


    private void imprimir(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "-");
        }
        System.out.println("-------------");
    }


}

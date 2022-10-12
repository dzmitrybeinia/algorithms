package com.dzmitrybeinia.algoexpert.arrays.two_number_sum;

import java.util.*;

class Program {

    public static void main(String[] args) {
        int [] array = new int[]{3, 5, -4, 8, 11, 1, -1, 6};
        System.out.println(Arrays.toString(twoNumberSum(array, 10)));
    }

    public static int[] twoNumberSum(int[] array, int targetSum) {

        Set<Integer> difSet = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            int dif = targetSum - array[i];
            if(difSet.contains(dif)) {
                return new int[]{dif, array[i]};
            } else {
                difSet.add(array[i]);
            }
        }

        return new int[0];
    }
}


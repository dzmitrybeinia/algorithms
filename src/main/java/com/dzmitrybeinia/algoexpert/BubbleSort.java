package com.dzmitrybeinia.algoexpert;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubbleSort(new int[]{8, 5, 2, 9, 5, 6, 3})));
    }

    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[j] < array[i]) {
                    int swap = array[j];
                    array[j] = array[i];
                    array[i] = swap;
                }
            }
        }
        return array;
    }
}

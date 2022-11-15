package com.dzmitrybeinia.algoexpert;

import java.util.*;

public class SortedSquareArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquaredArray(new int[]{-5, 1, 2, 3, 5, 6, 8, 9})));
    }

    public static int[] sortedSquaredArray(int[] array) {
        int [] output = new int[array.length];
        int smallest = 0;
        int largest = array.length - 1;
        int outputIndex = array.length - 1;
        while (smallest <= largest) {
            int square;
            if(Math.abs(array[largest]) >= Math.abs(array[smallest])) {
                square = array[largest] * array[largest];
                largest--;
            } else {
                square = array[smallest] * array[smallest];
                smallest++;
            }
            output[outputIndex] = square;
            outputIndex--;
        }
        return output;
    }
}

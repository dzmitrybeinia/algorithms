package com.dzmitrybeinia.algoexpert;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{0, 1, 21, 33, 45, 45, 61, 71, 72, 73}, 21));
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int middle = (right + left) / 2;
            if(array[middle] == target) {
                return middle;
            } else if(target > array[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
}

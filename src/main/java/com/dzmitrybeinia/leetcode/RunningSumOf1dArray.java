package com.dzmitrybeinia.leetcode;

import java.util.Arrays;

public class RunningSumOf1dArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(runningSum(new int[]{1, 1, 1, 1, 1})));
        System.out.println(Arrays.toString(runningSum(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(runningSum(new int[]{1, 3, 6, 10, 15})));
    }

    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
}

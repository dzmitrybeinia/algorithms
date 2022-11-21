package com.dzmitrybeinia.algoexpert;

public class PalindromeCheck {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abcdcba"));
        System.out.println(isPalindrome("abb"));
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if(str.charAt(left) == str.charAt(right)) {
                left++;
                right--;
            } else return false;
        }
        return true;
    }
}

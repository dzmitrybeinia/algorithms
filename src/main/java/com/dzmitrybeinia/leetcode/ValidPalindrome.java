package com.dzmitrybeinia.leetcode;

import java.util.Set;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(" "));
    }

    public static boolean isPalindrome(String s) {
        int leftId = 0;
        int rightId = s.length() - 1;
        while (leftId < rightId) {
            while (leftId < rightId && !isAlphanumericCharacter(s.charAt(leftId))) {
                leftId++;
            }
            while (leftId < rightId && !isAlphanumericCharacter(s.charAt(rightId))) {
                rightId--;
            }
            if (Character.toLowerCase(s.charAt(leftId)) != Character.toLowerCase(s.charAt(rightId))) {
                return false;
            } else {
                leftId++;
                rightId--;
            }
        }
        return true;
    }

    private static boolean isAlphanumericCharacter(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
    }
}

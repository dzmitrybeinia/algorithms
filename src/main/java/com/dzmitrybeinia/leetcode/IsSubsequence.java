package com.dzmitrybeinia.leetcode;

import java.util.List;

public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc","ahbgdc"));
        System.out.println(isSubsequence("axc", "ahbgdc"));
    }

    public static boolean isSubsequence(String s, String t) {
        int sId = 0;
        int tId = 0;
        while (sId < s.length() && tId < t.length()) {
            if(s.charAt(sId) == t.charAt(tId)) {
                sId++;
            }
            tId++;
        }
        return sId == s.length();
    }
}

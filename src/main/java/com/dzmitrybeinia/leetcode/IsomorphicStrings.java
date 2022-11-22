package com.dzmitrybeinia.leetcode;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("foo", "bar"));
        System.out.println(isIsomorphic("paper", "title"));
        System.out.println(isIsomorphic("badc", "baba"));
    }

    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> matchMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(matchMap.get(s.charAt(i)) == null) {
                if(matchMap.containsValue(t.charAt(i))) {
                    return false;
                }
                matchMap.put(s.charAt(i), t.charAt(i));
            } else if (matchMap.get(s.charAt(i)) != t.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}

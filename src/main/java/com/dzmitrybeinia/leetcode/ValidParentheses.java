package com.dzmitrybeinia.leetcode;

import java.util.LinkedList;
import java.util.Map;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
    }

    public static boolean isValid(String s) {
        var mapping = Map.of(
                '(', ')',
                '[', ']',
                '{', '}'
        );
        var stack = new LinkedList<>();
        for(char c : s.toCharArray()) {
            if(mapping.containsKey(c)) {
                stack.push(c);
            } else {
                if(stack.size() == 0) {
                    return false;
                }
                if(c != mapping.get(stack.pop())) {
                    return false;
                }
            }
        }
        return stack.size() == 0;
    }
}

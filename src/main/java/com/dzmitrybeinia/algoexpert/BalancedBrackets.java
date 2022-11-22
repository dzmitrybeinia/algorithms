package com.dzmitrybeinia.algoexpert;

import java.util.*;

public class BalancedBrackets {
    public static void main(String[] args) {
        System.out.println(balancedBrackets("([])(){}(())()()"));
        System.out.println(balancedBrackets("(((((({{{{{[[[[[([)])]]]]]}}}}}))))))"));
        System.out.println(balancedBrackets("()()[{()})]"));
        System.out.println(balancedBrackets("(141[])(){waga}((51afaw))()hh()"));
        System.out.println(balancedBrackets("()[]{}{"));
    }

    public static boolean balancedBrackets(String str) {
        Map<Character, Character> brackets = Map.of(
                '(', ')',
                '{', '}',
                '[', ']'
        );
        Deque<Character> stack = new LinkedList<>();
        for (Character ch : str.toCharArray()) {
            if (!isBracket(ch)) {
                continue;
            }
            if(brackets.containsKey(ch)) {
                stack.push(ch);
            } else {
                if(stack.isEmpty() || !ch.equals(brackets.get(stack.pop()))) {
                    return false;
                }
            }
        }
        return stack.size() == 0;
    }

    private static boolean isBracket(Character ch) {
        return ch == '(' || ch ==')' || ch == '{' || ch == '}' || ch == '[' || ch == ']';
    }
}

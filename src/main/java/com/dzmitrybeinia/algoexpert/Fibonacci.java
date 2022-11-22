package com.dzmitrybeinia.algoexpert;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(getNthFib(2));
        System.out.println(getNthFib(6));
        System.out.println(getNthFib(5));
        System.out.println(getNthFib(7));
        System.out.println(getNthFib(9));
    }

    public static int getNthFib(int n) {
        if (n == 1) return 0;
        if (n == 2) return 1;
        int prevPrevNumber = 0;
        int prevNumber = 1;
        int nFib = 0;
        int i = 2;
        while (i < n) {
            nFib = prevNumber + prevPrevNumber;
            prevPrevNumber = prevNumber;
            prevNumber = nFib;
            i++;
        }
        return nFib;
    }
}

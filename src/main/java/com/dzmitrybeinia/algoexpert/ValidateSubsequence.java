package com.dzmitrybeinia.algoexpert;

import java.util.List;

public class ValidateSubsequence {
    public static void main(String[] args) {
        System.out.println(isValidSubsequence(List.of(1, 1, 6, 1), List.of(1, 1, 1, 6)));
    }

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int arrayId = 0;
        int sequenceId = 0;
        while(arrayId < array.size() && sequenceId < sequence.size()) {
            if(array.get(arrayId) == sequence.get(sequenceId)) {
                sequenceId++;
            }
            arrayId++;
        }
        return sequenceId == sequence.size();
    }
}

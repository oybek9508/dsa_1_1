package com.example.tester_peroject.tasks.stacks;

import java.util.Stack;

public class NextGreaterValue {

    public int[] findNextGreaterValue() {
        int[] arr = new int[]{7, 8, 8, 6, 4, 8};
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            result[i] = -1;
        }

        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                int index = stack.pop();
                result[index] = arr[i];
            }
            stack.push(i);
        }
        return result;
    }
}

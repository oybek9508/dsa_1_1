package com.example.tester_peroject.tasks.stacks;

import java.util.Arrays;
import java.util.Stack;

public class MinStack {
    Stack<Integer> stack = new Stack<>();

    public void push(int data) {
        if (!stack.isEmpty() && stack.peek() < data) {
            int poppedItem = stack.pop();
            stack.push(data);
            stack.push(poppedItem);
        } else {
            stack.push(data);
        }
    }

    public int getMin() {
        if (stack.isEmpty()) {
            System.out.println("The list is empty");
            return -1;
        }
        return stack.peek();
    }

    @Override
    public String toString() {
        return Arrays.toString(stack.toArray());
    }
}

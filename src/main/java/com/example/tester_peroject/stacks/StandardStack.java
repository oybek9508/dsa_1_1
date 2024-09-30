package com.example.tester_peroject.stacks;

import java.util.Arrays;
import java.util.Stack;

public class StandardStack {
    private int[] stack = new int[3];
    private int counter;

    public void push(int item) {
        if (counter == stack.length) {
            int[] newStack = new int[counter * 2];

            for (int i = 0; i < counter; i++) {
                newStack[i] = stack[i];
            }
            stack = newStack;
        }
        stack[counter++] = item;
    }

    public int pop() {
        if (counter == 0) throw new IllegalArgumentException("Stack is empty");
        int item = stack[counter - 1];
        counter--;
        return item;
    }

    public int peek() {
        if (counter == 0) throw new IllegalArgumentException("Stack is empty");
        System.out.println(counter);
        return stack[counter - 1];
    }

    public boolean isEmpty() {
        return counter == 0;
    }

    @Override
    public String toString() {
        var content = Arrays.copyOfRange(stack, 0, counter);
        return Arrays.toString(content);
    }
}

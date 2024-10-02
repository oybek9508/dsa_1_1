package com.example.tester_peroject.tasks.stacks;

import java.util.Arrays;

public class StackWithArray {
    private int[] arr;
    private int top = -1;
    private int capacity;

    public StackWithArray(int size) {
        arr = new int[size];
        capacity = size;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            System.exit(1);
        }

        arr[++top] = data;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            System.exit(1);
        }

        return arr[top - 1];
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            System.exit(1);
        }
        int removedItem = arr[top - 1];
        arr[top--] = 0;
        return removedItem;
    }

    public boolean isFull() {
        return top + 1 == capacity;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}

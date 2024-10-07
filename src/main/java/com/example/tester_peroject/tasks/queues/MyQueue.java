package com.example.tester_peroject.tasks.queues;

import java.util.Arrays;

public class MyQueue {
    private int[] arr = new int[5];
    private int size = 0;
    private int count = 0;

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("The Queue is full");
            return;
        }
        if (size == 5 && size - count < 5) {
            size = 0;
        }
        arr[size++] = data;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("queue is empty");
        }
    }

    public int peek() {
        return arr[0];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == arr.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}

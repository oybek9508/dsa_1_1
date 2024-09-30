package com.example.tester_peroject.queue;

import java.util.Arrays;

public class ArrayQueue {
    int[] q = new int[5];
    private int front;
    private int rear;
    private int count;

    public void enqueue(int item) {
        if (isFull()) throw new StackOverflowError("Queue is full");
        q[rear] = item;
        rear = (rear + 1) % q.length;
        count++;

    }

    public int dequeue() {
        if (isEmpty()) throw new IllegalArgumentException("Queue is empty");
        int item = q[0];
        q[front] = 0;
        front = (front + 1) % q.length;
        count--;
        return item;
    }

    public int peek() {
        if (isEmpty()) throw new IllegalArgumentException("Queue is empty");
        return q[front];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == q.length;
    }

    @Override
    public String toString() {
//        var content = Arrays.copyOfRange(q, front, count);
        return Arrays.toString(q);
    }
}

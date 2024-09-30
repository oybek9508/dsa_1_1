package com.example.tester_peroject.queue;

import ch.qos.logback.core.encoder.ByteArrayUtil;

import java.sql.Array;
import java.util.ArrayDeque;
import java.util.Arrays;

public class StackWithTwoQueues {
    ArrayDeque<Integer> queue1 = new ArrayDeque<>();
    ArrayDeque<Integer> queue2 = new ArrayDeque<>();

    public void push(int item) {
        queue1.push(item);
    }

    public int pop() {
        if (queue1.isEmpty()) throw new IllegalArgumentException("Queue is empty");
        var queueArray1 = queue1.toArray();
        if (queue2.isEmpty()) {
            for (int i = queueArray1.length - 1; i >= 0; i--) {
                queue2.push((Integer) queueArray1[i]);
            }
        }
        return queue2.pop();
    }

    public void printStack() {
        var queueArray = queue2.toArray();

        for (int item : queue1) {
            System.out.println("-----> " + item);
        }

        for (int i = queueArray.length - 1; i >= 0; i--) {
            System.out.println("--> " + queueArray[i]);
        }
    }
}

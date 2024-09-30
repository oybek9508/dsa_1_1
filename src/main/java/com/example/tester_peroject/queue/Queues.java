package com.example.tester_peroject.queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class Queues {
    Stack<Integer> stack = new Stack<>();

    public void reverse(Queue<Integer> queue) {
        if (queue.isEmpty()) throw new IllegalArgumentException("Queue is empty");
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        System.out.println(queue);
    }

}

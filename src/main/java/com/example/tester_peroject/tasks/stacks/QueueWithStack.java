package com.example.tester_peroject.tasks.stacks;

import java.util.Arrays;
import java.util.Stack;

public class QueueWithStack {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();


    public void enqueue(int data) {
        stack1.push(data);
    }

    public int dequeue() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }

    public void printQueue() {
        for (int s1 : stack1) {
            System.out.println("-->:" + s1);
        }
        for (int i = stack2.size() - 1; i >= 0; i--) {
            System.out.println("-->: " + stack2.get(i));

        }
    }
}

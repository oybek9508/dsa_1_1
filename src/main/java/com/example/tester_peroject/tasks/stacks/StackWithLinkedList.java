package com.example.tester_peroject.tasks.stacks;

import java.util.Arrays;
import java.util.LinkedList;

public class StackWithLinkedList {
    private LinkedList<Integer> linkedList = new LinkedList<>();

    public void push(int data) {
        linkedList.push(data);
    }

    public int peek() {
        if (linkedList.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        return linkedList.getLast();
    }

    public int pop() {
        if (linkedList.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        return linkedList.removeLast();
    }

    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public String toString() {
        return Arrays.toString(linkedList.toArray());
    }
}

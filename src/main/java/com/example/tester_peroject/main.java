package com.example.tester_peroject;

import com.example.tester_peroject.tasks.stacks.SortStack;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Stack;

@SpringBootApplication
public class main {

    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(5);
        stack1.push(3);
        stack1.push(1);
        stack1.push(0);
        stack1.push(2);
        stack1.push(8);
        stack1.push(1);
        stack1.push(7);

        SortStack stack = new SortStack();

        stack.sortStack(stack1);

    }

}

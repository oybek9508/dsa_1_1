package com.example.tester_peroject.tasks.stacks;

import java.util.Stack;

public class SortStack {
    Stack<Integer> stack2 = new Stack<>();

    public void sortStack(Stack stack1) {
        if (stack1.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        stack2.push((Integer) stack1.pop());

        while (!stack1.isEmpty()) {
            Integer poppedItemStack1 = (Integer) stack1.pop();
            if (poppedItemStack1 < stack2.peek()) {
                int item = stack2.pop();
//                stack2.push(poppedItemStack1);
//                stack1.push(item);

            } else {
                stack2.push(poppedItemStack1);
            }

//
        }

        System.out.println(stack1.pop());
    }
}

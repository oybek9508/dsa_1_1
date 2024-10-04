package com.example.tester_peroject.tasks.stacks;

import java.util.Arrays;
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
            Integer poppedItemStack1 = (Integer) stack1.pop(); // Pop the last item from stack1

            // Compare poppedItemStack1 with the top of stack2
            while (!stack2.isEmpty() && stack2.peek() > poppedItemStack1) {
                stack1.push(stack2.pop()); // Push the larger item from stack2 to stack1
            }

            // Push the current poppedItemStack1 into stack2 if it's smaller or stack2 is empty
            stack2.push(poppedItemStack1);
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(stack2.toArray());
    }
}

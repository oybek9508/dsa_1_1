package com.example.tester_peroject.tasks.stacks;

import java.util.Stack;

public class BalancedParanthasis {
    Stack<Character> stack = new Stack<>();
    private String brackets = "({}{}[][]]])";
    private char[] bChars = brackets.toCharArray();

    public BalancedParanthasis() {
    }

    public boolean balancedParanthesis() {
        for (int i = 0; i < bChars.length; i++) {
            if (bChars[i] == '(' || bChars[i] == '{' || bChars[i] == '[') {
                stack.push(bChars[i]);
            }

            if (bChars[i] == ')' || bChars[i] == '}' || bChars[i] == ']') {
                if (stack.isEmpty()) return false;

                if (stack.peek() == '{' && bChars[i] == '}' || stack.peek() == '[' && bChars[i] == ']' || stack.peek() == '(' && bChars[i] == ')') {
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();
    }

}

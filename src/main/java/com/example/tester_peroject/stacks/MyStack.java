package com.example.tester_peroject.stacks;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class MyStack {
    private final List<Character> leftBrackets = Arrays.asList('{', '[', '(', '<');
    private final List<Character> rightBrackets = Arrays.asList('}', ']', ')', '>');
    Stack<Character> stackStr = new Stack<>();

    public String reverseString(String str) {
        if (str == null) throw new IllegalArgumentException();
        for (char c : str.toCharArray()) {
            stackStr.push(c);
        }
        StringBuilder reversed = new StringBuilder();
        while (!stackStr.isEmpty()) {
            reversed.append(stackStr.pop());
        }
        return reversed.toString();
    }

    public boolean balancedExpression(String str) {
        Stack<Character> stack = new Stack<>();
        if (str == null || str == "") throw new IllegalArgumentException();

        for (char c : str.toCharArray()) {
            if (isLeftExpression(c)) {
                stack.push(c);
            }
            if (isRightExpression(c)) {
                if (stack.isEmpty()) return false;
                else {
                    if (!isMatchingBrackets(stack.peek(), c)) {
                        return false;
                    } else {
                        stack.pop();
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    private boolean isLeftExpression(char c) {
        return leftBrackets.contains(c);
    }

    private boolean isRightExpression(char c) {
        return rightBrackets.contains(c);
    }

    private boolean isMatchingBrackets(char left, char right) {
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }
}

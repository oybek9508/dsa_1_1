package com.example.tester_peroject.tasks.stacks;

import java.util.Arrays;
import java.util.Stack;

public class ValidParanthesis {
    String str = "(*()*)*)";
    char[] strChar = str.toCharArray();
    Stack<Character> stack = new Stack<>();

    public void balanceParanthesis() {
        int starLength = 0;
        if (strChar[0] == ')') {
            System.out.println("Invalid expression");
            return;
        }
        for (int i = 0; i < strChar.length; i++) {
            if (strChar[i] == '(') {
                stack.push(strChar[i]);
            }
            if (strChar[i] == ')' && stack.contains('(')) {
                stack.removeElement('(');
            }
            if (strChar[i] == '*') {
                starLength++;
            }
        }

        if (starLength >= 1 && stack.isEmpty()) {
            System.out.println("empty string");
        } else if (starLength == stack.size() && stack.peek() == '(') {
            System.out.println("* is )");
        } else if (starLength == stack.size() && stack.peek() == ')') {
            System.out.println("* is (");
        } else {
            System.out.println("Invalid expression");
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(stack.toArray());
    }
}

package com.example.tester_peroject.tasks.stacks;

import java.util.Arrays;
import java.util.Stack;

public class Calculator {
    Stack<Integer> stack = new Stack<>();

    public int calculate() {
        String expression = "2 - 2 * 3";
        expression = expression.replaceAll("\\s+", "");
        char[] charExpression = expression.toCharArray();
        int finalResult = 0;
        for (int i = 0; i < charExpression.length; i++) {
            if (Character.isDigit(charExpression[i])) {
                stack.push(Character.getNumericValue(charExpression[i]));
            } else if (charExpression[i] == '*') {
                int result = stack.pop() * Character.getNumericValue(charExpression[i + 1]);
                stack.push(result);
                i++;
            } else if (charExpression[i] == '/') {
                int result = stack.pop() / Character.getNumericValue(charExpression[i + 1]);
                stack.push(result);
                i++;
            } else if (charExpression[i] == '+') {
                stack.push(Character.getNumericValue(charExpression[i + 1]));
                i++;
            } else if (charExpression[i] == '-') {
                stack.push((-1 * Character.getNumericValue(charExpression[i + 1])));
                i++;
            }
        }

        while (!stack.isEmpty()) {
            finalResult = finalResult + stack.pop();
        }

        return finalResult;
    }

    @Override
    public String toString() {
        return Arrays.toString(stack.toArray());
    }
}

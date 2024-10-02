package com.example.tester_peroject.tasks.stacks;

import java.util.Stack;

public class ReversePolishNotation {

    private String[] notation = {"4", "13", "5", "/", "+"};

    public ReversePolishNotation() {
    }

    Stack<Integer> stack = new Stack<>();

    public int reversePolishNotation() {
        int result = 0;
        for (String item : notation) {
            if (!item.equals("/") && !item.equals("*") && !item.equals("-") && !item.equals("+") && !item.equals("%")) {
                stack.push(Integer.parseInt(item));
            } else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                switch (item) {
                    case "+":
                        result = operand1 + operand2;
                        break;
                    case "-":
                        result = operand1 - operand2;
                        break;
                    case "*":
                        result = operand1 * operand2;
                        break;
                    case "%":
                        result = operand1 % operand2;
                        break;
                    case "/":
                        if (operand2 != 0) {
                            result = operand1 / operand2;
                        } else {
                            System.out.println("Cannot divide by zero");
                        }
                        break;
                    default:
                        System.out.println("Invalid operator");
                }
                stack.push(result);
            }
        }
        return result;
    }
}

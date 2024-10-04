package com.example.tester_peroject.tasks.stacks;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
    int[] temperatures = new int[]{30, 40, 50, 60};
    Stack<Integer> stack = new Stack<>();
    int size;

    public void futureWarmerDays() {
        for (int i = 0; i < temperatures.length - 1; i++) {
            if (temperatures[i] < temperatures[i + 1]) {
                stack.push(1);
                size++;
            } else {
                for (int j = i; j < temperatures.length - 1; j++) {
                    if (j != temperatures.length - 1 && temperatures[i] < temperatures[j + 1]) {
                        stack.push(j - i + 1);
                        size++;
                        break;
                    }
                }
                if (i + 1 > stack.size()) {
                    stack.push(0);
                }
            }
        }
        stack.push(0);
    }

    @Override
    public String toString() {
        return Arrays.toString(stack.toArray());
    }
}

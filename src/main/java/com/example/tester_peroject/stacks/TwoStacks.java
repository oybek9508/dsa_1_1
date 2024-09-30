package com.example.tester_peroject.stacks;

import java.util.Arrays;

public class TwoStacks {
    int[][] twoStacks = new int[2][5];
    private int count1;
    private int count2;

    public void push1(int item) {
        if (count1 == twoStacks[0].length) {
            int[] newArray = new int[count1 * 2];
            for (int i = 0; i < count1; i++) {
                newArray[i] = twoStacks[0][i];
            }
            twoStacks[0] = newArray;
        }
        twoStacks[0][count1++] = item;
    }

    public void push2(int item) {
        if (count2 == twoStacks[1].length) {
            int[] newArray = new int[count2 * 2];
            for (int i = 0; i < count2; i++) {
                newArray[i] = twoStacks[1][i];
            }
            twoStacks[1] = newArray;
        }
        twoStacks[1][count2++] = item;
    }

    public int pop1() {
        if (count1 == 0) throw new IllegalArgumentException("Stack is empty");
        return twoStacks[0][count1--];

    }

    public int pop2() {
        if (count2 == 0) throw new IllegalArgumentException("Stack is empty");
        return twoStacks[1][count2--];

    }

    @Override
    public String toString() {
        var content1 = Arrays.copyOfRange(twoStacks[0], 0, count1);
        var content2 = Arrays.copyOfRange(twoStacks[1], 0, count2);
        return "content1: " + Arrays.toString(content1) + ", content2: " + Arrays.toString(content2);
    }
}

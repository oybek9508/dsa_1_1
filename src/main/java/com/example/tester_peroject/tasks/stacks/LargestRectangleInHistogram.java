package com.example.tester_peroject.tasks.stacks;

import java.util.Stack;

public class LargestRectangleInHistogram {
    private final int[] heights = new int[]{2, 1, 5, 6, 2, 3};

    public int largestRectangleArea() {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i < n; i++) {
            // Maintain stack of increasing height bars
            while (!stack.isEmpty() && heights[stack.peek()] > heights[i]) {
                int height = heights[stack.pop()];
//                System.out.println("height: " + height);
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
//                System.out.println("width: " + width);
                maxArea = Math.max(maxArea, height * width);
//                System.out.println("maxArea: " + maxArea);
            }
            stack.push(i);
        }

        // Clean up remaining bars in the stack
        while (!stack.isEmpty()) {
            int height = heights[stack.pop()];
            int width = stack.isEmpty() ? n : n - stack.peek() - 1;
            maxArea = Math.max(maxArea, height * width);
            System.out.println("maxArea 2: " + maxArea);
        }

        return maxArea;
    }


}

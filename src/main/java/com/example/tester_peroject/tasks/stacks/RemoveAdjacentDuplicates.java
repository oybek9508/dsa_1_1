package com.example.tester_peroject.tasks.stacks;

import java.util.Arrays;
import java.util.Stack;

public class RemoveAdjacentDuplicates {
    private String duplicateString = "azxxzy";
    Stack<Character> charStack = new Stack<>();

    char[] strChar = duplicateString.toCharArray();

    public String removeDuplicateChars() {
        for (int i = 0; i < strChar.length; i++) {
            if (!charStack.isEmpty() && strChar[i] == charStack.peek()) {
                charStack.pop();
            } else {
                charStack.push(strChar[i]);
            }
        }
        return Arrays.toString(charStack.toArray());
    }

}

package com.example.tester_peroject.hash_table;

import java.util.HashSet;

public class FirstRepeatedCharacter {
    private String str = "gren apple";
    private HashSet<Character> set = new HashSet<>();

    public char firstRepeatedCharacter() {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (set.contains(ch)) {
                return ch;
            }
            set.add(ch);
        }

        return Character.MIN_VALUE;
    }

}

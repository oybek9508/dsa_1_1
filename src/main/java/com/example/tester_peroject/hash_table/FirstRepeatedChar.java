package com.example.tester_peroject.hash_table;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatedChar {
    private final String str = "aapplele";
    private HashMap<Character, Integer> map = new HashMap<>();

    public char findFirstNonRepeatedChar() {

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.get(ch) == 1 && ch != ' ') return ch;
        }
        return Character.MIN_VALUE;
    }
}

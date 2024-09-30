package com.example.tester_peroject.hash_table;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class HashTableExercise {
    int[] nums = {1, 3, 8, 3, 7, 11, 15};
    HashMap<Integer, Integer> hashMap = new HashMap<>();

    public int mostFrequent() {
        for (Integer key : nums) {
            hashMap.put(key, hashMap.getOrDefault(key, 0) + 1);
        }

        int max = 0;
        int repeatedKey = 0;
        for (Integer key : hashMap.keySet()) {
            if (max < hashMap.get(key)) {
                repeatedKey = key;
                max = hashMap.get(key);
            }
        }

        return repeatedKey;
    }

    public int countPairWithDiff(int k) {
        int pairs = 0;
        for (Integer key : nums) {
            hashMap.put(key, key + k);
        }

        for (Integer key : hashMap.keySet()) {
            if (hashMap.containsKey(hashMap.get(key))) {
                pairs++;
            }
        }

        return pairs;

    }

    public int[] twoSum(int target) {
        for (int i = 0; i < nums.length; i++) {
            int compliment = target = nums[i];

            if (hashMap.containsKey(compliment)) {
                System.out.println("--> " + hashMap.get(compliment));
                System.out.println("--> " + i);
                return new int[]{hashMap.get(compliment), i};
            }

            hashMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    @Override
    public String toString() {
        return Arrays.toString(hashMap.entrySet().toArray());
    }
}

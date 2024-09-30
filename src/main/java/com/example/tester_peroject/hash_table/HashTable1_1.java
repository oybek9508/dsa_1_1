package com.example.tester_peroject.hash_table;


import java.util.LinkedList;

public class HashTable1_1 {
    private int size = 5;
    private LinkedList<HashEntry>[] hashMap;

    private class HashEntry {
        private Integer key;
        private String name;

        public HashEntry(Integer key, String name) {
            this.key = key;
            this.name = name;
        }
    }

    public HashTable1_1() {
        hashMap = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            hashMap[i] = new LinkedList<>();
        }
    }

    public void put(int key, String name) {
        int index = hashing(key);
        LinkedList<HashEntry> bucket = hashMap[index];

        for (HashEntry entry : bucket) {
            if (entry.key.equals(key)) {
                throw new IllegalArgumentException("Key already exits");
            }
        }
        bucket.add(new HashEntry(key, name));
    }

    public String get(int key) {
        int index = hashing(key);
        var bucket = hashMap[index];
        for (HashEntry entry : bucket) {
            if (entry.key.equals(key)) {
                return entry.name;
            }
        }
        return null;
    }

    public String remove(int key) {
        int index = hashing(key);
        var bucket = hashMap[index];

        var iterator = bucket.iterator();
        while (iterator.hasNext()) {
            var entry = iterator.next();
            String name = entry.name;
            iterator.remove();
            return name;
        }
        return null;
    }

    public int size() {
        return size;
    }

    private int hashing(int key) {
        return key % hashMap.length;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            var bucket = hashMap[i];
            if (bucket != null) {
                for (HashEntry entry : bucket) {
                    System.out.println("Key: " + entry.key + " name: " + entry.name);
                }
            }
        }
    }
}

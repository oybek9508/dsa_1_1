package com.example.tester_peroject.hash_table;

import java.util.LinkedList;

public class HashWithLinkedList {
    private final LinkedList<Node>[] hashList;
    private final int size = 5;

    public HashWithLinkedList() {
        hashList = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            hashList[i] = new LinkedList<>();
        }
    }

    private class Node {
        private final HashEntry value;

        public Node(HashEntry value) {
            this.value = value;
        }
    }

    private static class HashEntry {
        private final Integer key;
        private final String name;

        public HashEntry(Integer key, String name) {
            this.key = key;
            this.name = name;
        }
    }

    private int hashing(int k) {
        return k % size;
    }

    private boolean isEmpty(int index) {
        return hashList[index].isEmpty();
    }

    public void put(int k, String name) {
        int index = hashing(k);
        var bucket = hashList[index];
        for (Node node : bucket) {
            if (node.value.key.equals(k)) {
                throw new IllegalArgumentException("The key already exists");
            }
        }
        bucket.add(new Node(new HashEntry(k, name)));
    }

    public String get(int key) {
        var index = hashing(key);
//        if (isEmpty(index)) throw new IllegalArgumentException("The list is empty");
        var bucket = hashList[index];

        for (Node node : bucket) {
            if (node.value.key.equals(key)) {
                return node.value.name;
            }
        }

        return null;
    }

    public String remove(int key) {
        var index = hashing(key);
        var bucket = hashList[index];
        var iterator = bucket.iterator();
        while (iterator.hasNext()) {
            Node node = iterator.next();
            if (node.value.key.equals(key)) {
                String item = node.value.name;
                iterator.remove();
                return item;
            }
        }
        return null;
    }

    public void printHashList() {
        for (int i = 0; i < size; i++) {
            var bucket = hashList[i];
            for (Node node : bucket) {
                System.out.println("key " + node.value.key + " name " + node.value.name);
            }
        }
    }
}

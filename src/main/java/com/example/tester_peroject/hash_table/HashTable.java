package com.example.tester_peroject.hash_table;

public class HashTable {
    private int count;

    private class HashEntry {

        private Integer key;
        private String value;

        public HashEntry(Integer key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    HashEntry[] hashTable = new HashEntry[5];

    public void put(int k, String v) {
        // if array is empty.
        if (isFull()) throw new IllegalArgumentException("Hash table is full");

        var index = hashing(k);
        while (hashTable[index] != null) {
            // this always rotates inside the array not going beyond the array length
            index = (index + 1) % hashTable.length;
        }

        // 1 -> [1, oybek]
        // 2 -> [2, elyor]
        // 3 -> [11, jasur]
        // 4 -> [4, shona]
        // 5 -> [15, john]

        hashTable[index] = new HashEntry(k, v);
        count++;
    }

    public String get(int k) {
        if (isEmpty()) throw new IllegalArgumentException("Hash is empty");
        var index = hashing(k);

        while (hashTable[index] != null) {
            if (hashTable[index].key.equals(k)) {
                return hashTable[index].value;
            }
            index = (index + 1) % hashTable.length;
        }
        return null;
    }

    public String remove(int k) {
        if (isEmpty()) throw new IllegalArgumentException("Hash table is empty");
        var index = hashing(k);

        while (hashTable[index] != null) {
            if (hashTable[index].key.equals(k)) {
                String value = hashTable[index].value;
                hashTable[index] = null;
                count--;
                return value;
            }
            index = (index + 1) % hashTable.length;
        }
        return null;
    }

    public void print() {
        for (HashEntry entry : hashTable) {
            if (entry != null) {
                System.out.println("--> " + entry.key + " " + entry.value);
            }
        }
    }


    private boolean isEmpty() {
        return count == 0;
    }

    private boolean isFull() {
        return count == hashTable.length;
    }

    private int hashing(int key) {
        return key % hashTable.length;
    }
}

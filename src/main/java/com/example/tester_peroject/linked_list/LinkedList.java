package com.example.tester_peroject.linked_list;

public class LinkedList<H> {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public void addLast(int item) {
        var node = new Node(item);
        if (first == null) {
            first = last = node;
        } else {
            var current = last;
            current.next = node;
            last = node;
            last.next = null;
        }
        size++;
    }

    public void addFirst(int item) {
        var node = new Node(item);
        if (isEmpty()) {
            first = last = node;
        } else {
            var current = first;
            first = node;
            first.next = current;
        }
        size++;
    }

    public void printNodes() {
        if (isEmpty()) System.out.println("There are no nodes");
        var current = first;
        while (current != null) {
            System.out.println("--> " + current.value);
            current = current.next;
        }
    }

    public int findKNodeFromTheEnd(int k) {
        var kNode = first;
        var current = first;
        if (isEmpty()) return -1;

        for (int i = 0; i < k; i++) {
            if (current == null) {
                System.out.println("The size of the list is smaller than requested K node");
                return -1;
            }
            current = current.next;
        }

        while (current != null) {
            kNode = kNode.next;
            current = current.next;
        }

        return kNode.value;
    }

//    public void printMiddle() {
//        int index = 0;
//        int indexMiddle = 0;
//        var current = first;
//        var middleFirst = first;
//        var middleSecond = first;
//        if (isEmpty()) throw new IllegalArgumentException();
//        while (current != null) {
//            if (index / 2 > indexMiddle) {
//                middleFirst = middleFirst.next;
//                indexMiddle++;
//            }
//            current = current.next;
//            index++;
//        }
//        if (index % 2 == 0) {
//            middleSecond = middleFirst.next;
//            System.out.println("first middle item is: " + middleFirst.value);
//            System.out.println("second middle item is: " + middleSecond.value);
//        } else {
//            System.out.println("middle item is: " + middleFirst.value);
//        }
//    }

    public void findMiddle() {
        if (isEmpty()) throw new IllegalArgumentException();
        var fast = first;
        var slow = first;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast == null) {
            var secondMiddle = slow.next;
            System.out.println("middle item is: " + slow.value);
            System.out.println("middle item is: " + secondMiddle.value);
        } else {
            System.out.println("middle item is: " + slow.value);
        }
    }

    public boolean hasLoop() {
        if (isEmpty()) throw new IllegalArgumentException();
        var fast = first;
        var slow = first;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    private boolean isEmpty() {
        return first == null;
    }
}

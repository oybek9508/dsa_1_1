package com.example.tester_peroject.tasks;

public class LinkedList1_1 {
    public Node head;
    public Node tail;
    private int size;

    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            size++;
        }
    }

    public void insertAtTheEnd(int data) {
        var newNode = new Node(data);
        if (head == null) head = tail = newNode;

        tail.next = newNode;
        tail = tail.next;
        size++;
    }


    public void insertFirst(int value) {
        var newNode = new Node(value);
        if (head == null) {
            head = tail = newNode;
        } else {
            var temp = head;
            head = newNode;
            head.next = temp;
        }
        size++;
    }

    public void removeAt(int value) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.data == value) {
            head = head.next;
            size--;
            return;
        }
        if (head == tail) head = null;

        var prev = head;
        var current = head;

        while (current != null && current.data != value) {
            prev = current;
            current = current.next;
        }

        if (current != null) {
            prev.next = current.next;

            if (current == tail) {
                tail = prev;
            }
            size--;
        } else {
            System.out.println("No element has been found");
        }

    }

    public boolean search(int value) {
        var current = head;
        while (current != null) {
            if (current.data == value) return true;
            current = current.next;
        }
        return false;
    }

    public void reverse() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node next = null;
        Node prev = null;
        var current = head;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        tail = head;
        head = prev;
    }

    public void removeDuplicates() {
        var curr = head;
        var prev = head;

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        while (curr.next != null) {
            curr = curr.next;
            if (prev.data == curr.data) {
                prev.next = curr.next;
                size--;
            } else {
                prev = curr;
            }
        }
    }

    public void findMiddle() {
        var slow = head;
        var fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast.next != null) {
            System.out.println("first middle -> " + slow.data);
            System.out.println("second middle -> " + slow.next.data);
        } else {
            System.out.println("middle -> " + slow.data);
        }
    }

    public void mergeTwoSortedLists(LinkedList1_1 l1, LinkedList1_1 l2) {
        Node dummyNode = new Node(0);
        Node curr3 = dummyNode;

        var curr1 = l1.head;
        var curr2 = l2.head;

        if (curr1 == null && curr2 == null) {
            System.out.println("The list is empty");
            return;
        }

        while (curr1 != null && curr2 != null) {
            if (curr1.data <= curr2.data) {
                curr3.next = curr1;
                curr1 = curr1.next;
            } else {
                curr3.next = curr2;
                curr2 = curr2.next;
            }
            curr3 = curr3.next;
        }

        if (curr1 != null) {
            curr3.next = curr1;
        }

        if (curr2 != null) {
            curr3.next = curr2;
        }

        head = dummyNode.next;
    }

    public void removeTheNthNodeFromTheEnd(int n) {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }

        if (size < n) {
            System.out.println("The size of the list is lesser than the target node");
            return;
        }

        Node dummyNode = new Node(0);
        dummyNode.next = head;

        var curr = dummyNode;
        var follow = dummyNode;
        int counter = 0;

        while (curr != null) {
            if (counter > n) {
                follow = follow.next;
            }
            curr = curr.next;
            counter++;
        }

        follow.next = follow.next.next;
        head = dummyNode.next;
    }

    public void addTwoNumbersAsLinkedLists(LinkedList1_1 l1, LinkedList1_1 l2) {
        Node dummyNode = new Node(0);
        var curr3 = dummyNode;
        int carry = 0;

        var curr1 = l1.head;
        var curr2 = l2.head;

        while (curr1 != null || curr2 != null || carry != 0) {
            int digit1 = (curr1 != null) ? curr1.data : 0;
            int digit2 = (curr2 != null) ? curr2.data : 0;

            if (digit1 + digit2 + carry > 9) {
                curr3.next = new Node((digit1 + digit2 + carry) % 10);
                carry = 1;
            } else {
                curr3.next = new Node(digit1 + digit2 + carry);
                carry = 0;
            }
            curr3 = curr3.next;
            curr1 = curr1 != null ? curr1.next : null;
            curr2 = curr2 != null ? curr2.next : null;
            System.out.println("carry: " + carry);
        }
        head = dummyNode.next;
    }

    public int intersectionOfTwoLinkedLists(LinkedList1_1 l1, LinkedList1_1 l2) {
        var pointer1 = l1.head;
        var pointer2 = l2.head;

        if (pointer1 == null || pointer2 == null) return -1;

        while (pointer1 != pointer2) {
            pointer1 = (pointer1 == null) ? l2.head : pointer1.next;
            pointer2 = (pointer2 == null) ? l1.head : pointer2.next;
        }
        return pointer1.data;
    }

    public Node copyListWithRandomPointer(Node h) {
        var node = h;
        Node dummy = new Node(0);

        while (node != null) {
            dummy.next = node;
            node = node.next;
            dummy = dummy.next;
//            while (node.random != null) {
//                dummy.random = node.random;
//                node = node.random;
//            }
        }

        head = dummy.next;
        dummy = head;
        return dummy;
    }

    public void print() {
        var curr = head;
        if (head == null) System.out.println("List is empty");
        while (curr != null) {
            System.out.println("--> " + curr.data);
            curr = curr.next;
        }
    }
}


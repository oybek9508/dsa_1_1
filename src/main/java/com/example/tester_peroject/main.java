package com.example.tester_peroject;

import com.example.tester_peroject.tasks.LinkedList1_1;
import com.example.tester_peroject.tasks.Node;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class main {

    public static void main(String[] args) {

        LinkedList1_1 list = new LinkedList1_1();

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        node1.next = node2;
        node2.next = node3;
        node3.next = null;

        node1.random = node3;
        node2.random = node1;
        node3.random = node2;

        System.out.println(list.copyListWithRandomPointer(node1));

    }

}

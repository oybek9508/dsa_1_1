package com.example.tester_peroject;

import com.example.tester_peroject.tasks.LinkedList1_1;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class main {

    public static void main(String[] args) {

        LinkedList1_1 list = new LinkedList1_1();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);

        list.rotateLinkedList(4);

        list.print();

    }

}

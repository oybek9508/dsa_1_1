package com.example.tester_peroject;

import com.example.tester_peroject.tasks.queues.MyQueue;
import com.example.tester_peroject.tasks.stacks.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Stack;

@SpringBootApplication
public class main {

    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);

        System.out.println(q.peek());


        System.out.println(q);
    }

}

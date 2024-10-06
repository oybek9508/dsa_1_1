package com.example.tester_peroject;

import com.example.tester_peroject.tasks.stacks.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Stack;

@SpringBootApplication
public class main {

    public static void main(String[] args) {
        ValidParanthesis v = new ValidParanthesis();

        v.balanceParanthesis();
        System.out.println(v);

    }

}

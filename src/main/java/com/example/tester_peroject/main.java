package com.example.tester_peroject;

import com.example.tester_peroject.tasks.stacks.DailyTemperatures;
import com.example.tester_peroject.tasks.stacks.SortStack;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Stack;

@SpringBootApplication
public class main {

    public static void main(String[] args) {
        DailyTemperatures stack = new DailyTemperatures();
        stack.futureWarmerDays();
        System.out.println(stack);

    }

}

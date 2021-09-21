package com.demo.controllerdemo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controllerdemo {

    // End point
    @RequestMapping("/welcome")
    public void demo() {
        System.out.println("Hello, Spring boot..... ");
    }

    // End point 2
    @RequestMapping("/welcome_screen")
    // access_specifier return_type method_name(){}

    public String Screen_welcome() {

        return "Hello, welcome the spring ";
    }

    @RequestMapping("/Age")
    public int age() {
        return 24;
    }

    @RequestMapping("/city")
    public List<String> cityname() {

        ArrayList<String> name = new ArrayList<>();
        name.add("Bhopal");
        name.add("agra");
        name.add("Visakhapatnam");
        name.add("Chhattisgarh");

        return name;
    }

    @RequestMapping("/1")
    public List<Integer> marksofstudent() {

        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(36);
        marks.add(56);
        marks.add(78);

        marks.set(0, 50);
        return marks;
    }

    @RequestMapping("/cal")
    public int add() {
        int a = 12;
        int b = 22;
        int sum = a + b;


        return a + b;

    }

    public class HelloWorldController {
        @RequestMapping("/java")
        public String hello(String msg) {
            return  "Hello javaTpoint " + msg;
        }
    }
}
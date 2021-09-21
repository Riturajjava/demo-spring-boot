package com.demo.controllerdemo;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Calculator {

    @RequestMapping("/Cul")
    public int add_method() {
        int a = 10;
        int b = 39;
        int sum = a + b;


        return a+b;
    }
    @RequestMapping("/sub")
    public int subtraction(){
        int a=190;
        int b=99;

        return a-b;
    }
    @RequestMapping("/multiply")
    public int multiply(){
        int a=150;
        int b=12;
        int multi=a*b;

        return a*-b;
    }
   @RequestMapping("/div")
    public int divided(){
        int a=270;
        int b=19;

        return a/b;

  }


    }


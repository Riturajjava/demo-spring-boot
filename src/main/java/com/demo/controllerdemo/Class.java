package com.demo.controllerdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Class {

       // access_specifier return_type method_name(parameter){}

    @RequestMapping("/book")
    public void book() {
        System.out.println("This is the book method");
        System.out.println("Printing display element " + "hello spring boot");
    }
   /*  if and else
     Syntax : if (condition){
                code
    {
    else{
           code
      }
     */

    int age = 30;
    @RequestMapping("/con")
    public int condition() {
        if (!(age > 18 & age == 25 & age != 0)) {
            System.out.println("Person is more than 30");

        } else {
            System.out.println("Person is young ");

        }

        return age;
    }
    // calculator with Spring boot..
    @RequestMapping("/sum")
    public int addition(){
        int a=22;
        int b;
        b=88;
        int sum= a+b;

        return sum ;
    }
    @RequestMapping("/subtraction")
    public int subtraction(){
        int a=90;
        int b;

        b=39;
        return a-b;
    }
   @RequestMapping("/multi")
   public int multiply(){
       int a = 77;
       int  b=10;

       return a *b;
    }

    @RequestMapping("/divided")
    public int Divided(){
        int a=56;
        int b=12;
        int div=a/b;{
            System.out.println(div+" printing value a and b ");
        }
          return a/b;
      }
}
package com.demo.controllerdemo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Pathwithrequest_variable {


        // Path Variable

        @RequestMapping("/hello/{msg}")
        public String message(@PathVariable String msg) {
            String code = "Welcome ";

            return code + "User "+ msg;
        }


        @RequestMapping("/add_n/{a}/{b}")
        public int addwithpath(@PathVariable int a, @PathVariable int b) {
            int sum = a + b;

            return sum;
        }

        @RequestMapping("/add_n")
        public int add() {
            int a = 50;
            int b = 49;

            return a + b;
        }

// Request param

        @RequestMapping("/msg")
        public String Request(@RequestParam String in) {

            return "Welcome " + "User " + in;
        }

        @RequestMapping("/sum_n")
        public int Requestparam(@RequestParam int a, @RequestParam int b) {

            return a + b;
        }
    }



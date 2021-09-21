package com.demo.controllerdemo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculatorwithparam {

    // Path variable

    // End Point addition method
   @RequestMapping("/add/{a}/{b}")
  public int addition(@PathVariable int a,@PathVariable int b){

      return a+b;
  }

  // End Point subtraction method
@RequestMapping("/sub/{a}/{b}")
  public double subtraction(@PathVariable double a,@PathVariable double b ){

       return a-b;
  }
 // End Point multiply method
 @RequestMapping("/multi/{a}/{b}")
  public int multiply(@PathVariable int a,@PathVariable int b){

       return a*b;
  }
  // End point divided method
    @RequestMapping("/div/{a}/{b}")
    public int divided(@PathVariable int a,@PathVariable int b){

       return a/b;
  }

  // Request Param
  @RequestMapping("/add")
    public int addition_method(@RequestParam int a,@RequestParam int b){
       return a+b;
    }

    @RequestMapping("/Sub")
    public int subtraction_method(@RequestParam int a,@RequestParam int b){

       return a-b;
    }
    @RequestMapping("/multi/")
    public int multiply_method(@RequestParam int a,@RequestParam int b){

       int multi=a*b;
       return multi;
    }
    @RequestMapping("/divid")
    public int divided_method(int a, int b){

       return a/b;
    }






    }










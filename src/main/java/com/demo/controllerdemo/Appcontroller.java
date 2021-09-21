package com.demo.controllerdemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.demo.service.Appservice;

@RestController
public class Appcontroller {

@Autowired
Appservice appservice;

@RequestMapping(value = "/app",method = RequestMethod.GET)
public String message(){

  //  Appservice ob=new Appservice();
 //String output=   ob.Servicemethod();

    return appservice.Servicemethod();
}



}

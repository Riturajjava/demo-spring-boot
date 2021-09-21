package com.demo.service;

import com.demo.repository.Apprepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Appservice {

    @Autowired
    Apprepository apprepository;


    public String Servicemethod() {


        return apprepository.repository();


    }
}
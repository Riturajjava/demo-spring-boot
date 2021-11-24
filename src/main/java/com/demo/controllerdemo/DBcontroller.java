package com.demo.controllerdemo;

import com.demo.model.Student;
import com.demo.service.DBservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DBcontroller {

    @Autowired
    DBservice service;
    @PostMapping("/add_s")
    public String  addStudent(@RequestBody Student student) {

    return service.addStudent(student);
     }
   @GetMapping("/get_s")
    public List<Student>getstudent() {

   return service.Getstudents();
    }
    @PutMapping("/update_s")
    public String updatestudnet(@RequestBody Student student){

        return service.updatestudent(student);
    }
    @DeleteMapping("/del_s")
    public String delstudnet(long id){

        return service.deletestudent(id);
    }
}
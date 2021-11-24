package com.demo.service;


import com.demo.model.Student;
import com.demo.repository.StudentjpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DBservice {

    @Autowired
    StudentjpaRepository repository;

    public String addStudent(Student student) {

        repository.save(student);

        return "add record successfully to Database " + student.getName();
    }

    public List<Student> Getstudents() {

        return repository.findAll();

    }

    public String updatestudent(Student student) {

        repository.save(student);
        return "Update record successfully " +student.getName();}

    public String deletestudent(Long id){

       repository.deleteById(id);
       return "delete Record successfully";
    }


    }
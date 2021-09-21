package com.demo.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "STUDENT_TABLE_JAVA")
public class Student {

   @Id// Primary key unique value
   @GeneratedValue // Automatic increment current 1,2,3.....15,16
   Long id;


    String name;
    int age;
    String branch;

    // Create Default Constructor

    public Student (){

    }


    // create  the Parameter constructor


    public Student(String name, int age, String branch) {
        this.name = name;
        this.age = age;
        this.branch = branch;
    }

  // Getter and Setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}

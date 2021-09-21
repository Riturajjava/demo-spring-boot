package com.demo.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "EMPLOYEE_TABLE_TEAM")
public class Employee {

    @Id// Primary key unique value
    @GeneratedValue // Automatic increment current 1,2,3.....15,16
     Long Id;


    String name;
    int age;
    String Department;
    double Salary;

    // Default constructor
     public Employee (){

     }

    // Create the Parameter constructor

    public Employee(String name, int age, String department, double salary) {
        this.name = name;
        this.age = age;
        Department = department;
        Salary = salary;
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

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }
}

package com.demo.model;

public class Doctor {

    String name;
    int age;
    String Specialist;

   // Create parameter constructor


    public Doctor(String name, int age, String specialist) {
        this.name = name;
        this.age = age;
        Specialist = specialist;
    }

    // Setter and Getter


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

    public String getSpecialist() {
        return Specialist;
    }

    public void setSpecialist(String specialist) {
        Specialist = specialist;
    }
}

package com.stackroute.domain;

public class Actor {

    // properties
    private String name;
    private String gender;
    private int age;

    // getter setter of properties
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // method to display the information of actor
    public void displayActor(){
        System.out.println("Name is "+this.name+" Gender is "+this.gender+" Age is "+this.age);
    }
}

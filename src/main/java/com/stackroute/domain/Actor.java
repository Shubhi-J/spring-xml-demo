package com.stackroute.domain;

public class Actor {

    // properties
    private String name;
    private String gender;
    private int age;

    // constructor
    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    // setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // method to display the information of actor
    public void displayActor(){
        System.out.println("the actor details are:");
        System.out.println("Name is "+this.name+" Gender is "+this.gender+" Age is "+this.age);
    }
}

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

    // method to display the information of actor
    public void displayActor(){
        System.out.println("Name is "+this.name+" Gender is "+this.gender+" Age is "+this.age);
    }
}

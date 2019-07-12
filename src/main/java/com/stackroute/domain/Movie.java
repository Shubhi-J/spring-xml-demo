package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Movie {

    // create objects of actor
    private Actor actor1;
    private Actor actor2;
    private Actor actor3;

    // create constructor of three objects of actor
    public Movie(Actor actor1, Actor actor2, Actor actor3) {
        this.actor1 = actor1;
        this.actor2 = actor2;
        this.actor3 = actor3;
    }

    // method to display actors
    public void displayActor(){
        actor1.displayActor();
        actor2.displayActor();
        actor3.displayActor();
    }

}

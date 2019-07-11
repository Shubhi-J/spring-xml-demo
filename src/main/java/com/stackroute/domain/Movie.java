package com.stackroute.domain;

public class Movie {

    // create three objects of actor
    private Actor actor1;
    private Actor actor2;
    private Actor actor3;

    // generate constructor for three actors
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

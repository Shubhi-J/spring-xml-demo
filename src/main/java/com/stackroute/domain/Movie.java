package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {

    ApplicationContext context;
    BeanFactory factory;
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

    // override setBeanFactoryMethod
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.factory=beanFactory;
        System.out.println(this.factory);
    }

    // override setApplicationContext
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context=applicationContext;
        System.out.println(this.context);
        }

    // override setBeanName
    @Override
    public void setBeanName(String beanName) {
        System.out.println(beanName);
    }
}

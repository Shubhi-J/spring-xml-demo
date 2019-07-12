package com.stackroute.domain;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Demo {

    public static void main(String[] args) {

        // using application context
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");

         // create object of Movie1 bean
          Movie movie1=context.getBean("Movie1", Movie.class);
          movie1.displayActor();

          /* The exception thrown using btType is
            Exception encountered during context initialization - cancelling refresh attempt
            org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'Movie1'
            defined in class path resource [beans.xml]: Unsatisfied dependency expressed through bean property 'actor1': :
            No qualifying bean of type [com.stackroute.domain.Actor] is defined: expected single matching bean but found 3:
            actor1,actor2,actor3; nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException:
            No qualifying bean of type [com.stackroute.domain.Actor] is defined: expected single matching bean but found 3: actor1,actor2,actor3
          */
}


}

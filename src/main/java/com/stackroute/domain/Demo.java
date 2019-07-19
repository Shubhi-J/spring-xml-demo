package com.stackroute.domain;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


public class Demo {

    public static void main(String[] args) {

        // using application context
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");

         // create object of Movie1 bean
          Movie movie1=context.getBean("Movie1", Movie.class);
          movie1.displayActor();

        // create object of Movie2 bean
          Movie movie2=context.getBean("Movie2", Movie.class);
          movie2.displayActor();
        
          // create object of Movie3 bean
          Movie movie3=context.getBean("Movie3", Movie.class);
          movie3.displayActor();


        // check the equality of two beans, if type is prototype then it returns false otherwise true
         System.out.println(movie1==movie2);
    }


}

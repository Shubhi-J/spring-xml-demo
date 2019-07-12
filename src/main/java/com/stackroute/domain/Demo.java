package com.stackroute.domain;
import org.springframework.beans.factory.BeanFactory;
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
          // movie1.displayActor();

        // using BeanFactory
           BeanFactory factory=new XmlBeanFactory(new ClassPathResource("beans.xml"));
            Movie movie2 =factory.getBean("Movie1", Movie.class);
           // movie2.displayActor();
}


}

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

        Movie movie=context.getBean("objMovie", Movie.class);

        movie.displayActor();

        // using bean factory
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie movie1 = (Movie) factory.getBean("objMovie");
        movie1.displayActor();

        // using beanDefinitionRegistry

    }


}

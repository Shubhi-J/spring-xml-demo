package com.stackroute.domain;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


public class Demo {

    public static void main(String[] args) {

        // using configurable application context
        ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");

        // create object of BeanLifeCycleDemoBean
        BeanLifecycleDemoBean beanLifecycleDemoBean= context.getBean("BeanLifeCycleDemoBean",BeanLifecycleDemoBean.class);

        // close
        context.close();
    }
}

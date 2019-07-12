package com.stackroute.domain;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Demo {

    public static void main(String[] args) {

        // using configurable application context
        ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");

        // create object of BeanLifeCycleDemoBean
        BeanLifecycleDemoBean beanLifecycleDemoBean= context.getBean("BeanLifecycleDemoBean",BeanLifecycleDemoBean.class);

        // create object of BeanPostProcessorDemoBean
        BeanPostProcessorDemoBean beanPostProcessorDemoBean= context.getBean("BeanPostProcessorDemoBean",BeanPostProcessorDemoBean.class);

        // close
        context.close();
    }
}

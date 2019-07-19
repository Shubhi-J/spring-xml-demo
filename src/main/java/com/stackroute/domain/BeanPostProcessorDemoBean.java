package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorDemoBean implements BeanPostProcessor {

    // override postProcessBeforeInitialization method
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("post processor before initialization");
        return bean;
    }

    // override postProcessAfterInitialization method
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("post processor after initialization");
        return bean;
    }
}

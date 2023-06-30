package com.example.SpringConcepts.SpringCore.shape;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Quadilateral implements ApplicationContextAware {
    ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void draw() {
        System.out.print("Drawing a square from Quadilateral draw method");
        Square square = applicationContext.getBean(Square.class);
        square.draw();
    }

}

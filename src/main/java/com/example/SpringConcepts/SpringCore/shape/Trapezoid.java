package com.example.SpringConcepts.SpringCore.shape;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

public class Trapezoid implements InitializingBean, DisposableBean {
    @Autowired
    private Point pointA;
    @Autowired
    private Point pointB;
    @Autowired
    private Point pointC;
    @Autowired
    private Point pointD;

    public void draw() {
        System.out.println("\nDrawing Trapezoid");
    }

    @Override
    public void afterPropertiesSet() {
        // This method will be called when the bean is being initialized
        System.out.println("Initializing Trapezoid bean");
    }

    @Override
    public void destroy() {
        // This method will be called when the bean is being destroyed
        System.out.println("Destroying Trapezoid bean");
    }
}

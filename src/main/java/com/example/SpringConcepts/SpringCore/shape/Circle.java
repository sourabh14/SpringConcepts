package com.example.SpringConcepts.SpringCore.shape;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Circle {
    @Autowired
    Point pointA;
    // Spring will inject pointA when Circle is created.
    // By default, the autowiring happens by type - here there are many beans of type Point
    // Hence it goes for autowiring by name - It looks for bean with name pointA

    @Autowired
    @Qualifier("pointB")
    Point pointK;   // Since there's no bean with name pointK hence we can use @Qualifier

    public Point getPointA() {
        return pointA;
    }

    public Point getPointK() {
        return pointK;
    }

    public void draw() {
        System.out.println("\nDrawing Circle");
        System.out.print("[" + getPointA().getX() + "," + getPointA().getY() + "], ");
        System.out.println("[" + getPointK().getX() + "," + getPointK().getY() + "], ");
    }
}

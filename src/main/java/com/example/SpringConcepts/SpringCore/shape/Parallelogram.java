package com.example.SpringConcepts.SpringCore.shape;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Parallelogram {
    @Autowired
    private Point pointA;
    @Autowired
    private Point pointB;
    @Autowired
    private Point pointC;
    @Autowired
    private Point pointD;

    public Point getPointA() {
        return pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public Point getPointD() {
        return pointD;
    }

    public void draw() {
        System.out.println("\nDrawing Parallelogram");
        System.out.print("[" + getPointA().getX() + "," + getPointA().getY() + "], ");
        System.out.print("[" + getPointB().getX() + "," + getPointB().getY() + "], ");
        System.out.print("[" + getPointC().getX() + "," + getPointC().getY() + "], ");
        System.out.println("[" + getPointD().getX() + "," + getPointD().getY() + "]");
    }
}

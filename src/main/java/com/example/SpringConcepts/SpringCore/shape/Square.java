package com.example.SpringConcepts.SpringCore.shape;

import org.springframework.beans.factory.annotation.Autowired;

public class Square {
    @Autowired
    private Point pointA;
    @Autowired
    private Point pointB;
    @Autowired
    private Point pointC;
    @Autowired
    private Point pointD;
    // For autowiring bean name should be same as field name

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public Point getPointD() {
        return pointD;
    }

    public void setPointD(Point pointD) {
        this.pointD = pointD;
    }

    public void draw() {
        System.out.println("\nDrawing Square");
        System.out.print("[" + getPointA().getX() + "," + getPointA().getY() + "], ");
        System.out.print("[" + getPointB().getX() + "," + getPointB().getY() + "], ");
        System.out.print("[" + getPointC().getX() + "," + getPointC().getY() + "], ");
        System.out.println("[" + getPointD().getX() + "," + getPointD().getY() + "]");
    }
}

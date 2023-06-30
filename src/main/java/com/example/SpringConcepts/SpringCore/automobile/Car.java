package com.example.SpringConcepts.SpringCore.automobile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    @Autowired
    Engine engine;

    public void describe() {
        System.out.println("\nCar with engine : " + engine.getName() + "\n");
    }
}

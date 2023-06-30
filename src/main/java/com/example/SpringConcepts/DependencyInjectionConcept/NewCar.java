package com.example.SpringConcepts.DependencyInjectionConcept;

import com.example.SpringConcepts.DependencyInjectionConcept.engine.IEngine;

public class NewCar {
    IEngine engine;

    /*
        Car class with dependency injection via constructor.
        Benefits:
            - We can now create a new Car with different engines.
            - If there is a change in Engine concrete classes, NewCar class will not be affected
     */

    public NewCar(IEngine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }
}

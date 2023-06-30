package com.example.SpringConcepts.DependencyInjectionConcept.engine;

public class DieselEngine implements IEngine {
    @Override
    public void start() {
        System.out.println("Starting Diesel Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Diesel Engine");
    }
}

package com.example.SpringConcepts.DependencyInjectionConcept.engine;

public class ElectricEngine implements IEngine {
    @Override
    public void start() {
        System.out.println("Starting Electric Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Electric Engine");
    }
}

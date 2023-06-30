package com.example.SpringConcepts.DependencyInjectionConcept.engine;

public class PetrolEngine implements IEngine {
    @Override
    public void start() {
        System.out.println("Starting Petrol Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Petrol Engine");
    }
}

package com.example.SpringConcepts.DependencyInjectionConcept;

import com.example.SpringConcepts.DependencyInjectionConcept.engine.DieselEngine;
import com.example.SpringConcepts.DependencyInjectionConcept.engine.IEngine;

public class CarService {
    public void execute() {
        Car car = new Car();
        car.start();
        car.stop();

        IEngine dieselEngine = new DieselEngine();
        NewCar newCar = new NewCar(dieselEngine);
        newCar.start();
        newCar.stop();
    }
}

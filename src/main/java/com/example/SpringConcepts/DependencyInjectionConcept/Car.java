package com.example.SpringConcepts.DependencyInjectionConcept;

import com.example.SpringConcepts.DependencyInjectionConcept.engine.PetrolEngine;

public class Car {
    PetrolEngine engine = new PetrolEngine();

    /*
        The car has a dependency on petrol engine.
        Issues:
            - Let's say there is a change in implementation of PetrolEngine class. Then we would have to do
                changes in Car class also. Eg: start() is renamed to kickOff() then we would have to change
                start() method in our Car class
            - If we want to change the engine of our car then this will require changes in our Car class also.
                A Car, by itself, is not smart enough to know what engine it needs. Only the engineers that construct
                the car understand the requirements for its engines and wheels. Thus, it makes sense that the people
                who construct the car provide the specific engine required, rather than letting a Car itself pick
                whichever engine it wants to use.
     */

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

}

package com.example.SpringConcepts.SpringCore.automobile;

import org.springframework.stereotype.Component;

@Component
public class Engine {
    private String name = "DefaultEngine";

    public String getName() {
        return name;
    }
}

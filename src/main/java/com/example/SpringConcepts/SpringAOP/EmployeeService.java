package com.example.SpringConcepts.SpringAOP;

import org.springframework.stereotype.Component;

@Component
public class EmployeeService {
    private String name;

    public String getName() {
        System.out.println("Inside getName method");
        return name;
    }

    @LogActivity
    public String getNameUpperCase() {
        System.out.println("Inside getName uppercase method");
        return name;
    }
}

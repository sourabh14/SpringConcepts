package com.example.SpringConcepts.SpringCore;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestDatabase {
    @Value("${test.property}")
    private String testProperty;

    public void showJdbcUrl() {
        System.out.println("Test Property: " + testProperty);
    }
}

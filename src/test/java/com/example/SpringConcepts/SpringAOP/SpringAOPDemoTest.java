package com.example.SpringConcepts.SpringAOP;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class SpringAOPDemoTest {

    @Autowired
    SpringAOPDemo springAOPDemo;

    @Test
    void execute() {
        springAOPDemo.execute();
    }
}
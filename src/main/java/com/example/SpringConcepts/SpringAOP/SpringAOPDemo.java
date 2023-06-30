package com.example.SpringConcepts.SpringAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SpringAOPDemo {

    public void execute() {
        System.out.println("\n\n\n\n");
        System.out.println("Spring AOP Demo");
        System.out.println("----------------\n");

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AopConfig.class);
        EmployeeService employeeService = applicationContext.getBean(EmployeeService.class);
        employeeService.getName();
        employeeService.getNameUpperCase();
    }

}

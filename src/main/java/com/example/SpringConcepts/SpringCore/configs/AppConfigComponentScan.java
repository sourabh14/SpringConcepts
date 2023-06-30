package com.example.SpringConcepts.SpringCore.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.SpringConcepts.SpringCore.automobile")
public class AppConfigComponentScan {
    // @ComponentScan configures which packages to scan for classes with annotation configuration.
}

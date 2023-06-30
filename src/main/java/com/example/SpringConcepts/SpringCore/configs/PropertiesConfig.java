package com.example.SpringConcepts.SpringCore.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = {"com.example.SpringConcepts.SpringCore",
        "com.example.SpringConcepts.SpringCore.eventHandling"})
public class PropertiesConfig {
}

package com.example.SpringConcepts.SpringAOP;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.example.SpringConcepts.SpringAOP")
public class AopConfig {
}

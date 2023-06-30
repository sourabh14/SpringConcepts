package com.example.SpringConcepts.SpringCore.configs;

import com.example.SpringConcepts.SpringCore.shape.Point;
import com.example.SpringConcepts.SpringCore.shape.Trapezoid;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig2 {
    @Bean
    public Trapezoid trapezoid() {
        return new Trapezoid();
    }

    @Bean
    public Point pointA() {
        return new Point(0, 0);
    }

    @Bean
    public Point pointB() {
        return new Point(0, 10);
    }

    @Bean
    public Point pointC() {
        return new Point(10, 0);
    }

    @Bean
    public Point pointD() {
        return new Point(10, 10);
    }

}

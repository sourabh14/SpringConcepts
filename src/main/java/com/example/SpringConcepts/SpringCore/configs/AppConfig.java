package com.example.SpringConcepts.SpringCore.configs;

import com.example.SpringConcepts.SpringCore.shape.Circle;
import com.example.SpringConcepts.SpringCore.shape.Pentagon;
import com.example.SpringConcepts.SpringCore.shape.Point;
import com.example.SpringConcepts.SpringCore.shape.Quadilateral;
import com.example.SpringConcepts.SpringCore.shape.Square;
import com.example.SpringConcepts.SpringCore.shape.Triangle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/*
    The @Configuration annotation indicates that the class is a source of bean definitions.
    We can also add it to multiple configuration classes.
 */
@Configuration
@ComponentScan(basePackageClasses = Triangle.class)
public class AppConfig {

    /*
        We use the @Bean annotation on a method to define a bean. If we don't specify a custom name, then the bean
        name will default to the method name.

        For a bean with the default singleton scope, Spring first checks if a cached instance of the bean already
        exists, and only creates a new one if it doesn't. If we're using the prototype scope, the container returns
        a new bean instance for each method call.
     */

//    @Bean
//    public Triangle equilateralTriangle() {
//        Triangle triangle = new Triangle("equilateral");
//        triangle.setPointA(pointA());
//        triangle.setPointB(pointB());
//        triangle.setPointC(pointC());
//        return triangle;
//    }

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

    @Bean
    public Point pointE() {
        return new Point(10, 15);
    }

    @Bean
    public Triangle equilateralTriangle() {
        return new Triangle("Equilateral", pointA(), pointB(), pointC());
    }

    @Bean
    public Triangle obtuseTriangle() {
        return new Triangle("Obtuse", pointB(), pointB(), pointC());
    }

    @Bean
    public Square square() {
        return new Square();
    }

    @Bean
    @Scope("prototype")
    public Pentagon pentagon() {
        return new Pentagon();
    }

    @Bean
    public Quadilateral quadilateral() {
        return new Quadilateral();
    }

    @Bean
    public Circle circle() {
        return new Circle();
    }


//
//    @Bean
//    public Store store() {
//        return new Store(item());
//    }

}

/*
    Another way to create the configuration of the beans is through XML configuration:

        <bean id="item1" class="com.example.SpringHibernateConcepts.IoCContainer.ItemImpl" />
        <bean id="store" class="com.example.SpringHibernateConcepts.IoCContainer.Store">
            <constructor-arg type="ItemImpl" index="0" name="item" ref="item" />
        </bean>

 */
package com.example.SpringConcepts.SpringCore;

import com.example.SpringConcepts.SpringCore.automobile.Car;
import com.example.SpringConcepts.SpringCore.configs.AppConfig;
import com.example.SpringConcepts.SpringCore.configs.AppConfig2;
import com.example.SpringConcepts.SpringCore.configs.AppConfig3;
import com.example.SpringConcepts.SpringCore.configs.AppConfigComponentScan;
import com.example.SpringConcepts.SpringCore.configs.PropertiesConfig;
import com.example.SpringConcepts.SpringCore.eventHandling.MyEvent;
import com.example.SpringConcepts.SpringCore.eventHandling.MyEventPublisher;
import com.example.SpringConcepts.SpringCore.shape.Circle;
import com.example.SpringConcepts.SpringCore.shape.Pentagon;
import com.example.SpringConcepts.SpringCore.shape.Quadilateral;
import com.example.SpringConcepts.SpringCore.shape.Square;
import com.example.SpringConcepts.SpringCore.shape.Trapezoid;
import com.example.SpringConcepts.SpringCore.shape.Triangle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class SpringCoreDemo {
    public void execute() {
        System.out.println("Spring Core Demo");
        System.out.println("----------------");

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		/*
			Constructor Injection
		 */
        Triangle equilateralTriangle = applicationContext.getBean("equilateralTriangle", Triangle.class);
        equilateralTriangle.draw();
        // If there is only one bean of Type Triangle then this will work, otherwise it will give conflict
        // Triangle equilateralTriangle = applicationContext.getBean(Triangle.class);


		/*
			Autowiring
		 */
        Square square = applicationContext.getBean("square", Square.class);
        square.draw();

		/*
			Bean scopes: @Scope annotation
				- Singleton
					- When we define a bean with the singleton scope, the container creates a single instance of that bean;
						all requests for that bean name will return the same object, which is cached.
					- By default we have singleton scope
				- Prototype
					- For prototype a new bean created with every request or reference.
		 */
        System.out.println("\nBean Scopes");
        Square square2 = applicationContext.getBean("square", Square.class);
        if (square == square2) {
            System.out.println("square and square2 point to same object");
        } else {
            System.out.println("square and square2 point to different object");
        }

        Pentagon pentagon1 = applicationContext.getBean("pentagon", Pentagon.class);
        Pentagon pentagon2 = applicationContext.getBean("pentagon", Pentagon.class);

        if (pentagon1 == pentagon2) {
            System.out.println("pentagon1 and pentagon2 point to same object");
        } else {
            System.out.println("pentagon1 and pentagon2 point to different object");
        }

		/*
			ApplicationContextAware
				- Interface to be implemented by any object that wishes to be notified of the ApplicationContext that it runs in.
				- It contains the setApplicationContext() method, which Spring calls after creating ApplicationContext.
				- Furthermore, when an application starts, Spring automatically detects this interface and injects a reference to ApplicationContext.
				- By implementing the interface, a bean can obtain a reference to ApplicationContext and access other beans or resources.
		 		- In new spring: Life is even easier for you. Just call @Inject ApplicationContext context; or @Autowired ApplicationContext context;
					to get your application context.
		 */
        System.out.println("\n-- ApplicationContextAware --");
        Quadilateral quadilateral = applicationContext.getBean(Quadilateral.class);
        quadilateral.draw();

		/*
			Lifecycle callbacks
				- Spring provides callback methods which run when the bean is being created/ destroyed.
				- For initializing or doing cleaning up.
		 */
        System.out.println("\n-- Lifecycle callbacks --");
        AbstractApplicationContext applicationContext2 = new AnnotationConfigApplicationContext(AppConfig2.class);
        Trapezoid trapezoid = applicationContext2.getBean(Trapezoid.class);
        trapezoid.draw();
        // After calling shutdown the destroy method will be called
        applicationContext2.registerShutdownHook();

		/*
			BeanPostProcessor
				- postProcessAfterInitialization - Apply this BeanPostProcessor to the given new bean instance after
					any bean initialization callbacks (like InitializingBean's afterPropertiesSet or a custom init-method).

		 */
        AbstractApplicationContext applicationContext3 = new AnnotationConfigApplicationContext(AppConfig3.class);
        trapezoid = applicationContext3.getBean(Trapezoid.class);
        trapezoid.draw();

		/*
			Annotations:
				- @Autowired: Marks a constructor, field, setter method, or config method as to be autowired by Spring's
					dependency injection facilities.
				- @Component: Indicates that an annotated class is a "component". Such classes are considered as
					candidates for auto-detection when using annotation-based configuration and classpath scanning.

				- @Required: If we don't want a member variable to be null
		 */
        Circle circle = applicationContext.getBean(Circle.class);
        circle.draw();

        ApplicationContext applicationContext4 = new AnnotationConfigApplicationContext(AppConfigComponentScan.class);
        Car car = applicationContext4.getBean(Car.class);
        car.describe();

		/*
			Spring Properties
				- @PropertySource annotation as a convenient mechanism for adding property sources to the environment.
				- We can use this annotation in conjunction with the @Configuration annotation:
		 */
        ApplicationContext applicationContext5 = new AnnotationConfigApplicationContext(PropertiesConfig.class);
        TestDatabase testDatabase = applicationContext5.getBean(TestDatabase.class);
        testDatabase.showJdbcUrl();

        /*
            Event handling in Spring:
                - Three core components
                - Event publisher
                - Event listener
         */
        MyEventPublisher publisher = applicationContext5.getBean(MyEventPublisher.class);
        publisher.getApplicationEventPublisher().publishEvent(new MyEvent(this));
    }
}

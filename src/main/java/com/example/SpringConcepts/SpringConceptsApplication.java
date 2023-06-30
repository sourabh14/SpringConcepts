package com.example.SpringConcepts;

import com.example.SpringConcepts.SpringAOP.SpringAOPDemo;
import com.example.SpringConcepts.SpringCore.SpringCoreDemo;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringConceptsApplication {

	public static void main(String[] args) {
		// SpringApplication.run(SpringHibernateConceptsApplication.class, args);

		// Spring Core
		new SpringCoreDemo().execute();

		// Spring AOP
		new SpringAOPDemo().execute();

	}


}

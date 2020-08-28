package com.spring.AutoWiring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.AutoWiring.Coach;
public class JavaConfigApp {

	public static void main(String[] args) {
		//read spring config java class.
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		//read the bean from Spring container.
		Coach coach	= context.getBean("swimCoach",Coach.class);
				
		coach.getDailyWorkOut();
		System.out.println(coach.getDailyFortune());
		//closing the context .
		context.close();
	}

}

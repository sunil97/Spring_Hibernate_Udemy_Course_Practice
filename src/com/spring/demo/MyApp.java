package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.AutoWiring.Coach;
public class MyApp {

	public static void main(String[] args) {
		//read spring config file.
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//read the bean from Spring container.
		Coach coach	= context.getBean("tennisCoach",Coach.class);
				
		coach.getDailyWorkOut();
		System.out.println(coach.getDailyFortune());
		//closing the context .
		context.close();
	}

}

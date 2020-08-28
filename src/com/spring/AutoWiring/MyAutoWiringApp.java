package com.spring.AutoWiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.AutoWiring.Coach;
public class MyAutoWiringApp {

	public static void main(String[] args) {
		//read spring config file.
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("autowiring.xml");
		
		//read the bean from Spring container.
		Coach coach	= context.getBean("tennisCoach",Coach.class);
				
		coach.getDailyWorkOut();
		System.out.println(coach.getDailyFortune());
		//closing the context .
		context.close();
	}

}

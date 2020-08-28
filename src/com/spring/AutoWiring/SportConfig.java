package com.spring.AutoWiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.spring.AutoWiring")
public class SportConfig {
	//define bean for happyfortune service.
	@Bean
	public FortuneService happyFortuneService() {
		return new HappyFortuneService();
	}
	
	//define bean for swimcoach and inject dependency into it.
	@Bean 
	public Coach swimCoach() {
	SwimCoach coach = new SwimCoach(happyFortuneService());
		return coach;
	}
}

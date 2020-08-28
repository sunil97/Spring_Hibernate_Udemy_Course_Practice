/**
 * 
 */
package com.spring.AutoWiring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Hp
 *
 */
@Component
public class TennisCoach implements Coach {
	//below @ annotation is only for field injection .
	@Autowired
	@Qualifier("restFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println("default constructor :");
	}
	//defining init method that will call just after bean creation.
	@PostConstruct
	public void justtp() {
		System.out.println("TennisCoach : this is just Post constrction of bean:");
	}
	
	//defining pre destroy method which will call just before destroying the bean.
	@PreDestroy
	public void destroyXX() {
		System.out.println("TennisCoach : this is just before bean destroying");
	}
	
//<--- below commented code is for constructor injection . --->
//	@Autowired
//	
//	public TennisCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	//<---------------------->
	
	@Override
	public void getDailyWorkOut() {
		System.out.println("do 15 min back hand practice : ");
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
//<--- below commented code is for setter  injection . --->
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
//<---------------------------------------->	
	
	//<-- we can inject dependency by anhy method simply put @Autowired-------->
//	@Autowired
//	public void setServiceXYXY(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
}

package com.spring.AutoWiring;

import org.springframework.stereotype.Component;

@Component
public class RestFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "you are getting restFull fortune service :";
	}

}

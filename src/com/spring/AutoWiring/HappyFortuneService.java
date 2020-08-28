/**
 * 
 */
package com.spring.AutoWiring;

import org.springframework.stereotype.Component;

/**
 * @author Hp
 *
 */
@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Today is lucky day: ";
	}

}

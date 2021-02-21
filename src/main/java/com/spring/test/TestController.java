package com.spring.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/step1/*")
public class TestController {
	
	@RequestMapping("/q1")
	public String step1_q1() {
				
		return "step1_q1";
	}
	
//	@RequestMapping("/q1")	// "/q1"을 jsp페이지하고 맞춰준다
//	void step1_q2() {
//			
//		
//	}
}

package com.zensar.sampleappweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/hello")
	public  String  sayHello() {
		return "<h2> Welcome to Jenkins </h2>";
	}
	
	@RequestMapping("/hii")
	public  String  sayHii() {
		return "<h2> Welcome to Jenkins Hii Ishika  </h2>";
	}
	@RequestMapping("/bye")
	public  String  sayBye() {
		return "<h2> Bye Ishika  </h2>";
		
	}
	@RequestMapping("/greet")
	public  String  greet() {
		return "<h2> Hello Ishika Good morning Jenkins here!!!!</h2> ";
		
	}

}

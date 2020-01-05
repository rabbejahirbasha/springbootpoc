package com.prepare.boot.SpringBootProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/sayhello/{name}")
	    public String sayHello(@PathVariable String name) {
	        return "I am spring Boot Hello...."+name.toUpperCase();
	    }
	
	/*@RequestMapping(value = "/hello")
	
	public String sayHello() {
		//System.out.println("************************"+name);
		return "Hello";
	}*/
}

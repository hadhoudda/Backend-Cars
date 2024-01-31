package com.syaweb.backend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test") //localhost:8080/test
public class TestController {
	
	@GetMapping	//localhost:8080/test
	public String TestString() {
		return  "lien de test";
	}
	
	@GetMapping("/get") //localhost:8080/api/test/get
	public String getString() {
		return "get ok";
	}
	
	@GetMapping("/get2") //localhost:8080/api/test/get2
	public String getString2() {
		return "get2 ok";
	}
	
	
	@PostMapping("post")
	public String postString() {
		return "post ok";
	}

}

package com.ust.apis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.services.impls.MyService;

@RestController
@RequestMapping("/api")
public class MyController {
	
	@Autowired
	private MyService myService;
	
	@GetMapping("/welcome")
	public String getMessage() {
		//return "Hello welcome to the world of WCNP";
		return myService.getMessage();
	}

}

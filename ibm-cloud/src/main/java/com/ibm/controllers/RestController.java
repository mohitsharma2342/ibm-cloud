package com.ibm.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping(value = "/Rest")
public class RestController {
	
	@GetMapping
	public String name() {
		return "Hello Deployed on Ibm Cloud";
	}

}

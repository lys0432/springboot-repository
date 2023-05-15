package com.example.llyyss.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@RequestMapping("/hello2")
	public String hello21() {
		return "hello world 20230514";
		
	}

}

package com.warmme.study.spring.boot.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.warmme.study.spring.boot.config.Config;

@RestController
public class HelloController {
	
	@Autowired
	private Config config;

	@RequestMapping("/hello")
	public String index() {
		return "Hello World";
	}
}

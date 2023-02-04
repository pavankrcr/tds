package com.pavank.tds.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

	@GetMapping("/")
	public String index() {
		return "<h1> Hello Spring !</h1>";
	}

}
package com.handson.handson.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {


	@GetMapping("/")
	public String getIndex() {
		return "test";
	}

}

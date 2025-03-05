package com.klm.crud_example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MyController {

	@GetMapping("/hello")
	public String greed(@RequestParam String name){
		return String.format("Hello %s", name);
	}
}

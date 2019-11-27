package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/mapping/{name}")
	public String sayHello(@PathVariable("name") String name) {

		if (name.equalsIgnoreCase("avinash")) {
			System.out.println("logger here");

			return "Hi";
		} else {
			char i = name.charAt(0);
			if ('a' == i) {
				return "hello" + i;
			} else if ('j' == i) {
				return "hello" + i;
			} else {
				return "hello" + i;
			}
		}
	}
}

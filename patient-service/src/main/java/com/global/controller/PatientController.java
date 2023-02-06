package com.global.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {
	
	@GetMapping("/patient")
	public String message() {
		return "Hello from the Patient service";
	}
}

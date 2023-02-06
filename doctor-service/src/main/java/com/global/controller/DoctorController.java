package com.global.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {
	
	@GetMapping("/doctor")
	public String message() {
		return "Hello from the Doctor service";
	}
}

package com.global.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
	
	@GetMapping("/pay")
	public String payAmount() {
		return "Calling from Payment service";
	}
	
}

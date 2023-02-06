package com.global.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {
	@GetMapping("/ticket")
	public String payAmount() {
		return "Calling from Ticket service";
	}
	
}

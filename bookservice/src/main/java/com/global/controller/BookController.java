package com.global.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


@RestController
public class BookController {

	@Autowired
	private RestTemplate template;
	
	@Bean
	public RestTemplate template() {
		return new RestTemplate();
	}
	
	@HystrixCommand(groupKey = " sample ", commandKey = " test ", fallbackMethod = "bookingServiceFallBack")
	@GetMapping("/booking")
	public String bookMethod1() {
		String paymentServiceResponse = template.getForObject("http://localhost:9090/payment", String.class);
		String ticketServiceResponse = template.getForObject("http://localhost:9091/ticket", String.class);
		
		return paymentServiceResponse + " \n" + ticketServiceResponse;
	}
	
	@GetMapping("/directbooking")
	public String bookMethod2() {
		String paymentServiceResponse = template.getForObject("http://localhost:9090/payment", String.class);
		String ticketServiceResponse = template.getForObject("http://localhost:9091/ticket", String.class);
		
		return paymentServiceResponse + " \n" + ticketServiceResponse;
	}
	
	public String bookingServiceFallBack() {
		return "Service failed";
	}
}

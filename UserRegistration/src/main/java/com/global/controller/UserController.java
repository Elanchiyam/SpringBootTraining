package com.global.controller;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.global.model.User;
import com.global.service.UserServiceImp;

@RestController
public class UserController {

	@Autowired
	UserServiceImp userServiceImp;
	
	@PostMapping("/addUser")
	public void addBook(@RequestBody User user) {
		userServiceImp.addUser(user);
	}
	
	@GetMapping("/findall")
	public HashSet<User> getAllUsers(){
		return userServiceImp.findAllUsers();
	}
	
	@GetMapping("/findbyid/{id}")
	public User getUserByid(@PathVariable Integer id) {
		return userServiceImp.findByUserId(id);
	}
	

	@DeleteMapping("/delete")
	public void deleteBook() {
		userServiceImp.deleteAllData();
	}
	
	@DeleteMapping("/deletebyid/{id}")
	public void deleteBookByid(@PathVariable Integer id) {
		userServiceImp.deleteById(id);
	}
}

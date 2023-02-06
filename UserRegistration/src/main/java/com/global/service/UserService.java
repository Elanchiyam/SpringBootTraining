package com.global.service;

import java.util.HashSet;

import com.global.model.User;

public interface UserService {
	public void addUser(User user);
	public HashSet<User> findAllUsers();
	public User findByUserId(Integer id);
	public void deleteAllData();
	public void deleteById(Integer id);
}

package com.global.service;

import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.global.model.User;
import com.global.repository.UserRepository;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}

	@Override
	public HashSet<User> findAllUsers() {
		// TODO Auto-generated method stub
		HashSet<User> userList = new HashSet<>();
		userRepository.findAll().forEach(e-> userList.add(e));
		return userList;
	}

	@Override
	public User findByUserId(Integer id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).get();
	}

	@Override
	public void deleteAllData() {
		// TODO Auto-generated method stub
		userRepository.deleteAll();
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
	}
	
}

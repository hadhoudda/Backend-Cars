package com.syaweb.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syaweb.backend.model.UserModel;
import com.syaweb.backend.repository.UserRepository;


@Service
public class UserServiceImplement implements UserService{
	
	@Autowired
	private UserRepository userRepositery;
	
	@Override
	public List<UserModel> getAllUsers() {
		return userRepositery.findAll();
	}

	@Override
	public UserModel findUserById(Long id) {
		Optional<UserModel> userId = userRepositery.findById(id);
		if(userId.isEmpty()) {
			return null;
		}
		else {
			return userId.get();
		}
	}

	@Override
	public UserModel createUser(UserModel user) {
		return userRepositery.save(user);
	}

	@Override
	public UserModel updateUser(UserModel user) {
		Optional<UserModel> userId = userRepositery.findById(user.getId());
		if(userId.isEmpty()) {
			return null;
		}
		else {
			return userRepositery.save(user);
		}
	}

	@Override
	public void deleteUser(Long id) {
		userRepositery.deleteById(id);
	}

	@Override
	public List<UserModel> findByFirstName(String firstName) {
		return userRepositery.findByFirstName(firstName);
	}

	@Override
	public List<UserModel> findByFirstNameAndLastName(String firstName, String lastName) {
		return userRepositery.findByFirstNameAndLastName(firstName, lastName);
	}

	@Override
	public List<UserModel> findByFirstNameAndLastNameJPQL(String firstName, String lastName) {
		return userRepositery.findByFirstNameAndLastNameJPQL(firstName, lastName);
	}
	
	
}

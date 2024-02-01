package com.syaweb.backend.service;

import java.util.List;

import com.syaweb.backend.model.UserModel;

public interface UserService {
	
	public List<UserModel> getAllUsers();
	public UserModel findUserById(Long id);
	public UserModel createUser(UserModel user); 
	public UserModel updateUser(UserModel user);
	public void deleteUser(Long id);

}

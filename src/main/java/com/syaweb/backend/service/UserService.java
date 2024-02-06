package com.syaweb.backend.service;

import java.util.List;

import com.syaweb.backend.model.UserModel;

public interface UserService {
	
	//**** Methode CRUD ****//
	public List<UserModel> getAllUsers();
	public UserModel findUserById(Long id);
	public UserModel createUser(UserModel user); 
	public UserModel updateUser(UserModel user);
	public void deleteUser(Long id);
	
	//**** Methode avancees ****//
	public List<UserModel> findByFirstName(String firstName);
	public List<UserModel> findByFirstNameAndLastName(String firstName, String lastName);
	
	//**** Methode avec request JPQL ****//
	public List<UserModel> findByFirstNameAndLastNameJPQL(String firstName, String lastName);
	

}

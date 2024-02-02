package com.syaweb.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.syaweb.backend.model.UserModel;
import com.syaweb.backend.service.UserService;

@RestController
@RequestMapping("/utilisateur") //localhost:8080/utilisateur
public class UserController {
	
	@Autowired
	private UserService userService; 
	
	
	@GetMapping(path="/all") //localhost:8080/utilisateur/all
	public List<UserModel> getAllUtilisateur() {
		return userService.getAllUsers();
	}
	
//	@GetMapping(path="/{id}") 
//	public UserModel getUtilisateur(@PathVariable Long id) {
//		return userService.findUserById(id);
//	}
	
	@GetMapping(path="/{id}") 
	public ResponseEntity<UserModel> getUtilisateur(@PathVariable Long id) {
		UserModel userModel = userService.findUserById(id);
		if(userModel == null) {
			return new ResponseEntity<UserModel>(HttpStatus.NO_CONTENT);
		}
		else {
			return new ResponseEntity<UserModel>(userModel , HttpStatus.OK);
		}
	}
	
	@PostMapping
	public UserModel createUtilisateur(@RequestBody UserModel user) {
		return userService.createUser(user);
	}
	
	@PutMapping
	public UserModel updateUtilisateur(@RequestBody UserModel user) {
		return userService.updateUser(user);
	}
	
//	
//	@DeleteMapping("/{id}")
//	public void deleteUtilisateur(@PathVariable Long id) {
//		userService.deleteUser(id);
//	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<UserModel> deleteUtilisateur(@PathVariable Long id) {
		UserModel userModel = userService.findUserById(id);
		if(userModel == null) {
			return new ResponseEntity<UserModel>(HttpStatus.NO_CONTENT);
		}
		else {
			userService.deleteUser(id);
			return new ResponseEntity<UserModel>( HttpStatus.OK);
		}
	}
		
	
	
}



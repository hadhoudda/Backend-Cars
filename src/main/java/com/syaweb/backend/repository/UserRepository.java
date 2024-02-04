package com.syaweb.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.syaweb.backend.model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long>{
	
	public List<UserModel> findByFirstName(String firstName); //firstName --> variable de UserModel attention au majscul
	

}

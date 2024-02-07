package com.syaweb.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.syaweb.backend.model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long>{
	
	public List<UserModel> findByFirstName(String firstName); //firstName --> variable de UserModel attention au majscul
	public List<UserModel> findByFirstNameAndLastName(String firstName, String lastName);
	
	//********** Reuest JPQL ****************//
	@Query("SELECT user FROM UserModel user where user.firstName Like ?1 AND user.lastName Like ?2") // user c'est alias 
	public List<UserModel> findByFirstNameAndLastNameJPQL(String firstName, String lastName);
	
	//********** Reuest JPQL éeme méthode avec les parametrtes ****************//
	@Query("SELECT user FROM UserModel user where user.firstName Like : myFirstName AND user.lastName Like : myLastName") 
	public List<UserModel> findByFirstNameAndLastNameJPQLParametres(@Param(value ="myFirstName") String firstName,@Param(value ="myLastName")String lastName);
	
}

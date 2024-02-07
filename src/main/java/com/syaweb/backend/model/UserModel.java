package com.syaweb.backend.model;


import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserModel implements Serializable{
	
	@Id
	@Column(nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Basic(optional = false)
    @Column(nullable = false)
	private String firstName;
	@Basic(optional = false)
    @Column(nullable = false)
	private String lastName;
	@Column(name="age")
	private int age;
	@Basic(optional = false)
    @Column(nullable = false)
	private String email;
	@Basic(optional = false)
    @Column(nullable = false)
	private String password;
	private Date starterDate;
	private Boolean active;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getStarterDate() {
		return starterDate;
	}
	public void setStarterDate(Date starterDate) {
		this.starterDate = starterDate;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	
	
	

}

package com.example.demo;

//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
//import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Technician")
public class TechEntity {
    
	@Id
    //@Column(name="Id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	//@Column(name="Username")
	//@Column(name="Email")
	//@Column(name="mobileNumber")
	//@Column(name="Password")
    private int id;
    private String username;
    private String email;
    private String phoneNumber;
    private String skills;
    private String experience;
    private String password;
    
   
    
    public TechEntity() {}
    public TechEntity(int id, String username, String email,String phoneNumber,String skills,String experience,String password) {
		super();
		this.id = id;
		this.username = username;
		this.email=email;
		this.phoneNumber = phoneNumber;
		this.skills=skills;
		this.experience=experience;
		this.password=password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
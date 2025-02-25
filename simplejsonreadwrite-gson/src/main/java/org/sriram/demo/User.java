package org.sriram.demo;

import java.io.Serializable;

public class User implements Serializable { 
	private String name; 
	private int age; 
	private String city; 
	private String state; 
	private String country; 

	public User(String name, int age, String city, String state, String country) {
	this.name = name; this.age = age; this.city = city; this.state = state; this.country = country;  
	} 

	public String getName() { return name; } 
	public int getAge() { return age; } 
	public String getCity() { return city; } 
	public String getState() { return state; } 
	public String getCountry() { return country; } 
	
	public void setName(String name) { this.name = name; } 
	public void setAge(int age) { this.age = age; } 
	public void setCity(String city) { this.city = city; } 
	public void setState(String state) { this.state = state; } 
	public void setCountry (String country) { this.country = country; } 
	
	public String toString() { 
		return "{name: \""+ getName() +"\", age:" + getAge() + ", city: \""+ getCity() + "\",state: \""+ getState() + "\", country: \"" +getCountry() + "\"}"; 
	}

} 
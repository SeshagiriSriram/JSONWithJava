package org.sriram.demo;
import java.io.Serializable;
import lombok.AllArgsConstructor;
//import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Getter; 
import lombok.Setter; 
@Getter @Setter @NoArgsConstructor @AllArgsConstructor 
public class User implements Serializable { 
	private String name; 
	private int age; 
	private String city; 
	private String state; 
	private String country; 

	public String toString() { 
		return "{name: \""+ getName() +"\", age:" + getAge() + ", city: \""+ getCity() + "\",state: \""+ getState() + "\", country: \"" +getCountry() + "\"}"; 
	}

} 
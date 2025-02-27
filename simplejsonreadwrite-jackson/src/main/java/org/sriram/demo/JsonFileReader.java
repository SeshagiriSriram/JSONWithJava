package org.sriram.demo;
//import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
//import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class JsonFileReader {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        byte[] jsonData = Files.readAllBytes(Paths.get("mydata.json"));
        User[]  aList = objectMapper.readValue(jsonData, User[].class);
        //User user = objectMapper.readValue(jsonData, User.class); 
		System.out.println("First User: " + aList[0].toString()); 

		for (User u:  aList) { 
				System.out.println("User: " + u); // Will this work??? 
		} 
                /* JsonNode jsonNode = objectMapper.readTree(new File("mydata.json"));
        String name = jsonNode.get("name").asText();
        int age = jsonNode.get("age").asInt();
        String city = jsonNode.get("city").asText();
        String state = jsonNode.get("state").asText();
        String country = jsonNode.get("country").asText();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Country: " + country);
        */ 
    }
}

package org.sriram.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
// import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList; 
public class JsonFileWriter {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        User user = new User("Seshagiri Sriram",55,"Chennai","Tamil Nadu","India"); 
	String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
	System.out.println("JSON: " + json); 

    ArrayList<User> aList = new ArrayList<User>(); 
    aList.add(user); 
	objectMapper.writeValue(new File("mydata.json"), aList);

	// ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
	// writer.writeValue(new File("mydata.json"), user);

	/* ObjectNode jsonNode = objectMapper.createObjectNode();
        jsonNode.put("name", "Seshagiri Sriram");
        jsonNode.put("age", 55);
        jsonNode.put("city", "Chennai");
        jsonNode.put("state", "Seshagiri Sriram");
        jsonNode.put("country", "India");
        objectMapper.writeValue(new File("mydata.json"), jsonNode);
	*/ 
    }
}

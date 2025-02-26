package org.sriram.demo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter; 
import java.io.Writer; 
import java.io.IOException;
import java.util.ArrayList;
 
public class JsonFileWriter {
    public static void main(String[] args) throws IOException {

    ArrayList<User> users = new ArrayList<User>(); 
	User user = new User("Seshagiri Sriram",55,"Chennai","Tamil Nadu","India");
	users.add(user); 
	Gson tmpGson = new Gson(); 
	System.out.println(tmpGson.toJson(user)); 
	User tmpUser = tmpGson.fromJson(tmpGson.toJson(user), User.class); 
	System.out.println("Name Converted back: "+ tmpUser.getName()); 

	try (Writer writer = new FileWriter("mydata.json")) {
    	Gson gson = new GsonBuilder().create();
    	gson.toJson(users, writer);
	}
	catch(Exception e) { 
		System.out.println("Exception e: "+ e.getMessage());
	} 
    }
}

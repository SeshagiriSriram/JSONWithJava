package org.sriram.demo;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

 
public class JsonFileReader {
    public static void main(String[] args) throws IOException {
	Gson gson = new Gson(); 
	BufferedReader bufferedReader =null; 


	try  {
		bufferedReader = new BufferedReader(new FileReader("mydata.json")); 
		User [] finalData = gson.fromJson(bufferedReader,User[].class);
		for(int i = 0; i < finalData.length;i++) { 
			System.out.println(finalData[i].toString()); 
		}	
	}
	catch(Exception e) { 
		System.out.println("Exception e: "+ e.getMessage());
	} 
    }
}

package org.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Execution {

	public static void main(String[] args) throws JacksonException, DatabindException, IOException{
	FileReader fileReader = new FileReader (new File("C:\\Users\\tamil\\eclipse-workspace\\Sample1\\src\\test\\resources\\read.json"));	
    ObjectMapper objectMapper = new ObjectMapper();
   // ObjectMapper mapper.get(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    Root readValue = objectMapper.readValue(fileReader, Root.class);
    System.out.println(readValue.getAge());
    System.out.println(readValue.getName());
    System.out.println(readValue.isStstus());
    Address address = readValue.getAddress();
    System.out.println(address.getCity());
    System.out.println(address.getState());
    ArrayList<String> courses = readValue.getCourses();
    for (int i = 0; i < courses.size(); i++) {
    	System.out.println(courses.get(i));
		
	}
    
	}

}

package org.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Execution1 {

	public static void main(String[] args) throws JacksonException, DatabindException, IOException  {
		// TODO Auto-generated method stub
FileReader fileReader = new FileReader(new File("C:\\Users\\tamil\\eclipse-workspace\\Sample1\\src\\test\\resources\\read1.json"));
ObjectMapper objectMapper = new ObjectMapper();
Root1 readValue = objectMapper.readValue(fileReader, Root1.class);
System.out.println(readValue.getId());











	}

}

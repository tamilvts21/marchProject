package org.login;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Execution {

	public static void main(String[] args) throws JsonProcessingException, DatabindException, IOException   {
		FileReader fileReader = new FileReader (new File("C:\\Users\\tamil\\eclipse-workspace\\Sample1\\src\\test\\resources\\read1.json"));
		ObjectMapper objectMapper = new ObjectMapper();
		Root1 readValue = objectMapper.readValue(fileReader, Root1.class);
		System.out.println(readValue.getId());
		System.out.println(readValue.getName());
		System.out.println(readValue.getType());
		System.out.println(readValue.getPpu());
		Batters batters = readValue.getBatter();
		ArrayList<BatterValue> batter = batters.getBatter();
		for (int i = 0; i < batter.size(); i++) {
			BatterValue batterValue = batter.get(i);
			System.out.println(batterValue.getId());
			System.out.println(batterValue.getType());
			
		}
		ArrayList<ToppingInnerValue> topping = readValue.getTopping();
		for (int i = 0; i < topping.size(); i++) {
			ToppingInnerValue toppingInnerValue = topping.get(i);
			System.out.println(toppingInnerValue.getId());
			System.out.println(toppingInnerValue.getType());
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

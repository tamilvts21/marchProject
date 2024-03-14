package org.login;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ExecutionWriteJSON {

	public static void main(String[] args) {
		File file = new File ("C:\\Users\\tamil\\eclipse-workspace\\Sample1\\src\\test\\resources\\tamil.json");
		ObjectMapper objectMapper = new ObjectMapper();
		
		
		
		
		BatterValue batterValue = new BatterValue("100", "JAVA");
		BatterValue batterValue1 = new BatterValue("200", "SELENIUM");
		BatterValue batterValue2 = new BatterValue("300", "API");
		batter.add(batterValue);
		Batters batter = new Batters(batter);
		
		Root1 root = new Root1("100", "TAmil", "RAM", "10.75", batter, topping);
		objectMapper.writeValue(file, root);
		
		
		
		
		
		
		
		
		
		
		
	}

}

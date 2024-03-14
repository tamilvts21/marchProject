package org.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class SampleRead {

	public static void main(String[] args) throws IOException, ParseException  {
	//FileReader - Pre defined class - object - to mention the path of the file to be read	
    FileReader fr = new FileReader(new File("C:\\Users\\tamil\\eclipse-workspace\\Sample1\\src\\test\\resources\\read.json") );
    //JSONParser - Pre Defined class to read the Json File we have method 
    //parse
	JSONParser jsonParser = new JSONParser();
	Object parse = jsonParser.parse(fr);
	//object is Supermost class in java JSONObject, JSONArray
	//TYpe casting lower order obj = (lowerdorder) HighorderRefName
	JSONObject jsonObject = (JSONObject)parse;
	System.out.println(jsonObject.get("name"));
	System.out.println(jsonObject.get("age"));
	System.out.println(jsonObject.get("status"));
	System.out.println(jsonObject.get("address"));
	System.out.println(jsonObject.get("courses"));
		
	}
	

}

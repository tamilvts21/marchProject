package org.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class SampleRead1 {

	public static void main(String[] args) throws IOException, ParseException {
		 FileReader fR = new FileReader (new File("C:\\Users\\tamil\\eclipse-workspace\\Sample1\\src\\test\\resources\\read1.json"));
		 JSONParser jsonParser = new JSONParser();
		 Object parse = jsonParser.parse(fR);
		 JSONObject jsonObject=(JSONObject)parse;
		 System.out.println(jsonObject.get("id"));
		 System.out.println(jsonObject.get("type"));
		 System.out.println(jsonObject.get("name"));
		 System.out.println(jsonObject.get("ppu"));
		 Object object = jsonObject.get("batters");
		 JSONObject jsonObject2=(JSONObject)object;
		 Object object2 = jsonObject2.get("batter");
		 JSONArray jsonArray =(JSONArray)object2;
		 for (int i = 0; i < jsonArray.size(); i++) {
			Object object3 = jsonArray.get(i);
			JSONObject JSONObject3 = (JSONObject)object3;
			System.out.println(JSONObject3.get("id")+ ":"+JSONObject3.get("type"));
			
		}
		
		 
         System.out.println(jsonObject.get("topping"));
         JSONArray jsonArray1 = (JSONArray)parse;
         for (int j = 0; j < jsonArray1.size(); j++) {
       System.out.println(jsonArray1.get(j));
         }
			
		
	}
		 
}


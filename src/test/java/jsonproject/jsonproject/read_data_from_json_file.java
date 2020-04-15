package jsonproject.jsonproject;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class read_data_from_json_file 
{

	public static void main(String[] args) throws Exception 
	{
		JSONParser jsonperser=new JSONParser();
		FileReader reader=new FileReader(".\\json files\\employee.json");
		Object obj=jsonperser.parse(reader);
		JSONObject empjsonobject=(JSONObject)obj;
		String fname=(String) empjsonobject.get("firstName");
		String lname=(String) empjsonobject.get("lastName");
		
		System.out.println("first name:"+fname);
		System.out.println("first name:"+lname);
		
		JSONArray array=(JSONArray) empjsonobject.get("address");
		
		for (int i = 0; i <array.size(); i++) 
		{
			JSONObject address	=(JSONObject)array.get(i);
			String street=(String) address.get("street");
			String city=(String) address.get("city");
			
			String state=(String) address.get("state");
			
			System.out.println("address of  "+i+"   is....");
			System.out.println("street is "+street);
			System.out.println("city is "+city);
			System.out.println("state is "+state);
			
			
			
			
		}
		
		
		
		
		

	}

}

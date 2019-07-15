package com.atmecs.RestAssuredInCustomerDetails;

import static io.restassured.RestAssured.given;


import org.json.JSONException;
import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
/**
 * automate the insert request using rest assured 
 * @author Anne.Sivakumar
 *
 */
public class PostRequest {
	//one method to insert in to the file by passing json as string 
	@Test

	public void postService()

	{

	String myJson = "{\"firstname\":\"STEPHIE\",\"lastname\":\"A\",\"age\":\"20\",\"phone\":\"908765443\",\"sex\":\"FEMALE\",\"address\":\"GANDHI NAGAR\",\"city\":\"ERODE\",\"state\":\"TAMIL NADU\",\"pincode\":\"981234\",\"country\":\"INDIA\",\"email\":\"stephie567@gmail.com\"}";

	RestAssured.baseURI  = "http://localhost:8091/customer";
	Response r = given()
	.contentType("application/json")
	.body(myJson)
	.when()
	.post("http://localhost:8091/customer");
	String body = r.getBody().asString();
	System.out.println(body);

	}
	 JSONObject jsonObject=new JSONObject();
	 
	//another method to insert in to the file by passing json object 
	  @Test
	    public void postOtherMethod() throws JSONException
	    {
	    	
	    	jsonObject.put("firstname", "SOFIA");
			jsonObject.put("lastname", "J");
			jsonObject.put("age", "25");
			jsonObject.put("phone", "678905432");
			jsonObject.put("sex", "FEMALE");
			jsonObject.put("address", "GACHIBOWLI");
			jsonObject.put("city", "HYDERABAD");
			jsonObject.put("state", "TELUNGANA");
			jsonObject.put("pincode", "678905");
			jsonObject.put("country", "INDIA");
			jsonObject.put("email", "sofiaj@gmail.com");
			
	        RestAssured.baseURI  = "http://localhost:8091/customer";
	    	Response r = given()
	    	.contentType("application/json")
	    	.body(jsonObject.toString())
	    	.when()
	    	.post("http://localhost:8091/customer");
	    	String body = r.getBody().asString();
	    	System.out.println(body);

	    }
}

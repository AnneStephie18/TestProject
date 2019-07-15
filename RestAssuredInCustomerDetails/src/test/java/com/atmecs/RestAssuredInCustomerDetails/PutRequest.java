package com.atmecs.RestAssuredInCustomerDetails;

import static io.restassured.RestAssured.given;

import org.json.JSONException;
import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PutRequest {
	 JSONObject jsonObject=new JSONObject();
	 @Test
	    public void putMethod() throws JSONException
	    {
	    	
		 jsonObject.put("firstname", "SOFIA");
			jsonObject.put("lastname", "J");
			jsonObject.put("age", "30");
			jsonObject.put("phone", "678905432");
			jsonObject.put("sex", "FEMALE");
			jsonObject.put("address", "GACHIBOWLI");
			jsonObject.put("city", "HYDERABAD");
			jsonObject.put("state", "TELUNGANA");
			jsonObject.put("pincode", "678905");
			jsonObject.put("country", "INDIA");
			jsonObject.put("email", "sofiaj123@gmail.com");
			
	        RestAssured.baseURI  = "http://localhost:8091/customer";
	    	Response r = given()
	    	.contentType("application/json")
	    	.body(jsonObject.toString())
	    	.when()
	    	.put("http://localhost:8091/customer");
	    	String body = r.getBody().asString();
	    	System.out.println(body);

	    }
	
}

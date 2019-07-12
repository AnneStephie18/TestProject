package com.atmecs.GetRestAssured;

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
	    	
	    	jsonObject.put("empNo", "200");
			jsonObject.put("empName", "xxxx");
			jsonObject.put("position", "dddd");
			
	        RestAssured.baseURI  = "http://localhost:5022/employee";
	    	Response r = given()
	    	.contentType("application/json")
	    	.body(jsonObject.toString())
	    	.when()
	    	.put("http://localhost:5022/employee");
	    	String body = r.getBody().asString();
	    	System.out.println(body);

	    }
	
}

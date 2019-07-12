package com.atmecs.GetRestAssured;

import static io.restassured.RestAssured.given;


import org.json.JSONException;
import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PostRequest {
	@Test

	public void postService()

	{

	String myJson = "{\"empNo\":\"100\",\"empName\":\"merlin\",\"position\":\"manager\"}";

	RestAssured.baseURI  = "http://localhost:5022/employee";
	Response r = given()
	.contentType("application/json")
	.body(myJson)
	.when()
	.post("http://localhost:5022/employee");
	String body = r.getBody().asString();
	System.out.println(body);

	}
	 JSONObject jsonObject=new JSONObject();
	 
	
	  @Test
	    public void postOtherMethod() throws JSONException
	    {
	    	
	    	jsonObject.put("empNo", "200");
			jsonObject.put("empName", "jeni");
			jsonObject.put("position", "director");
			
	        RestAssured.baseURI  = "http://localhost:5022/employee";
	    	Response r = given()
	    	.contentType("application/json")
	    	.body(jsonObject.toString())
	    	.when()
	    	.post("http://localhost:5022/employee");
	    	String body = r.getBody().asString();
	    	System.out.println(body);

	    }
}

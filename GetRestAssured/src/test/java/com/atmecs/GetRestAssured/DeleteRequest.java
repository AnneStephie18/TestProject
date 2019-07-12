package com.atmecs.GetRestAssured;

import static io.restassured.RestAssured.given;

import org.json.JSONException;
import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteRequest {
	 JSONObject jsonObject=new JSONObject();

	  @Test
	    public void deleteMethod() throws JSONException
	    {
		  jsonObject.put("empNo", "200");
			
	        RestAssured.baseURI  = "http://localhost:5022/employee";
	    	Response r = given()
	    	.contentType("application/json")
	    	.body(jsonObject.toString())
	    	.when()
	    	.delete("http://localhost:5022/employee/100");
	    	String body = r.getBody().asString();
	    	System.out.println(body);
	    }
}

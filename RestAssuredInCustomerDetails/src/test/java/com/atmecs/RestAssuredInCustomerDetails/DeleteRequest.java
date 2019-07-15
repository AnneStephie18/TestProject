package com.atmecs.RestAssuredInCustomerDetails;

import static io.restassured.RestAssured.given;

import org.json.JSONException;
import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
/**
 * automate the delete request using rest assured 
 * @author Anne.Sivakumar
 *
 */
public class DeleteRequest {
	 JSONObject jsonObject=new JSONObject();

	  @Test
	    public void deleteMethod() throws JSONException
	    {
		  jsonObject.put("email", "banu9876@gmail.com");
			
	        RestAssured.baseURI  = "http://localhost:8091/customer";
	    	Response r = given()
	    	.contentType("application/json")
	    	.body(jsonObject.toString())
	    	.when()
	    	.delete("http://localhost:8091/customer/banu9876@gmail.com");
	    	String body = r.getBody().asString();
	    	System.out.println(body);
	    }
}

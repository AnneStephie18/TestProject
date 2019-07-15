package com.atmecs.RestAssuredInCustomerDetails;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;
/**
 * automate the get request using rest assured 
 * @author Anne.Sivakumar
 *
 */
public class GetRequest {
	@Test
	public void GetService()
	{   
		Response response=RestAssured.get("http://localhost:8091/customers");
		int code=response.getStatusCode();
		System.out.println("Employee Details:"+response.asString());
		System.out.println("Status code is:"+code);
		Assert.assertEquals(code, 200);
	}
	
	
	 
	
	
}

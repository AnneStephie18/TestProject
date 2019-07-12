package com.atmecs.GetRestAssured;

import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;
public class GetRequest {
	@Test
	public void GetService()
	{   
		Response response=RestAssured.get("http://localhost:5022/employees");
		int code=response.getStatusCode();
		System.out.println("Employee Details:"+response.asString());
		System.out.println("Status code is:"+code);
		Assert.assertEquals(code, 200);
	}
	
	
	 
	
	
}

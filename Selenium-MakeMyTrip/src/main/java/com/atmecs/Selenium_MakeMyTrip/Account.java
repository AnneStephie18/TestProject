package com.atmecs.Selenium_MakeMyTrip;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Account extends Base{
	
	
	@Test
	public void createAccount() throws Exception
	{
		
		openUrl();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[contains(text(),'Login or Create Account')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("emailOrPhone")).sendKeys(properties.getProperty("username"));
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys(properties.getProperty("password"));
		Thread.sleep(2000);
		System.out.println("okkkk");
		driver.findElement(By.xpath("//button[@class='capText font16']")).click();
	}
	

}

package com.atmecs.Selenium_MakeMyTrip;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginPage extends Base {
	@Test
	public void login() throws Exception
	{
		openUrl();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[contains(text(),'Login or Create Account')]")).click();
		//Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys(properties.getProperty("username"));
		//Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys(properties.getProperty("password"));
	
		//driver.findElement(By.xpath("//div[@class='btnContainer appendBottom25 disabled']")).click();
		
	driver.findElement(By.xpath("//span[@class='font14 darkGreyText latoBold']")).click();
		
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("annebanu180996@gmail.com");
	}
}

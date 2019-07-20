package com.atmecs.trivago;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.atmecs.Selenium_MakeMyTrip.Base;

public class CreateAccount extends Base{
	@Test
	public void createAccount() throws Exception
	{
		
chooseBrowser();
driver.get("https://www.trivago.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='siteheader__control']")).click();
		
	}
}

package com.atmecs.Oyo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.atmecs.Selenium_MakeMyTrip.Base;

public class AlertMessage extends Base{
	
	@Test
	public void popupWindow()
	{
		driver.get(properties.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebElement startplanning = driver.findElement(By.xpath("//a[text()='Start Planning']"));
		startplanning.click();
		Alert alert = driver.switchTo().alert();		
		
        // Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();		
        		
        // Displaying alert message		
        System.out.println(alertMessage);	
        
        		
        // Accepting alert		
        alert.accept();		
	}
	
	@Test
	public void UploadFile()
	{
		driver.get(properties.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

}

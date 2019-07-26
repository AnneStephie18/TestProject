package com.atmecs.Oyo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.atmecs.Selenium_MakeMyTrip.Base;
/**
 * This class is used to automate login page by providing user name and password for the 
 * @author Anne.Sivakumar
 *
 */
public class LoginOyo extends Base {
/**
 * delete all cookies, get the url, maximize the window, provide implicit wait, clicking login page and providing user name and password which is stored in properties file 
 * @throws Exception
 */
	@Test
	public void login() throws Exception {

		driver.manage().deleteAllCookies(); 
		driver.get(properties.getProperty("url"));
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath(properties.getProperty("loginclickbutton"))).click();
		driver.findElement(By.xpath(properties.getProperty("clickherebutton"))).click();
		WebElement user_text_field=driver.findElement(By.xpath(properties.getProperty("usertextfield")));
		user_text_field.sendKeys(properties.getProperty("username"));
		driver.findElement(By.xpath(properties.getProperty("passwordtextfield"))).sendKeys(properties.getProperty("password"));
		driver.findElement(By.xpath(properties.getProperty("submitbutton"))).click();
		AssertJUnit.assertTrue(user_text_field.getAttribute("value").equalsIgnoreCase(properties.getProperty("username")));
		//AssertJUnit.assertTrue(user_text_field.getText().equalsIgnoreCase(properties.getProperty("username")));
	}

}

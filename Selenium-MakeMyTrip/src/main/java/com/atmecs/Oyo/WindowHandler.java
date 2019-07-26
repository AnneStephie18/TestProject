package com.atmecs.Oyo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.atmecs.Selenium_MakeMyTrip.Base;

/**
 * This class is used for window handler and switching frames
 * 
 * @author Anne.Sivakumar
 *
 */
public class WindowHandler extends Base {
	/**
	 * get the url, maximize the window, provide implicit wait,
	 */
	@Test
	public void windowHandler() {
		driver.get(properties.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement membershipcard = driver.findElement(By.xpath(properties.getProperty("membershipcardbutton-xpath")));
		membershipcard.click();
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("Parent window's handle -> " + parentWindowHandle);
		driver.switchTo().window(parentWindowHandle);
	}

	/**
	 * get the url, maximize the window, provide implicit wait,
	 */
	@Test
	public void Frames() {
		driver.get(properties.getProperty("frameurl"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().frame(properties.getProperty("frameid"));
		System.out.println("********switched to the iframe*******");
	}

}

package com.atmecs.Oyo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.atmecs.Selenium_MakeMyTrip.Base;
/**
 * This class is used to book a hotel
 * @author Anne.Sivakumar
 *
 */
public class BookRoom extends Base {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	/**
	 * get the url, maximize the window, provide implicit wait, search hotel by city name which is stored in properties file, sort by price,category,type
	 * @throws Exception
	 */
	@Test
	public void bookRoom() throws Exception  {
		
		
		
		driver.get(properties.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("autoComplete__home")).sendKeys(properties.getProperty("city"));
		driver.findElement(By.xpath("(//div[@class='geoSuggestionsList__locationText u-textEllipsis'])[3]")).click();
		driver.findElement(By.xpath("//div[@class='oyo-row oyo-row--no-spacing datePickerDesktop datePickerDesktop--home']")).click();
		driver.findElement(By.xpath("(//span[text()='2'])[3]")).click();
		driver.findElement(By.xpath("//div[text()='1 Room, 1 Guest']")).click();
		driver.findElement(By.xpath("//span[@class='guestRoomPickerPopUp__plus']")).click();
		
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		
		WebElement element = driver.findElement(By.xpath("//span[@class='dropdown__select']"));
		element.click();
		System.out.println(element);
		driver.findElement(By.xpath("(//li[@class='dropdown__item'])[3]")).click();;
		//js.executeScript("window.scrollBy(0,250)");
		 driver.findElement(By.xpath("(//span[@class='default-icon-style checkbox__checkmark match-container wt-auto'])[1]")).click();
		 driver.findElement(By.xpath("(//span[@class='default-icon-style checkbox__checkmark match-container wt-auto'])[6]")).click();
		 driver.findElement(By.xpath("(//span[@class='default-icon-style checkbox__checkmark match-container wt-auto'])[11]")).click();
		 driver.findElement(By.xpath("(//span[@class='default-icon-style checkbox__checkmark match-container wt-auto'])[14]")).click();
		 driver.findElement(By.xpath("(//span[@class='default-icon-style checkbox__checkmark match-container wt-auto'])[19]")).click();
		 driver.findElement(By.xpath("(//div[@class='btn d-whiteButton'])[1]")).click();
	}

}

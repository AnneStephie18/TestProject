package com.atmecs.Selenium_MakeMyTrip;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
/**
 * This class is used to get the website url for three different browser
 * @author Anne.Sivakumar
 *
 */

public class Base {
	public WebDriver driver;
	public String path="TestData.properties";
	public Properties properties;
	public FileInputStream fis;
	/**
	 * By using properties file compare the key with the name of the browser and open browser with corresponding value in properties file
	 * @throws Exception
	 */
@BeforeTest
	public void chooseBrowser() throws Exception
	{
		properties=new Properties();
		fis=new FileInputStream(path);
		properties.load(fis);
		if(properties.getProperty("browser").equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:/Users/Anne.Sivakumar/Desktop/neon/Selenium-MakeMyTrip/Lib/geckodriver-v0.24.0-win64/geckodriver.exe");
			driver=new FirefoxDriver();
		}	
		else if(properties.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:/Users/Anne.Sivakumar/Desktop/neon/Selenium-MakeMyTrip/Lib/chromedriver_win32/chromedriver.exe");
			driver=new ChromeDriver();
		}
		 
		else if(properties.getProperty("browser").equalsIgnoreCase("internetexplorer"))
		{
			System.setProperty("webdriver.ie.driver", "C:/Users/Anne.Sivakumar/Desktop/neon/Selenium-MakeMyTrip/Lib/IEDriverServer_x64_2.39.0/IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		
	}
	
	//close the driver
	
	public void quitUrl() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.quit();
	}
	
	
}

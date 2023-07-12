package com.general.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./src/main/resources/driver/geckodriver.exe");
		System.setProperty("webdriver.edge.driver", "./src/main/resources/driver/msedgedriver.exe");
	}
public	WebDriver driver;
	
	@BeforeTest
	public void openBrowser() {
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	@BeforeMethod
	public void login() {
		
	}
	@AfterMethod
	public void logout() {
		
	}
	@AfterTest
	public void closeBrowser() {
	//	driver.close();
		
	}

}

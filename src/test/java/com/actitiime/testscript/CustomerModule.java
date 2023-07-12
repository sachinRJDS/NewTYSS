package com.actitiime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule {
	static {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");
	}
	@Test
    public void test() throws InterruptedException {
    	Reporter.log("test",true);
    	WebDriver driver=new ChromeDriver();
    	driver.get("https://demo.actitime.com");
    	String title = driver.getTitle();
    	System.out.println(title);
    	driver.close();
    }
}

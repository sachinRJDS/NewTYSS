package com.mouseaction.pom;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.general.generic.BaseClass;

public class HomePage {
	
	@FindBy(xpath="/html/body/div[2]/div/div/button")
	private WebElement hiddenPopUp;
	
	@FindBy(xpath="//div[text()='Fashion']")
	private WebElement fashionDropDown;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[2]/div/div/div[3]/a/div[2]/div[2]/div[2]/div/div/div[1]/a[2]")
	private WebElement mensOption;
	
	@FindBy(xpath="//div[@class='_24_Dny']")
	private List<WebElement>allCheckBox;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setPopUp() {
		hiddenPopUp.click();
	}
	public void setFashionDropDown(WebDriver driver) {
		Actions a=new Actions(driver);
		a.moveToElement(fashionDropDown).perform();;
	}
	public void setMensOption() {
		mensOption.click();
	}
	public void setAllCheckBox(WebDriver driver) throws InterruptedException {
		JavascriptExecutor j=(JavascriptExecutor) driver;
		Thread.sleep(2000);
		for(WebElement we1:allCheckBox) {
			j.executeScript("window.scrollBy(0,820)");
			Thread.sleep(2000);
			we1.click();
			
			
		}
	}
	

}

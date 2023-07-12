package com.actitiime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.general.generic.BaseClass;
import com.mouseaction.pom.HomePage;

public class MouseOver extends BaseClass{
	
	@Test
	public void testMouseOver() throws InterruptedException {
		Reporter.log("mouseOver",true);
		HomePage h=new HomePage(driver);
		h.setPopUp();
		Thread.sleep(2000);
		h.setFashionDropDown(driver);
		Thread.sleep(2000);
		h.setMensOption();
		Thread.sleep(2000);
		h.setAllCheckBox(driver);
	}

}

package com.testscenario;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.objectrepository.Locators;
import com.utilities.GeneraicWrappers;

public class Jritest extends GeneraicWrappers {

	Locators loc = new Locators();
	@Parameters("browsername")
	@BeforeClass
	public void initliaze(String browsername) {
		if(browsername.equalsIgnoreCase("chrome")) {
			OpenChrom();
		}
		else if(browsername.equalsIgnoreCase("firefox")) {
			OpenFirefox();
		}
		else if(browsername.equalsIgnoreCase("edge")) {
			OpenEdge();
		}
		else {
			System.out.println("Please Choose valid Browser name.....");
		}
	}
	
	@Test
	public void test() throws Exception {
		driver.get("https://www.justrechargeit.com/");
		
		//Click on Create Account Button link.
		driver.findElement(loc.ClickonCreateAccount).click();
		Thread.sleep(3000);
		
		//Fill the Details
		driver.findElement(loc.Name).sendKeys("Chitra Rami");
		Thread.sleep(2000);
		driver.findElement(loc.Mobileno).sendKeys("8456496596");
		Thread.sleep(2000);
		driver.findElement(loc.Email).sendKeys("Test123@ymail.com");
		Thread.sleep(2000);
		driver.findElement(loc.Password).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(loc.Checkbox).click();
		Thread.sleep(5000);
		driver.findElement(loc.SubmitButton).click();
		Thread.sleep(5000);
		driver.quit();
	}
	
}

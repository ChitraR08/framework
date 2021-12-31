package com.testscenario;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.objectrepository.Blazedemolocators;
import com.objectrepository.Locators;
import com.utilities.GeneraicWrappers;

public class BlazeDemo extends GeneraicWrappers {

	Blazedemolocators loc_blazedemo = new Blazedemolocators();
	@Parameters("browsername")
	@BeforeClass
	public void initliaze(@Optional("chrome") String browsername) {
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
	public void init() throws Exception {
		FileInputStream fis = new FileInputStream("./src/test/resources/testdata/inputdata.properties");
		prop.load(fis);
		
		driver.get(prop.getProperty("Blazedemourl"));
		Select departurecty = new Select(driver.findElement(loc_blazedemo.BlazeDemo_DepartureCity));
		departurecty.selectByVisibleText(prop.getProperty("Departure_City"));
		Thread.sleep(2000);
		Select desticity = new Select(driver.findElement(loc_blazedemo.BlazeDemo_DestinationCity));
		desticity.selectByValue(prop.getProperty("Destination_City"));
		Thread.sleep(2000);
		driver.findElement(loc_blazedemo.BlazeDemo_FindFlightBtn).click();
		Thread.sleep(2000);
		
		/*Random r1 = new Random();
		int randbtn = r1.nextInt(5);
		System.out.println("Random Current flight buttons is :" + r1);
		if(randbtn == 0) {
			randbtn=1;
			System.out.println(randbtn);
		}
		*/
		driver.findElement(loc_blazedemo.BlazeDemo_Chooseflightbtn).click();
		
		driver.findElement(loc_blazedemo.BlazeDemo_Name).sendKeys(prop.getProperty("Name"));
		Thread.sleep(2000);
		driver.findElement(loc_blazedemo.BlazeDemo_Address).sendKeys(prop.getProperty("Address"));
		Thread.sleep(2000);
		driver.findElement(loc_blazedemo.BlazeDemo_City).sendKeys(prop.getProperty("City"));
		Thread.sleep(2000);
		driver.findElement(loc_blazedemo.BlazeDemo_State).sendKeys(prop.getProperty("State"));
		Thread.sleep(2000);
		driver.findElement(loc_blazedemo.BlazeDemo_Zipcode).sendKeys(prop.getProperty("Zipcode"));
		Thread.sleep(2000);
		Select Ctype = new Select(driver.findElement(loc_blazedemo.BlazeDemo_CardType));
		Ctype.selectByVisibleText(prop.getProperty("CardType"));
		Thread.sleep(2000);
		driver.findElement(loc_blazedemo.BlazeDemo_Credritcardnum).sendKeys(prop.getProperty("CardNumber"));
		Thread.sleep(2000);
		driver.findElement(loc_blazedemo.BlazeDemo_Month).sendKeys(prop.getProperty("Month"));
		Thread.sleep(2000);
		driver.findElement(loc_blazedemo.BlazeDemo_Year).sendKeys(prop.getProperty("Year"));
		Thread.sleep(2000);
		driver.findElement(loc_blazedemo.BlazeDemo_NameonCard).sendKeys(prop.getProperty("Namecard"));
		Thread.sleep(2000);
		driver.findElement(loc_blazedemo.BlazeDemo_Chkbox).click();
		Thread.sleep(2000);
		driver.findElement(loc_blazedemo.BlazeDemo_Purshaceflightbtn).click();
		Thread.sleep(2000);
		
		String msg = driver.findElement(By.xpath("//h1[contains(text(),'Thank you for your purchase today!')]")).getText();
		System.out.println(msg);
		Thread.sleep(2000);
		
		String tbl = driver.findElement(By.xpath("//body/div[2]/div[1]/table[1]")).getText();
		System.out.println(tbl);
		Thread.sleep(2000);
		
		
		driver.close();
	}
	
}

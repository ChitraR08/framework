package com.testscenario;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.objectrepository.Blazedemolocators;
import com.utilities.GeneraicWrappers;

public class StudentForm extends GeneraicWrappers {
	
	Blazedemolocators blaz_loc = new Blazedemolocators();
	@Parameters("browsername")
	@BeforeClass
	public void start(@Optional("chrome") String browsername) {
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
			System.out.println("Choose valid browser....");
		}
	}
	@org.testng.annotations.Test
	public void Test() throws Exception {
		FileInputStream fis = new FileInputStream("./src/test/resources/testdata/inputdata.properties");
		prop.load(fis);
		driver.get(prop.getProperty("Studentformurl"));
		Thread.sleep(2000);
		driver.findElement(blaz_loc.Stud_Name).sendKeys(prop.getProperty("Student_name"));
		Thread.sleep(1000);
		driver.findElement(blaz_loc.Stud_fname).sendKeys(prop.getProperty("Student_fathename"));
		Thread.sleep(1000);
		driver.findElement(blaz_loc.Stud_postalAdd).sendKeys(prop.getProperty("Student_postaladdress"));
		Thread.sleep(1000);
		driver.findElement(blaz_loc.Stud_personalAdd).sendKeys(prop.getProperty("Student_Personaladdress"));
		Thread.sleep(1000);
		driver.findElement(blaz_loc.Stud_gender).click();
		Thread.sleep(3000);
		SelectByVisibleText(blaz_loc.Stud_City, prop.getProperty("Student_City"));
		Thread.sleep(3000);
		selectByValue(blaz_loc.Stud_Course, prop.getProperty("Student_Course"));
		Thread.sleep(2000);
		SelectByVisibleText(blaz_loc.Stud_District, prop.getProperty("Student_District"));
		Thread.sleep(2000);
		selectByValue(blaz_loc.Stud_State, prop.getProperty("Student_state"));
		Thread.sleep(2000);
		driver.findElement(blaz_loc.Stud_pincode).sendKeys(prop.getProperty("Student_Pincode"));
		Thread.sleep(2000);
		driver.findElement(blaz_loc.Stud_Email).sendKeys(prop.getProperty("Student_Email"));
		Thread.sleep(2000);
		takeScreenshot();
		Thread.sleep(2000);
		driver.findElement(blaz_loc.Stud_Submitbtn).click();
		Thread.sleep(5000);
		
	}
	
	@AfterClass
	public void Afterclass() throws Exception {
		driver.quit();
	}
}

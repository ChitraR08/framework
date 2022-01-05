package com.utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GeneraicWrappers extends Base {

	public void OpenChrom() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public void OpenFirefox() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
	 
	public void OpenEdge() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
	}
	
	public void SelectByVisibleText(By Locators, String visibleText) {
		WebElement wb = driver.findElement(Locators);
		if(wb.isDisplayed()) {
			if(wb.isEnabled()) {
				Select city = new Select(wb);
				city.selectByVisibleText(visibleText);
			}
			else {
				System.out.println("The webelement is NOT Enabled, please check**************");
			}
		}
		else {
			System.out.println("The webelement is NOT displayed, please check**************");
		}
	}
	
	public void selectByValue(By locater, String value) {
		WebElement element = driver.findElement(locater);
		if (element.isDisplayed()) {
			// isEnabled()
			if (element.isEnabled()) {
				Select dropdown = new Select(element);
				dropdown.selectByValue(value);
			} else {
				System.out.println("The webelement is NOT Enabled, please check**************");
			}
		} else {
			System.out.println("The webelement is NOT displayed, please check**************");
		}

	}
	public String timestamp() {
		Date d = new Date();
		DateFormat df = new SimpleDateFormat("ddMMMyyy_HHmmss");
		String timeTamp = df.format(d);
		return timeTamp;
	}
	
	public void takeScreenshot() throws Exception {
		File abc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//move the file to local folder
		//FileHandler.copy(abc, new File(".\\Screenshots\\"+timestamp()+".PNG"));
		 try {
	            FileUtils.copyFile(abc, new File(".\\Screenshots\\"+timestamp()+".PNG"));
	        } catch (IOException e) {
	            System.out.println(e.getMessage());
	        }
		System.out.println("Screenshot taken*** ");
	}
}

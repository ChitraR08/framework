package com.objectrepository;

import org.openqa.selenium.By;

public class Blazedemolocators {

	public final By BlazeDemo_DepartureCity = By.name("fromPort");
	public final By BlazeDemo_DestinationCity = By.name("toPort");
	public final By BlazeDemo_FindFlightBtn = By.xpath("//input[@value='Find Flights']");
	
	public final By BlazeDemo_Chooseflightbtn = By.xpath("(//input[@type='submit'])[3]");
	
	public final By BlazeDemo_Name = By.id("inputName");
	public final By BlazeDemo_Address = By.id("address");
	public final By BlazeDemo_City = By.id("city");
	public final By BlazeDemo_State = By.id("state");
	public final By BlazeDemo_Zipcode = By.id("zipCode");
	public final By BlazeDemo_CardType = By.id("cardType");
	public final By BlazeDemo_Credritcardnum = By.id("creditCardNumber");
	public final By BlazeDemo_Month =By.id("creditCardMonth");
	public final By BlazeDemo_Year = By.id("creditCardYear");
	public final By BlazeDemo_NameonCard = By.id("nameOnCard");
	public final By BlazeDemo_Chkbox = By.id("rememberMe");
	public final By BlazeDemo_Purshaceflightbtn = By.xpath("//body/div[2]/form[1]/div[11]/div[1]/input[1]");
	
	
}


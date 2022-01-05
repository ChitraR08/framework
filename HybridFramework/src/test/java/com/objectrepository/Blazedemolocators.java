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
	
	
	//Student RegistrationForm
	public final By Stud_Name = By.id("studentname");
	public final By Stud_fname = By.id("fathername");
	public final By Stud_postalAdd = By.id("paddress");
	public final By Stud_personalAdd = By.id("personaladdress");
	public final By Stud_gender = By.xpath("//tbody/tr[6]/td[2]/input[2]");
	public final By Stud_City = By.xpath("//tbody/tr[7]/td[2]/select[1]");
	public final By Stud_Course = By.xpath("//tbody/tr[8]/td[2]/select[1]");
	public final By Stud_District = By.xpath("//tbody/tr[9]/td[2]/select[1]");
	public final By Stud_State = By.xpath("//tbody/tr[10]/td[2]/select[1]");
	public final By Stud_pincode = By.id("pincode");
	public final By Stud_Email = By.id("emailid");
	public final By Stud_Submitbtn = By.xpath("//tbody/tr[13]/td[2]/input[1]");
	
}


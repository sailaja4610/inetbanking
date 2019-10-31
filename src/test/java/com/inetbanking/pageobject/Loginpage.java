package com.inetbanking.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebDriver idriver;
	
	Loginpage(WebDriver rdriver)
	{
		idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(name="uid")
	WebElement txtusername;
	
	@FindBy(name="password")
	WebElement txtpassword;
	
	@FindBy(name="btnLogin")
	WebElement loginbutton;
	
	public void setusername(String uname)
	{
		txtusername.sendKeys("uname");
	}
	public void setpassword(String pass)
	{
		txtpassword.sendKeys("pass");
	}
	public void clicksubmit()
	{
		loginbutton.click();
	}

	{
	

}
}

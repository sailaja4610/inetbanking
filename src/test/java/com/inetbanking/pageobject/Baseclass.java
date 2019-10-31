package com.inetbanking.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class Baseclass {
	public String baseurl="http://demo.guru99.com/v4/";
	public String username="mngr229797";
	public String password="nAdAzEs";
	public static WebDriver driver;
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	

}

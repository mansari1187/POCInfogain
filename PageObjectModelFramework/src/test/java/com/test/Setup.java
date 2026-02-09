package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Setup {
	WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void CleanUp()
	{
		driver.quit();
	}

}

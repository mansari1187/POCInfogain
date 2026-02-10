package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterAndDeleteAccount extends Setup{
	
	@Test
	public void SignUpAndDeleteAccount() throws InterruptedException
	{
		driver.get("https://automationexercise.com/");
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Automation Exercise"));
		
		driver.findElement(By.xpath("//a[contains(text(),' Signup / Login')]")).click();
		
		WebElement signupText = driver.findElement(By.xpath("//h2[text()='New User Signup!']"));
		
		Assert.assertTrue(signupText.isDisplayed());
		
		driver.findElement(By.name("name")).sendKeys("Anand Test");
		
		driver.findElement(By.xpath("(//input[@placeholder='Email Address'])[2]")).sendKeys("anand.103m@gmail.com");
		
		driver.findElement(By.xpath("//button[text()='Signup']")).click();
		
		Thread.sleep(4000);
		
		
		WebElement VerifyAccountInformation=driver.findElement(By.xpath("//b[text()='Enter Account Information']"));
		
		Assert.assertTrue(VerifyAccountInformation.isDisplayed());
		
		driver.findElement(By.id("id_gender1")).click();
		
	}

}

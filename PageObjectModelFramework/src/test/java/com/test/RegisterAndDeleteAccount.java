package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterAndDeleteAccount extends Setup{
	
	@Test
	public void SignUpAndDeleteAccount()
	{
		driver.get("https://automationexercise.com/");
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Automation Exercise"));
	}

}

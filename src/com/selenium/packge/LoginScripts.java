package com.selenium.packge;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginScripts extends BaseClass {

	@Test(description="this TC perform valid logintomyapp")
	public void logintoMyapp() throws InterruptedException {

		driver.findElement(By.id("email")).sendKeys("venkatramreddy108@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("9247739447");
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(5000);

	}

	@Test(description="this TC will do invalid login")
	public void invalidLogin() throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys("venkatramreddy105@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("9247739448");
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(5000);
		
	}

}

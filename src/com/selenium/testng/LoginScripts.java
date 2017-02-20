package com.selenium.testng;


import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginScripts extends BaseClass {
	@BeforeClass
	public void beforClass() {
System.out.println("befor class");
	}

	@Test(description = "this TC perform valid logintomyapp",priority=0)
	public void logintoMyapp() throws InterruptedException {

		driver.findElement(By.id("email")).sendKeys("venkatramreddy107@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("9247739447");
		driver.findElement(By.id("loginbutton")).click();
		System.out.println("logintomyapp");
		Thread.sleep(5000);

	}

	@Test(description = "this TC will do invalid login",priority=1)
	public void invalidLogin() throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys("venkatramreddy105@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("9247739448");
		driver.findElement(By.id("loginbutton")).click();
		System.out.println("invalid login ");
		Thread.sleep(5000);

	}
	@AfterClass
	public void afterClass(){
		System.out.println("after class");
	}

}

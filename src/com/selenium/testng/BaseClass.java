package com.selenium.testng;

//import org.junit.AfterClass;
//import org.junit.BeforeClass;
//import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.AfterMethod;// ----> now we are not using methods
//import org.testng.annotations.BeforeMethod;//  ---> now we are not using methods

public class BaseClass {

	WebDriver driver;

	// @BeforeMethod //--> BM-t1-AM -- BM-t2-AM -- BM-t3-AM flow like this
	// @BeforeClass --> BC-t1-t2-t3-AC
	//@Parameters
	//@BeforeClass
	@BeforeTest
	public void openBrowser() {
		Reporter.log("=======Browser session started========", true);
		System.setProperty("webdriver.chrome.driver", "D:\\naa files\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Reporter.log("=======Browser session end========", true);

	}

	// @AfterMethod
	//@Parameters
	//@AfterClass
	@AfterTest
	public void closeBrowser() {

		driver.quit();
		Reporter.log("=======Browser session end========", true);
	}

}

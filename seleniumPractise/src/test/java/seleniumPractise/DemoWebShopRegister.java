package seleniumPractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pages.DemoWebShopHomePage;


public class DemoWebShopRegister {
	WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		driver = new ChromeDriver();
	}
	
	@Test
	public void sampleAssert() {
		String a ="Apple";
		String b = "Apple";
		Assert.assertEquals(a, b,"The values are not equal");
	}
	
	@Test
	public void navigateToWebshopRegistration() {
		DemoWebShopHomePage WebPageHome = new DemoWebShopHomePage(driver);
		WebPageHome.launchDemoWebShop();
		driver.manage().window().maximize();
		WebPageHome.rejectPopup();
		WebPageHome.clickRegisterLink();
	}
	
	@AfterTest
	public void tearDownMethod() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
		System.out.println("Test Executed successfully");
	}

}

package seleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleHome;


public class FirstSample {
	

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Reject all']")).click();
		GoogleHome.searchInput(driver).sendKeys("apple");
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@title='Search']")).sendKeys("apple");
//		driver.findElement(By.xpath("//*[@title='Search']")).sendKeys(Keys.ENTER);
		GoogleHome.searchButton(driver).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.quit();
	}

}

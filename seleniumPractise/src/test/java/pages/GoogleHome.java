package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHome {
	
	public static WebElement searchInput(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("//*[@title='Search']"));
		return element;
	}
	
	public static WebElement searchButton(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("//*[@title='Search']"));
		return element;
	}



}

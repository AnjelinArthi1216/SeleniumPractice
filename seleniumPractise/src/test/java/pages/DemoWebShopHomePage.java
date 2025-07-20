package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoWebShopHomePage {
	
	By buttonRejectAll = By.xpath("//*[text()='Reject all']");
	By linkRegister = By.xpath("//*[text() = 'Register']");
	By genderMale = By.xpath("//*[@value='M']");
	By genderFemale = By.xpath("//*[@value='F']");
	By inputFirstName = By.name("FirstName");
	By inputLastName = By.name("LastName");
	By inputEmail = By.id("Email");
	By inputPassword = By.id("Password");
	By inputConfirmPassword = By.id("ConfirmPassword");
	By buttonRegister = By.name("register-button");
	WebDriver driver = null;
	
	public DemoWebShopHomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void launchDemoWebShop() {
		driver.get("https://demowebshop.tricentis.com/");
				
	}
	
	public boolean checkRejectPopupIsDisplayed() {
		try {
			driver.findElement(buttonRejectAll);
			return true;
		}
		catch(Exception ignored){
			return false;
		}
	}
	public void rejectPopup() {
		if(checkRejectPopupIsDisplayed()) {
			driver.findElement(buttonRejectAll).click();
		}
	}
	
	public void clickRegisterLink() {
		driver.findElement(linkRegister).click();
	}
	
	
}

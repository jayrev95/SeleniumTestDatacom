package jayTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Pages {
	WebDriver driver;

//	public Pages(WebDriver driver) {
//        this.driver = driver;
//	}
	
	WebElement firstNameInput = driver.findElement(By.id("FirstName"));
	WebElement LastNameInput = driver.findElement(By.id("LastName"));
	WebElement businessEmailInput = driver.findElement(By.id("Email"));
	WebElement phoneInput = driver.findElement(By.id("Phone"));
	WebElement jobTitleInput = driver.findElement(By.id("Title"));
	WebElement companyInput = driver.findElement(By.id("Company"));
	WebElement countryInput = driver.findElement(By.id("Company"));
	WebElement helpInput = driver.findElement(By.id("custom2"));
	WebElement submitBtn = driver.findElement(By.xpath("//button[@type='submit']"));
	
}

package jayTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;

public class SeleniumJayson {

    WebDriver driver;
    String driverPath = "C:\\Users\\Jayson\\Downloads\\selenium webdriver\\chromedriver.exe";
	 @BeforeClass
	    public void setup() {
	        System.setProperty("webdriver.chrome.driver", driverPath);
	        
	        driver = new ChromeDriver();
	        
	        // Maximize the window
	        driver.manage().window().maximize();
	    }

	    @Test
	    public void testContactUsNavigation() {
	        driver.get("https://datacom.com/nz/en/contact-us");
	        
	        WebElement contactUsBtn = driver.findElement(By.xpath("//span[contains(text(),'Contact us')]"));
	       
	        // Click Contact Us 
	        contactUsBtn.click();
	        
	        WebElement firstNameInput = driver.findElement(By.id("FirstName"));
	        WebElement LastNameInput = driver.findElement(By.id("LastName"));
	        WebElement businessEmailInput = driver.findElement(By.id("Email"));
	        WebElement phoneInput = driver.findElement(By.id("Phone"));
	        WebElement jobTitleInput = driver.findElement(By.id("Title"));
	        WebElement companyInput = driver.findElement(By.id("Company"));
	        WebElement countryInput = driver.findElement(By.id("Country"));
	        WebElement helpInput = driver.findElement(By.id("custom2"));
	        WebElement submitBtn = driver.findElement(By.xpath("//button[@type='submit']"));
	        
	        
	        // Verify if input fields and buttons are displayed
	        Assert.assertTrue(firstNameInput.isDisplayed(), "First Name Field not displayed");
	        Assert.assertTrue(LastNameInput.isDisplayed(), "Last Name Field not displayed");
	        Assert.assertTrue(businessEmailInput.isDisplayed(), "Business Email Field not displayed");
	        Assert.assertTrue(phoneInput.isDisplayed(), "FirstName Field not displayed");
	        Assert.assertTrue(jobTitleInput.isDisplayed(), "FirstName Field not displayed");
	        Assert.assertTrue(companyInput.isDisplayed(), "FirstName Field not displayed");
	        Assert.assertTrue(countryInput.isDisplayed(), "Country Input Field not displayed");
	        Assert.assertTrue(helpInput.isDisplayed(), "Help Input Field not displayed");
	        Assert.assertTrue(submitBtn.isDisplayed(), "Submit Button Field not displayed");
	   
	    }
	    
	    @Test
	    public void testSubmitButtonNotEnabledWhenFieldsAreBlank() {
	        driver.get("https://datacom.com/nz/en/contact-us");
	        
	        WebElement contactUsBtn = driver.findElement(By.xpath("//span[contains(text(),'Contact us')]"));
	       
	        // Click Contact Us 
	        contactUsBtn.click();
	        
	        
	        WebElement submitBtn = driver.findElement(By.xpath("//button[@type='submit']"));
	        
	        /// verify submit button is disabled
	        Assert.assertFalse(submitBtn.isEnabled(), "Submit Button is enabled");
	    }

	    @Test
	    public void testSubmitButtonNotEnabledWithIncompleteInputs() {
	        driver.get("https://datacom.com/nz/en/contact-us");
	        
	        WebElement contactUsBtn = driver.findElement(By.xpath("//span[contains(text(),'Contact us')]"));
	       
	        // Click Contact Us 
	        contactUsBtn.click();
	        
	        WebElement firstNameInput = driver.findElement(By.id("FirstName"));
	        WebElement LastNameInput = driver.findElement(By.id("LastName"));
	        WebElement businessEmailInput = driver.findElement(By.id("Email"));
	        WebElement phoneInput = driver.findElement(By.id("Phone"));
	        WebElement submitBtn = driver.findElement(By.xpath("//button[@type='submit']"));
	        
	        // fill up the form
	        firstNameInput.sendKeys("Jay");
	        LastNameInput.sendKeys("Rev");
	        businessEmailInput.sendKeys("jay@gmail.com");
	        phoneInput.sendKeys("1234515");
	        
	        /// verify submit button is disabled
	        Assert.assertFalse(submitBtn.isEnabled(), "Submit Button is enabled");
	   
	    }
	    
	    
	    @Test
	    public void testSubmitButtonIsEnabledWithCompleteInputs() {
	        driver.get("https://datacom.com/nz/en/contact-us");
	        
	        WebElement contactUsBtn = driver.findElement(By.xpath("//span[contains(text(),'Contact us')]"));
	       
	        // Click Contact Us 
	        contactUsBtn.click();
	        
	        WebElement firstNameInput = driver.findElement(By.id("FirstName"));
	        WebElement LastNameInput = driver.findElement(By.id("LastName"));
	        WebElement businessEmailInput = driver.findElement(By.id("Email"));
	        WebElement phoneInput = driver.findElement(By.id("Phone"));
	        WebElement jobTitleInput = driver.findElement(By.id("Title"));
	        WebElement companyInput = driver.findElement(By.id("Company"));
	        WebElement countryInput = driver.findElement(By.id("Country"));
	        WebElement helpInput = driver.findElement(By.id("custom2"));

	        WebElement submitBtn = driver.findElement(By.xpath("//button[@type='submit']"));
	        
	        Select countrydropdown = new Select(countryInput);
	        Select helpInputdropdown = new Select(helpInput);
	 
	        
	        // fill up the form
	        firstNameInput.sendKeys("Jay");
	        LastNameInput.sendKeys("Rev");
	        businessEmailInput.sendKeys("jay@gmail.com");
	        phoneInput.sendKeys("1234515");
	        jobTitleInput.sendKeys("IT");
	        companyInput.sendKeys("TestCompanjy");
	        countrydropdown.selectByValue("Philippines");
	        helpInputdropdown.selectByValue("Consult with an expert");
	        
	        WebElement selectSolutionInput = driver.findElement(By.xpath("//label[text()='Select a solution']/following-sibling::select"));
	        WebElement messageInput = driver.findElement(By.xpath("//label[text()='Message']/following-sibling::input"));
	        Select selectSolutionInputdropdown = new Select(selectSolutionInput);
	        selectSolutionInputdropdown.selectByValue("Security");
	        messageInput.sendKeys("Help");
	        
	        /// verify submit button is Enabled
	     //   Assert.assertTrue(submitBtn.isEnabled(), "Submit Button is enabled");
	   
	    }
	    
	    
	    public void testSubmitContactUsForm() {
	        driver.get("https://datacom.com/nz/en/contact-us");
	        
	        WebElement contactUsBtn = driver.findElement(By.xpath("//span[contains(text(),'Contact us')]"));
	       
	        // Click Contact Us 
	        contactUsBtn.click();
	        
	        WebElement firstNameInput = driver.findElement(By.id("FirstName"));
	        WebElement LastNameInput = driver.findElement(By.id("LastName"));
	        WebElement businessEmailInput = driver.findElement(By.id("Email"));
	        WebElement phoneInput = driver.findElement(By.id("Phone"));
	        WebElement jobTitleInput = driver.findElement(By.id("Title"));
	        WebElement companyInput = driver.findElement(By.id("Company"));
	        WebElement countryInput = driver.findElement(By.id("Country"));
	        WebElement helpInput = driver.findElement(By.id("custom2"));

	        WebElement submitBtn = driver.findElement(By.xpath("//button[@type='submit']"));
	        
	        Select countrydropdown = new Select(countryInput);
	        Select helpInputdropdown = new Select(helpInput);
	 
	        
	        // fill up the form
	        firstNameInput.sendKeys("Jay");
	        LastNameInput.sendKeys("Rev");
	        businessEmailInput.sendKeys("jay@gmail.com");
	        phoneInput.sendKeys("1234515");
	        jobTitleInput.sendKeys("IT");
	        companyInput.sendKeys("TestCompanjy");
	        countrydropdown.selectByValue("Philippines");
	        helpInputdropdown.selectByValue("Consult with an expert");
	        
	        WebElement selectSolutionInput = driver.findElement(By.xpath("//label[text()='Select a solution']/following-sibling::select"));
	        WebElement messageInput = driver.findElement(By.xpath("//label[text()='Message']/following-sibling::input"));
	        Select selectSolutionInputdropdown = new Select(selectSolutionInput);
	        selectSolutionInputdropdown.selectByValue("Security");
	        messageInput.sendKeys("Help");
	        
	        /// verify submit button is Enabled
	        Assert.assertTrue(submitBtn.isEnabled(), "Submit Button is enabled");
	        submitBtn.click();
	        
	        // verify message
	        WebElement thankYouMessage = driver.findElement(By.xpath("//div//h3[text()='Thank you for getting in touch with us']"));
	        Assert.assertEquals("Thank you for getting in touch with us", thankYouMessage);
	        
	        WebElement returnHomepageBtn = driver.findElement(By.xpath("//span[text()='Return to homepage']"));
	        returnHomepageBtn.click();
	        
	        Assert.assertEquals("DATACOM", driver.getTitle());

	  
	   
	    }


	    // Clean up after tests
	    @AfterClass
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }

}

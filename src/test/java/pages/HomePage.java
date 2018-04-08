package pages;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.custom.library.BasePage;

public class HomePage extends BasePage {
	
	
	JavascriptExecutor js = (JavascriptExecutor) driver;

	public HomePage(){
		
	}
	
	final static Logger logger = Logger.getLogger(HomePage.class);
	
	// 1- Scenario- launch the website
	

	public HomePage goto_OrangeHrmWebsite() {
		driver.get("http://opensource.demo.orangehrmlive.com");
		String websiteTitle = driver.getTitle();
		System.out.println("The website title is :" + websiteTitle);
		String expectedTitle = ("OrangeHRM");
		assertEquals(websiteTitle, expectedTitle);

		return this;
		
		
	}
	
	
	public HomePage VerifyLogo(){
	
			driver.findElement(By.id("divLogo")).isDisplayed();	
	
	System.out.println("Logo is displayed");
	return this;
	
	}
	
	
	public DashBoardPage SignUp() throws InterruptedException{
		
		WebElement Username = driver.findElement(By.id("txtUsername"));
		Username.sendKeys("Admin");
		Thread.sleep(1 * 1000);

		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin");
		
	driver.findElement(By.id("btnLogin")).click();
		
		return new DashBoardPage();

	}
	
	

}

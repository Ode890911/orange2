package pages;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.custom.library.BasePage;
import com.google.common.base.Function;

public class PIMPage extends BasePage {
	public PIMPage() {
		// TODO Auto-generated constructor stub
	}
	
	
	public PIMPage VerifyPIMPage(){	
	
		
		WebElement PimPage = driver.findElement(By.xpath("//div[@class='head']"));		
		
	System.out.println(PimPage.getText());

	assertEquals("Employee Information", PimPage.getText());
		
	return this;
	
		
		
	}
	

}

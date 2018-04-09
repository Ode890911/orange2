package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.custom.library.BasePage;

public class TimePage extends BasePage{
	public TimePage() {
		// TODO Auto-generated constructor stub
	}
public TimePage VerifyRecruitPage(){	
	
		
		WebElement TimePage = driver.findElement(By.xpath("//div[@class='head']"));		
		
	System.out.println(TimePage.getText());

	assertEquals("Employee Information", TimePage.getText());
		
	return this;
	
		
		
	}
	

}

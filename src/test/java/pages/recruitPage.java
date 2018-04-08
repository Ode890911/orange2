package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.custom.library.BasePage;

public class recruitPage extends BasePage {
	public recruitPage(){
		
	}
public recruitPage VerifyRecruitPage(){	
	
		
		WebElement RecruiPage = driver.findElement(By.xpath("//div[@class='head']"));		
		
	System.out.println(RecruiPage.getText());

	assertEquals("Employee Information", RecruiPage.getText());
		
	return this;
	
		
		
	}
	
	
	

}

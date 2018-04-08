package pages;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.custom.library.BasePage;

public class DashBoardPage extends BasePage{
	
	public DashBoardPage(){
		
	}
	
	
	public DashBoardPage EmployeeDistGraph() throws InterruptedException{	
		
	
		// getting the Pie label
		driver.findElements(By.id("div_graph_display_emp_distribution"));

		List<WebElement> employee = driver.findElements(By.xpath("//span[@class='pieLabel']"));

		for (WebElement emp : employee) {
			System.out.println(emp.getText());
		}
					
					
	
	
		return this;
		}
		
		
		
		public DashBoardPage VerifyDashBoardPage(){
			WebElement dashBoard= driver.findElement(By.xpath("//div[@class='head']"));
		System.out.println(dashBoard.getText());
	
		assertEquals("Dashboard", dashBoard.getText());
			
		
		
			
			return this;
		}
		
				
		public DashBoardPage Legend(){
			
			WebElement legend = driver.findElement(By.id("div_legend_pim_employee_distribution_legend"));
			  List<WebElement> rows=legend.findElements(By.tagName("tr"));
			  List<WebElement> columns=legend.findElements(By.tagName("td"));
			  
			  for (WebElement cell: columns){
			   String legendLabel= cell.getText();
			   System.out.println(legendLabel);
			  }	   
					   return this;
		}
		
		
		
		
		
		public PIMPage GoToPiMSectionPage() throws InterruptedException {
			Actions action = new Actions(driver);
			
			WebElement PimSection= driver.findElement(By.id("menu_pim_viewPimModule"));
			action.moveToElement(PimSection).perform();
			
			WebElement EmployeeList= driver.findElement(By.xpath("//*[@id='menu_pim_viewEmployeeList']"));
			action.moveToElement(EmployeeList).perform();
			EmployeeList.click();
			Thread.sleep(1000);						
			
			return new PIMPage();
		
		}
		public recruitPage GoToRecruitPage() throws InterruptedException {
			Actions action = new Actions(driver);
			
			WebElement RecSection= driver.findElement(By.id("menu_recruitment_viewRecruitmentModule"));
			action.moveToElement(RecSection).perform();
			Thread.sleep(1000);						
			
			return new recruitPage();
		
		}





		



		}




	
package tests;

import org.testng.annotations.Test;

import com.custom.library.BasePage;

import pages.DashBoardPage;
import pages.HomePage;
import pages.PIMPage;

public class OrangeTest extends BasePage{
	
	HomePage MyOrangePage = new HomePage();
	DashBoardPage MyOrangeBoard = new DashBoardPage();
	PIMPage Employees= new PIMPage();
	
	
	@Test
	public void  OrangeWebsiteTests() throws InterruptedException{
		
		MyOrangePage.goto_OrangeHrmWebsite();
	//	MyOrangePage.VerifyLogo();
		MyOrangePage.SignUp();
		//MyOrangeBoard.EmployeeDistGraph();
		
		MyOrangeBoard.VerifyDashBoardPage();
		MyOrangeBoard.GoToPiMSectionPage();
		Employees.VerifyPIMPage();
		
		
	//	MyOrangeBoard.Legend();
		
		
	}
	
	

}

package tests;

import org.testng.annotations.Test;

import com.custom.library.BasePage;

import pages.DashBoardPage;
import pages.HomePage;
import pages.PIMPage;
import pages.recruitPage;

public class OrangeTest extends BasePage{
	
	HomePage MyOrangePage = new HomePage();
	DashBoardPage MyOrangeBoard = new DashBoardPage();
	PIMPage Employees= new PIMPage();
	recruitPage recruit = new recruitPage();
	
	
	@Test
	public void  OrangeWebsiteTests() throws InterruptedException{
		
		MyOrangePage.goto_OrangeHrmWebsite();
	//	MyOrangePage.VerifyLogo();
		MyOrangePage.SignUp();
		//MyOrangeBoard.EmployeeDistGraph();
		
		MyOrangeBoard.VerifyDashBoardPage();
		MyOrangeBoard.GoToPiMSectionPage();
		Employees.VerifyPIMPage();
		MyOrangeBoard.GoToRecruitPage();
		//recruit.VerifyRecruitPage()
		
		
	//	MyOrangeBoard.Legend();
		
		
	}
	
	

}

package tests;

import org.testng.annotations.Test;

import com.custom.library.BasePage;

import pages.DashBoardPage;
import pages.HomePage;
import pages.PIMPage;
import pages.TimePage;
import pages.recruitPage;

public class OrangeTest extends BasePage{
	
	//need to modify a few things here
	
	HomePage MyOrangePage = new HomePage();
	DashBoardPage MyOrangeBoard = new DashBoardPage();
	PIMPage Employees= new PIMPage();
	recruitPage recruit = new recruitPage();
	TimePage myTime = new TimePage();
	
	
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
		MyOrangeBoard.GoToTimetPage();
		
		
	//	MyOrangeBoard.Legend();
		
		}
	
	

}

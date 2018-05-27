package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		testCaseName="TC001_LoginAndLogout";
		testDescription="login and logout in LeafTaps Application";
		testNodes="Leads";
		category="Smoke";
		authors="Gopi";
		browserName="chrome";
		dataSheetName="TC003";
	}
	
	@Test(dataProvider="fetchData")
	public void CreateLead(String uName, String pwd,String compName, String firstName, String lastName)
	{
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.enterCompany(compName)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.clickCreateLeadEntry();
		
	}
	
	

}

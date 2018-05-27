package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_MergeLead extends ProjectMethods {
	
	  @BeforeTest
		public void setData() {
			testCaseName="TC001_LoginAndLogout";
			testDescription="login and logout in LeafTaps Application";
			testNodes="Leads";
			category="Smoke";
			authors="Gopi";
			browserName="chrome";
			dataSheetName="TC004";
		}

		@Test(dataProvider="fetchData")
        public void MergeLead(String uName, String pwd)
        {
			new LoginPage()
			.enterUserName(uName)
			.enterPassword(pwd)
			.clickLogIn()
			.clickCRMSFA()
			.clickLeads();
		    
        }

}

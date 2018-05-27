package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods {
	
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
	public void EditLead(String uName, String pwd,String value,String desc) {

		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickEditLead()
		.typeFirstName(value)
		.clickFind()
		.clickEntry()
		.ClickEdit()
		.typeDesc(desc)
		.clickUpdate();


	}

}

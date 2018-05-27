package testcases;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.PayForGoods;
import wdMethods.ProjectMethods;

public class TC_001_PAYPAL extends ProjectMethods{

	@BeforeTest
	public void setdata()
	{
		testCaseName="TC001_PayPal";
		testDescription="PayPal continue";
		testNodes="Leads";
		category="Smoke";
		authors="J PAUL HEBER";
		browserName="chrome";
		dataSheetName="TC_008";

	}

	@Test(dataProvider="fetchData")
	public void PayPalWebPage(String data,String data1)
	{
		new PayForGoods()
		.clickSignUP()
		.clickNext()
		.typeMail(data)
		.typePassword(data1)
		.typeConfirmPassword(data1)
		.clickContinue();
	}
}

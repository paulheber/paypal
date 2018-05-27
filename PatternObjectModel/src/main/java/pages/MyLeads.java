package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyLeads extends ProjectMethods{

	public MyLeads()
	{
		PageFactory.initElements(driver,this);
	}

	//FIND THE ELEMENT CREATE LEAD

	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement eleCreateLead;

	//FIND THE ELEMENT FIND LEAD
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleFindLead;
	
	//FIND THE ELEMENT MERGE LEAD
	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	private WebElement eleMergeLead;

	//CLICK CREATE LEAD
	@And("click Create lead")
	public CreateLead clickCreateLead()
	{
		click(eleCreateLead);
		return new CreateLead();
	}

	//CLICK FIND LEADS
	@And("click Find Leads")
	public FindLeads clickEditLead()
	{
		click(eleFindLead);
		return new FindLeads();
	}
	
	//CLICK MERGE LEAD
	public MergeLead clickMergeLead()
	{
        click(eleMergeLead);
        return new MergeLead();
	}

}

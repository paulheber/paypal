package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class FindLeads extends ProjectMethods {

	//CONSTRUCTOR
	public FindLeads()
	{
		PageFactory.initElements(driver,this);	
	}

	//FIND ELEMENT BY LEAD ID
	@FindBy(how=How.NAME,using="id")
	private WebElement eleLeadId;

	//FIND ELEMENT OF "FIND LEADS"
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFindLead;

	//FIND ELEMENT OF "FIND LEADS"
	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	private WebElement eleValue;
	
	//FIND ELEMENT OF "FIRST NAME"
	//@FindBy(how=How.NAME,using="firstName")
	@FindBy(how=How.XPATH,using="//input[@class=' x-form-text x-form-field ']/following::input[1]")
	private WebElement eleFirstName;

	public FindLeads typeLead(String data)
	{
		type(eleLeadId,data);
		return this;
	}
	
	//TYPE THE VALUE IN FIND LEAD
	@And("type First Name (.*)")
	public FindLeads typeFirstName(String data)
	{
		type(eleFirstName,data);
		return this;
	}
	@And("click find leads button")
	public FindLeads clickFind()
	{
		click(eleFindLead);
		return this;
	}

	//CLICK ENTRY
	@And("click first Entry")
	public ViewLead clickEntry()
	{
		click(eleValue);
		return new ViewLead();
	}
	
	
}

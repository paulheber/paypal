package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{

	//CONSTRUCTOR 
	public CreateLead()
	{
		
		
		PageFactory.initElements(driver,this);
	}

	//GET COMPANY NAME FROM USER
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompName;

	//GET FIRST NAME FROM USER
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;

	//GET LAST NAME FROM USER

	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;

	//GET ELEMENT 'CREATE LEAD' TO CLICK
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleSubmit;

	//TYPE COMPANY NAME
	@And("Enter Company Name (.*)")
	public CreateLead enterCompany(String data)
	{
		type(eleCompName,data);
		return this;
	}

	//TYPE FIRST NAME
	@And("Enter First Name (.*)")
	public CreateLead enterFirstName(String data)
	{
		type(eleFirstName, data);
		return this;
	}

	//TYPE LAST NAME
	@And("Enter Last Name (.*)")
	public CreateLead enterLastName(String data)
	{
		type(eleLastName, data);
		return this;
	}

	//CLICK CREATE LEAD
	@When("Create lead button is clicked")
	public ViewLead clickCreateLeadEntry()
	{
		click(eleSubmit);
		return new ViewLead();

	}
}
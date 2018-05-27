package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods{
	
	public ViewLead()
	{
		 PageFactory.initElements(driver,this);
	}
    
	//GET FIRST NAME
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleGetFirstName;
	
	//FIND EDIT ELEMENT
	@FindBy(how=How.LINK_TEXT,using="Edit")
	private WebElement eleEdit;
	
	//COMPARE THE FIRST NAME WITH EARLIER ONE
	@Then("Lead created successfully (.*)")
	public ViewLead Compare(String data)
	{
		verifyExactText(eleGetFirstName, data);
		return this;
	}
	
	@And("click Edit")
	public EditPage ClickEdit()
	{
		click(eleEdit);
		return new EditPage();
	}
	
}

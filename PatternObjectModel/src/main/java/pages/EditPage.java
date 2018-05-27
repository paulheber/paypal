package pages;

import javax.lang.model.element.Element;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class EditPage extends ProjectMethods {
	
	public EditPage()
	{
		 PageFactory.initElements(driver,this);
	}
	
	//FIND WEBELEMENT OF DESCRIPTION
	@FindBy(how=How.ID,using="updateLeadForm_description")
	private WebElement eleDescription; 
	
	//FIND WEBELEMENT OF UPDATE BUTTON
	@FindBy(how=How.XPATH,using="//input[@class='smallSubmit'][1]")
	private WebElement eleUpdateButton;
	
	//Type the content in Description
	@And("type description (.*)")
	public EditPage typeDesc(String Data)
	{
		type(eleDescription,Data);
		return this;
	}
	
	//CLICK UPDATE
	
	@And("click update")
	public ViewLead clickUpdate()
	{
		
		click(eleUpdateButton);
		return new ViewLead();
	}
	

}

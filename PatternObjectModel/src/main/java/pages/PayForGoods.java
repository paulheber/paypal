package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class PayForGoods extends ProjectMethods {
	
	//CONSTRUCTOR
	public PayForGoods() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="signup-button")
	private WebElement eleSignUp;
	
	public SignUpFor clickSignUP()
	{
		click(eleSignUp);
		return new SignUpFor();
	}

	
}

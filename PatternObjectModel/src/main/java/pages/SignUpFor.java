package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class SignUpFor extends ProjectMethods{

	public SignUpFor()
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.LINK_TEXT,using="Next")
	private WebElement eleNext;

	public SeeForYourself clickNext()
	{
		click(eleNext);
		return new SeeForYourself();
	}
}

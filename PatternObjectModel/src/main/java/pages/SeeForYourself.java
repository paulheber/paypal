package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class SeeForYourself extends ProjectMethods{

	public SeeForYourself()
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.ID,using="email")
	private WebElement eleMail;

	@FindBy(how=How.ID,using="password")
	private WebElement elePassword;

	@FindBy(how=How.ID,using="confirmPassword")
	private WebElement eleConfirmPassword;

	@FindBy(how=How.ID,using="_eventId_personal")
	private WebElement eleContinue;

    public SeeForYourself typeMail(String data)
    {
    	type(eleMail,data);
    	return this;
    }
    
    public SeeForYourself typePassword(String data)
    {
    	type(elePassword,data);
    	return this;
    }

    public SeeForYourself typeConfirmPassword(String data)
    {
    	type(eleConfirmPassword,data);
    	return this;
    }
    
    public SeeForYourself clickContinue() {
    	click(eleContinue);
    	return this;
    }

	
}

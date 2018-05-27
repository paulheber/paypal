package pages;

import javax.lang.model.element.Element;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLead extends ProjectMethods{

	public MergeLead()
	{
		PageFactory.initElements(driver,this);
	}

	//FIND THE ELEMENT ICON 1 
	@FindBy(how=How.XPATH,using="//img[@id='ext-gen596']")
	private WebElement eleClickLink1;

	
	//FIND THE ELEMENT ICON 2
	@FindBy(how=How.XPATH,using="//img[@id='ext-gen602']")
	private WebElement eleClickLink2;

	//FIND THE ELEMENT MERGE 
	@FindBy(how=How.LINK_TEXT,using="Merge")
	private WebElement eleMergebutton;
	
    public FindLeadForMergeLead clickicon1()
    {
    	click(eleClickLink1);
    	switchToWindow(1);
    	return new FindLeadForMergeLead();
    }
    
    public FindLeadForMergeLead clickicon2()
    {
    	click(eleClickLink2);
    	switchToWindow(1);
    	return new FindLeadForMergeLead();
    }
    
    //CLICK MERGE BUTTON
    public ViewLead ClickMerge()
    {
    	click(eleMergebutton);
    	return new ViewLead()  ;
    }
    
    
    
}

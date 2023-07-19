package admin_feature_Page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import GenericLibrary.WebDriverCommonLibrary;

public class user_add_page extends WebDriverCommonLibrary {

	@FindBy(xpath = "//*[text()='Admin']")
	private WebElement admin_button;
	
	@FindBy(xpath = "(//*[text()='-- Select --'])[1]")
	private WebElement User_role;
	
	@FindBy(xpath = "(//*[text()='-- Select --'])[2]")
	private WebElement status;
	
	@FindBy(xpath = "//*[text()='Job ']")
	private WebElement Job_box;
	
	@FindBy(xpath = "//*[text()='Job Titles']")
	private WebElement Job_Title;

	
	
	public void useradd1() throws InterruptedException
	{
		waitforDOMElements();
		highLightonElement(admin_button);
		admin_button.click();
		waitforDOMElements();
	    highLightonElement(User_role);
	    Actions a=new Actions(driver);
	    a.click(User_role).build().perform();
	    a.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN ,Keys.ENTER).build().perform();
	    
	    Thread.sleep(5000);
	    highLightonElement(User_role);
	    Actions a1=new Actions(driver);
	    a1.click(User_role).build().perform();
	    a1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER).build().perform();
	    
	    Thread.sleep(5000);
		highLightonElement(Job_box);
		Job_box.click();
		Thread.sleep(5000);
		highLightonElement(Job_Title);
		Job_Title.click();
    
	    
	}
	
}	
	
	



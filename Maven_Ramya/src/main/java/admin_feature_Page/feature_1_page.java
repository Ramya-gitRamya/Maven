package admin_feature_Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericLibrary.WebDriverCommonLibrary;

public class feature_1_page extends WebDriverCommonLibrary{
	@FindBy(xpath = "//*[text()='Employees on Leave Today']")
	private WebElement EMp_leave;
	
	@FindBy(xpath = "//*[text()='Admin']")
	private WebElement admin_button;
	
	@FindBy(xpath = "(//*[@class='oxd-input oxd-input--active'])[2]")
	private WebElement Username_textbox;
	
	

	
			
	public void admincheck()

	{
		waitforDOMElements();
		highLightonElement(EMp_leave);
		EMp_leave.getText();
		waitforDOMElements();
		highLightonElement(admin_button);
		admin_button.click();
		waitforDOMElements();
		highLightonElement(Username_textbox);
		Username_textbox.sendKeys("test");
		
		

		   
		
	}
	
	
	

}

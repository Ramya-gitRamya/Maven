package admin_feature_Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericLibrary.WebDriverCommonLibrary;

public class Job_page extends WebDriverCommonLibrary {
	@FindBy(xpath = "//*[text()='Job ']")
	private WebElement Job_box;
	
	@FindBy(xpath = "//*[text()='Job Titles']")
	private WebElement Job_Title;
	
	
public void jobButton_check()
{
	
	waitforDOMElements();
	highLightonElement(Job_box);
	Job_box.click();
	waitforDOMElements();
	highLightonElement(Job_Title);
	Job_Title.click();
	
}

}

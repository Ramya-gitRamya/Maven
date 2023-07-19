package admin_feature_Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericLibrary.WebDriverCommonLibrary;

public class PIM_Button extends WebDriverCommonLibrary {
	
@FindBy(xpath = "//*[text()='PIM']")
private WebElement PIM_Button;

@FindBy(xpath = "//*[text()='Add Employee']")
private WebElement addemp_button;

@FindBy(xpath = "//*[@name='firstName']")
private WebElement First_name;

@FindBy(xpath = "//*[@placeholder='Middle Name']")
private WebElement Emp_Middlename;

@FindBy(xpath = "//*[@placeholder='Last Name']")
private WebElement emp_lastname;
@FindBy(xpath = "//*[@type='submit']")
private WebElement save;



public void PIM_Buttoncheck() throws InterruptedException
{
	Thread.sleep(5000);
	highLightonElement(PIM_Button);
	PIM_Button.click();
	
	waitforDOMElements();
	highLightonElement(addemp_button);
	addemp_button.click();

	Thread.sleep(5000);
    highLightonElement(First_name);
    First_name.sendKeys("bargav");

waitforDOMElements();
highLightonElement(Emp_Middlename);
Emp_Middlename.sendKeys("Hari");

Thread.sleep(5000);
highLightonElement(emp_lastname);
emp_lastname.sendKeys("siva");

Thread.sleep(5000);
highLightonElement(save);
save.click();


}
}
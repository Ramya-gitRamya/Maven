package Login_logout_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import GenericLibrary.WebDriverCommonLibrary;

public class Login_logout_page extends WebDriverCommonLibrary {
@FindBy (xpath = "//*[@name='username']")
private WebElement username;
@FindBy(xpath ="//*[@placeholder='Password']")
private WebElement password;

@FindBy(xpath = "//*[text()='Logout']")
private WebElement logout_button;

@FindBy(xpath = "//*[@type='submit']")
private WebElement Login_Button;
@FindBy(xpath = "//*[@class='oxd-userdropdown-name']")
private WebElement user_dropdown;



@BeforeTest
public void Login(String Username, String Password)
{
	waitforDOMElements();
	highLightonElement(username);
	username.sendKeys(Username);
	waitforDOMElements();
	highLightonElement(password);
	password.sendKeys(Password);
	waitforDOMElements();
	highLightonElement(Login_Button);
	Login_Button.click();
	waitforDOMElements();
	

}

@AfterTest
public void Logout()
{
	waitforDOMElements();
	highLightonElement(user_dropdown);
	user_dropdown.click();
	waitforDOMElements();
	highLightonElement(logout_button);
	logout_button.click();
	waitforDOMElements();
	
}

} 

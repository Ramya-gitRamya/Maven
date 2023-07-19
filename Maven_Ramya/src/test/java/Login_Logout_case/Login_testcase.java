package Login_Logout_case;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import GenericLibrary.BrowserDriver;
import GenericLibrary.ConstantInstanceDriver;
import Login_logout_page.Login_logout_page;

public class Login_testcase extends BrowserDriver {
	@BeforeMethod
	public void openBrowser()
	{
		BrowserDriver.getBrowser(ConstantInstanceDriver.browser).get(ConstantInstanceDriver.url);
		
		System.out.println("aplication launch successfully");
	}
	@AfterMethod
	public void Logout_orange() throws InterruptedException
	{
		Login_logout_page loginpage=PageFactory.initElements(driver,Login_logout_page.class);
		           loginpage.Logout();
				System.out.println("Logout Successfully");
                  Thread.sleep(5000);
                  driver.close();
	}

}

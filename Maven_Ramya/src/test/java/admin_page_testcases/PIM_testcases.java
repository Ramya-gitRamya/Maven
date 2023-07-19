package admin_page_testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import GenericLibrary.ConstantInstanceDriver;
import Login_Logout_case.Login_testcase;
import Login_logout_page.Login_logout_page;
import admin_feature_Page.PIM_Button;

public class PIM_testcases extends Login_testcase {
	@Test
	public void admincase() throws InterruptedException
	{
		Login_logout_page loginpage=PageFactory.initElements(driver, Login_logout_page.class);
		loginpage.Login(ConstantInstanceDriver.Username, ConstantInstanceDriver.Password);
		System.out.println("logged in Success in PIM");
				
		PIM_Button PIM=PageFactory.initElements(driver, PIM_Button.class);
		PIM.PIM_Buttoncheck();
		System.out.println("pim page sucessfull");
	}

}

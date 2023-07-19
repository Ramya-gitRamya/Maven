package admin_page_testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import GenericLibrary.ConstantInstanceDriver;
import Login_Logout_case.Login_testcase;
import Login_logout_page.Login_logout_page;
import admin_feature_Page.user_add_page;

public class User_add_Case extends Login_testcase{
	@Test
	public void admincase() throws InterruptedException
	{
		Login_logout_page loginpage= PageFactory.initElements(driver, Login_logout_page.class);
		loginpage.Login(ConstantInstanceDriver.Username, ConstantInstanceDriver.Password);
		System.out.println("loggedin successfully");
		
		user_add_page uap=PageFactory.initElements(driver,user_add_page.class);
		uap.useradd1();
		System.out.println("Usre Add page");
		
		/*Login_logout_page logoutpage=PageFactory.initElements(driver, Login_logout_page.class);
		loginpage.Logout();
		System.out.println("Loggedout successfully");*/
		
		
		
	}
	


}
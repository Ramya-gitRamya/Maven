package admin_page_testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import GenericLibrary.ConstantInstanceDriver;
import Login_Logout_case.Login_testcase;
import Login_logout_page.Login_logout_page;
import admin_feature_Page.feature_1_page;
import junit.framework.Assert;

public class Feature_One extends Login_testcase {
	@Test
	public void admincase()
	{
		Login_logout_page loginpage = PageFactory.initElements(driver,Login_logout_page.class);
		loginpage.Login(ConstantInstanceDriver.Username,ConstantInstanceDriver.Password );
		System.out.println("Logged in successfully");
	
	feature_1_page fap=PageFactory.initElements(driver, feature_1_page.class);
	fap.admincheck();
	System.out.println("Feature_1 page successfull");
	
	
	//if we want to check actual vs expected
	String expected="Employees on Leave ";
	String actual = "Employees on Leave Today";
	Assert.assertEquals(actual,expected);
	System.out.println("Testcase got passed");
	Assert.assertTrue(10<20);
	System.out.println("Tesrcase passed");


	}

}

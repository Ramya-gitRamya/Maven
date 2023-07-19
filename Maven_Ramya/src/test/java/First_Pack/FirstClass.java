package First_Pack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class FirstClass {
	@BeforeSuite
	public void EnterURL()
	{
		System.out.println("URL test");
	}
	@BeforeMethod
	public void LOgin()
	{
		System.out.println("logintest");
	}
	@Test
	public void imageverify()
	{
		System.out.println("imageverify");
	}
@AfterMethod
public void logout()
{
	System.out.println("logout test");
}
}

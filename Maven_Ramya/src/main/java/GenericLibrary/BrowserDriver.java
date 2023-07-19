package GenericLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

public class BrowserDriver extends WebDriverCommonLibrary {
	
              static String ChromeDriverkey="webdriver.chrome.driver";
            static String ChromeDriverPath="E:\\eclipse\\chromedriver_win32\\chromedriver.exe"	;
            
	static String firefoxDriverKey="webdriver.gecko.driver";
	static String firefoxdriverPath="E:\\softwarefiles\\geckodriver-v0.33.0-win64\\geckodriver.exe";

	public static WebDriver getBrowser(String browsertype)
	{
		switch(browsertype)
		{
		case "chrome":System.setProperty(ChromeDriverkey, ChromeDriverPath);
		driver=new ChromeDriver();
		deleteAllCookies();
		windowMaximize();
		break;
		
		case "firefox":System.setProperty(firefoxDriverKey, firefoxdriverPath);
			driver = new FirefoxDriver();
			deleteAllCookies();
			windowMaximize();
			break;
			
			default:System.out.println("Invalid browser choice");
		
		
		}
		return driver;
		
	
	
}
}
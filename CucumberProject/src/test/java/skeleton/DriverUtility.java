package skeleton;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverUtility
{
	@Test
	
	  public static WebDriver getdriver(String browser) 
	{
	  if(browser.equals("chrome")) 
	  { System.setProperty("webdriver.chrome.driver","C:\\project\\SELENIUM\\drivers\\chromedriver.exe"); 
	  return new ChromeDriver(); 
	  } 
	  else if(browser.equals("firefox"))
	  {
	  System.setProperty("webdriver.gecko.driver","C:\\project\\SELENIUM\\drivers\\geckodriver.exe"); 
	  return new FirefoxDriver(); } 
	  else if(browser.equals("iedriver")) 
	  {
	  System.setProperty("webdriver.gecko.driver","C:\\project\\SELENIUM\\drivers\\IEDriverServer.exe"); 
	  return new InternetExplorerDriver(); 
	  } 
	  else
	  { 
		  return null; 
	  } 
	  }
	 

	
	}

	
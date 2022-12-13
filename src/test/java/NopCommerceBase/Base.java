package NopCommerceBase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import NopCommerceUtility.utility;

public class Base
{
	protected static  WebDriver driver;
	public void LaunchNopCommerce() throws IOException
	  {
		
		
		
		//launching Browser
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\AITS\\\\eclipse-workspace\\\\23Jul B Morning\\\\selenium-java-4.4.0\\\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get(utility.readdatafrompropertyfile("url"));
		driver.manage().window().maximize();
      }
}

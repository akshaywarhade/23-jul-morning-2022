package BaseClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import NeostoxPOM.utility;

public class Base
{
	protected static WebDriver driver;
	public void LaunchBrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AITS\\eclipse-workspace\\23Jul B Morning\\selenium-java-4.4.0\\chromedriver.exe");
		
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get(utility.ReadPrpprtyFile("url"));
	}
	
	public void CloseBrowser()
	{
		driver.close();
	}

}

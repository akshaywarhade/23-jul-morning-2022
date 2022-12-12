package NopCommerceTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import NopCommercePOM.Register;
import NopCommerceUtility.utility;
@Listeners(NopCommerceListener.listener.class)

public class CheckRegisterFunctionality 
{
	 WebDriver driver;
	Register res;
	@BeforeClass
	@Parameters("BrowserName")
	public void LaunchNopCommerce(String bName) throws IOException
	  {
			
		  
		if(bName.equals("chrome"))
		  {
			  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\AITS\\\\eclipse-workspace\\\\23Jul B Morning\\\\selenium-java-4.4.0\\\\chromedriver.exe");
			    driver = new ChromeDriver();
				driver.get(utility.readdatafrompropertyfile("url"));
				driver.manage().window().maximize();
		  }
		  else if (bName.equals("firefox"))
		  {
			  System.setProperty("webdriver.gecko.driver", "C:\\Users\\AITS\\eclipse-workspace\\23Jul B Morning\\selenium-java-4.4.0\\geckodriver.exe");
				
			    driver = new FirefoxDriver();
				driver.get(utility.readdatafrompropertyfile("url"));
				driver.manage().window().maximize();
			
	 
		  }
		res = new Register(driver);
	  }
	    
	
  @Test
  public void ToCheckRegistraion() throws IOException 
  {
	  res.selectGender();
	  res.EnterFirstName(utility.readdatafrompropertyfile("firstname"));
	  res.EnterlastName(utility.readdatafrompropertyfile("lastname"));
	  utility.wait(driver, 2000);
	  res.SelectDayDropdown();
	  utility.wait(driver, 2000);
	  res.SelectmonthDropdown();
	  utility.wait(driver, 2000);
	  res.SelectyearDropdown();
	  utility.wait(driver, 2000);
	  res.EnterEmail(utility.readdatafrompropertyfile("email"));
	  res.EnterPassword(utility.readdatafrompropertyfile("password"));
	  res.ConfirmePassword1(utility.readdatafrompropertyfile("password"));
	  res.Clickonregisterbutton();
  }
  @AfterClass
  public void closeBrowser()
  {
	  driver.close();
  }
  
  
}

package NopCommerceTest;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import NopCommerceBase.Base;
import NopCommercePOM.Register;
import NopCommerceUtility.utility;
@Listeners(NopCommerceListener.listener.class)

public class CheckRegisterFunctionality extends Base
{
	Register res;
	 @BeforeClass
	 public void LaunchBrowser() throws IOException
	 {
		 LaunchNopCommerce();
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

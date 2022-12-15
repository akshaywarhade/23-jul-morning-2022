package TestClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.Base;
import NeostoxPOM.HomePage;
import NeostoxPOM.LogInPage;
import NeostoxPOM.PasswordPage;
import NeostoxPOM.utility;

public class ValidateUserName extends Base
{
	HomePage home;
	LogInPage login;
	PasswordPage pass;
	@BeforeClass
	public void LuanchNeostox() throws IOException
	{
		LaunchBrowser();
		 home = new HomePage(driver);
		 login =new LogInPage(driver);
		 pass = new PasswordPage(driver);
	}
	@BeforeMethod
	public void LogIn() throws IOException
	{
		Reporter.log("Entering MoBile Number", true);
	   login.EnterMobileNo(driver, utility.ReadPrpprtyFile("mono"));
	   login.ClickOnSigInButton(driver);
		Reporter.log("Entering password", true);
		
		pass.EnterPassword(driver, utility.ReadPrpprtyFile("pass"));
		utility.ImplicitWait(driver, 2000);
		pass.ClickOnSubmitButton(driver);
		utility.ImplicitWait(driver, 1000);
		pass.ClickOnSubmitButton(driver);
		home.HandelPopUp(driver);
	}
  @Test
  public void ValidateUserId() throws IOException 
  {
	  utility.ImplicitWait(driver, 2000);
	  Reporter.log("Validating user Name", true);
	  Assert.assertEquals(home.CheckUserName(driver), utility.ReadPrpprtyFile("ExpectedUsername"),"Tc is Fail ,Actual And expecterd result are not same");
  }
  
  
  @AfterMethod
  public void LoggingOutApplication()
  {
	  Reporter.log("Logging out the Pllication", true);
	  utility.ImplicitWait(driver, 2000);
	  home.loggingOut(driver);
  }
  
  
  @AfterClass
  public void ClossingBrowser()
  {
	  Reporter.log("Closing The Browser", true);
	  CloseBrowser();
  }
}

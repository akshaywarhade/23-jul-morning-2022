package NeostoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage 
{
	
	@FindBy(xpath ="(//input[@class='form-control'])[1]" ) private WebElement MoNo;
	@FindBy(xpath="//a[@id='lnk_signup1']")private WebElement signinButton;
	
	
	
	public LogInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public  void EnterMobileNo(WebDriver driver ,String mono)
	{
		utility.ImplicitWait(driver, 1000);
		MoNo.sendKeys(mono);
	}
	
	public void ClickOnSigInButton(WebDriver driver)
	{
		utility.ImplicitWait(driver, 1000);
		signinButton.click();
	}

}



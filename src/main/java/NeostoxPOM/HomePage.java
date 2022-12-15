package NeostoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(xpath="(//a[text()='OK'])[2]")private WebElement OkkButton;
	@FindBy(xpath="(//a[text()='Close'])[5]")private WebElement closeButton;
	@FindBy(xpath = "//span[@id='lbl_username']")private WebElement username;
	@FindBy(xpath = "//span[@id='lbl_curbalancetop']")private WebElement balance;
	@FindBy(xpath = "//a[@id='lnk_logout']")private WebElement logout;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void HandelPopUp(WebDriver driver)
	{
		if(OkkButton.isDisplayed())
		{
			utility.ImplicitWait(driver, 2000);
		OkkButton.click();
		closeButton.click();
		System.out.println("Handeling POpUp");
		}
		else
		{
			System.out.println("PopUp Is Not Present");
		}

	}
	
	public String CheckUserName(WebDriver driver)
	{
		utility.ImplicitWait(driver, 2000);
		String ActualUserName = username.getText();
		System.out.println("validating user name");
		return ActualUserName;
	}
	
	public String CheckBalance(WebDriver driver)
	{
		utility.ImplicitWait(driver, 2000);
		String ActualBalance = balance.getText();
		System.out.println("Getting Actual Balance");
		return ActualBalance;
	}
	
	public void loggingOut(WebDriver driver)
	{
		username.click();
		logout.click();
	}
	

	

}

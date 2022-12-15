package NeostoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasswordPage
{
	@FindBy(xpath ="//input[@id='txt_accesspin']")private WebElement PasswordFiled;
	
	@FindBy(xpath = "//a[@class='btn btn-neo']")private WebElement SubmitButton;
	
	
	
	public PasswordPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterPassword(WebDriver driver ,String pass)
	{
		utility.ImplicitWait(driver, 1000);
		PasswordFiled.sendKeys(pass);
	}
	
	public void ClickOnSubmitButton(WebDriver driver)
	{
		utility.ImplicitWait(driver, 2000);
		SubmitButton.click();
	}

}

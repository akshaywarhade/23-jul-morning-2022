package NopCommercePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Register 
{
	@FindBy(id="gender-male")private WebElement gender;
	@FindBy(id="FirstName")private WebElement Firstname;
	@FindBy(id="LastName")private WebElement Lastname;
	@FindBy(name="DateOfBirthDay") private WebElement daydropdown;
	@FindBy(xpath="(//option[@value='2'])[1]")private WebElement date;
	@FindBy(name="DateOfBirthMonth") private WebElement monthdropdown;
	@FindBy(xpath="((//option[@value='3'])[2]")private WebElement month;
	@FindBy(name="DateOfBirthYear") private WebElement yeardropdown;
	@FindBy(xpath="(//option[@value='1998']")private WebElement year;
	@FindBy(xpath="//input[@id='Email']")private WebElement email;
	@FindBy(xpath="//input[@id='Password']")private WebElement password;
	@FindBy(xpath="//input[@id='ConfirmPassword']")private WebElement confirmepassword;
	@FindBy(id="register-button")private WebElement registerbutton;
	
	
	public Register(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void selectGender()
	{
		gender.click();
	}
	public void EnterFirstName(String firstname)
	{
		Firstname.sendKeys(firstname);
	}
	public void EnterlastName(String lastname)
	{
		Lastname.sendKeys(lastname);
	}
	
	public void SelectDayDropdown()
	{
		daydropdown.click();
		Select s = new Select(daydropdown);
		s.selectByValue("4");
		
	}
	public void SelectmonthDropdown()
	{
		monthdropdown.click();
		Select s = new Select(monthdropdown);
		s.selectByValue("9");
		
	}
	public void SelectyearDropdown()
	{
		yeardropdown.click();
		Select s = new Select(yeardropdown);
		s.selectByValue("1998");
		
	}
	public void EnterEmail(String Email)
	{
		email.sendKeys(Email);
	}
	
	public void EnterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void ConfirmePassword1(String pass1)
	{
		confirmepassword.sendKeys(pass1);
	}
	
	public void Clickonregisterbutton()
	{
		registerbutton.click();
	}
	


	

}

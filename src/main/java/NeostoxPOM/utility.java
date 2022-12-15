package NeostoxPOM;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class utility
{
	
	public static void ImplicitWait(WebDriver driver, int time)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
	}
	
	public static String ReadPrpprtyFile (String key) throws IOException
	{
		Properties prop = new Properties();
		FileInputStream inp =new FileInputStream("C:\\Users\\AITS\\eclipse-workspace\\Neostox\\neostox.properties");
		prop.load(inp);
		String value = prop.getProperty(key);
		return value;
	
	}

}

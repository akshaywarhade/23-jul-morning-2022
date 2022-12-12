package NopCommerceUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class utility 
{
	public static String readexcelsheet(int row,int cell) throws EncryptedDocumentException, IOException
	{
		File myfile = new File("D:\\Akshay S.T\\upstox.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		String value = mysheet.getRow(row).getCell(cell).getStringCellValue();
		Reporter.log("Sending Data from Excel" + value, true);
		return value;
	}
	
	public static void TakeScreenshot(WebDriver driver,String myFile) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\AITS\\eclipse-workspace\\23Jul B Morning\\SceenShots\\"+myFile+".png");
		FileHandler.copy(src, dest);
		Reporter.log("Taking Screenshot", true);
	}
	
	public static void scrolling(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeAsyncScript("arguments[0].scrollIntoView(true)", element);
		Reporter.log("Scroll In to View " +element.getText(), true);
	}
	
	public static void wait(WebDriver driver,int timevalue)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(timevalue));
		Reporter.log("Waiting for" + timevalue + "milis", true);
	}
	public static String readdatafrompropertyfile(String key) throws IOException
	{
		Properties prop =new Properties();
		
		FileInputStream myfile = new FileInputStream("C:\\Users\\AITS\\eclipse-workspace\\NopCommerce\\NopCommerce.propeties");
		prop.load(myfile);
	    String value = prop.getProperty(key);
	    return value;
	    
	}


}

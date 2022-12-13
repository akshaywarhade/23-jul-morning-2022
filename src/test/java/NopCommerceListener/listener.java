package NopCommerceListener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class listener implements ITestListener
{
	public void onTestSuccess(ITestResult result) 
	{
		String methodname = result.getName();
		Reporter.log("Tc " + methodname+" is pass sucessfully", true);
	}
	public void onTestSkipped(ITestResult result) 
	{
		Reporter.log("Tc " + result.getName()+" is Skip,check once ", true);	
	}
	public void onTestFailure(ITestResult result)
	{
		Reporter.log("Tc " + result.getName()+" is Failed", true);	
	}
		

}

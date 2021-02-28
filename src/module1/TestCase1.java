package module1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("---launch Browser---");
	}
	
	@BeforeMethod
	public void checkingCondition() {
		
		System.out.println("Checking Condition");
	}

	@Test(priority =1)
	public void positiveCondition() {
		System.out.println("Positive Condition ");
		
	}
	
	@Test(priority =2)
	public void negativeCondition() {
		System.out.println("Negative Condition ");
		
	}
	
	@AfterMethod
	public void Closetest() {
		System.out.println("Close  Test ");
		
	}
	
	
	@AfterTest
	public void closeBrowser() {
		System.out.println("---Close Browser---");
	}
	
}

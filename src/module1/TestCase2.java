package module1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase2 {
	
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("---Test case 2 launch Browser---");
	}

	@Test
	public void testcase2() {
		System.out.println("test case 2 ");
		
	}
	@AfterTest
	public void closeBrowser() {
		System.out.println("---Close Browser test case 2---");
	}
	
}

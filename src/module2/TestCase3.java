package module2;


import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase3 {
	
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("---Test case 3 launch Browser---");
	}

	@Test
	public void testcase2() {
		System.out.println("test case 3 ");
		
	}
	@AfterTest
	public void closeBrowser() {
		System.out.println("---Close Browser test case 3---");
	}
	
}

package TestLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;

public class RegisterPageTest extends BaseClass{
	
	static RegisterPage registerPage;
	@BeforeTest
	public void setUp()
	{
		BaseClass.initialization();
	}
	
	@Test
	public void validateRegisterPageFunctionality() {
		 registerPage = new RegisterPage();
		 registerPage.createAccount("Monika", "Navale", "Female", "monika@gmail.com", "Monika@123","Monika@123", "UKB", "Automation Test Engineer", "Pune", "Pune", "Maharashtra", "INDIA", "425613", "9651234552", "QA Manager", "Media", "456");
		 
		
	}
	@AfterTest
	public void tearDown() {
		//driver.quit;
	}

}

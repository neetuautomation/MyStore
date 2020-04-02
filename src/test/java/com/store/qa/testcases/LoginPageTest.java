package com.store.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.store.qa.base.TestBase;
import com.store.qa.pages.HomePage;
import com.store.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage  loginPage;
	HomePage  homePage;

	
	public LoginPageTest() {
		super();
		
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		 loginPage = new LoginPage();
	}
	
	@Test
	public void login() throws Exception {
		homePage = loginPage.ValidateLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() {
	driver.quit();
	}
}


	


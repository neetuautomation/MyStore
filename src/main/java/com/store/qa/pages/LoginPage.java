package com.store.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.store.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy (xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	WebElement signinbtn;
	
	@FindBy (name = "email")
	WebElement email;
	
	@FindBy (name = "passwd")
	WebElement  pwd;
	
	@FindBy (xpath = "//*[@id=\"SubmitLogin\"]/span")
	WebElement submit;
	
	//Initializing the Page Objects 
	
	public void LoginTest() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public HomePage ValidateLogin(String username, String password) throws Exception  {
		Thread.sleep(5000);
		signinbtn.click();
		email.sendKeys(username);
		pwd.sendKeys(password);
		submit.click();
		
		return new HomePage();
	}

}

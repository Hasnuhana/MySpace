package com.automationpractice.myStore;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPageFactory {

	WebDriver driver;
	
	@FindBy(className="login")
	WebElement signIn;
	
	@FindBy(id="email_create")
	WebElement emailCreate;
	
	@FindBy(id="SubmitCreate")
	WebElement btn_SubmitCreate;
	
//	@FindBy(xpath="//input[contains(text(),'Invalid email address.’)]")
//	WebElement invalidEmailAddress;
	
	@FindBy(id="email")
	WebElement emailAddress;
	
	@FindBy(id="passwd")
	WebElement password;
	
	@FindBy(id="SubmitLogin")
	WebElement btn_SubmitLogin;
	
	public LogInPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSignIn() {
		signIn.click();
	}
	
	public void setEmailCreate(String email) {
		emailCreate.sendKeys(email);
	}
	
	public void clickoOnCreateAccount() {
		btn_SubmitCreate.click();
	}
	
	public void setEmailAddress(String email) {
		emailCreate.sendKeys(email);
	}
	
	public void setPassword(String password) {
		emailCreate.sendKeys(password);
	}
	
	public void clickoOnSubmitLogin() {
		btn_SubmitLogin.click();
	}
	
}

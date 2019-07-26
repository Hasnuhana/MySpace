package com.automationpractice.myStore;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.automationpractice.myStore.LogInPageFactory;


public class MyStore {
	private WebDriver driver;
	private String baseUrl;
	LogInPageFactory logInPage;
	SignUpPageFactory signUpPage;
	AddToCartPageFactory addToCart;
	JavascriptExecutor js;
	
  @BeforeMethod
  public void beforeMethod() {
	  	System.setProperty("webdriver.gecko.driver", "/Users/hasnuhanamazumder/Documents/workspace_selenium/geckodriver");
	    driver = new FirefoxDriver();
	    js = (JavascriptExecutor) driver;
		baseUrl = "http://automationpractice.com/";
	
		logInPage = new LogInPageFactory(driver);
		
		signUpPage = new SignUpPageFactory(driver);
		
		addToCart = new AddToCartPageFactory(driver);
		
		// Maximise the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
  }
  
	@Test(enabled = true)

	public void validateSignUp() throws Exception {

		signUpPage.clickoOnRegister();
		String actualError = driver.findElement(By.xpath("//input[contains(text(),'There are 9 errors')]")).getText();
		String errorMsg = "There are 9 errors'";
		Assert.assertEquals(actualError, errorMsg);

	}

  @Test(enabled=true)
  
	  public void signUpTest() throws Exception {
		  logInPage.clickOnSignIn();
		  logInPage.setEmailCreate("mazumderh1505@gmail.com");
		  logInPage.clickoOnCreateAccount();
		  signUpPage.clickOnGenderFemaleRadioBtn();
		  signUpPage.setCustomerFirstname("Hasnuhana");
		  signUpPage.setCustomerLastname("Mazumder");
		  //signUpPage.setEmailAddress("mazumderh1505@gmail.com");
		  signUpPage.setPassword("abcd1234");
		  signUpPage.setDate("15");
		  signUpPage.setMonth("May");
		  signUpPage.setYear("1987");
		  signUpPage.CheckBoxNewsLetter();
		  signUpPage.CheckBoxSpecialOffer();
		  //signUpPage.setFirstname("Hasnuhana");
		  //signUpPage.setLastname("Mazumder");
		  signUpPage.setCompanyName("ABCD");
		  signUpPage.setAddressLine1("Kersalway");
		  signUpPage.setAddressLine2("Penninsula Building");
		  signUpPage.setCity("Phenix");
		  signUpPage.setState("Alabama");
		  signUpPage.setZipCode("00000");
		  signUpPage.setCountry("United States");
		  signUpPage.setAdditionalInformation("Nothing");
		  signUpPage.setHomePhone("123456");
		  signUpPage.setMobilePhone("9876543210");
		  signUpPage.setAddressAlias("My Home Address");
		  signUpPage.clickoOnRegister();
		  
  }
  
  
  @Test 
  public void logInTest() throws Exception {
	  
	  logInPage.clickOnSignIn();
	  logInPage.setEmailAddress("mazumderh1505@gmail.com");
	  logInPage.setPassword("abcd1234");
	  logInPage.clickoOnSubmitLogin();
	  
  }
  
  @Test(dependsOnMethods={ "logInTest" })
  public void addToCartTest() throws Exception {
	  logInTest();
	  addToCart.clickOnCatagories();
	  addToCart.clickoOnWomen();
	  
	  //scroll down the page 
	  js.executeScript("window.scrollBy(0,2000);");
	  addToCart.clickoOnAddTocart();
	  
	  //verify the item in cart
	  WebElement item = driver.findElement(By.xpath("//input[(@id='layer_cart_product_title') and contains(text(),'Blouse')]"));
	  Assert.assertEquals(true, item.isDisplayed());
	 
	  addToCart.clickoOnProceedToCheckout();
  }
  
	@AfterMethod
	public void quit() {
		driver.close();
	}

}



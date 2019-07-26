package com.automationpractice.myStore;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AddToCartPageFactory {

WebDriver driver;


	@FindBy(className="cat-title")
	WebElement catagories;
	
	@FindBy(xpath="//a[contains(text(),'women')]")
	WebElement women;
	
	@FindBy(xpath="//input[contains(@title,'Dresses')]")
	WebElement dresses;
	
	@FindBy(xpath="//input[contains(@title,'T-shirts')]")
	WebElement tshirts;
	
	//Add item to cart
	@FindBy(xpath="//input[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 last-item-of-tablet-line']//span[contains(text(),'Add to cart')]")
	WebElement addTocart;
	
	@FindBy(xpath="//input[(@id='layer_cart_product_title') and contains(text(),'Blouse')]")
	WebElement item;
	
	@FindBy(xpath="//input[contains(text(),'Proceed to checkout')]")
	WebElement proceedToCheckout;
	
	
	public AddToCartPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnCatagories() {
		catagories.click();
	}
	
	public void clickoOnWomen() {
		tshirts.click();
	}
	
	public void clickoOnAddTocart() {
		addTocart.click();
	}
	
	public void clickoOnProceedToCheckout() {
		proceedToCheckout.click();
	}
	
}

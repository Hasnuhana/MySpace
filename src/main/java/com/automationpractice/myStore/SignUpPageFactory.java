package com.automationpractice.myStore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpPageFactory {

WebDriver driver;
	
	@FindBy(xpath="//input[contains(@type,'radio')and contains(@id,id_gender1")
	WebElement genderMale;
	
	@FindBy(xpath="//input[contains(@type,'radio')and contains(@id,id_gender2")
	WebElement genderFemale;
	
	@FindBy(id="customer_firstname")
	WebElement customerFirstname;
	
	@FindBy(id="customer_lastname")
	WebElement customerLastname;
	
	@FindBy(id="email")
	WebElement emailAddress;
	
	@FindBy(id="passwd")
	WebElement password;
	
	@FindBy(id="days")
	WebElement dayOfbirth;
	
	@FindBy(id="months")
	WebElement monthOfbirth;
	
	@FindBy(id="years")
	WebElement yearOfbirth;
	
	@FindBy(id="newsletter")
	WebElement chk_newsLetter;
	
	@FindBy(id="optin")
	WebElement chk_specialOffer;
	
	@FindBy(id="firstname")
	WebElement firstname;
	
	@FindBy(id="lastname")
	WebElement lastname;
	
	@FindBy(id="company")
	WebElement company;
	
	@FindBy(id="address1")
	WebElement address1;
	
	@FindBy(id="address2")
	WebElement address2;
	
	@FindBy(id="city")
	WebElement city;
	
	@FindBy(id="id_state")
	WebElement state;
	
	@FindBy(id="postcode")
	WebElement postcode;
	
	@FindBy(id="id_country")
	WebElement country;
	
	@FindBy(id="other")
	WebElement additionalInformation;
	
	@FindBy(id="phone")
	WebElement homePhone;
	
	@FindBy(id="phone_mobile")
	WebElement mobilePhone;
	
	@FindBy(id="alias")
	WebElement addressAlias;
	
	@FindBy(id="submitAccount")
	WebElement btn_register;
	
	
	public SignUpPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//selecting radiobutton
	public void clickOnGenderMaleRadioBtn() {
		
		boolean isMaleSelected = genderMale.isSelected();
		if(!isMaleSelected)
		genderMale.click();
	}

	public void clickOnGenderFemaleRadioBtn() {
		boolean isFemaleSelected = genderFemale.isSelected();
		if(!isFemaleSelected)
		genderFemale.click();
	}
	
	public void setCustomerFirstname(String firstname) {
		customerFirstname.sendKeys(firstname);
	}
	
	public void setCustomerLastname(String lastname) {
		customerLastname.sendKeys(lastname);
	}
	
	public void setEmailAddress(String email) {
		//emailAddress.clear();
		emailAddress.sendKeys(email);
	}
	
	public void setPassword(String passwd) {
		password.sendKeys(passwd);
		
	}
	//Selecting DOB from drop down 
	
	public void setDate(String day) {
		Select sel= new Select(dayOfbirth);
		sel.selectByValue(day);
	}
	
	public void setMonth(String month) {
		Select sel= new Select(monthOfbirth);
		sel.selectByVisibleText(month);
	}
	
	public void setYear(String year) {
		Select sel= new Select(yearOfbirth);
		sel.selectByVisibleText(year);
	}
	
	//Selecting Checkboxes
	public void CheckBoxNewsLetter() {
		boolean isNewsLetterSelected = chk_newsLetter.isSelected();
	
		if(!isNewsLetterSelected) {
			chk_newsLetter.click();
		}
	}
	
	public void CheckBoxSpecialOffer() {
		boolean isSpecialOfferSelected = chk_specialOffer.isSelected();
	
		if(!isSpecialOfferSelected) {
			chk_specialOffer.click();
		}
	}
	
	public void setFirstname(String fstname) {
		//firstname.clear();
		firstname.sendKeys(fstname);
	}
	
	public void setLastname(String lstname) {
		//lastname.clear();
		lastname.sendKeys(lstname);
	}
	
	public void setCompanyName(String companyname) {
		company.sendKeys(companyname);
	}
	
	public void setAddressLine1(String address) {
		address1.sendKeys(address);
	}
	
	public void setAddressLine2(String address) {
		address2.sendKeys(address);
	}
	
	public void setCity(String cityname) {
		city.sendKeys(cityname);
		
	}
	
	//Selecting State Name from drop down
	
	public void setState(String statename) {
		Select sel= new Select(state);
		sel.selectByValue(statename);
	}
	
	public void setZipCode(String zipcode) {
		postcode.sendKeys(zipcode);
		
	}
	
	//Selecting Country Name from drop down
	
	public void setCountry(String countryname) {
		Select sel= new Select(country);
		sel.selectByValue(countryname);
	}
	
	public void setAdditionalInformation(String other) {
		additionalInformation.sendKeys(other);	
	}
	
	public void setHomePhone(String phone) {
		homePhone.sendKeys(phone);
	}
	
	public void setMobilePhone(String mobile) {
		mobilePhone.sendKeys(mobile);
	}
	
	public void setAddressAlias(String alias) {
		addressAlias.clear();
		addressAlias.sendKeys(alias);
	}
	
	public void clickoOnRegister() {
		btn_register.click();
	}
	
	
	
}

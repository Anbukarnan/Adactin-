package org.test.facebook;

import org.maven.baseclass.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends Baseclass {
	public RegistrationPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//a[@role='button'])[2]")
	private WebElement signUp;
	@FindBy(name="firstname")
	private WebElement txtfirstname;
	@FindBy(name="lastname")
	private WebElement txtlastname;
	@FindBy(xpath="(//input[@type='text'])[4]")
	private WebElement mobileno;
	@FindBy(xpath="(//input[@type='password'])[2]")
	private WebElement txtpass;
	@FindBy(id="day")
	private WebElement day;
	@FindBy(id="month")
	private WebElement month;
	@FindBy(id="year")
	private WebElement year;
	@FindBy(xpath="(//input[@type='radio'])[2]")
	private WebElement gender;
	public WebElement getSignUp() {
		return signUp;
	}
	public WebElement getTxtfirstname() {
		return txtfirstname;
	}
	public WebElement getTxtlastname() {
		return txtlastname;
	}
	public WebElement getMobileno() {
		return mobileno;
	}
	public WebElement getTxtpass() {
		return txtpass;
	}
	public WebElement getDay() {
		return day;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getGender() {
		return gender;
	}
	
	
	
	
	
		

	

}

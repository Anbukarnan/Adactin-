package org.Adatin.pom;

import org.maven.baseclass.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orderno extends Baseclass {
	public orderno() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement Itinerary;
	@FindBy(xpath="//table[@cellspacing='1']")
	private WebElement table;
	@FindBy(tagName="td")
	private WebElement tabledata;
	@FindBy(id="order_no")
	private WebElement getprint;
	public WebElement getItinerary() {
		return Itinerary;
	}
	public WebElement getGetprint() {
		return getprint;
	}
	public WebElement getTable() {
		return table;
	}
	public WebElement getTabledata() {
		return tabledata;
	}
	
	
}

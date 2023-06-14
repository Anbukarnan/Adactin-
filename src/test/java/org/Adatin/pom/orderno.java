package org.Adatin.pom;

import java.util.List;

import org.maven.baseclass.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orderno extends Baseclass {
	public orderno() {
		PageFactory.initElements(driver, this);
	}


	
	
	
	
	@FindBy(id="order_no")
	private WebElement getprint;
	
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement Itinerary;
	@FindBy(xpath="//table[@cellpadding='5']")
	private WebElement table;
	@FindBy(xpath="//input[@class='select_text']")
	private List<WebElement> tabledata;
	@FindBy(xpath="//input[@type='button']")
	private List<WebElement> cancel;
	
	public WebElement getGetprint() {
		return getprint;
	}
	
	public List<WebElement> getTabledata() {
		return tabledata;
	}

	public List<WebElement> getCancel() {
		return cancel;
	}

	public WebElement getItinerary() {
		return Itinerary;
	}
	
	public WebElement getTable() {
		return table;
	}
	
}

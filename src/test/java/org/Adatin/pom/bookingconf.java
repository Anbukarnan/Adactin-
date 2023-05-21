package org.Adatin.pom;

import org.maven.baseclass.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bookingconf extends Baseclass {
	public bookingconf() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "search_hotel")
	private WebElement search;

	public WebElement getSearch() {
		return search;
	}

}

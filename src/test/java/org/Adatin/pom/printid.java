package org.Adatin.pom;

import org.maven.baseclass.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class printid extends Baseclass {
	public printid() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="order_no")
	private WebElement print;
	public WebElement getPrint() {
		return print;
	}

}

package org.Adatin.pom;

import org.maven.baseclass.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selectHotel extends Baseclass {
	public selectHotel() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "radiobutton_0")
	private WebElement select;
	@FindBy(id = "continue")
	private WebElement continuebtn;

	public WebElement getSelect() {
		return select;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}

}

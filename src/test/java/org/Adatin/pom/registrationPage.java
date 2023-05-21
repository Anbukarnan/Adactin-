package org.Adatin.pom;

import org.maven.baseclass.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registrationPage extends Baseclass {
	public registrationPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(className="login_register")
	private WebElement newuser;
	@FindBy(id = "username")
	private WebElement txtusername;
	@FindBy(id = "password")
	private WebElement txtpass;

	public WebElement getNewuser() {
		return newuser;
	}

	@FindBy(id = "re_password")
	private WebElement txtconpass;
	@FindBy(id = "full_name")
	private WebElement txtfullname;

	public WebElement getTxtconpass() {
		return txtconpass;
	}

	@FindBy(id = "email_add")
	private WebElement txtemail;
	@FindBy(id = "tnc_box")
	private WebElement checkbox;
	@FindBy(id = "Submit")
	private WebElement btnregister;

	public WebElement getTxtusername() {
		return txtusername;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getTxtfullname() {
		return txtfullname;
	}

	public WebElement getTxtemail() {
		return txtemail;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getBtnregister() {
		return btnregister;
	}
}

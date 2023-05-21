package org.Adatin.pom;

import org.maven.baseclass.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class hotelSearch extends Baseclass {
	public hotelSearch() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement location;
	@FindBy(id = "hotels")
	private WebElement hotels;
	@FindBy(id = "room_type")
	private WebElement room;
	@FindBy(xpath = "(//select[@class='search_combobox'])[4]")
	private WebElement roomno;
	@FindBy(id = "datepick_in")
	private WebElement datecheckin;
	@FindBy(id = "datepick_out")
	private WebElement datecheckout;
	@FindBy(id = "adult_room")
	private WebElement adultno;
	@FindBy(id = "child_room")
	private WebElement childno;
	@FindBy(id = "Submit")
	private WebElement search;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getRoomno() {
		return roomno;
	}

	public WebElement getDatecheckin() {
		return datecheckin;
	}

	public WebElement getDatecheckout() {
		return datecheckout;
	}

	public WebElement getAdultno() {
		return adultno;
	}

	public WebElement getChildno() {
		return childno;
	}

	public WebElement getSearch() {
		return search;
	}

}

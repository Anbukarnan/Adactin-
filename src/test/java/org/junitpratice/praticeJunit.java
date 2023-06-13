package org.junitpratice;

import java.sql.Date;
import java.util.List;

import org.Adatin.pom.bookingconf;
import org.Adatin.pom.hotelBook;
import org.Adatin.pom.hotelSearch;
import org.Adatin.pom.orderno;
import org.Adatin.pom.selectHotel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.maven.baseclass.Baseclass;
import org.openqa.selenium.WebElement;

public class praticeJunit extends Baseclass {
	
	@Test
	public void adactin() {
		Browerlauch("chrome");
		urllaunch("https://adactinhotelapp.com/");
		time(20);
		org.Adatin.pom.loginPage l=new org.Adatin.pom.loginPage();
		sendkeys(l.getTxtuser()	, "Anbukarnan");
		sendkeys(l.getTxtpass(), "Anbu@123");
		click(l.getBtnlogin());
		
		hotelSearch hs = new hotelSearch();
		selectbyvalue("Melbourne", hs.getLocation());
        selectbyvalue("Hotel Hervey", hs.getHotels());
        selectbyvalue("Deluxe", hs.getRoom());
       selectbyvalue("4", hs.getRoomno());
        sendkeysbyJS(hs.getDatecheckin(), "26/12/2023");
        sendkeysbyJS(hs.getDatecheckout(), "28/12/2023");
        selectbyvalue("2", hs.getAdultno());
        selectbyvalue("2", hs.getChildno());
        click(hs.getSearch());
        
        selectHotel s = new selectHotel();
		
		click(s.getSelect());
		click(s.getContinuebtn());
		
		hotelBook hb  =new hotelBook();
		sendkeys(hb.getFirstname(), "Anbu");
		sendkeys(hb.getLastname(), "selvan");
		sendkeys(hb.getBilladdress(), "trichy");
		sendkeys(hb.getCardno(), "1234334567886545");
		selectbyvalue("MAST", hb.getCardtype());
		selectbyvalue("12", hb.getExpmonth());
		selectbyvalue("2026", hb.getExpyear());
		sendkeys(hb.getCardcvno(), "123");
		click(hb.getBookbtn());
		
		 bookingconf b = new bookingconf();
			click(b.getSearch());
			
			orderno o = new orderno();
			System.out.println(attributemethod(o.getGetprint(), "value"));
			String idno = attributemethod(o.getGetprint(), "value");
			click(o.getItinerary());
			
//			
//			WebElement table = findelement(o.getTable());
//			List<WebElement> td = findelements(o.getTabledata());
//			 for(int i=0;i<td.size();i++) {
//			WebElement data = td.get(i);
//			String text = data.getText();
//			if(idno==text) {
//				System.out.println(text);
//			}}

        

	}
}

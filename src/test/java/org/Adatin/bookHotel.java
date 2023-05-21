package org.Adatin;

import org.Adatin.pom.hotelBook;
import org.junit.Test;
import org.maven.baseclass.Baseclass;

public class bookHotel extends Baseclass {
	@Test
	public void book() {
		hotelBook hb  =new hotelBook();
		sendkeys(hb.getFirstname(), "Anbu");
		sendkeys(hb.getLastname(), "selvan");
		sendkeys(hb.getBilladdress(), "trichy");
		sendkeys(hb.getCardno(), "6754334567886545");
		selectbyvalue("MAST", hb.getCardtype());
		selectbyvalue("12", hb.getExpmonth());
		selectbyvalue("2026", hb.getExpyear());
		sendkeys(hb.getCardcvno(), "123");
		click(hb.getBookbtn());

	}

}

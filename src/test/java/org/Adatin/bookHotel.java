package org.Adatin;

import java.io.IOException;

import org.Adatin.pom.hotelBook;
import org.junit.Test;
import org.maven.baseclass.Baseclass;

public class bookHotel extends Baseclass {
	@Test
	public void book() throws IOException {
		hotelBook hb  =new hotelBook();
		sendkeys(hb.getFirstname(), ""+  excelfileread("data", "Sheet2", 3, 0)   +"");
		sendkeys(hb.getLastname(), ""+  excelfileread("data", "Sheet2", 4, 0)   +"");
		sendkeys(hb.getBilladdress(), ""+  excelfileread("data", "Sheet2", 5, 0)   +"");
		sendkeys(hb.getCardno(), ""+  excelfileread("data", "Sheet2", 6, 0)   +"");
		selectbyvalue("MAST", hb.getCardtype());
		selectbyvalue("12", hb.getExpmonth());
		selectbyvalue("2026", hb.getExpyear());
		sendkeys(hb.getCardcvno(), ""+  excelfileread("data", "Sheet2", 9, 0)   +"");
		click(hb.getBookbtn());

	}

}

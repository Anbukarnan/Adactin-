package org.Adatin;

import java.io.IOException;

import org.Adatin.pom.hotelSearch;
import org.junit.Test;
import org.maven.baseclass.Baseclass;

public class searchHotel extends Baseclass {
	@Test
	public void search() throws IOException {
		time(20);
		
		hotelSearch hs = new hotelSearch();
		selectbyvalue("Melbourne", hs.getLocation());
        selectbyvalue("Hotel Hervey", hs.getHotels());
        selectbyvalue("Deluxe", hs.getRoom());
       selectbyvalue("4", hs.getRoomno());
        sendkeysbyJS(hs.getDatecheckin(), ""+  excelfileread("data", "Sheet2", 7, 0)   +"");
        sendkeysbyJS(hs.getDatecheckout(), ""+  excelfileread("data", "Sheet2", 8, 0)   +"");
        selectbyvalue("2", hs.getAdultno());
        selectbyvalue("2", hs.getChildno());
        click(hs.getSearch());
	}

}

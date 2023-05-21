package org.Adatin;

import org.Adatin.pom.hotelSearch;
import org.junit.Test;
import org.maven.baseclass.Baseclass;

public class searchHotel extends Baseclass {
	@Test
	public void search() {
		time(20);
		
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
	}

}

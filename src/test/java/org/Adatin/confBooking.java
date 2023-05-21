package org.Adatin;

import org.Adatin.pom.bookingconf;
import org.junit.Test;
import org.maven.baseclass.Baseclass;

public class confBooking extends Baseclass {
     @Test
     public void search() {
    	 bookingconf b = new bookingconf();
		click(b.getSearch());

	}
}

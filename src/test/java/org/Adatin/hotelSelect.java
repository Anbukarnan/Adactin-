package org.Adatin;

import org.Adatin.pom.selectHotel;
import org.junit.Test;
import org.maven.baseclass.Baseclass;

public class hotelSelect extends Baseclass {
	@Test
	public void select() {
		selectHotel s = new selectHotel();
		
		click(s.getSelect());
		click(s.getContinuebtn());
		
	}

}

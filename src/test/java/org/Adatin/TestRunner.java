package org.Adatin;

import org.Adatin.pom.bookingconf;
import org.Adatin.pom.hotelSearch;
import org.Adatin.pom.loginPage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.maven.baseclass.Baseclass;

@RunWith(Suite.class)
@SuiteClasses({login.class,registerpage.class,searchHotel.class,hotelSelect.class,bookHotel.class,bookingconf.class,idprint.class})
public class TestRunner extends Baseclass {
	@BeforeClass
	public static void beforeclass() {
		Browerlauch("edge");
		

	}
	@AfterClass
    public static void afterclass() {
		driver.quit();
		

	}
}

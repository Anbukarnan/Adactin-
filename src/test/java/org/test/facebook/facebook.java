package org.test.facebook;

import java.io.IOException;

import org.maven.baseclass.Baseclass;

public class facebook extends Baseclass {
	public static void main(String[] args) throws IOException {
		Browerlauch("chrome");
		time(20);
		urllaunch("https://www.facebook.com/");
		//-----------------------------LOGIN PAGE-------------
		loginPage l =new loginPage();
		sendkeys(l.getTxtuser(), "anbuvis");
		sendkeys(l.getTxtpass(), "709289823");
		click(l.getBtnlogin());
	//	Screenshot("First Entry");
		driver.navigate().back();
		driver.navigate().refresh();
		
		sendkeys(l.getTxtuser(), "GreenTech");
		sendkeys(l.getTxtpass(), "123456789");
		//Screenshot("Second Entry");
		
		
		//-------------------------REGISTRATION PAGE------------------
		RegistrationPage r =new RegistrationPage();
		click(r.getSignUp());
	//	Screenshot("Before data given on Regitration page");
		sendkeys(r.getTxtfirstname(), "anbu");
		sendkeys(r.getTxtlastname(), "selvan");
		sendkeys(r.getMobileno(), "8092898236");
		sendkeys(r.getTxtpass(), "1253735348");
		selectbyvalue("26", r.getDay());
		selectbyvalue("12", r.getMonth());
		selectbyvalue("1996", r.getYear());
		click(r.getGender());
	//	Screenshot("After data given on Regitration page");
		
		
		
		
		
		
	}

}

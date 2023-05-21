package org.Adatin;

import org.Adatin.pom.registrationPage;
import org.junit.Ignore;
import org.junit.Test;
import org.maven.baseclass.Baseclass;

public class registerpage extends Baseclass{
	@Ignore
	@Test
	public void register() throws InterruptedException {
		
		urllaunch(" https://adactinhotelapp.com/");
		time(20);
		registrationPage r = new registrationPage();
		click(r.getNewuser());
		sendkeys(r.getTxtusername(), "Anbukarnan");
		sendkeys(r.getTxtpass(), "Anbu@123");
		sendkeys(r.getTxtconpass(), "Anbu@123");
		sendkeys(r.getTxtfullname(), "Anbuselvan");
		sendkeys(r.getTxtemail(), "Anbuvis424@gmail.com");
		Thread.sleep(10000);
		click(r.getCheckbox());
		click(r.getBtnregister());
	
	}

}

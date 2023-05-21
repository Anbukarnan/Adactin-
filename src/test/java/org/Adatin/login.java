package org.Adatin;

import org.Adatin.pom.loginPage;
import org.junit.Test;
import org.maven.baseclass.Baseclass;

public class login extends Baseclass {
	@Test
	public void loginpage() {
		urllaunch("https://adactinhotelapp.com/");
		time(20);
		loginPage l=new loginPage();
		sendkeys(l.getTxtuser()	, "Anbukarnan");
		sendkeys(l.getTxtpass(), "Anbu@123");
		click(l.getBtnlogin());

	}

}

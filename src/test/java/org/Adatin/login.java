package org.Adatin;

import java.io.IOException;

import org.Adatin.pom.loginPage;
import org.junit.Test;
import org.maven.baseclass.Baseclass;

public class login extends Baseclass {
	@Test
	public void loginpage() throws IOException {
		urllaunch(""+ excelfileread("data", "Sheet2", 0, 0) +"");
		time(20);
		loginPage l=new loginPage();
		sendkeys(l.getTxtuser()	, ""+  excelfileread("data", "Sheet2", 1, 0)   +"");
		sendkeys(l.getTxtpass(), ""+  excelfileread("data", "Sheet2", 2, 0)   +"");
		click(l.getBtnlogin());
		

	}

}

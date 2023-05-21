package org.junitpratice;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;
import org.maven.baseclass.Baseclass;
import org.test.facebook.loginPage;

public class facebookexcel extends Baseclass{
	@Test
	public void facebook() throws IOException, InterruptedException {
		Browerlauch("chrome");
		time(20);
		
		

	
	loginPage l =new loginPage();
	for(int i=1;i<=2;i++) {
		for(int j = 2; j<=10;j++) {
	urllaunch("https://www.facebook.com/");
	
	sendkeys(l.getTxtuser(), excelfileread("data", "Sheet1", j, i));
	
    sendkeys(l.getTxtpass(), excelfileread("data", "Sheet1", j, i+1));
	click(l.getBtnlogin());
	Thread.sleep(2000);
	Assert.assertEquals("Verify email&password", "privacy_mutation_token", geturl().contains("privacy_mutation_token"));
	
	
	Thread.sleep(3000);
	}
	}
	
	
}
}

package org.Adatin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.Adatin.pom.orderno;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.maven.baseclass.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class classadatin extends Baseclass {
	@Test
	public void test() throws InterruptedException, IOException {
		orderno o = new orderno();
		
		
		String idno = attributemethod(o.getGetprint(), "value");
		System.out.println(idno);
		click(o.getItinerary());
		WebElement table = driver.findElement(By.xpath("//table[@cellpadding='5']"));
		List<WebElement> td = table.findElements(By.xpath("//input[@class='select_text']"));
		
		
		for(int i=0;i<td.size();i++) {
		System.out.println(td.get(i).getAttribute("value"));
		String orid = td.get(i).getAttribute("value");
		
		if( idno.equals(orid)) {
			System.out.println(idno);
			List<WebElement> cancel = driver.findElements(By.xpath("//input[@type='button']"));
			System.out.println("Cancel id no"+idno);
			cancel.get(cancel.size()-3).click();
			driver.switchTo().alert().accept();
			
			
			
			
			
		}
		}
}
}

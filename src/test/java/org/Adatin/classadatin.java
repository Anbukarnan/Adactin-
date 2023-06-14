package org.Adatin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.Adatin.pom.orderno;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
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
	public void test() throws InterruptedException, IOException, InvalidFormatException {
		orderno o = new orderno();
		
		
		String idno = attributemethod(o.getGetprint(), "value");
		System.out.println(idno);
		click(o.getItinerary());
		File f = new File("C:\\Users\\New\\Desktop\\projects\\Adactin-\\src\\test\\resources\\excelfiles\\orderid.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet sheet = w.createSheet("Data");
		Row row = sheet.createRow(0);
		row.createCell(0).setCellValue("Genarate order id");
		row.createCell(1).setCellValue(idno);
		
		
		for(int i=0;i<o.getTabledata().size();i++) {
		
		String orid = o.getTabledata().get(i).getAttribute("value");
		
		if( idno.equals(orid)) {
			System.out.println(idno);
			row.createCell(2).setCellValue("Cancel id number");
			row.createCell(3).setCellValue(idno);
			
			System.out.println("Cancel id no "+idno);
			o.getCancel().get(o.getCancel().size()-3).click();
			driver.switchTo().alert().accept();
			
			
			
			
			
		}
		}
		FileOutputStream fo = new FileOutputStream(f);
		w.write(fo);
}
}

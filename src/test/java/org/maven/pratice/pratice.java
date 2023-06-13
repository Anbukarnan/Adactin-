package org.maven.pratice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pratice {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone 14");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		File f= new File("C:\\Users\\New\\eclipse-workspace\\maven\\src\\test\\resources\\task.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet sheet = w.createSheet("Flipkart");
		
		Row row2 = sheet.createRow(0);
		Cell cell3 = row2.createCell(0);
		cell3.setCellValue("SI.NO");
		Cell cell4 = row2.createCell(1);
		cell4.setCellValue("PHONE NAME");
		Cell cell5 = row2.createCell(2);
		cell5.setCellValue("PHONE PRICE");
		List<WebElement> listofphonenames = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		
		for(int i=0;i<listofphonenames.size();i++) {
			System.out.println(listofphonenames.get(i).getText());
			WebElement element = listofphonenames.get(i);
			String text = element.getText();
			Row row = sheet.createRow(i+1);
			Cell cell2 = row.createCell(0);
			cell2.setCellValue(i+1);
			Cell cell = row.createCell(1);
			cell.setCellValue(text);
			
		
				List<WebElement> listofphoneprice = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		
			System.out.println(listofphoneprice.get(i).getText());
			
			Cell cell1 = row.createCell(2);
			cell1.setCellValue(listofphoneprice.get(i).getText());
			
		
		FileOutputStream f0=new FileOutputStream(f);
		w.write(f0);
//		 List<WebElement> list = driver.findElements(By.xpath("//a[@class='ge-49M']"));
//		   list.get(n).click();
		}
				   }
}
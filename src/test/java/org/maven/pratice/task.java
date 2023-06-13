package org.maven.pratice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.XLSBUnsupportedException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.maven.baseclass.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task extends Baseclass
{
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone 14");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
//		for(int n=0;n<4;n++) {
//			Thread.sleep(3000);
		 File f=new File("C:\\Users\\New\\eclipse-workspace\\maven\\src\\test\\resources\\Flipkart.xlsx");
		   
		 Workbook w=new XSSFWorkbook();
		 Sheet sheet = w.createSheet("iphone 14");
		 
		 
				   
		List<WebElement> listofphonenames = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		
		for(int i=0;i<listofphonenames.size();i++) {
			System.out.println(listofphonenames.get(i).getText());
			Row row = sheet.createRow(i);
			Cell cell = row.createCell(0);
			cell.setCellValue(listofphonenames.get(i).getText());
		}
		FileOutputStream f01 = new FileOutputStream(f);
		w.write(f01);
		
		List<Integer>li=new ArrayList<>();
		List<WebElement> listofphoneprice = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		for(int i=0;i<listofphoneprice.size();i++) {
			System.out.println(listofphoneprice.get(i).getText());
			Row row = sheet.createRow(i);
			Cell cell = row.createCell(1);
			cell.setCellValue(listofphoneprice.get(i).getText());
			String text2 = listofphoneprice.get(i).getText();
			
			WebElement element = listofphoneprice.get(i);
			String text = element.getText();
			String string = text.substring(1);
			String pricelist = string.replace(",", "");
            Integer price = Integer.valueOf(pricelist);
            
			li.add(price);
			
		}
		FileOutputStream fo =new FileOutputStream(f);
		w.write(fo);
		
		System.out.println("text value");
		
		System.out.println("---------------Decending order--------------");
		ComparatorDemo1 c=new ComparatorDemo1();
		Collections.sort(li, c);
	
		for(Integer x:li) {
			System.out.println(x);
			
		}
		Integer max = Collections.max(li);
		Integer min = Collections.min(li);
		System.out.println("Maximum value of price"+max);
		System.out.println("Minimum value of price"+min);
		
		
	   Map<String, String> iphone=new LinkedHashMap<>();
	   for(int i=0;i<listofphonenames.size();i++) {
			
		iphone.put(listofphonenames.get(i).getText(), listofphoneprice.get(i).getText());

		}
	   Set<Entry<String,String>> entrySet = iphone.entrySet();
	   for(Entry<String, String> x:entrySet ) {
		   System.out.println(x);
			   }
	  
	   
//	  // driver.findElement(By.xpath("//a[@class='_1LKTO3']")).click();
//	   List<WebElement> list = driver.findElements(By.xpath("//a[@class='ge-49M']"));
//	   list.get(n).click();
//		}
	   
		   }
	}
	



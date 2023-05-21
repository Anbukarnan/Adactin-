package org.maven.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;

	public static void Browerlauch(String browsername) {
		switch (browsername) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		}
	}

	public static void time(int sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
		driver.manage().window().maximize();
	}

	public static void urllaunch(String url) {
		driver.get(url);

	}

	public static void sendkeys(WebElement e, String data) {
		e.sendKeys(data);

	}

	public static void click(WebElement e) {
		e.click();

	}

	// -----------------------ACTION METHOD-----------------
	public static void actionclick(WebElement target) {
		Actions a = new Actions(driver);
		a.click(target).perform();

	}

	public static void actiondraganddrop(WebElement from, WebElement to) {
		Actions a = new Actions(driver);
		a.dragAndDrop(from, to).perform();

	}

	public static void contextclickaction(WebElement target) {
		Actions a = new Actions(driver);
		a.contextClick(target).perform();

	}

	public static void clickholdaction(WebElement target) {
		Actions a = new Actions(driver);
		a.clickAndHold(target).perform();

	}

	public static void releaseaction(WebElement target) {
		Actions a = new Actions(driver);
		a.release(target).perform();

	}

	public static String geturl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}

	public static String attributemethod(WebElement e, String value) {
		String attribute = e.getAttribute(value);
		return attribute;

	}

	public static String gettext(WebElement e) {
		String text = e.getText();
		return text;

	}

	// ---------------------SCREENSHOT------------------
	public static void Screenshot(String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\"+ name+".png");
		FileUtils.copyFile(screenshotAs, f);

	}
	// -------------------WINDOWS HANDLE----------------

	public static void windowshandle(int windowcount) {
		Set<String> Allid = driver.getWindowHandles();
		int count = 1;
		for (String Eachid : Allid) {
			if (count == windowcount) {
				driver.switchTo().window(Eachid);
			}
			count++;
		}
	}

	// -----------------------------DROP AND DOWN BY SELECT METHOD---------
	public static void selectbyindex(int indexno, WebElement e) {
		Select s = new Select(e);
		s.selectByIndex(indexno);

	}

	public static void selectbyvalue(String value, WebElement e) {
		Select s = new Select(e);
		s.selectByValue(value);

	}

	public static void selectbyvisibletext(String text, WebElement e) {
		Select s = new Select(e);
		s.selectByVisibleText(text);

	}

	public static void deselectbyvalue(String value, WebElement e) {
		Select s = new Select(e);
		s.deselectByValue(value);

	}

	public static void deselectbyindex(int indexno, WebElement e) {
		Select s = new Select(e);
		s.deselectByIndex(indexno);

	}

	public static void deselectbyvisibletext(String text, WebElement e) {
		Select s = new Select(e);
		s.deselectByVisibleText(text);

	}

	public static void Alldeselect(WebElement e) {
		Select s = new Select(e);
		s.deselectAll();

	}

	// -----------------------FRAMES--------------------
	public static void frames(WebElement traget) {
		driver.switchTo().frame(traget);
	}

	// -----------------------ALERT----------------
	public static void simplealert() {
		driver.switchTo().alert().accept();
		
	}

	public static void confirmalert(String alertcmd) {
		switch (alertcmd) {
		case "accept":
			driver.switchTo().alert().accept();
			break;

		case "dismiss":
			driver.switchTo().alert().dismiss();
			break;
		}

	}

	public static void promtalert(String text) {
		Alert a = driver.switchTo().alert();
		a.sendKeys(text);
		a.accept();

	}

	// -----------------------JAVA SCRIPT EXECUTOR METHODS--------------

	public static void sendkeysbyJS(WebElement e, String giventxt) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value',' " + giventxt + " ')", e);

	}

	public static void clickbyJS(WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", e);

	}

	public static void scrollupandsown(WebElement e, String upordown) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(" + upordown + ")", e);

	}

	private void getattributebyJS(WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("return arguments[0].getAttribute('value')", e);

	}
	// -----------------------------NAVIGATION METHOD--------------
	public static void refresh() {
		driver.navigate().refresh();

	}
	public static void backward() {
		driver.navigate().back();

	}
	public static void forward() {
		driver.navigate().forward();

	}
	public static void reload(String url) {
		driver.navigate().to(url);

	}
	//-------------------------------Data Driven-----------------
	public static String excelfileread(String name, String sheetname,int rowno,int cellno) throws IOException {
		File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\excelfiles\\"+ name+".xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet s = w.getSheet(sheetname);
		Row r = s.getRow(rowno);
		Cell c = r.getCell(cellno);
		int type = c.getCellType();
		String value=null;
		if(type == 1) {
			 value = c.getStringCellValue();
			
		}else {
			if(DateUtil.isCellDateFormatted(c)) {
				java.util.Date date = c.getDateCellValue();
				SimpleDateFormat ss = new SimpleDateFormat("dd/MM/yyyy");
				 value = ss.format(date);
				
			}else {
				double db = c.getNumericCellValue();
				long ln = (long)db;
				 value = String.valueOf(ln);
				
				
			}
		}
		return value;
		
		
		

	}
	

}

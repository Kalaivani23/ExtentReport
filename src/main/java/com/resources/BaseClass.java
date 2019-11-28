package com.resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseClass {

	public static WebDriver driver;
	public static Actions action;
	public static Select select;
	public static Alert alert;
	public static JavascriptExecutor js;
	public static ExtentTest test;
	public static ExtentReports extent;
	public static ExtentHtmlReporter htmlReporter;

	public static void extentReportSetPath() {
		htmlReporter = new ExtentHtmlReporter(
				"C:\\Users\\hi\\eclipse-workspace\\KalaiVaniV\\AirCanadaProject\\report\\extentreport.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}

	public static void extentReportCreateTest(String page) {
		test = extent.createTest(page);
	}

	public static String capture() throws IOException {
		TakesScreenshot t = (TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\hi\\eclipse-workspace\\KalaiVaniV\\AirCanadaProject\\Error Image\\Image"
				+ System.currentTimeMillis() + ".png");
		String errflpath = des.getAbsolutePath();
		FileUtils.copyFile(src, des);
		return errflpath;
	}

	public static void extentReportINFO() throws IOException {
		try {
			test.log(Status.INFO, "Passed");
		} catch (Exception e) {
			test.log(Status.FAIL, test.addScreenCaptureFromPath(capture()) + "Test Failed");
		}
	}

	public static void extentReportPASS() {
		test.log(Status.PASS, "Passed");
	}

	public static void extentReportFAIL() throws IOException {
		test.log(Status.FAIL, test.addScreenCaptureFromPath(capture()) + "Test Failed");
	}

	public static void extentFlush() {
		extent.flush();
	}

	public static void launchChromeBrowser(String url) {
		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\hi\\eclipse-workspace\\KalaiVaniV\\AirCanadaProject\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
		} catch (Exception e) {
			System.out.println("Chrome Not Launched");
			e.printStackTrace();
		}
	}

	public static void launchFirefoxBrowser(String url) {
		try {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\hi\\eclipse-workspace\\KalaiVaniV\\AirCanadaProject\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(url);
		} catch (Exception e) {
			System.out.println("Firefox Not Launched");
			e.printStackTrace();
		}
	}

	public static void launchIEBrowser(String url) {
		try {
			System.setProperty("webdriver.ie.driver",
					"C:\\Users\\hi\\eclipse-workspace\\KalaiVaniV\\AirCanadaProject\\driver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.get(url);
		} catch (Exception e) {
			System.out.println("IE Not Launched");
			e.printStackTrace();
		}
	}

	public static void closeBrowser() {
		driver.quit();
	}

	public static void type(WebElement loc, String in) {
		try {
			loc.sendKeys(in);
		} catch (Exception e) {
			System.out.println("Input Not Entered");
			e.printStackTrace();
		}
	}

	public static void click(WebElement loc) {
		try {
			loc.click();
		} catch (Exception e) {
			System.out.println("Click Button");
			e.printStackTrace();
		}
	}

	public static void screenShot(String path) {
		try {
			TakesScreenshot t = (TakesScreenshot) driver;
			FileUtils.copyFile(t.getScreenshotAs(OutputType.FILE), new File(path));
		} catch (Exception e) {
			System.out.println("Screenshot failed");
			e.printStackTrace();
		}
	}

	public static void maximize() {
		try {
			driver.manage().window().maximize();
		} catch (Exception e) {
			System.out.println("Not Maximize");
			e.printStackTrace();
		}
	}

	public static String getURL() {
		String url = driver.getCurrentUrl();
		return url;
	}

	public static String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	public static void implicitlyWait() {
		try {
			driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void dropDownValue(WebElement e, String value) {
		select = new Select(e);
		select.selectByValue(value);
	}

	public static void dropDownText(WebElement e, String text) {
		select = new Select(e);
		select.selectByVisibleText(text);
	}

	public static void dropDownIndex(WebElement e, int index) {
		select = new Select(e);
		select.selectByIndex(index);
	}

	public static void actionMoveToElement(WebElement e) {
		action = new Actions(driver);
		action.moveToElement(e).perform();
	}

	public static void actionContextClick(WebElement e) {
		action = new Actions(driver);
		action.contextClick(e).perform();
	}

	public static void actionDoubleClick(WebElement e) {
		action = new Actions(driver);
		action.doubleClick(e).perform();
	}

	public static void actionDragAndDrop(WebElement src, WebElement des) {
		action = new Actions(driver);
		action.dragAndDrop(src, des).perform();
	}

	public static void actionKeyUpDown(WebElement e, String text) {
		action = new Actions(driver);
		action.keyDown(e, Keys.SHIFT).sendKeys(text).keyUp(e, Keys.SHIFT).perform();
	}

	public static void multipleWindowsHandling(WebDriver d, int window) {
		Set<String> allWind = d.getWindowHandles();
		ArrayList<String> list = new ArrayList<String>();
		list.addAll(allWind);
		driver.switchTo().window(list.get(window));
	}

	public static String getData(int r, int c) throws IOException {
		File loc = new File("C:\\Users\\hi\\eclipse-workspace\\Kalaivani\\MavenSample\\excel\\Datadriven.xlsx");
		FileInputStream f = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(f);
		Sheet s = w.getSheet("Datas");
		Row row = s.getRow(r);
		Cell cell = row.getCell(c);
		int type = cell.getCellType();
		String value = null;
		if (type == 1) {
			value = cell.getStringCellValue();
		} else if (type == 0) {
			if (DateUtil.isCellDateFormatted(cell)) {
				Date date = cell.getDateCellValue();
				SimpleDateFormat sim = new SimpleDateFormat("mm/dd/yyyy");
				value = sim.format(date);
			} else {
				double num = cell.getNumericCellValue();
				long l = (long) num;
				value = String.valueOf(l);
			}
		}
		return value;
	}

	public static void alert(String alertType, String action) {
		alert = driver.switchTo().alert();
		if (alertType.equals("Simple")) {
			if (action.equals("accept")) {
				alert.accept();
			}
		} else if (alertType.equals("Confirm")) {
			if (action.equals("accept")) {
				alert.accept();
			} else if (action.equals("dismiss")) {
				alert.dismiss();
			} else if (alertType.equals("Prompt")) {
				if (action.equals("accept")) {
					alert.sendKeys("Yes");
					alert.accept();
				} else if (action.equals("dismiss")) {
					alert.sendKeys("No");
					alert.dismiss();
				}
			}
		}
	}

	public static void scrollDown(WebElement loc) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", loc);
	}

	public static void scrollUp(WebElement loc) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", loc);
	}

	public static void jsType(WebElement loc, String in) {
		js = (JavascriptExecutor) driver;
		String s = "arguments[0].setAttribute('value','input')";
		js.executeScript(s.replace("input", in), loc);
	}

	public static void jsClick(WebElement loc) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", loc);
	}

	public static String jsGetAttribute(WebElement loc) {
		js = (JavascriptExecutor) driver;
		String t = (String) js.executeScript("return arguments[0].getAttribute('value')", loc);
		return t;
	}

	public static String getText(WebElement loc) {
		String t = loc.getText();
		return t;
	}

	public static String getAttribute(WebElement loc, String attribute) {
		String t = loc.getAttribute(attribute);
		return t;
	}

	public static void date(String date) {
		String[] d = date.split("-");
		String day = d[0];
		String month = d[1];
		String year = d[2];
		System.out.println("Date: " + date + " Day: " + d[0] + " Month: " + d[1] + " Year: " + d[2]);
		WebElement selDate = driver.findElement(By
				.xpath("//td[@data-date='" + day + "' and @data-month='" + month + "' and @data-year='" + year + "']"));
		click(selDate);
	}

	public static void paxCount(String a, String ac, String y, String yc, String c, String cc, String i, String ic) {
		if (a.equalsIgnoreCase("Yes")) {
			for (int x = 1; x < Integer.parseInt(ac); x++) {
				WebElement plus1 = driver.findElement(By.xpath("(//span[text()='+'])[1]"));
				click(plus1);
			}
		} else {
			WebElement minus = driver.findElement(By.xpath("(//span[text()='-'])[2]"));
			click(minus);
		}
		if (y.equalsIgnoreCase("Yes")) {
			for (int x = 1; x <= Integer.parseInt(yc); x++) {
				WebElement plus2 = driver.findElement(By.xpath("(//span[text()='+'])[2]"));
				click(plus2);
			}
		}
		if (c.equalsIgnoreCase("Yes")) {
			for (int x = 1; x <= Integer.parseInt(cc); x++) {
				WebElement plus3 = driver.findElement(By.xpath("(//span[text()='+'])[3]"));
				click(plus3);
			}
		}
		if (i.equalsIgnoreCase("Yes")) {
			for (int x = 1; x <= Integer.parseInt(ic); x++) {
				WebElement plus4 = driver.findElement(By.xpath("(//span[text()='+'])[4]"));
				click(plus4);
			}
		}
	}
}

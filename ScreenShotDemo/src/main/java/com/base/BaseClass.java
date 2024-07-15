package com.base;

import java.io.File;
import  java.util.Date;

import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
 public WebDriver driver;
 public void setUp() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aboubacar\\eclipse-workspace\\ScreenShotDemo\\driver\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com/");

}
 
 public  static void  screenShot(WebDriver driver,String filename) {
	 String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	TakesScreenshot takesScreenShot = (TakesScreenshot) driver;
	File source = takesScreenShot.getScreenshotAs(OutputType.FILE);
	
	try {
		FileUtils.copyFile(source, new File(System.getProperty("user.dir")+"\\ScreenShot\\"+filename+"_"+dateName+".png"));
	} catch (Exception e) {
		e.getMessage();
	}
}
}

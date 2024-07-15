package com.TestPackage;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import com.base.BaseClass;

public class ScreensShotTest extends BaseClass {

	@Test
	 public void testCase1() {

	  driver.findElement(By.name("q")).sendKeys("ScreenShot Demo");
	  Assert.assertTrue(false);
	 }
	 @org.junit.Test
	 public void testCase2() {
	
	  Assert.assertTrue(false);
	 }
	 
	// @AfterMethod
	 public void tearDown() {
	  driver.close();
	 }
}

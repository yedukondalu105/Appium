package com.Appium;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;

public class AhiBus {
	public AndroidDriver<WebElement> driver;
  @Test
  public void bookATickets() {
	  driver.findElement(By.xpath("//android.widget.TextView[@text='Leaving from']")).click();
	  driver.findElement(By.xpath("//android.widget.EditText[@text='Search for city' and @resource-id='android:id/search_src_text']")).click();
	  driver.findElement(By.xpath("//android.widget.EditText[@text='Search for city' and @resource-id='android:id/search_src_text']")).sendKeys("hyderabad");
	  driver.findElement(By.xpath("//android.widget.TextView[@text='Hyderabad']")).click();
	  driver.findElement(By.xpath("//android.widget.TextView[@text='Going to']")).click();
	  driver.findElement(By.xpath("//android.widget.EditText[@text='Search for city']")).click();
	  driver.findElement(By.xpath("//android.widget.EditText[@text='Search for city']")).sendKeys("repalle");
	  driver.findElement(By.xpath("//android.widget.TextView[@text='Repalle']")).click();
	  driver.findElement(By.xpath("//android.widget.TextView[@text='12' and @resource-id='com.app.abhibus:id/tv_date']")).click();
	  driver.findElement(By.xpath("//android.widget.TextView[@text='Search' and @resource-id='com.app.abhibus:id/searchButton']")).click();
	  
  }
  @BeforeTest
  public void beforeTest() throws MalformedURLException {
	  
	  DesiredCapabilities dc=new DesiredCapabilities();
	  dc.setCapability("deviceName", "a8c810fd");
	  dc.setCapability("platformVersion", "9");
	  dc.setCapability("platformName", "Android");
	  dc.setCapability("appPackage", "com.app.abhibus");
	  dc.setCapability("appActivity", "com.abhibus.mobile.MainActivity");
	  dc.setCapability("fullReset", false);
	  dc.setCapability("noReset", true);
	  driver=new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
	  driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	 // driver.quit();
  }

}

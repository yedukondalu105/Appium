package com.Appium;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;

public class RedBus {
	public WebDriver driver;
  @Test
  public void bookATickets() {
	  
	  
  }
  @BeforeTest
  public void beforeTest() throws MalformedURLException {
	  
	  DesiredCapabilities dc=new DesiredCapabilities();
	  dc.setCapability("deviceName", "a8c810fd");
	  dc.setCapability("platformVersion", "9");
	  dc.setCapability("platformName", "Android");
	  dc.setCapability("appPackage", "in.redbus.android");
	  dc.setCapability("appActivity", "in.redbus.android.root.HomeScreen");
	  dc.setCapability("fullReset", false);
	  dc.setCapability("noReset", true);
	  driver=new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"),dc);
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
  }

}

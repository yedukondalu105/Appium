package com.Appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LaunchWhatsApp {
	public WebDriver driver;
	@BeforeTest
	public void beforeTest() throws MalformedURLException{
		  DesiredCapabilities dc=new DesiredCapabilities();
		  dc.setCapability("deviceName", "a8c810fd");
		  dc.setCapability("platformVersion", "9");
		  dc.setCapability("platformName", "Android");
		  dc.setCapability("appPackage", "com.whatsapp");
		  dc.setCapability("appActivity", "com.whatsapp.HomeActivity");
		  dc.setCapability("fullReset", false);
		  dc.setCapability("noReset", true);
		  driver=new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
  @Test
  public void whatsAppProgram() {  
	
	  driver.findElement(By.xpath("//android.widget.TextView[@text='Jeevani']")).click();
	  driver.findElement(By.xpath("//android.widget.EditText[@text='Type a message']")).click();
	  driver.findElement(By.xpath("//android.widget.EditText[@text='Type a message']")).sendKeys("Sleep well and sweet dreams");
	  driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Send']")).click();
	  
	  
	  
  }
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }
}

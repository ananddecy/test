package org.cuke.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuperClass
{
  public WebDriver driver;
  public SuperClass(){
	 String exePath = "C:\\Users\\sivamani.krubhanand\\Documents\\ChromeDriver\\chromedriver.exe";
	  //String exePath = "src/test/resources/drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		
  }
  public WebDriver getDriver(){
    if (driver == null){
      driver = new ChromeDriver();
      return driver;
    }else{
      return driver;
    }
  }
}
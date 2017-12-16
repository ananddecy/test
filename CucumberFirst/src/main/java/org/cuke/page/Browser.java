package org.cuke.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

private static WebDriver webDriver = new FirefoxDriver();


public WebDriver getDriver()
{
    return webDriver;
}
public static void open(String url)
{
	webDriver.get(url);
}
public static void close()
{
	webDriver.close();
}
}

package org.cuke.page;

import org.cuke.steps.GoogleSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;




public class GooglePage extends SuperClass{
	
	@FindBy(xpath = "//*[@id='hplogo']")
	private WebElement googleIcon;
	
	@FindBy(xpath = "//*[@id='sfcontent']/div[1]/div[2]/div[21]/span/a")
	private WebElement csvButton;
	
	GoogleSteps steps;
	
	
	public void googleIcon(){
		
		String title = getDriver().getTitle();
		System.out.println(title);
	}
	
	public void clickOnButton(){
		WebElement element = getDriver().findElement(By.xpath("//[@id='rf_export']/a"));

				JavascriptExecutor executor = (JavascriptExecutor) getDriver();
				executor.executeScript("arguments[0].click();", element);
	}

}

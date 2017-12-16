package org.cuke.steps;

import org.cuke.page.GooglePage;
import org.cuke.page.SuperClass;
import org.openqa.selenium.By;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSteps extends SuperClass {

	@Given("user opens google homepage")
	public void openGoogle() {

		getDriver().get("http://google.ie");

	}

	@Then("google homepage is displayed")
	public void isPageDisplayed() {
		GooglePage googlePage = new GooglePage();
		googlePage.googleIcon();
		System.out.println("Homepage displayed");
	}

	@Given("user downloads balance sheet")
	public void openFinance() {

		getDriver().get("http://financials.morningstar.com/balance-sheet/bs.html?t=HNHAF&region=usa&culture=en-US");
		getDriver().findElement(By.xpath("//*[@id='sfcontent']/div[1]/div[2]/div[21]/span/a")).click();

	}

	@When("balance sheet is downloaded")
	public void balanceSheet() {
		GooglePage googlePage = new GooglePage();
		googlePage.clickOnButton();
		System.out.println("Homepage displayed");
	}

	@And("user downloads finance sheet")
	public void financeSheet() {
		getDriver().get("http://financials.morningstar.com/income-statement/is.html?t=HNHAF&region=usa&culture=en-US");
		getDriver().findElement(By.xpath("//*[@id='sfcontent']/div[1]/div[2]/div[21]/span/a")).click();
	}

	@And("user downloads cash flow")
	public void cashFlow() {
		getDriver().get("http://financials.morningstar.com/cash-flow/cf.html?t=HNHAF&region=usa&culture=en-US");
		getDriver().findElement(By.xpath("//*[@id='sfcontent']/div[1]/div[2]/div[16]/span/a")).click();
	}
	
	@Then("close browser after")
	public void closeBrowser(){
		getDriver().quit();
	}

	@Given("user downloads \"([^\"]*)\"$")
	public void downloadSheet(final String download) {

		switch (download) {
		case "Balance Sheet":
			getDriver().get("http://financials.morningstar.com/balance-sheet/bs.html?t=HNHAF&region=usa&culture=en-US");
			getDriver().findElement(By.xpath("//*[@id='sfcontent']/div[1]/div[2]/div[21]/span/a")).click();
			break;

		case "Finance Sheet":
			getDriver()
					.get("http://financials.morningstar.com/income-statement/is.html?t=HNHAF&region=usa&culture=en-US");
			getDriver().findElement(By.xpath("//*[@id='sfcontent']/div[1]/div[2]/div[21]/span/a")).click();
			break;

		case "Cash Flow":
			getDriver().get("http://financials.morningstar.com/cash-flow/cf.html?t=HNHAF&region=usa&culture=en-US");
			getDriver().findElement(By.xpath("//*[@id='sfcontent']/div[1]/div[2]/div[16]/span/a")).click();
			break;

		default:
			System.out.println("Invalid Option");

		}

	}
	
	
	@After("@closeBrowser")
	public void afterHooks(){
		getDriver().quit();
	}
	

}

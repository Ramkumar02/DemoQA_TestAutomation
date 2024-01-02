package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StepDefinition.hostUrl;

public class demoQAHost {
	
	WebDriver driver;
	public demoQAHost(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, hostUrl.class);
	}
	
	@FindBy(name = "q")
	WebElement googleSearchBar;
	
	@FindBy(xpath = "//a[@jsname='UWckNb'][1]/h3[1]")
	WebElement txtDemoQa;
	
	public void searchDemoQA() {
		// TODO Auto-generated method stub
		googleSearchBar.sendKeys("demoqa.com");
	}
	
	public void pressEnterKey() {
		googleSearchBar.sendKeys(Keys.ENTER);
	}
	
	public void findDemoQAText() {
		txtDemoQa.click();
	}



}

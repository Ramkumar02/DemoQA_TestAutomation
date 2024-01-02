package StepDefinition;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.demoQAHost;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class hostUrl {

	WebDriver driver = null;
	demoQAHost objdemoQAHost;

	@Given("Browser is open")
	public void browser_is_open() {
		
		System.out.println("Given --> Browser is open");
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@And("User is on google search page")
	public void user_is_on_google_search_page() {
		
		driver.navigate().to("https://www.google.com/");
	}

	@When("User enters demoQA url")
	public void user_enters_demo_qa_url() throws InterruptedException {
		
		objdemoQAHost.searchDemoQA();
		Thread.sleep(2000);
	}

	@And("Hits enter")
	public void hits_enter() {
		
		objdemoQAHost.pressEnterKey();
	}

	@Then("User is navigated to search results")
	public void user_is_navigated_to_search_results() throws InterruptedException {
		
		objdemoQAHost.findDemoQAText();
		Thread.sleep(4000);
		driver.close();
	}
}

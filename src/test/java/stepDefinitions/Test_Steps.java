package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {

	WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       

	}

	/*
	 * @After public void tearDown() { driver.quit(); }
	 */
	
	@Given("^Set SkyBlue Background button exists$")
	public void set_skyblue_background_button_exists() {
		driver.get("https://techfios.com/test/101/");
	}

	@When("^User click on the button$")
	public void user_click_on_the_button() {
		driver.findElement(By.cssSelector("button:nth-child(12)")).click();

	}

	@Then("^The background color will change to skyblue$")
	public void the_background_color_will_change_to_skyblue() {
		System.out.println(driver.findElement(By.cssSelector("body")).getAttribute("style"));
	}

	@Given("^Set White Background button exists$")
	public void Set_white_Background_button_exists() {
		driver.get("https://techfios.com/test/101/");

	}

	@When("^User click on the Set White Background button$")
	public void user_click_on_the_set_white_background_button() {
		driver.findElement(By.cssSelector("button:nth-child(13)")).click();

	}

	@Then("^The background color will change to white$")
	public void the_background_color_will_change_to_white() {
		System.out.println(driver.findElement(By.cssSelector("body")).getAttribute("style"));
	}

}

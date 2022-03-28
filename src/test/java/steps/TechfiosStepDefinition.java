package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.DatabasePage;
import pages.LoginPage;
import pages.TestBase;

public class TechfiosStepDefinition extends TestBase {
	
	LoginPage loginPage;
	DatabasePage databasePage;
	
	@Before
	public void beforeRun() {
		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		
	}

//  Given User in on the Techfios login page

	@Given("^User in on the Techfios login page$")
	public void user_in_on_the_Techfios_login_page() {
		 driver.get("https://techfios.com/billing/?ng=dashboard/");	
	}

	@When("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String username) {
		
		loginPage.enterUsername(username);
		 
	}

	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) {
		 
		loginPage.enterPassword(password);
		 
	}

	@And("^User clicks on signin button$")
	public void user_clicks_on_signin_button() {
		 
		loginPage.clickSignin();
		 
	}

	@Then("^User should land on dashboard page$")
	public void user_should_land_on_dashboard_page() {
		Assert.assertEquals("Dashboard- iBilling", loginPage.getPageTitle());
		takeScreenshot(driver);
	}
	
	@Then("^User should not land on dashboard page$")
	public void user_should_not_land_on_dashboard_page() {
		Assert.assertEquals("Dashboard- iBilling", loginPage.getPageTitle());
		
	}
	
	@When("^User enters \"([^\"]*)\" from techfios database$")
	public void user_enters_from_techfios_database(String loginData) throws Throwable {
	     
	
	
	switch (loginData) {
	case "username":
		loginPage.enterUsername(databasePage.getData("username"));
		System.out.println("Username from DB:" + databasePage.getData("username"));
		break;
	case "password":
		loginPage.enterPassword(databasePage.getData("password"));
		System.out.println("Password from DB:" + databasePage.getData("password"));
	    break;
	 default:
	 System.out.println("Unable to enter login data from DB!");
	}
	
	}
	
	@After
	public void teardown() {
		driver.close();
		driver.quit();
	}

}

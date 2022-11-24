package TestDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class minn {
	WebDriver d;
	@Given("user is in newtours application")
	public void user_is_in_newtours_application() {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	    d=new ChromeDriver();
	    d.get("");
	    d.manage().window().maximize();
	}

	@When("user needs to enter mercury and mercury")
	public void user_needs_to_enter_mercury_and_mercury() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user clicls on login button")
	public void user_clicls_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user back to homepage")
	public void user_back_to_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}

package TestDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class min {
	WebDriver d;
	@Given("user is in google page")
	public void user_is_in_google_page() {
	    System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	    d=new ChromeDriver();
	    d.get("https://google.com");
	    d.manage().window().maximize();
	}

	@When("user searches some text")
	public void user_searches_some_text() {
	    d.findElement(By.name("q")).sendKeys("manual testing");
	}

	@Then("user click on submit button")
	public void user_click_on_submit_button() throws InterruptedException {
		
		Thread.sleep(2000);
	    d.findElement(By.name("btnK")).click();
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		System.out.println("google");
		d.close();
	}

}

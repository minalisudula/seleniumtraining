package TestDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class minnn {
	
	WebDriver d;
	
	@Given("user is in newtours page")
	public void user_is_in_newtours_page() {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	    d=new ChromeDriver();
	    d.get("https://demo.guru99.com/test/newtours/login.php");
	    d.manage().window().maximize();
	}

	@When("user clicks on register")
	public void user_clicks_on_register() {
		
		d.findElement(By.linkText("REGISTER")).click();
	}

	@Then("user selects india from dropdown")
	public void user_selects_india_from_dropdown() {
		d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select")).sendKeys("india");
		
	}

	@Then("user closes window")
	public void user_closes_window() throws InterruptedException {
		Thread.sleep(2000);
	    d.close();
	}

}

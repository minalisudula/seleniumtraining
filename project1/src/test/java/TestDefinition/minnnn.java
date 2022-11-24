package TestDefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class minnnn {
	
	WebDriver d;
	
	@Given("user is in dezlearnp page")
	public void user_is_in_dezlearnp_page() {
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	    d=new ChromeDriver();
	    d.get("https://www.dezlearn.com/javascript-alerts/");
	    d.manage().window().maximize();
	}

	@When("user clicks on alert")
	public void user_clicks_on_alert() {
		
		d.findElement(By.id("s_alert1")).click();
	    
	}

	

	@Then("user takes ss")
	public void user_takes_ss() throws IOException {
		File scr=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr,new File("C:\\Users\\91949\\Pictures\\Screenshots\\pi9.png"));
	}

	@Then("user closes the page")
	public void user_closes_the_page() throws InterruptedException {
	    Thread.sleep(2000);
	    d.close();
	}

}

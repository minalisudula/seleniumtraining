package TestDefinition;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class w {
	
	WebDriver d;
	@Given("user is in amazon page")
	public void user_is_in_amazon_page() {
		
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://www.amazon.com/");
	    
	}

	@When("user captures links")
	public void user_captures_links() throws InterruptedException {
		
		List<WebElement> links=d.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
			links.get(i).click();
			Thread.sleep(2000);
			d.navigate().back();
		}
	    
	}

	@Then("user gets url and title")
	public void user_gets_url_and_title() {
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		
	    
	}

	@Then("stores in xl sheet")
	public void stores_in_xl_sheet()throws IOException{
	    FileInputStream f=new FileInputStream("C:\\Users\\91949\\Desktop\\minali\\Book4.xlsx");
	    XSSFWorkbook wb=new XSSFWorkbook(f);
	    XSSFSheet ws=wb.getSheet("Sheet1");
	    Rows r=null;
	    Cell c=null;
	    	    
	}

	@Then("closes browser")
	public void closes_browser() {
	    d.close();
	}

}

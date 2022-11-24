package methods;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class method {
	
	WebDriver d;
	public void open_chrome() {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://amazon.com");
		d.manage().window().maximize();
	}
	
	public void get_title() {
		System.out.println(d.getTitle());
	}
	
	public void get_current_url() {
		System.out.println(d.getCurrentUrl());
	}
	
	public void drop() {
		WebElement a=d.findElement(By.id("searchDropdownBox"));
		List<WebElement> a1=a.findElements(By.tagName("option"));
		System.out.println(a1.size());
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i).getText());
		}
	}
	
	public void screenshot() throws IOException {
		File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\91949\\Pictures\\Screenshots\\p.png"));
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		method x=new method();
		x.open_chrome();
		x.get_title();
		x.get_current_url();
		x.drop();
		x.screenshot();
		
	}

}

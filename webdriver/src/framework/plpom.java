package framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class plpom {
	
	static WebDriver d;
	static Properties p1;
	By username=By.name("userName");
	By password=By.name("password");
	By submit=By.name("submit");
	
	
	public plpom(WebDriver d2) {
		// TODO Auto-generated constructor stub
	}

	public void uname()
	{
		d.findElement(username).sendKeys(p1.getProperty("uname"));
		
	}
	
	public void pw()
	{
		d.findElement(password).sendKeys(p1.getProperty("pword"));
		
	}
	
	public void sub()
	{
		d.findElement(submit).click();
		
	}
	
	public static void main(String args[]) throws IOException, InterruptedException
	{
		FileInputStream f=new FileInputStream("C:\\Users\\91949\\eclipse-workspace\\framework\\src\\framework\\heyy.properties");
		p1=new Properties();
		p1.load(f);
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		d.manage().window().maximize();
		
		plpom a=new plpom(d);
		a.uname();
		a.pw();
		Thread.sleep(2000);
		a.sub();
	
	}

}

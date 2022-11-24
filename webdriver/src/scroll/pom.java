package scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class pom {
	
	WebDriver d;
	By username=By.name("userName");
	By password=By.name("password");
	By submit=By.name("submit");
	
	pom(WebDriver d)
	{
		this.d=d;
	}
	
	public void uname()
	{
		d.findElement(username).sendKeys("minali");
		
	}
	
	public void pw()
	{
		d.findElement(password).sendKeys("s");
		
	}
	
	public void sub()
	{
		d.findElement(submit).click();
		
	}
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/login.php");
		d.manage().window().maximize();
		
		pom a=new pom(d);
		a.uname();
		a.pw();
		Thread.sleep(2000);
		a.sub();
	}

}

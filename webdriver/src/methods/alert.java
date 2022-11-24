package methods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class alert {
	
	WebDriver d;

	public void O_c()
	{
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://demoqa.com/alerts");
		d.manage().window().maximize();
		
	}
	
	public void Title()
	{
		System.out.println(d.getTitle());
		
	}
	
	public void Url()
	{
		System.out.println(d.getCurrentUrl());
	}
	
	public void a_m() throws InterruptedException
	{
		d.findElement(By.id("alertButton")).click();
		Alert alt=d.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(2000);
		alt.accept();
		
	}
	public void close()
	{
		d.close();
	}
	
	public static void main(String args[]) throws InterruptedException
	{
		alert h=new alert();
		h.O_c();
		h.Title();
		h.Url();
		h.a_m();
		h.close();
	}

}

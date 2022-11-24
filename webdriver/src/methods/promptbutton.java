package methods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class promptbutton {
	
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
	
	public void prompt() throws InterruptedException
	{
		d.findElement(By.id("promtButton")).click();
		Alert alt=d.switchTo().alert();
		System.out.println(alt.getText());
		alt.sendKeys("selenium");
		Thread.sleep(2000);
		alt.accept();
		WebElement Text=d.findElement(By.id("promptResult"));
		System.out.println(Text.getText());
		
	}
	public void close()
	{
		d.close();
	}
	
	public static void main(String args[]) throws InterruptedException
	{
		promptbutton a=new promptbutton();
		a.O_c();
		a.Title();
		a.Url();
		a.prompt();
		a.close();
	}

}

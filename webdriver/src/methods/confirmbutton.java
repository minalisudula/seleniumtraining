package methods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class confirmbutton {
	
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
	
	public void Conf() throws InterruptedException
	{
		d.findElement(By.id("confirmButton")).click();
		Alert alt=d.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(2000);
		alt.accept();
		WebElement Text=d.findElement(By.id("confirmResult"));
		System.out.println(Text.getText());
	}
	
	public void close()
	{
		d.close();
	}
	
	public static void main(String args[]) throws InterruptedException
	{
		confirmbutton a=new confirmbutton();
		a.O_c();
		a.Title();
		a.Url();
		a.Conf();
		a.close();
	}

}

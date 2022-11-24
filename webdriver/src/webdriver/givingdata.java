package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class givingdata {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/login.php");
		d.manage().window().maximize();
		d.findElement(By.linkText("REGISTER")).click();
		d.findElement(By.name("firstName")).sendKeys("Minali");
		d.findElement(By.name("country")).sendKeys("india");
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
		WebElement a=d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul"));
		
		List<WebElement> e=a.findElements(By.tagName("a")); 
		System.out.println(e.size());
		for(int i=0;i<e.size();i++)
		{
			System.out.println(e.get(i).getText());
		}
	

	}

}

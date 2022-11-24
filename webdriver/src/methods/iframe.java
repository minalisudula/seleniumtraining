package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.dezlearn.com/iframe-example/");
		d.manage().window().maximize();
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		d.switchTo().frame("iframe1");
		d.findElement(By.id("u_5_6")).click();
		Thread.sleep(2000);
		WebElement Text=d.findElement(By.id("processing"));
		System.out.println(Text.getText());
		
		
		d.switchTo().frame("iframe2");
		d.findElement(By.xpath("//*[@id=\"u_5_6\"]")).click();
		Thread.sleep(2000);
		WebElement Tex=d.findElement(By.xpath("//*[@id=\"processing\"]"));
		System.out.println(Tex.getText());
		
		d.close();
	
	
	}

}

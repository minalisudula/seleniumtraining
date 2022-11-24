package webdriver;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ss {
	
	public static void main(String[] args)throws IOException {
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
		
		d.findElement(By.linkText("REGISTER")).click();
		WebElement drop=d.findElement(By.name("country"));
		List<WebElement>drop1=drop.findElements(By.tagName("option"));
		System.out.println(drop1.size());
		for(int i=0;i<drop1.size();i++)
		{
			System.out.println(drop1.get(i).getText());
		}
		File a=((TakesScreenshot)d).getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		FileUtils.copyFile(a,new File("C:\\Users\\91949\\Pictures\\Screenshots\\pi.png"));
		
	}

}

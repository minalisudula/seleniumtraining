package framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class pl {
	
	public static void main(String args[]) throws IOException
	{
		FileInputStream f=new FileInputStream("C:\\Users\\91949\\eclipse-workspace\\framework\\src\\framework\\heyy.properties");
		Properties p1=new Properties();
		p1.load(f);
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		
		d.get(p1.getProperty("url"));
		d.findElement(By.name("userName")).sendKeys(p1.getProperty("uname"));
		d.findElement(By.name("password")).sendKeys(p1.getProperty("pword"));
		
	}

}

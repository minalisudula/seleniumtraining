package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class m {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver","D:\\chromedriver.exe");
		ChromeDriver d= new ChromeDriver();
		d.get("https://www.amazon.com/");
		d.manage().window().maximize();
		d.findElement(By.id("searchDropdownBox")).sendKeys("Books");
	    d.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry potter");
		d.findElement(By.id("nav-search-submit-button")).click();
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		d.close();
		
		
	}

}

package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkeys {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		d.manage().window().maximize();
		d.findElement(By.name("firstname")).sendKeys("minali");
		d.findElement(By.name("lastname")).sendKeys("sudula");
		

	}

}

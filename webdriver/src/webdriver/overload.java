package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class overload {
	
WebDriver d;
	
	public void c()
	{
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		d=new ChromeDriver();
	}
	
	public void c(String a)
	{
		d.get(a);
		d.manage().window().maximize();
	}
	
	public void c(String y,String z) throws InterruptedException
	{
		d.findElement(By.name("Name")).sendKeys(y);
		d.findElement(By.name("Email")).sendKeys(z);
		d.findElement(By.id("Form_getForm_action_submitForm")).click();
		Thread.sleep(2000);
		d.close();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		overload x=new overload();
		x.c();
		x.c("https://www.orangehrm.com/orangehrm-30-day-trial/");
		x.c("min", "su");

	}


}

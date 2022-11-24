package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class parameters {
	
WebDriver d;
	
	public void O_c()
	{
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://www.demo.guru99.com/test/newtours/");
		d.manage().window().maximize();
	}
	
	public String details(String n, String m) throws InterruptedException
	{
		d.findElement(By.name("userName")).sendKeys(n);
		d.findElement(By.name("password")).sendKeys(m);
//		d.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		d.close();
		return "yess";
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		parameters a=new parameters();
		a.O_c();
		String b=a.details("min", "su");
		System.out.println(b);
		

	}

}

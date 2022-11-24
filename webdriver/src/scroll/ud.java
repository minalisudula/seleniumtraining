package scroll;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ud {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://knowindia.india.gov.in/");
		d.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("window.scrollBy(0,10000)"," ");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-1000)"," ");
	}

}

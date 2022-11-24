package scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class siv {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://knowindia.india.gov.in/");
		d.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)d;
		WebElement a=d.findElement(By.xpath("//*[@id=\"fontSize\"]/section[3]/span"));
		js.executeAsyncScript("arguments[0].scrollIntoView()", a);

	}

}

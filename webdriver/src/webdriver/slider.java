package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://jqueryui.com/slider/#default");
		d.manage().window().maximize();
		d.switchTo().frame(0);
		WebElement s=d.findElement(By.id("slider"));
		Actions A=new Actions(d);
		int y=s.getLocation().y;
		A.dragAndDropBy(s, y, 500).build().perform();

	}

}

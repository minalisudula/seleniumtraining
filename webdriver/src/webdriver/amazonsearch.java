package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonsearch {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
				
				System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
				ChromeDriver d=new ChromeDriver();
				//opening page
				d.get("https://www.amazon.com");
				//maximizing window
				d.manage().window().maximize();
				//getting the title
				String a=d.getTitle();
				System.out.println(a);
				//getting the current Url
				String b=d.getCurrentUrl();
				System.out.println(b);
				//directing to mail
				d.findElement(By.id("searchDropdownBox")).sendKeys("Deals");
				d.findElement(By.id("twotabsearchtextbox")).sendKeys("laptops");
				d.findElement(By.id("nav-search-submit-button")).click();
				boolean c=d.findElement(By.id("nav-search-submit-button")).isSelected();
				System.out.println(c);
				boolean e=d.findElement(By.id("nav-search-submit-button")).isEnabled();
				System.out.println(e);
				boolean f=d.findElement(By.id("nav-search-submit-button")).isDisplayed();
				System.out.println(f);
				d.navigate().back();
				d.navigate().forward();
				Thread.sleep(3000);
				d.close();

			}

	}

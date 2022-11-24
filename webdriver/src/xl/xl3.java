package xl;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xl3 {
	
	public static void main(String args[]) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		
		d.get("https://demo.guru99.com/test/newtours/");
		d.manage().window().maximize();
		d.getTitle();
		
		List<WebElement> links=d.findElements(By.tagName("a"));
		System.out.println(links.size());
		FileInputStream f=new FileInputStream("C:\\Users\\91949\\Desktop\\minali\\Book4.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Row row = ws.createRow(0);
	    Cell cell = row.createCell(0);
	    
	    cell.setCellType(cell.CELL_TYPE_NUMERIC);
	    cell.setCellValue(links.size());
		
		
		
		
		FileOutputStream f1=new FileOutputStream("C:\\Users\\91949\\Desktop\\minali\\Book4.xlsx");
		wb.write(f1);
		d.close();
	}

}

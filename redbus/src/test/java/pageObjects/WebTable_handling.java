package pageObjects;

import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mongodb.diagnostics.logging.Logger;

public class WebTable_handling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		int r = driver.findElements(By.xpath("//table[@id=\"customers\"]//tbody//tr")).size();
		System.out.println(r);
		
		int c = driver.findElements(By.xpath("//table[@id=\"customers\"]//tbody//tr/th")).size();
		System.out.println(c);
		
		for(int i=2;i<=r;i++) {
			System.out.println(driver.findElement(By.xpath("//table[@id='customers']//tbody//tr["+i+"]//td[3]")).getText());
			for(int j=1;j<=c;j++) {
		System.out.println(driver.findElement(By.xpath("//table[@id='customers']//tbody//tr["+i+"]//td["+j+"]")).getText());
				    	
			System.out.println();
		
		     }
			
}}}

	    
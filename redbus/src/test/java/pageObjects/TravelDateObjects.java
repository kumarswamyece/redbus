package pageObjects;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resuable.ReusableMethods;

public class TravelDateObjects extends ReusableMethods{
	
	//String From= "rajahmundry";
	//String To = "hyderabad";
	
	
	@FindBy(id="src")
	WebElement source;
	
	@FindBy(id="dest")
	WebElement destnaton;
	
	@FindBy(id="date-box")
	WebElement Date;
		
	@FindBy(xpath="//div[@class='returndate input-box ']")
	WebElement return_date;
	
	@FindBy(id="search_butn")
	WebElement search;
	
	@FindBy(xpath="//*[@id=\"rdc-root\"]/div/div[1]/div[2]/div[2]/div/div/div[1]/span")
	List<WebElement> SetDate;
	

	@FindBy(xpath="//button[@class='sc-jTzLTM bfMZDh']")
	WebElement alert;
	
	@FindBy(xpath="(//button[@class='sc-hMqMXs sc-hSdWYo epTHCc'][text()='PROCEED'])[2]")
	WebElement close;

	@FindBy(linkText = ("Singapore to Penang"))
	WebElement scrool;

	
	public TravelDateObjects(WebDriver driver) {

		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}

	public TravelDateObjects travelplan(String From,String To) throws InterruptedException, IOException 
	{
isDisplayed(alert, "alert");
	    click(alert,"cl");
		text(source,From," origin");
	   // WebElement sourse = driver.findElement(By.xpath("(//input[contains(text(),"+inpsrc+")])[1]"));
	    //text(sourse, "Rajahmundry", "test sourse");
		waitTime();
		text(destnaton,To,"destn");
		waitTime();
		//practice session not related to the page object
		/*scrollByElement(scrool, "scrool");
		Thread.sleep(2000);
		DrawBoarder(scrool, "scrool");
		captureScreenshot("scrool");*/
			
   		return this;
	}
	public TravelDateObjects start_date(int day) throws InterruptedException  {
		
		click(Date,"start_date");
		waitTime();
		waitTime();
		//driver.findElement(By.xpath("//div[@class=\"DatePicker__CalendarContainer-sc-1x9sb82-0 bkhtIz\"]//span[text()="+day+"]")).click();
		driver.findElement(By.xpath("//div[@class='DatePicker__MainBlock-sc-1x9sb82-1 gTgSRP']//span[text()="+day+"]")).click();
		return this;                 
	}
	public TravelDateObjects end_date(int day) throws InterruptedException {
	waitTime();
	click(return_date,"retun date");
	driver.findElement(By.xpath("(//div[@class='DatePicker__CalendarContainer-sc-1x9sb82-0 bkhtIz']//span[text()="+day+"])[1]")).click();
	waitTime();
	click(search,"ser");
	isDisplayed(close, "close");
	click(close,"close");
		return this;	
}
	
}
	
	
	
	
		
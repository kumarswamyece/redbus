package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resuable.ReusableMethods;

public class travel_plan_modifications extends ReusableMethods {
	
	@FindBy(xpath="//div[@class='onward-modify-btn g-button clearfix fl']")
    WebElement modify;
	
	@FindBy(xpath="//input[@id=\"src\"]")
    WebElement board_modify;
	
	@FindBy(xpath="//input[@id=\"dest\"]")
    WebElement dest_modify;
	
	@FindBy(xpath="//input[@class='DatePicker__InputElm-sc-1lzvcq8-3 eBmHsT showNow Date']")
    WebElement modify_date;
	
    @FindBy(xpath="//button[text()='SEARCH']")
    WebElement search;
	
	@FindBy(xpath="(//div[@class='DayNavigator__IconBlock-l9u39j-2 csNhGs'])[2]")
    WebElement month_year;
	
	@FindBy(xpath="(//div[@class=\"DayNavigator__IconBlock-l9u39j-2 csNhGs\"])[3]")
    WebElement change_month;
	
	@FindBy(xpath="//span[text()=17]")
    WebElement date;


	
	public travel_plan_modifications(WebDriver driver) {

		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}
	
	public travel_plan_modifications Modify_details(String from1,String to1) {
		
		click(modify,"modify");
		board_modify.clear();
		waitTime();
		text(board_modify,from1,"kkd");
		waitTime();
		dest_modify.clear();
		waitTime();
		text(dest_modify,to1,"hyd");
		waitTime();
		return this;
	}

		public travel_plan_modifications Modify_month() {

    	click(modify_date,"start_date_modified");
    	System.out.println(driver.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-l9u39j-2 csNhGs'])[2]")).getText());
		for(int i=10;i>=1;i--) {
		driver.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-l9u39j-2 csNhGs'])[3]")).click();
		String month_year = driver.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-l9u39j-2 csNhGs'])[2]")).getText();
	    if(month_year.contains("APR 2023")) {
	    	driver.findElement(By.xpath("//span[text()=17]")).click();
	     break;
		}}
	    click(search,"search");
		 return this;
		
        }
        }

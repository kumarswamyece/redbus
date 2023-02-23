package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resuable.ReusableMethods;

public class redrail_PageObjects extends ReusableMethods{

	public redrail_PageObjects(WebDriver driver) {

		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="redRail")
	WebElement rpool;
	
	@FindBy(id="src")
	WebElement from_station;
	
	@FindBy(id="dst")
	WebElement to_station;
	
	@FindBy(xpath="//div[@class='home_date_wrap']")
	WebElement date;
	

	@FindBy(xpath="	//button[@class='search-btn ']")
	WebElement search;
	
	@FindBy(xpath="(//div[@class='display_flex'])[1]")
	WebElement train_search;
	
	@FindBy(xpath="//div[@class='change_stn_text']")
	WebElement changeStation_clic;

	@FindBy(xpath="(//div[@class=\"radio_button_outer false\"])[1]")
	WebElement changeSation;
	
	@FindBy(xpath="	//span[@id=\"www.redbus.in/railways/travellerInfo/forgotusername\"]")
	WebElement forgetPassword;

	@FindBy(xpath="//input[@id=\"13\"]")
	WebElement email;
	
	@FindBy(xpath="//input[@id=\"11\"]")
	WebElement dob;

	@FindBy(xpath="//div[@class=\"get_password_button\"]")
	WebElement submit;
	
	
	@FindBy(xpath="//input[@id=\"1\"]")
	WebElement irctcUsername;
	
	@FindBy(xpath="(//input[@id=\"1\"])[2]")
	WebElement irctcUsernameEntry;
	
	@FindBy(xpath="//div[@class=\"check_irctc_un\"]")
     WebElement checkUser;
	
	@FindBy(xpath="//span[@class=\"icon icon-cross\"]")
    WebElement close;

	

	public redrail_PageObjects redRail_actions() throws InterruptedException {
		driver.navigate().to("https://www.redbus.in");
		windowHandle();
		click(rpool,"Rpool");
		waitTime();
		text(from_station,"Hyderabad - All Stations","hyd");
		Thread.sleep(3000);
		clickAndHold(from_station, "Hyderabad",200, 35);
		text(to_station,"New Delhi - All Stations","chandi");
		Thread.sleep(2000);
		clickAndHold(to_station, "New Delhi - All Stations", 200, 35);
		Thread.sleep(2000);
		alertAccept();
		return this;
		}
	
@FindBy(xpath = "//div[@class='sc-jTzLTM cSXDfm']/div/span/div")
	List<WebElement> date_select;
	
	//@FindBy(xpath = "//div[@class='sc-jTzLTM cSXDfm']/div/span/div/span")
	//List<WebElement> date_select1;
	
		public redrail_PageObjects calender_actions() {
		click(date,"date_click");
		System.out.println("size of the calender" + date_select.size());
		for(int i=1;i<date_select.size()- 1; i++) {
			System.out.println("select date is" + date_select.get(i).getText());
			if(date_select.get(i).getText().equalsIgnoreCase("30"))
			{
				System.out.println("select date is" + date_select.get(i).getText());
				date_select.get(i).click();
				break;			
				}
			waitTime();
			waitTime();

			click(search,"click");
			click(train_search,"train");

			}
return this;
				
		}}

		



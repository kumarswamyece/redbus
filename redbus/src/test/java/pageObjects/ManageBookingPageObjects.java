package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resuable.ReusableMethods;

public class ManageBookingPageObjects extends ReusableMethods  {

	@FindBy(xpath="(//a[@class='D121_options_nav_a'])[3]")
    WebElement cancelticket;
	
	@FindBy(xpath="//input[@name=\"tin\"]")
    WebElement cancelticket_no;
	
	@FindBy(name="mobileno")
    WebElement cancelticket_mobile;
	
	@FindBy(xpath="//div[@class=\"button-comp-lbl bg-color-d84e55\"]")
    WebElement selectPassenger;
	
	@FindBy(xpath="//div[@class=\"icon-down icon ich dib mbh\"]")
    WebElement manageTkt;
	
	@FindBy(xpath="(//span[@class='w-65'])[2]")
    WebElement changeTravelDate;
	
	@FindBy(id="searchTicket")
    WebElement changeTravel_tkt_no;
	
	@FindBy(id="searchPhone")
    WebElement changeTravel_ph_no;
	
	@FindBy(id="ticketSearch")
    WebElement changeTravel_sumit;
	
	@FindBy(name="Tin")
    WebElement PrintTkt_no;
	
	@FindBy(name="mobileno")
    WebElement PrintTkt_ph_no;
	
	@FindBy(xpath="(//span[@class='w-65'])[3]")
    WebElement Print_tkt;
	
//	@FindBy(xpath="//div[@class=\"button-comp-lbl bg-color-d84e55\"]")
//    WebElement selectPassenger;
//	
//	@FindBy(xpath="//div[@class=\"button-comp-lbl bg-color-d84e55\"]")
//    WebElement selectPassenger;
//	
//	@FindBy(xpath="//div[@class=\"button-comp-lbl bg-color-d84e55\"]")
//    WebElement selectPassenger;
//	
//	@FindBy(xpath="//div[@class=\"button-comp-lbl bg-color-d84e55\"]")
//    WebElement selectPassenger;
	
	public ManageBookingPageObjects (WebDriver driver) {

		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}
public ManageBookingPageObjects managebooking(String tkt_no, String mobile_test) 
{
driver.navigate().to("https://www.redbus.in/Cancellation");	
	text(cancelticket_no,"123456","tkt.no");
	text(cancelticket_mobile,"8897709980","ph_no");
	click(selectPassenger,"passenger");
	click(manageTkt ," manageTkt");
	mouseHoverAndClick(changeTravelDate,"Change Travel Date");
	text(changeTravel_tkt_no,"123456","tkt.no");
	text(changeTravel_ph_no,"8897709980","ph_no");
	click(changeTravel_sumit,"changeTravel_sumit");
	click(manageTkt ," manageTkt");

	mouseHoverAndClick(Print_tkt,"showMyTikt");
	text(PrintTkt_no,"123456","tkt.no");
	text(PrintTkt_ph_no,"8897709980","ph_no");
	return this;
	
	
	
	
}

}

package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resuable.ReusableMethods;

public class apsrtc_selection_objects extends ReusableMethods {
	
	@FindBy(xpath="(//div[@class='button'])[1]")
	WebElement buslist_apsrtcdowm;

	@FindBy(xpath="	//i[@class=\"p-left-10 icon icon-up\"]")
	WebElement buslist_apsrtcup;
	
	@FindBy(xpath="//*[@id='22736314']/div/div[2]/div[1]")
	WebElement availability_seats_apsrtc;
	
	@FindBy(xpath="//span[@class=\"g-button d-color fr\"]")
	WebElement ok_got_it;
	
	@FindBy(xpath="//i[@class='icon icon-close']")
	WebElement close;
	 
	@FindBy(xpath="//i[@class='icon-cross']")
	WebElement Seatclose;
	
	
  @FindBy(xpath="(//div[@class='radio-unchecked'])[1]")
	WebElement board_point_radio;
	
	
	@FindBy(xpath="(//span[@class='bpdp-point'][1])[2]")
	WebElement drop_point_select;
	
	@FindBy(xpath="(//div[@class='radio-unchecked'][1])[4]")
	WebElement drop_piont_radio;

	@FindBy(xpath="//button[@id='gotoseat_btn']")
	WebElement view_seats;
	
	@FindBy(id="concession_dropdown")
    WebElement concession;

	@FindBy(xpath="//i[@class='icon-close closepopupbtn']")
    WebElement closeen;
	
	public apsrtc_selection_objects(WebDriver driver) {

		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}

	
	
	
	public apsrtc_selection_objects apsrtc_selection() {
		click(ok_got_it,"alert_close");
		waitTime();
		click(buslist_apsrtcdowm,"listof busses");
		waitTime();
		click(availability_seats_apsrtc,"seat selection");
		//click(close,"alert_close");
		waitTime();
        click(board_point_radio,"board");
		waitTime();
		click(drop_point_select,"drop_select");
		waitTime();
		click(drop_piont_radio,"drop_point_sel");
		waitTime();
        waitTime();
		selectByIndex(concession, 1);
		waitTime();
        click(view_seats,"seats display");
        waitTime();
        click(Seatclose,"seatclose");
       return this;
	
		
				
	
	}
	}
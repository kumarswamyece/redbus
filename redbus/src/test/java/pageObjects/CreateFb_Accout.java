package pageObjects;

import java.util.List;

import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resuable.ReusableMethods;

public class CreateFb_Accout extends ReusableMethods{
	
	@FindBy(name="firstname")
    WebElement first_name;
	
    @FindBy(name="lastname")
    WebElement lastname;
	
	@FindBy(name="reg_email__")
    WebElement email;
	
	@FindBy(name="reg_email_confirmation__")
    WebElement reg_email_confirmation;
	
	
	@FindBy(name="reg_passwd__")
    WebElement password;
	
    @FindBy(xpath="//label[text()='Male']")
    WebElement gender;
	
	@FindBy(name="websubmit")
    WebElement submit;
	
	@FindBy(name="birthday_day")
    WebElement birthday_;
	
	@FindBy(name="birthday_day")
    List <WebElement> birthday;
	
	@FindBy(name="birthday_month")
	List <WebElement> birthmonth;
	
	@FindBy(name="birthday_year")
	List <WebElement> birthday_year;
	
	@FindBy(name="birthday_month")
	WebElement birthmonth_;
	
	@FindBy(name="birthday_year")
	WebElement birthday_year_;
	
	@FindBy(xpath="//span[@class='icon icon-cross close_page_icon']")
	WebElement close;
	
	@FindBy(linkText ="Bus Tickets")
	WebElement Bus_Tickets;

	@FindBy(linkText ="Cancel Ticket")
	WebElement Cancel_Ticket;
	
	
	
	
	public CreateFb_Accout(WebDriver driver) {

		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}
 
public CreateFb_Accout CreateFbAccout(String first_Name,String last_Name,String Email,String pw ) {
	
	
	text(first_name,first_Name,"first_name");
	text(lastname,last_Name,"lastname");
	text(email,Email,"email");
	text(reg_email_confirmation,Email,"re_Email");
	text(password,pw,"password");
	waitTime();
	selectBy(birthday_,"6");
	waitTime();
	selectBy(birthmonth_,"Aug");
	waitTime();
	selectBy(birthday_year_,"1991");
	waitTime();
	click(gender, "gender");
	click(submit, "submit");
	waitTime();
	exceptionalWindowHandle3("Facebook");
	waitTime();
	switchtomain();
	waitTime();
	click(close,"close");
	click(Bus_Tickets, "Bus Tickets");
	waitTime();
	click(Cancel_Ticket, "Cancel_Ticket");
	waitTime();
	return this;
		
}
}

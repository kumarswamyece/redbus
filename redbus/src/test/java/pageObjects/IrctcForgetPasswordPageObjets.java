package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resuable.ReusableMethods;

public class IrctcForgetPasswordPageObjets  extends ReusableMethods  {

	public IrctcForgetPasswordPageObjets(WebDriver driver) {

		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}

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
	
	@FindBy(xpath="//div[@class='check_irctc_un']")
     WebElement checkUser;
	
	@FindBy(xpath="//span[@class=\"icon icon-cross\"]")
    WebElement close;
	
	@FindBy(xpath="//span[text()='Get new password via SMS or E-mail']")
    WebElement GetNewPassword;

	@FindBy(xpath="(//input[@class='undefined input_field'])[4]")
    WebElement mobile_no;
	
	@FindBy(xpath="//div[@class='get_password_button']")
    WebElement GetNewPassword_button;

	public IrctcForgetPasswordPageObjets irctc_forget(String Email, String mobile_test) {
	
	click(forgetPassword,"forgetPw");
	waitTime();
	//text(email,"kumaraswamyece@gmail.com","email");
	text(email, Email, "desired");
	waitTime();
	//windowHandle();
	text(dob,"06-08-1991","dob");
	click(submit,"submit");
	click(irctcUsername,"ir_user");
	waitTime();
	text(irctcUsernameEntry,"kumarakal","irctcuserName");
	waitTime();
	click(checkUser,"check");
	waitTime();
	//click(close,"close");
	waitTime();
	click(GetNewPassword,"pass");
	text(mobile_no,mobile_test,"mobile");
	waitTime();
	click(GetNewPassword_button,"pw");
	waitTime();
	
	return this;
	}
	
}

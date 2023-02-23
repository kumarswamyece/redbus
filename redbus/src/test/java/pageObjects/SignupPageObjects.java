package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resuable.ReusableMethods;

public class SignupPageObjects extends ReusableMethods {
	
	
	
	@FindBy(xpath="//span[@class=\"icon icon-arrow-down down-arrow\"]")
	WebElement signup_down;
	
	@FindBy(xpath="//div[text()='SignUp / Signin']")
    WebElement signup_tag;
	
	@FindBy(xpath="//input[@class='num_input']")  
    WebElement mobile_num;
	
	@FindBy(xpath="//div[@class='recaptcha-checkbox-borderAnimation']")
    WebElement captha;
	
	@FindBy(xpath="//span[@class='no_bold']")
    WebElement entry_otp;
	
	@FindBy(xpath="//img[@class='login_icon']")
    WebElement fb;

	@FindBy(xpath="//iframe[@name='a-zb8uusn8ko0a']")
    WebElement iframe;

	@FindBy(xpath = "//input[@id='email']")
    WebElement email;
	
	@FindBy(name="pass")	
    WebElement password;
	
	@FindBy(name="login")
    WebElement login;
	
	@FindBy(xpath = "//a[@class=\"_42ft _4jy0 _4jy3 _4jy2 selected _51sy\"]")
    WebElement create_nw;
//	
//	@FindBy(xpath = "//input[@id='email']")
//    WebElement email;
//	
//	@FindBy(xpath = "//input[@id='email']")
//    WebElement email;
//	
	
	
	public SignupPageObjects(WebDriver driver) {

		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}
	boolean present = false;


public 	SignupPageObjects Signup(String mobile_test, String pw) throws InterruptedException {
	
	click(signup_down, "sign");
	windowHandle();
	click(signup_tag,"signtag");
	windowHandle();
	waitTime();
	text(mobile_num,"8897709980","mob");
	click(fb, "fb.click");
	windowHandle();
	waitTime();
	text(email,"8897709980","ph.no");
	text(password,"9291325038","pass");
	click(login,"login");
	Thread.sleep(4000);
	click(create_nw,"create");
	return this;
	
}	
}

package pageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Window;
import java.awt.event.InputEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resuable.ReusableMethods;

public class Ryde_Page_Objects extends ReusableMethods {
	
	@FindBy(xpath="//a[@id='rYde']")
	WebElement ryde;
	
	@FindBy(xpath="(//div[@class='GDBwJR5SFp5mWx6dgAIj'])[1]")
	WebElement outstation;
	
	@FindBy(xpath="//div[text()='Round Trip']")
	WebElement round_trip;
	
	@FindBy(xpath="//div[@class='u9ytDRaU2Yko9gstxyQY']")
	WebElement change;
	
	@FindBy(xpath="(//div[@class='Aqd4Y_WIy_AUI4f30cuX'])[2]")
	WebElement TTbus;
	
	@FindBy(xpath="(//input[@class='CSwnlidw0FXxs7YV9qLF'])[3]")
	WebElement pickup_update;
	
	@FindBy(xpath="(//input[@class='CSwnlidw0FXxs7YV9qLF'])[4]")
	WebElement drop_update;
	
	@FindBy(xpath="//div[@id='OutstationMount']")
	WebElement window_handle;
	
	@FindBy(xpath="/html/body/div[1]/div[2]")
	WebElement window_handle1;
	
	@FindBy(xpath="//object[@class='Bk0St1vF8dHt6obq7lwo']")
	WebElement popup;
	


	
	public Ryde_Page_Objects(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}

public  Ryde_Page_Objects ryde(String pick_up, String drop) throws InterruptedException, AWTException {
	
	//click(ryde,"ryde_click");
	//windowHandle();
	waitTime();
	click(outstation,"outstation");
	driver.switchTo().frame(0);
	//exceptionalWindowHandle();
//	waitTime();
//mouseHoverAndClick(round_trip,"round_trip");
//click(round_trip,"round_trip");
//	click(change,"change");
click(TTbus,"ttbus");
//	click(pickup_update,"pickup_update");
//	pickup_update.clear();
//	text(pickup_update,"Rajahmundry,Main Road","rjy");
//	drop_update.clear();
//	text(drop_update,"Hyderabad,Deccan Railway Station","hyd");
return this;
	

	
}}
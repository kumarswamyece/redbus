package Resuable;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Set;
import java.util.TimeZone;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.apache.commons.io.FileUtils;

import com.aventstack.extentreports.Status;

import ActionEngine.BaseClass;

public class ReusableMethods extends BaseClass {
	String ChildWindow = "";
	public static String screenshotfolder = System.getProperty("user.dir") + "/screenshots/";

	public void click(WebElement element, String elementName) {
		try {
			explicitWait().until(ExpectedConditions.visibilityOf(element));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", element);
			System.out.println("sucessfully cliked " + elementName);
			test.pass("sucessfully cliked " + elementName);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("not clicked on " + elementName);
			test.fail("not clicked on " + elementName);
			try {
				test.log(Status.FAIL, "not clicked " +elementName + test.addScreenCaptureFromPath(captureScreenshot(elementName)));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}

	}
	
	
	public void DrawBoarder(WebElement element, String elementName) {
		try {
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].style.border='3px solid red'", element);
			System.out.println("sucessfully DrawBorder");
			test.pass("sucessfully DrawBorder ");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("not able to DrawBorder  " );
			test.fail("not able to DrawBorder " );
					}

	}

//	public void genrateAlert(WebElement element, String message) {
//		try {
//			
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("arguments[0].style.border='3px solid red'", message);
//			System.out.println("sucessfully display alert message");
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("not able to display alert message");
//					}
//
//	}

	
	public void scrollByElement(WebElement element, String elementName) {
		try {
			explicitWait().until(ExpectedConditions.visibilityOf(element));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", element);
			System.out.println("sucessfully scrollIntoView " + elementName);
			test.pass("sucessfully scrollIntoView " + elementName);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("not scrollIntoView " + elementName);
			test.fail("not scrollIntoView " + elementName);
			try {
				test.log(Status.FAIL, "not scrollIntoView " +elementName + test.addScreenCaptureFromPath(captureScreenshot(elementName)));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}

	}

	
	
	

	



		/*	public void selectDate(String dateVal ) {
				// dynamic - date selection
						String monthYearDisplayed = driver.findElement(("monthyear_css")).getText();
		
						
						System.out.println("monthYearDisplayed -"+monthYearDisplayed);
						SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");
						try {
							Date dateToBeSelected = sd.parse(dateVal);
							Date currentDate = new Date();
							String day = new SimpleDateFormat("d").format(dateToBeSelected);
							System.out.println(day);
							String month= new SimpleDateFormat("MMMM").format(dateToBeSelected);
							System.out.println(month);
							String year= new SimpleDateFormat("yyyy").format(dateToBeSelected);
							System.out.println(year);
							String monthYearToBeSelected = month+" "+year;
							System.out.println("monthYearToBeSelected -"+monthYearToBeSelected);
							
							while(!monthYearToBeSelected.equals(monthYearDisplayed)) {
								// click on forward or back icon
								if(dateToBeSelected.compareTo(currentDate) == 1) {//
									//forward icon
									driver.findElement(getObjectLocator("calendar_forward_xpath")).click();
								}else if(dateToBeSelected.compareTo(currentDate) == -1){
									// back icon
									driver.findElement(getObjectLocator("calendar_back_xpath")).click();
								}
								 monthYearDisplayed = driver.findElement(getObjectLocator("monthyear_css")).getText();
							     System.out.println("monthYearDisplayed -"+monthYearDisplayed);
							     
							}
							
							 //day
						     driver.findElement(By.xpath("//a[text()='"+day+"']")).click();

						}catch (Exception e) {
							
							e.printStackTrace();
						}
						
			}*/
			




	
	public void isDisplayed(WebElement element, String elementName) {
		boolean displayElement;

		try {
			explicitWait().until(ExpectedConditions.visibilityOf(element));
			displayElement = element.isDisplayed();
			System.out.println("successfully displayed " + elementName);
			test.pass("successfully displayed " + elementName);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("not displayed " + elementName);

			try {
				test.log(Status.FAIL, "not clicked " + elementName+ test.addScreenCaptureFromPath(captureScreenshot(elementName)));
			} catch (IOException e1) {
			}

		}
	}

	public void isenabled(WebElement element, String elementName) {
		boolean displayElement;

		try {
			explicitWait().until(ExpectedConditions.visibilityOf(element));
			displayElement = element.isEnabled();
			System.out.println("Element is enabled " + elementName);
			test.pass("Element is enabled " + elementName);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("not enabled " + elementName);

			try {
				test.log(Status.FAIL, "not enabled " + elementName+ test.addScreenCaptureFromPath(captureScreenshot(elementName)));
			} catch (IOException e1) {
			}

		}
	}
	
	public void isselected(WebElement element, String elementName) {
		boolean displayElement;

		try {
			explicitWait().until(ExpectedConditions.visibilityOf(element));
			displayElement = element.isSelected();
			System.out.println("Element is selected " + elementName);
			test.pass("Element is selected " + elementName);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("not selected " + elementName);

			try {
				test.log(Status.FAIL, "not selected " + elementName+ test.addScreenCaptureFromPath(captureScreenshot(elementName)));
			} catch (IOException e1) {
			}

		}
	}


	public void text(WebElement element, String textInput, String elementName) {
		try {
			explicitWait().until(ExpectedConditions.visibilityOf(element));
			element.sendKeys(textInput);
			System.out.println("successfully entered " + elementName);
			test.pass("successfully entered " + elementName);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("data not entered " + elementName);
			try {
				test.log(Status.FAIL, "not clicked " +elementName + test.addScreenCaptureFromPath(captureScreenshot(elementName)));
			} catch (IOException e1) {
			}
		}
	}

	public String captureScreenshot(String locatorName) throws IOException {
		String filepath = screenshotfolder + locatorName + ".png";
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(filepath));
		return filepath;
	}
	
	public void mouseHover(WebElement element, String elementName) {
		try {
		explicitWait().until(ExpectedConditions.visibilityOf(element));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();

		System.out.println("sucessfully hovered on the " + elementName);
		test.pass("sucessfully hovered on the " + elementName);

		// test.pass("sucessfully clicked on " + elementName);
		} catch (Exception e) {
		System.out.println("unable to hover" + elementName);
		test.fail("unable to hover" + elementName);
		e.printStackTrace();
		Assert.fail();
	

		}
		}

		public void selectByvalue(WebElement element, String elementName) {
		try {
		explicitWait().until(ExpectedConditions.visibilityOf(element));
		Select select = new Select(element);
		select.selectByValue(elementName);

		System.out.println("sucessfully selected the value " + elementName);
		test.pass("sucessfully selected the value " + elementName);

		// test.pass("sucessfully clicked on " + elementName);
		} catch (Exception e) {
		System.out.println("unable to select the value " + elementName);
		test.fail("unable to select the value " + elementName);
		e.printStackTrace();
		Assert.fail();

		}
		}


		public void selectBy(WebElement element, String elementName) {
		try {
		explicitWait().until(ExpectedConditions.visibilityOf(element));
		Select select = new Select(element);
		select.selectByVisibleText(elementName);

		System.out.println("sucessfully selected the value " + elementName);
		test.pass("sucessfully selected the value " + elementName);

		// test.pass("sucessfully clicked on " + elementName);
		} catch (Exception e) {
		System.out.println("unable to select the value " + elementName);
		test.fail("unable to select the value " + elementName);
		e.printStackTrace();
		Assert.fail();

		}
		}

		public void selectByIndex(WebElement element, int x) {
		try {
		explicitWait().until(ExpectedConditions.visibilityOf(element));
		Select select = new Select(element);
		select.selectByIndex(x);

		System.out.println("sucessfully selected the value " + x);
		test.pass("sucessfully selected the value " + x);

		// test.pass("sucessfully clicked on " + elementName);
		} catch (Exception e) {
		System.out.println("unable to select the value " + x);
		test.fail("unable to select the value " + x);
		e.printStackTrace();
		Assert.fail();

		}
		}

	
		public void waitTime() {
			try {
			Thread.sleep(2000);
			} catch (Exception e) {
			}
			}
		
		public void mouseHoverAndClick(WebElement element, String elementName) {
			try {
				explicitWait().until(ExpectedConditions.visibilityOf(element));
				Actions actions = new Actions(driver);
				actions.moveToElement(element);
				actions.click().build().perform();
				
				System.out.println("sucessfully hovered on the " + elementName);
				test.pass("sucessfully hovered on the " + elementName);

				// test.pass("sucessfully clicked on " + elementName);
			} catch (Exception e) {
				System.out.println("unable to hover" + elementName);
				test.fail("unable to hover" + elementName);
				e.printStackTrace();
				Assert.fail();

			}
		}
		public void mouseRightClick(WebElement element, String elementName) {
			try {
				explicitWait().until(ExpectedConditions.visibilityOf(element));
				Actions actions = new Actions(driver);
				actions.contextClick(element).build().perform();
				
				System.out.println("sucessfully right on the " + elementName);
				test.pass("sucessfully hovered on the " + elementName);

				// test.pass("sucessfully clicked on " + elementName);
			} catch (Exception e) {
				System.out.println("unable to right click" + elementName);
				test.fail("unable to hover" + elementName);
				e.printStackTrace();
				Assert.fail();

			}
		}


		public void exceptionalWindowHandle() {
			for (String handle : driver.getWindowHandles()) {
				try {
					driver.switchTo().window(handle);
				} catch (NoSuchWindowException e) {
					System.out.println("an exceptional case");}}
		}
			public void exceptionalWindowHandle1() {
				for (String handle : driver.getWindowHandles()) {
					try {
					String wind = driver.switchTo().window(handle).getTitle();
					System.out.println("windowid"+wind);
					} catch (NoSuchWindowException e) {
						System.out.println("an exceptional case");}}
							
				} 
			
			public void exceptionalWindowHandle2(String title) {
				for (String handle : driver.getWindowHandles()) {
					String wind = driver.switchTo().window(handle).getTitle();
					if(wind.equalsIgnoreCase(title)) {
						driver.close();
						}
					}
				} 
			public void exceptionalWindowHandle3(String title) {
				for (String handle : driver.getWindowHandles()) {
					String wind = driver.switchTo().window(handle).getTitle();
					if(wind.contains(title)) {
						driver.close();
						}
					}
			
			}
			
		
		public void switchtomain()
		{
			for (String handle : driver.getWindowHandles()) {

			driver.switchTo().window(handle);
			
		}

}
		public void alertAccept() {
			boolean present = false;
			try {
				Alert alert = driver.switchTo().alert();
				present = true;
				System.out.println(alert.getText());
				test.pass("The alert is- " + alert.getText());
				alert.accept();

			} catch (NoAlertPresentException ex) {
//				ex.printStackTrace();
				System.out.println(present);
			}
	
		}
		public void alertDismiss() {
			boolean present = false;
			try {
				Alert alert = driver.switchTo().alert();
				present = true;
				System.out.println(alert.getText());
				test.pass("The alert is- " + alert.getText());
				alert.dismiss();

			} catch (NoAlertPresentException ex) {
//				ex.printStackTrace();
				System.out.println(present);
			}
	
		}

		public static String getCurrentDay() {
			// Create a Calendar Object Calendar
			Calendar calendar = Calendar.getInstance(TimeZone.getDefault()); // Get Current Day as a number
			int todayInt = calendar.get(Calendar.DAY_OF_YEAR);
			System.out.println("Today Int: " + todayInt + "\n");
			// Integer to String Conversion
			String todayStr = Integer.toString(todayInt);
			// System.out.println("Today Str: " + todayStr + "\n");
			return todayStr;
		}
		public void verifyText(String actualResult, String ExpectedResult) {

			try {
				if (actualResult.equalsIgnoreCase(ExpectedResult)) {

					System.out.println("text verified successfully " + actualResult + " with " + ExpectedResult);
					test.pass("text verified successfully " + actualResult + " with " + ExpectedResult);
				}
			} catch (Exception e) {
				System.out.println("text not verified" + actualResult + " with " + ExpectedResult);
				try {
					test.log(Status.FAIL, "text not verified\" +actualResult +\" with \" +ExpectedResult"
							+ test.addScreenCaptureFromPath(captureScreenshot(actualResult)));
				} catch (IOException e1) {
				}
				e.printStackTrace();
				Assert.fail();
			}
		}
		public String mainwindow() {
			// Get handles of the windows
			String mainWindowHandle = driver.getWindowHandle();

			return mainWindowHandle;
		}

		public void windowHandle() {
			waitTime();
			Set<String> allWindowHandles = driver.getWindowHandles();

			Iterator<String> iterator = allWindowHandles.iterator();
			// Here we will check if child window has other child windows and will fetch the
			// heading of the child window
			while (iterator.hasNext()) {

				ChildWindow = iterator.next();
				 System.out.println("Main Window" + mainwindow());
				System.out.println("child Window" + ChildWindow);
				// System.out.println("child Window" +
				// driver.switchTo().window(ChildWindow).getTitle();
				if (!mainwindow().equalsIgnoreCase(ChildWindow)) {
					System.out.println("@@@@@@@@@@@@@@@" + ChildWindow);
					driver.switchTo().window(ChildWindow);
					//driver.switchTo().window(allWindowHandles);
				}
			}
			}
			
			public void clickwithoutJS(WebElement element, String elementName) {
				try {
					// explicitWait().until(ExpectedConditions.visibilityOf(element));
					element.click();
					System.out.println("sucessfully clicked " + elementName);
					test.pass("sucessfully clicked " + elementName);
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("not clicked on " + elementName);
					test.fail("not clicked on " + elementName);
					try {
						test.log(Status.FAIL,
								"not clicked " + elementName + test.addScreenCaptureFromPath(captureScreenshot(elementName)));
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}


 public void clickAndHold(WebElement element, String elementName,int x,int y) {
	try {
		explicitWait().until(ExpectedConditions.visibilityOf(element));
		Actions actions = new Actions(driver);
		actions.moveToElement(element,x,y);
		actions.clickAndHold().moveByOffset(x,y);
		Thread.sleep(2000);
		actions.release().click().perform();
		System.out.println("sucessfully move_offset on the " + elementName);
		test.pass("sucessfully hovered on the " + elementName);

		// test.pass("sucessfully clicked on " + elementName);
	} catch (Exception e) {
		System.out.println("unable move_offset to hover" + elementName);
		test.fail("unable to hover" + elementName);
		e.printStackTrace();
		Assert.fail();

	}
}
 public void MouseShift(WebElement element, String elementName,int x,int y) {
	try {
		explicitWait().until(ExpectedConditions.visibilityOf(element));
		Actions actions = new Actions(driver);
		actions.moveToElement(element,x,y);
		actions.clickAndHold().moveByOffset(x,y);
		Thread.sleep(2000);
		actions.release().click().perform();
		System.out.println("sucessfully move_offset on the " + elementName);
		test.pass("sucessfully hovered on the " + elementName);

		// test.pass("sucessfully clicked on " + elementName);
	} catch (Exception e) {
		System.out.println("unable move_offset to hover" + elementName);
		test.fail("unable to hover" + elementName);
		e.printStackTrace();
		Assert.fail();

	}
}}
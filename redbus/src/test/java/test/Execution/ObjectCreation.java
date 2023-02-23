package test.Execution;

import org.testng.annotations.BeforeClass;

import ActionEngine.ReadExcelData;
import pageObjects.CreateFb_Accout;
import pageObjects.IrctcForgetPasswordPageObjets;
import pageObjects.ManageBookingPageObjects;
import pageObjects.Ryde_Page_Objects;
import pageObjects.SignupPageObjects;
import pageObjects.TravelDateObjects;
import pageObjects.apsrtc_selection_objects;
import pageObjects.redrail_PageObjects;
import pageObjects.travel_plan_modifications;



public class ObjectCreation extends ReadExcelData {
	protected TravelDateObjects trd;
	protected apsrtc_selection_objects apsrtc;
	protected travel_plan_modifications tra_modi;
	protected Ryde_Page_Objects Ryde;
	protected redrail_PageObjects redRail;
	protected IrctcForgetPasswordPageObjets irctc_forget;
	protected SignupPageObjects signup;
	protected ManageBookingPageObjects manage;
    protected CreateFb_Accout create_fb;
	@BeforeClass
	public void beforeClass() {
		
   trd = new TravelDateObjects(driver);
   apsrtc  = new  apsrtc_selection_objects(driver);
   tra_modi= new travel_plan_modifications(driver);
   Ryde = new Ryde_Page_Objects(driver);
   redRail= new  redrail_PageObjects(driver);
   irctc_forget = new IrctcForgetPasswordPageObjets(driver);
   signup=new SignupPageObjects(driver);
   manage = new ManageBookingPageObjects(driver);
   create_fb = new CreateFb_Accout(driver);
	}

}

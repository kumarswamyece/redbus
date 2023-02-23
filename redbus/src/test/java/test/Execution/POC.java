package test.Execution;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;



public class POC extends ObjectCreation {

				
	@Test(dataProvider = "excel")
	public void TravelPageObjects(String pick_up,String drop, String From, String To,String from1,String to1,String Email, String mobile_test,String pw,String tkt_no,String first_Name,String last_Name) throws InterruptedException, IOException {
		System.out.println("travel plan");
		test = extent.createTest("TravelModifications");
		trd.travelplan(From, To).start_date(26).end_date(29);
	    tra_modi.Modify_details(from1,to1).Modify_month();
			}
	
	@Test(dataProvider = "excel")
	public void apsrtcSelection(String pick_up,String drop, String From, String To,String from1,String to1,String Email, String mobile_test,String pw,String tkt_no,String first_Name,String last_Name) throws InterruptedException {
		System.out.println("travel plan");
		test = extent.createTest("apsrtcSelection");
		//trd.travelplan(From,To).start_date(26).end_date(29);
		apsrtc.apsrtc_selection();
		
		}

	@Ignore
	@Test(dataProvider = "excel")
	public void manage_booking(String  pick_up,String drop, String From, String To,String from1,String to1,String Email, String mobile_test,String pw,String tkt_no,String first_Name,String last_Name) throws InterruptedException {
		System.out.println("travel plan");
		test = extent.createTest("travel_endDate");
		//trd.travelplan(From, To).start_date(26).end_date(29);
		manage.managebooking(tkt_no,mobile_test);
	
		}	

	@Ignore
	@Test(dataProvider = "excel")
	public void ryde_bus_operations(String pick_up,String drop, String From, String To,String from1,String to1,String Email, String mobile_test,String pw,String tkt_no,String first_Name,String last_Name) throws InterruptedException, AWTException{
		System.out.println("travel plan");
		test = extent.createTest("ryde_bus_operations");
		//trd.travelplan(From, To).start_date(26).end_date(29);	
		Ryde.ryde(pick_up, drop);

	}
	@Ignore
	@Test(dataProvider = "excel")
	public void create_fb(String pick_up,String drop, String From, String To,String from1,String to1,String Email, String mobile_test,String pw,String tkt_no,String first_Name,String last_Name) throws InterruptedException{
		System.out.println("travel plan");
		test = extent.createTest("create_fb");
		//trd.travelplan(From, To).start_date(26).end_date(29);
		redRail.redRail_actions().calender_actions();
		irctc_forget.irctc_forget(Email,mobile_test);
		signup.Signup(mobile_test,pw);
		create_fb.CreateFbAccout(first_Name,last_Name,Email,pw );
				
	}	
	@Ignore
	@Test(dataProvider = "excel")
	public void signup_createAcct(String pick_up,String drop, String From, String To,String from1,String to1,String Email, String mobile_test,String pw,String tkt_no,String first_Name,String last_Name) throws InterruptedException {
		System.out.println("travel plan");
		test = extent.createTest("signup_createAcct");
		//trd.travelplan(From, To).start_date(26).end_date(29);
    	manage.managebooking(tkt_no,mobile_test);
	}
	}
	

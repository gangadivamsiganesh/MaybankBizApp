package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class AddFavSuccessfulPage extends BaseTest{

	@iOSXCUITFindBy(id = "customInfo_0_Sent For Approval")
	@AndroidFindBy(accessibility  = "customInfo_0_Sent For Approval")
	private MobileElement SentForApproval_lbl;
	
	@iOSXCUITFindBy(id = "customInfo_Done_txt")
	@AndroidFindBy(accessibility  = "customInfo_Done_txt")
	private MobileElement done_btn;
	
	@iOSXCUITFindBy(id = "header_icon_crossBlack_img")
	@AndroidFindBy(accessibility  = "header_icon_crossBlack_img")
	private MobileElement cross_btn;
	
	public Boolean verifyAddFavSuccesssfulPageDisplayed() {
		Boolean value=pageDisplayed(SentForApproval_lbl,"Sent For Approval ");
		return value;
	}
	
	public PaymentsDashboardPage clickDoneButton() throws InterruptedException{
		//verticalSwipeTillElementDisplayed(confirm_btn,"Calender ");
		click(done_btn,"Done Button on succesfull page ");
		return new PaymentsDashboardPage();
	}	
	
}

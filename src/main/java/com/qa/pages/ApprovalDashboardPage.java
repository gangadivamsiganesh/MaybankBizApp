package com.qa.pages;

import org.testng.Assert;

import com.qa.BaseTest;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ApprovalDashboardPage extends BaseTest

{
	
	@iOSXCUITFindBy(id = "cardList_Approvals_txt")
	@AndroidFindBy(accessibility = "cardList_Approvals_txt")
	private MobileElement approval_icon;
	
	
	@iOSXCUITFindBy(id = "pageHeader_left_arrowBlack_img")
	@AndroidFindBy(accessibility = "pageHeader_left_arrowBlack_img")
	private MobileElement backarrow_btn;
	
	@iOSXCUITFindBy(id = "pageHeader_right_logout_img")
	@AndroidFindBy(accessibility = "pageHeader_right_logout_img")
	private MobileElement logout_btn;
	
	@iOSXCUITFindBy(id = "cardList_Successful_txt")
	@AndroidFindBy(accessibility = "cardList_Successful_txt")
	private MobileElement successful_icon;
	
	@iOSXCUITFindBy(id = "cardList_Failed_txt")
	@AndroidFindBy(accessibility = "cardList_Failed_txt")
	private MobileElement failedtab_icon;
	
	@iOSXCUITFindBy(id = "pageHeader_Approvals_txt")
	@AndroidFindBy(accessibility = "pageHeader_Approvals_txt")
	private MobileElement approvals_lbl;
	
	@iOSXCUITFindBy(id = "button_Pending Approval_txt")
	@AndroidFindBy(accessibility = "button_Pending Approval_txt")
	private MobileElement pendingapprovals_lbl;
	
	@iOSXCUITFindBy(id = "//*[@text()='Filter']")
	@AndroidFindBy (uiAutomator = "new UiSelector().text(\"Filter\")")
	private MobileElement filter_btn;

	@iOSXCUITFindBy(id = "list_item_0_biller_name")
	@AndroidFindBy(accessibility = "list_item_0_biller_name")
	private MobileElement billername_lbl;
	
	@iOSXCUITFindBy(id = "list_item_0_amount")
	@AndroidFindBy(accessibility = "list_item_0_amount")
	private MobileElement amount_lbl;
	
	@iOSXCUITFindBy(id = "list_item_0_type_date")
	@AndroidFindBy(accessibility = "list_item_0_type_date")
	private MobileElement trnsctype_lbl;
	
	
	@iOSXCUITFindBy(id = "button_Multi-Select_txt")
	@AndroidFindBy(accessibility = "button_Multi-Select_txt")
	private MobileElement multiselect_btn;
	
	
	@iOSXCUITFindBy(id = "list_item_0_forward_arrow")
	@AndroidFindBy(accessibility = "list_item_0_forward_arrow")
	private MobileElement detailsarrow_btn ;
	
	
	
	public Boolean verifyApprovalDashboardisplayed() {
		Boolean value=pageDisplayed(approvals_lbl,"Approval Dashboard is displayed");
		return value;
		}
	
		public BankingDashboardPage clickBusinessAccountCard(){
			click(backarrow_btn,"Back Arrow Button");
			return new BankingDashboardPage();
		}
	
		public ReviewDetailsPage clickOnRecord(){
				click(billername_lbl,"Review Details page displayed ");
				return new ReviewDetailsPage();
		}
		
		public ApprovalDashboardPage clickOnSuccessIcon() 
		{
			click(successful_icon);
			return this;
			
		}
		public ApprovalDashboardPage clickOnFailedIcon() 
		{
			click(failedtab_icon);
			return this;
			
		}
		
		public ApprovalFilterPage clickOnFilter(){
			click(filter_btn,"Filter page displayed ");
			return new ApprovalFilterPage();
	}
		
	
		
		
		
	}
		
	
	
	
	
	
	
	
	
	


package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ApprovalFilterPage extends BaseTest
{

	@iOSXCUITFindBy(id = "filterOptions_back_arrow_img")
	@AndroidFindBy(accessibility = "filterOptions_back_arrow_img")
	private MobileElement backarrow_icon;
	
	
	@iOSXCUITFindBy(id = "FilterList_Options_Header")
	@AndroidFindBy(accessibility = "FilterList_Options_Header")
	private MobileElement filterpage_lbl;
	
	@iOSXCUITFindBy(id = "filterOptions_Apply Filter_txt")
	@AndroidFindBy(accessibility = "filterOptions_Apply Filter_txt")
	private MobileElement applyfilter_btn;

	
	@iOSXCUITFindBy(id = "filterOptions_View_value")
	@AndroidFindBy(accessibility = "filterOptions_View_value")
	private MobileElement viewfilter_btn;
	
	@iOSXCUITFindBy(id = "filterOptions_Sort By_value")
	@AndroidFindBy(accessibility = "filterOptions_Sort By_value")
	private MobileElement sortby_btn;
	
	
	@iOSXCUITFindBy(id = "Payments_txt")
	@AndroidFindBy(accessibility = "Payments_txt")
	private MobileElement payments_button;
	
	
	@iOSXCUITFindBy(id = "Transfers_txt")
    @AndroidFindBy(accessibility = "Transfers_txt")
	private MobileElement transfers_button;
   
	
	@iOSXCUITFindBy(id = "Latest_txt")
    @AndroidFindBy(accessibility = "Latest_txt")
	private MobileElement latest_button;
	

	public ApprovalFilterPage clickviewFilterbtn() 
	{
		click(viewfilter_btn);
		return this;
		
	}
	public ApprovalFilterPage clickonPayments() 
	{
		click(payments_button);
		return this;
		
	}
	public ApprovalFilterPage clickonTransfers() 
	{
		click(transfers_button);
		return this;
		
	}
	public ApprovalFilterPage sortBybtn() 
	{
		click(sortby_btn);
		return this;
		
	}
	public ApprovalFilterPage clickonLatest() 
	{
		click(latest_button);
		return this;
		
	}
	public ApprovalDashboardPage clickonApplyFilter() 
	{
		click(applyfilter_btn,"ApplyFilter Button");
		return new ApprovalDashboardPage();
		
	}
	
	
	
	
	
}

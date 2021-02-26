package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class NotificationPage extends BaseTest{
	
	@iOSXCUITFindBy(id = "toggleWithCheckbox_Immediate_toggleBtn")
	@AndroidFindBy(accessibility = "toggleWithCheckbox_Immediate_toggleBtn")
	private MobileElement immediate_toggle;
	
	@iOSXCUITFindBy(id = "toggleWithCheckbox_Immediate_txt")
	@AndroidFindBy(accessibility = "toggleWithCheckbox_Immediate_txt")
	private MobileElement immediate_lbl;
	
	@iOSXCUITFindBy(id = "toggleWithCheckbox_Set a time of the day_toggleBtn")
	@AndroidFindBy(accessibility = "toggleWithCheckbox_Set a time of the day_toggleBtn")
	private MobileElement setATime_toggle;	
	
	@iOSXCUITFindBy(id = "toggleWithCheckbox_1_Set a time of the day")
	@AndroidFindBy(accessibility = "toggleWithCheckbox_1_Set a time of the day")
	private MobileElement setATime_lbl;	
	
	@iOSXCUITFindBy(id = "toggleWithCheckbox_1_err_msg")
	@AndroidFindBy(accessibility = "toggleWithCheckbox_1_err_msg")
	private MobileElement error_msg;	

	@iOSXCUITFindBy(id = "toggleWithCheckbox_10:00_img")
	@AndroidFindBy(accessibility = "toggleWithCheckbox_10:00_img")
	private MobileElement time10_chkbx;	
	
	@iOSXCUITFindBy(id = "toggleWithCheckbox_15:00_img")
	@AndroidFindBy(accessibility = "toggleWithCheckbox_15:00_img")
	private MobileElement time15_chkbx;	
	
	@iOSXCUITFindBy(id = "toggleWithCheckbox_17:00_img")
	@AndroidFindBy(accessibility = "toggleWithCheckbox_17:00_img")
	private MobileElement time17_chkbx;	
	
	@iOSXCUITFindBy(id = "toggleWithCheckbox_20:00_img")
	@AndroidFindBy(accessibility = "toggleWithCheckbox_20:00_img")
	private MobileElement time20_chkbx;	
	
	@iOSXCUITFindBy(id = "toggleWithCheckbox_1_10:00")
	@AndroidFindBy(accessibility = "toggleWithCheckbox_1_10:00")
	private MobileElement time10_lbl;	
	
	@iOSXCUITFindBy(id = "toggleWithCheckbox_1_15:00")
	@AndroidFindBy(accessibility = "toggleWithCheckbox_1_15:00")
	private MobileElement time15_lbl;	
	
	@iOSXCUITFindBy(id = "toggleWithCheckbox_1_17:00")
	@AndroidFindBy(accessibility = "toggleWithCheckbox_1_17:00")
	private MobileElement time17_lbl;	
	
	@iOSXCUITFindBy(id = "toggleWithCheckbox_1_20:00")
	@AndroidFindBy(accessibility = "toggleWithCheckbox_1_20:00")
	private MobileElement time20_lbl;	
	
	@iOSXCUITFindBy(id = "pageTitle_Notifications")
	@AndroidFindBy(accessibility = "pageTitle_Notifications")
	private MobileElement notificationsTitle_lbl  ;	
	
	@iOSXCUITFindBy(id = "button_Done_txt")
	@AndroidFindBy(accessibility = "button_Done_txt")
	private MobileElement done_btn;	
	
	@iOSXCUITFindBy(id = "button_1_cta_Confirm")
	@AndroidFindBy(accessibility = "button_1_cta_Confirm")
	//private MobileElement confirm_btn;	
	
	@iOSXCUITFindBy(id = "header_icon_crossBlack_img")
	@AndroidFindBy(accessibility = "header_icon_crossBlack_img")
	private MobileElement cross_btn;	
	
	
	public Boolean verifyNotificationPageDisplayed() {
		Boolean value=pageDisplayed(notificationsTitle_lbl,"Notification Page");
		return value;
	}


	public Boolean verifyImmediateToggleDisplayed() {
		Boolean value=elementDisplayed(immediate_toggle,"Immediate Notification Toggle button");
		return value;
	}
	
	public Boolean verifySetATimeToggleDisplayed() {
		Boolean value=elementDisplayed(setATime_toggle,"Immediate Notification Toggle button");
		return value;
	}

	
	public String getImmediateToggleTxt() {
		String text=getText(immediate_lbl, "Immediate Toggle value is");
		return text;
	}
	
	public String getSetATimeToggleTxt() {
		String text=getText(setATime_lbl, "Set a Time Toggle value is");
		return text;
	}
	
	public Boolean verifyTime10CheckboxDisplayed() {
		Boolean value=elementDisplayed(time10_chkbx,"Time 10:00 checkbox");
		return value;
	}
	
	public Boolean verifyTime15CheckboxDisplayed() {
		Boolean value=elementDisplayed(time15_chkbx,"Time 15:00 checkbox");
		return value;
	}
	
	public Boolean verifyTime17CheckboxDisplayed() {
		Boolean value=elementDisplayed(time17_chkbx,"Time 17:00 checkbox");
		return value;
	}
	
	public Boolean verifyTime20CheckboxDisplayed() {
		Boolean value=elementDisplayed(time20_chkbx,"Time 20:00 checkbox");
		return value;
	}
	
	
	public String getErrTxt() {
		String text=getText(error_msg, "Error message is");
		return text;
	}
	
	
	public NotificationPage clickSetATime_toggle(){
		click(setATime_toggle,"SetATime Toggle");
		return this;
	}
	
	public NotificationPage clickImmediate_toggle(){
		click(immediate_toggle,"Immediate Notification Toggle");
		return this;
	}
	
	
	public NotificationPage clickTime10ckkbox() {
		click(time10_chkbx,"Time CheckBox");
		return this;
	}
	
	public OtpPage clickDone_btn(){
		click(done_btn,"Done Button");
		return new OtpPage();
	}
	public Boolean verifyDoneButtonDisplayed() {
		Boolean value=elementDisplayed(done_btn,"Done Button");
		return value;
	}
	
	public Boolean Time10CheckboxDisplayed() {
		Boolean value=elementDisplayedWithOutError(time10_chkbx);
		return value;
	}


}

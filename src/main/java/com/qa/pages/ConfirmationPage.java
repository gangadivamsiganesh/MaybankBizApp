package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ConfirmationPage extends BaseTest {
	
	@iOSXCUITFindBy(id = "info_0_info_msg")
	@AndroidFindBy(accessibility = "info_0_info_msg")
	private MobileElement confirmationMsg_txt;
	
	@iOSXCUITFindBy(id = "info_0_info_desc")
	@AndroidFindBy(accessibility = "info_0_info_desc")
	private MobileElement confirmationMsgDesc_txt;
	
	@iOSXCUITFindBy(id = "info_Back To Settings_txt")
	@AndroidFindBy(accessibility = "info_Back To Settings_txt")
	private MobileElement backToSettings_btn;
	
	@iOSXCUITFindBy(id = "header_icon_crossBlack_img")
	@AndroidFindBy(accessibility = "header_icon_crossBlack_img")
	private MobileElement cross_btn;
	
	public String getSuccessfullMsg() {
		elementDisplayed(confirmationMsg_txt,"Message");
		String msg=getText(confirmationMsg_txt,"ConfimatiomMsg");
		return msg;
	}
	
	public String getSuccessfullMsgDesc() {
		String msg=getText(confirmationMsgDesc_txt,"ConfimatiomMsg");
		return msg;
	}
	
	public SettingsPage clickBackToSettingsButton() {
		click(backToSettings_btn,"Back To Settings Button");
		return new SettingsPage();
	}
	
	public SettingsPage clickCrossbutton() {
		click(cross_btn,"Cross Button ");
		return new SettingsPage();
	}
	

}

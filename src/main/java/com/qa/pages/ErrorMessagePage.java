package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ErrorMessagePage extends BaseTest {
	
	@iOSXCUITFindBy(id = "button_error_txt")
	@AndroidFindBy(accessibility ="button_error_txt")
	private MobileElement errorMsg_lbl;
	
	@iOSXCUITFindBy(id = "button_desc_txt")
	@AndroidFindBy(accessibility ="button_desc_txt")
	private MobileElement errorMsgDesc_lbl;
	
	@iOSXCUITFindBy(id = "button_Go To Settings_txt")
	@AndroidFindBy(accessibility ="button_Go To Settings_txt")
	private MobileElement goToSettings_btn;
	
	@iOSXCUITFindBy(id = "header_icon_crossBlack_img")
	@AndroidFindBy(accessibility ="header_icon_crossBlack_img")
	private MobileElement cross_btn;
	
	public String getErrorMessage() {
		String text=getText(errorMsg_lbl, "Error Message is ");
		return text;
	}
	
	public String getErrorMsgDesc() {
		String text=getText(errorMsgDesc_lbl, "Error Message is ");
		return text;
	}
	
	public Boolean goToSettingsButtonDisplayed() {
		Boolean value=elementDisplayed(goToSettings_btn,"Go to settings button ");
		return value;
	}
	
	public Boolean crossButtonDisplayed() {
		Boolean value=elementDisplayed(cross_btn,"Cross button ");
		return value;
	}
	
	
	public SecurityPage clickCrossButton() {
		click(cross_btn,"Cross Button");
		return new SecurityPage();
	}

}

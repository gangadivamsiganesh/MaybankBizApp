package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class LogoutPage extends BaseTest{
	@iOSXCUITFindBy(id = "list_header_txt")
	@AndroidFindBy(accessibility = "list_header_txt")
	//@AndroidFindBy(uiAutomator = "new UiSelector().description(\"introScreen_0_Login to M2U Biz, \")")
	private MobileElement logoutSuccessful_lbl;
	
	@iOSXCUITFindBy(id = "list_0_Back to Login")
	@AndroidFindBy(accessibility = "list_0_Back to Login")
	private MobileElement backToLogin_btn;
	
	@iOSXCUITFindBy(id = "pageHeader_header_img")
	@AndroidFindBy(accessibility = "pageHeader_header_img")
	private MobileElement profile_img;

	
	public String getLogoutMsg() {
		String text=getText(logoutSuccessful_lbl,"Logout successful message");
		return text;
	}
	
	public LoginPage clickBackToLogin() {
		click(backToLogin_btn,"Back to Login Button");
		return new LoginPage();
	}
}

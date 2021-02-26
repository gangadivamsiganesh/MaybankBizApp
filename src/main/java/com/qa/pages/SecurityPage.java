package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class SecurityPage extends BaseTest{
	
	@iOSXCUITFindBy(id = "pageTitle_Security")
	@AndroidFindBy(accessibility ="pageTitle_Security")
	private MobileElement securityPageTitle_lbl;
	
	@iOSXCUITFindBy(id = "header_icon_crossBlack_img")
	@AndroidFindBy(accessibility ="header_icon_crossBlack_img")
	private MobileElement cross_btn;
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Password\"`]")
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Password\")")
	private MobileElement changePassword_btn;
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Security Phrase\"`]")
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Security Phrase\")")
	private MobileElement securityPhrase_btn;
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Security Image\"`]")
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Security Image\")")
	private MobileElement securityImage_btn;
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Security Questions\"`]")
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Security Questions\")")
	private MobileElement securityQuestions_btn;
	
	@iOSXCUITFindBy(id = "button_quickTouch_toggleBtn")
	@AndroidFindBy(accessibility ="button_quickTouch_toggleBtn")
	private MobileElement quickTouch_toggle;
	
	
	@iOSXCUITFindBy(iOSClassChain = "snackbarModal_message")
	@AndroidFindBy(accessibility = "snackbarModal_message")
	private MobileElement snackBarMsg_lbl;
	
	@iOSXCUITFindBy(iOSClassChain = "snackbarModal_msg_close_img")
	@AndroidFindBy(accessibility = "snackbarModal_msg_close_img")
	private MobileElement snackBarCross_btn;
	
	public Boolean securityPageDisplayed() {
		Boolean value=pageDisplayed(securityPageTitle_lbl,"Security Page");
		return value;
	}
	
	public Boolean changePasswordDisplayed() {
		Boolean value=elementDisplayed(changePassword_btn,"change Password button");
		return value;
	}
	
	public Boolean securityPhraseDisplayed() {
		Boolean value=elementDisplayed(securityPhrase_btn,"Security Phrase button");
		return value;
	}
	
	public Boolean securityImageDisplayed() {
		Boolean value=elementDisplayed(securityImage_btn,"Security Image button");
		return value;
	}
	
	public Boolean securityQuestionsButtonDisplayed() {
		Boolean value=elementDisplayed(securityQuestions_btn,"Security Questions button");
		return value;
	}
	
	public Boolean quickTouchToggleDisplayed() {
		Boolean value=elementDisplayed(quickTouch_toggle,"Quick Touch  Toggle button");
		return value;
	}
	

	public SettingsPage clickCrossButton() {
		click(cross_btn,"cross button");
		return new SettingsPage();
	}
	
	public SecurityPhrasePage clickSecurityPhrase() {
		click(securityPhrase_btn,"Security Phrase Button");
		return new SecurityPhrasePage();
	}
	
	public SecurityPage clickSecurityQuestions() {
		click(securityQuestions_btn,"Security Questions Button");
		return this;
	}
	
	public ErrorMessagePage clickQuickTouch() {
		click(quickTouch_toggle,"Quick Touch toggle");
		return new ErrorMessagePage();
	}
	
	public String getSnackBarMsg() {
		String text=getText(snackBarMsg_lbl, "Snack Bar Message is ");
		return text;
	}

	public SecurityPage clickSnackBarClose() {
		click(snackBarCross_btn,"Snackbar Close button");
		return this;
	}
	
	

}

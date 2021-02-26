package com.qa.pages;

import org.openqa.selenium.Keys;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class BusinessProfilePage extends BaseTest {

	@iOSXCUITFindBy(id = "button_View Personal Profile_txt")
	@AndroidFindBy(accessibility = "button_View Personal Profile_txt")
	private MobileElement viewPersonalProfile_btn;
	
	@iOSXCUITFindBy(id = "label_Business Profile_txt")
	@AndroidFindBy(accessibility = "label_Business Profile_txt")
	private MobileElement businessProfile_header;
	
	@iOSXCUITFindBy(id = "button_Edit Profile_txt")
	@AndroidFindBy(accessibility = "button_Edit Profile_txt")
	private MobileElement editProfile_btn;
	
	@iOSXCUITFindBy(id = "button_Manage_txt")
	@AndroidFindBy(accessibility = "button_Manage_txt")
	private MobileElement manageProfile_btn;
	
	@iOSXCUITFindBy(id = "label_Address_txt")
	@AndroidFindBy(accessibility = "label_Address_txt")
	private MobileElement address_lbl;
	
	@iOSXCUITFindBy(id = "label_Phone Number_txt")
	@AndroidFindBy(accessibility = "label_Phone Number_txt")
	private MobileElement phoneNum_lbl;
	
	@iOSXCUITFindBy(id = "textInputWithSwipe_Email Address_txt")
	@AndroidFindBy(accessibility = "textInputWithSwipe_Email Address_txt")
	private MobileElement emailAddress_lbl;
	
	@iOSXCUITFindBy(id = "undefined_Website_txt")
	@AndroidFindBy(accessibility = "undefined_Website_txt")
	private MobileElement website_lbl;
	
	@iOSXCUITFindBy(id = "undefined_Website_value")
	@AndroidFindBy(accessibility = "undefined_Website_value")
	private MobileElement website_input;
	
	@iOSXCUITFindBy(id = "text_Website_input")
	@AndroidFindBy(accessibility = "text_Website_input")
	private MobileElement editWebsite_input;
	
	@iOSXCUITFindBy(id = "button_Done_txt")
	@AndroidFindBy(accessibility = "button_Done_txt")
	private MobileElement done_btn;
	
	@iOSXCUITFindBy(id = "undefined_Confirm_txt")
	@AndroidFindBy(accessibility ="undefined_Confirm_txt")
	private MobileElement confirm_btn;
	
	@iOSXCUITFindBy(id = "header_icon_crossBlack_img")
	@AndroidFindBy(accessibility = "header_icon_crossBlack_img")
	private MobileElement cross_btn;
	
	
	@iOSXCUITFindBy(id = "snackbarModal_message")
	@AndroidFindBy(accessibility = "snackbarModal_message")
	private MobileElement snackBarMsg_lbl;
	
	@iOSXCUITFindBy(id = "snackbarModal_msg_close_img")
	@AndroidFindBy(accessibility = "snackbarModal_msg_close_img")
	private MobileElement snackBarCross_btn;
	
	
	
	
	public PersonalProfilePage clickViewPersonalProfile() throws Throwable {
		verticalSwipe(viewPersonalProfile_btn,"View Personal Profile");
		return new PersonalProfilePage();
	}
	
	public Boolean verifyViewPersonalButtonDisplayed() throws Throwable {
		Boolean value=verticalSwipeTillElementDisplayed(viewPersonalProfile_btn,"View Personal Profile");
		return value;
	}
	
	public BusinessProfilePage scrollToViewPersonalProfileButton() throws InterruptedException {
		verticalSwipe(viewPersonalProfile_btn,"View Personal Profile");
		return this;
	}
	
	public Boolean verifyEditProfileButtonDisplayed() {
		Boolean value=elementDisplayed(editProfile_btn,"Edit Profile button ");
		return value;
	}
	public Boolean verifyManagePageButtonDisplayed() {
		Boolean value=elementDisplayed(manageProfile_btn,"Manage Profile page ");
		return value;
	}
	
	public Boolean verifyAddressDisplayed() {
		Boolean value=elementDisplayed(address_lbl,"Address");
		return value;
	}
	
	public Boolean verifyPhoneNumberDisplayed() {
		Boolean value=elementDisplayed(phoneNum_lbl,"Phone Number");
		return value;
	}
	
	public Boolean verifyEmailAddressDisplayed() {
		Boolean value=elementDisplayed(emailAddress_lbl,"Email Address");
		return value;
	}
	
	public Boolean verifyWebsiteLabelDisplayed() {
		Boolean value=elementDisplayed(website_lbl,"website Address");
		return value;
	}
	
	public Boolean verifyBusinessProfilePageDisplayed() {
		Boolean value=pageDisplayed(businessProfile_header,"Business Profile Page");
		return value;
	}

	
	public String getBusinessProfileHeader() {
		String text=getText(businessProfile_header, "Business Profile page header");
		return text;
	}
	
	public SettingsPage clickCrossButton() {
		click(cross_btn,"Cross button on Business Profile page ");
		return new SettingsPage();
	}

	public BusinessProfilePage clickWebsite() {
		click(website_input,"Website on Business profile page");
		return this;
	}

	public BusinessProfilePage enterWebsite(String value) throws Throwable {
		sendKeysWithEnterIos(editWebsite_input,value,"Enter Website value : ");
		return this;
	}
	
	public BusinessProfilePage clickDoneBtn() {
		click(done_btn,"Done button on edit  website page");
		return this;
	}
	
	public BusinessProfilePage clickConfirmBtn() {
		click(confirm_btn,"Confirm button on edit  website page");
		return this;
	}
	
	public String getWebsiteValue() {
		String text=getText(website_input, "New website value is");
		return text;
	}
	
	public String getSnackBarMsg() {
		pageDisplayed(snackBarMsg_lbl," ");
		String text=getText(snackBarMsg_lbl, "Snack Bar Message is ");
		return text;
	}

	public BusinessProfilePage clickSnackBarClose() {
		click(snackBarCross_btn,"Snackbar Close button");
		return this;
	}
	


}

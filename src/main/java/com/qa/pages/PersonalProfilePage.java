package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class PersonalProfilePage extends BaseTest {

	@iOSXCUITFindBy(id = "label_Personal Profile_txt")
	@AndroidFindBy(accessibility ="label_Personal Profile_txt")
	private MobileElement personalProfileheader_lbl;
	
	@iOSXCUITFindBy(id = "label_Full name_txt")
	@AndroidFindBy(accessibility ="label_Full name_txt")
	private MobileElement fullName_lbl;
	
	@iOSXCUITFindBy(id = "label_Mobile Number_txt")
	@AndroidFindBy(accessibility ="label_Mobile Number_txt")
	private MobileElement mobileNumber_lbl;
	
	@iOSXCUITFindBy(id = "undefined_Email Address_txt")
	@AndroidFindBy(accessibility ="undefined_Email Address_txt")
	private MobileElement emailAddress_lbl;
	
	@iOSXCUITFindBy(id = "undefined_Email Address_value")
	@AndroidFindBy(accessibility ="undefined_Email Address_value")
	private MobileElement emailAddress_txt;
	
	@iOSXCUITFindBy(id = "text_Email Address_input")
	@AndroidFindBy(accessibility ="text_Email Address_input")
	private MobileElement editEmailAddress_txt;
	
	@iOSXCUITFindBy(id = "button_Done_txt")
	@AndroidFindBy(accessibility ="button_Done_txt")
	private MobileElement done_btn;
	
	@iOSXCUITFindBy(id = "undefined_Confirm_txt")
	@AndroidFindBy(accessibility ="undefined_Confirm_txt")
	private MobileElement confirm_btn;
	
	@iOSXCUITFindBy(id = "button_View Business Profile_txt")
	@AndroidFindBy(accessibility ="button_View Business Profile_txt")
	private MobileElement viewBusinessProfile_btn;
	
	@iOSXCUITFindBy(id = "header_icon_crossBlack_img")
	@AndroidFindBy(accessibility ="header_icon_crossBlack_img")
	private MobileElement cross_btn;
	
	@iOSXCUITFindBy(id = "button_Edit Profile_txt")
	@AndroidFindBy(accessibility ="button_Edit Profile_txt")
	private MobileElement editProfile_icon;
	
	@iOSXCUITFindBy(id = "button_Manage_txt")
	@AndroidFindBy(accessibility ="button_Manage_txt")
	private MobileElement manage_icon;
	
	@iOSXCUITFindBy(id = "snackbarModal_message")
	@AndroidFindBy(accessibility = "snackbarModal_message")
	private MobileElement snackBarMsg_lbl;
	
	@iOSXCUITFindBy(id = "snackbarModal_msg_close_img")
	@AndroidFindBy(accessibility = "snackbarModal_msg_close_img")
	private MobileElement snackBarCross_btn;
	
	
	public Boolean verifyPersonalProfilePageDisplayed() {
		Boolean value=pageDisplayed(personalProfileheader_lbl,"Business Profile Page");
		return value;
	}

	
	public String getPersonalProfileHeader() {
		String text=getText(personalProfileheader_lbl, "Persona profile Page");
		return text;
	}
	
	public Boolean fullNameDisplayed() {
		Boolean value=elementDisplayed(fullName_lbl,"Full name ");
		return value;
	}
	
	
	public Boolean mobileDisplayed() {
		Boolean value=elementDisplayed(mobileNumber_lbl,"Mobile number ");
		return value;
	}
	
	public Boolean editProfileIconDisplayed() {
		Boolean value=elementDisplayed(editProfile_icon,"Edit Profile icon ");
		return value;
	}
	
	public Boolean emailDisplayed() {
		Boolean value=elementDisplayed(emailAddress_lbl,"Email Address ");
		return value;
	}
	public Boolean manageIconDisplayed() {
		Boolean value=elementDisplayed(manage_icon,"Manage Icon ");
		return value;
	}
	
	public String getEmailText() {
		String text=getText(emailAddress_txt, "Persona profile Page");
		return text;
	}
	
	public PersonalProfilePage clickPersonalEmail() {
		click(emailAddress_txt,"Email Address on personal profile");
		return this;
	}
	
	public PersonalProfilePage enterEmail(String value) throws Throwable {
		sendKeysWithEnterIos(editEmailAddress_txt,value,"Enter email value : ");
		return this;
	}
	
	public PersonalProfilePage clickDoneBtn() {
		click(done_btn,"Done button on edit email page ");
		return this;
	}
	
	public PersonalProfilePage clickConfirmBtn() {
		click(confirm_btn,"Confirm button on edit email page ");
		return this;
	}
	
	public Boolean viewBusinessProfileBtnDisplayed() {
		Boolean value=elementDisplayed(viewBusinessProfile_btn,"View Businss Profile Button ");
		return value;
	}
	
	public BusinessProfilePage clickViewBusinessProfileBtn(){
		click(viewBusinessProfile_btn,"Cross Button");
		return new BusinessProfilePage();
	}
	
	public String getSnackBarMsg() {
		String text=getText(snackBarMsg_lbl, "Snack Bar Message is ");
		return text;
	}

	public PersonalProfilePage clickSnackBarClose() {
		click(snackBarCross_btn,"Snackbar Close button");
		return this;
	}
	
	public SettingsPage clickCrossButton() {
		click(cross_btn,"Cross button on Personal Profile page ");
		return new SettingsPage();
	}
	
}

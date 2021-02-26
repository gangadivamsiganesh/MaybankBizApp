package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class DuitNowSelectIDPage extends BaseTest{
	
	@iOSXCUITFindBy(id = "select_Select ID Type")
	@AndroidFindBy(accessibility  = "select_Select ID Type")
	private MobileElement selectIDType_lbl;
	
	@iOSXCUITFindBy(id = "select_Mobile Number_txt")
	@AndroidFindBy(accessibility  = "select_Mobile Number_txt")
	private MobileElement mobileNumber_lbl;
	
	@iOSXCUITFindBy(id = "select_NRIC Number_txt")
	@AndroidFindBy(accessibility  = "select_NRIC Number_txt")
	private MobileElement nricNumber_lbl;
	
	@iOSXCUITFindBy(id = "select_Passport Number_txt")
	@AndroidFindBy(accessibility  = "select_Passport Number_txt")
	private MobileElement passportNumber_lbl;
	
	@iOSXCUITFindBy(id = "select_Army / Police ID_txt")
	@AndroidFindBy(accessibility  = "select_Army / Police ID_txt")
	private MobileElement armyPoliceID_lbl;
	
	@iOSXCUITFindBy(id = "select_Business Registration Number_txt")
	@AndroidFindBy(accessibility  = "select_Business Registration Number_txt")
	private MobileElement businessRegistrationNumber_lbl;
	
	@iOSXCUITFindBy(id = "select_ID Type_value")
	@AndroidFindBy(accessibility  = "select_ID Type_value")
	private MobileElement IDType_lbl;
	
	@iOSXCUITFindBy(id = "text_Mobile Number_input")
	@AndroidFindBy(accessibility  = "text_Mobile Number_input")
	private MobileElement mobileNumber_txt;
	
	@iOSXCUITFindBy(id = "text_NRIC Number_input")
	@AndroidFindBy(accessibility  = "text_NRIC Number_input")
	private MobileElement nricNumber_txt;
	
	@iOSXCUITFindBy(id = "text_Passport Number_input")
	@AndroidFindBy(accessibility  = "text_Passport Number_input")
	private MobileElement passportNumber_txt;
	
	@iOSXCUITFindBy(id = "searcheableDropDown_Issuing Country_value")
	@AndroidFindBy(accessibility  = "searcheableDropDown_Issuing Country_value")
	private MobileElement selectCountry_lbl;
	
	@iOSXCUITFindBy(id = "text_Army / Police ID_input")
	@AndroidFindBy(accessibility  = "text_Army / Police ID_input")
	private MobileElement armyPoliceID_txt;
	
	@iOSXCUITFindBy(id = "text_Business Registration Number_input")
	@AndroidFindBy(accessibility  = "text_Business Registration Number_input")
	private MobileElement BRN_txt;
	
	@iOSXCUITFindBy(id = "button_Next_txt")
	@AndroidFindBy(accessibility  = "button_Next_txt")
	private MobileElement next_btn;
	
	@iOSXCUITFindBy(id = "searcheableDropDown_3_Select Issuing Country")
	@AndroidFindBy(accessibility  = "searcheableDropDown_3_Select Issuing Country")
	private MobileElement selectPassportIssuingCountry_lbl;
	

	
	
	
	@iOSXCUITFindBy(id = "snackbarModal_message")
	@AndroidFindBy(accessibility = "snackbarModal_message")
	private MobileElement snackBarMsg_lbl;
	
	@iOSXCUITFindBy(id = "snackbarModal_msg_close_img")
	@AndroidFindBy(accessibility = "snackbarModal_msg_close_img")
	private MobileElement snackBarCross_btn;
	
	
	
	public String getSnackBarMsg() {
		String text=getText(snackBarMsg_lbl, "Snack Bar Message is ");
		return text;
	}

	public DuitNowSelectIDPage clickSnackBarClose() {
		click(snackBarCross_btn,"Snackbar Close button");
		return this;
	}
	
	public Boolean verifyDuitNowSelectIDTypePage() {
		Boolean value=pageDisplayed(selectIDType_lbl,"Duit Now select ID page ");
		return value;
	}
	
	public DuitNowSelectIDPage clickMobileNumber(){
		click(mobileNumber_lbl,"Mobile number on DuitNow select ID");
		return this;
	}
	
	public DuitNowSelectIDPage clickNRICnumber(){
		click(nricNumber_lbl,"NRIC number on DuitNow select ID");
		return this;
	}
	
	public DuitNowSelectIDPage clickPassportNumber(){
		click(passportNumber_lbl,"Passport number on DuitNow select ID");
		return this;
	}
	
	public DuitNowSelectIDPage clickArmyPoliceID(){
		click(armyPoliceID_lbl,"Army Police ID on DuitNow select ID");
		return this;
	}
	
	public DuitNowSelectIDPage clickBRN(){
		click(businessRegistrationNumber_lbl,"BRN on DuitNow select ID");
		return this;
	}
	
	public String getIDType() {
		String text=getText(IDType_lbl, "ID Type ");
		return text;
	}
	
	public DuitNowSelectIDPage enterMobileNumber(String Value) throws Throwable{
		sendKeys(mobileNumber_txt,Value,"Mobile Number");
		return this;
	}

	public DuitNowSelectIDPage enterNRICNumber(String Value) throws Throwable{
		sendKeys(nricNumber_txt,Value,"NRIC Number");
		return this;
	}
	
	public DuitNowSelectIDPage enterPassportNumber(String Value) throws Throwable{
		sendKeys(passportNumber_txt,Value,"Passport  Number");
		return this;
	}
	public DuitNowSelectIDPage enterArmyPoliceID(String Value) throws Throwable{
		sendKeys(armyPoliceID_txt,Value,"Army Police ID");
		return this;
	}
	
	public DuitNowSelectIDPage enterBRN(String Value) throws Throwable{
		sendKeys(BRN_txt,Value,"Business Registration Number");
		return this;
	}
	
	public EnterAmountPage clickNextButton(){
		click(next_btn,"Next button");
		return new EnterAmountPage();
	}
	
	public DuitNowSelectIDPage clickSelectCountry(){
		click(selectCountry_lbl,"Select country");
		return this;
	}

}

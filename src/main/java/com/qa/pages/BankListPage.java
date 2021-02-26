package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class BankListPage extends BaseTest{
	
	@iOSXCUITFindBy(id = "label_Select Recipient Bank_txt")
	@AndroidFindBy(accessibility  = "label_Select Recipient Bank_txt")
	private MobileElement selectRecipientBank_lbl;
	
	@iOSXCUITFindBy(id = "list_1_search_input")
	@AndroidFindBy(accessibility  = "list_1_search_input")
	private MobileElement searchBank_txt;
	
	@iOSXCUITFindBy(id = "list_fullName_bankName_0")
	@AndroidFindBy(accessibility  = "list_fullName_bankName_0")
	private MobileElement firstBankName_lbl;
	
	@iOSXCUITFindBy(id = "label_Enter account details_txt")
	@AndroidFindBy(accessibility  = "label_Enter account details_txt")
	private MobileElement enterAccountDetails_lbl;
	
	@iOSXCUITFindBy(id = "customPayTo_Recipient Bank_value")
	@AndroidFindBy(accessibility  = "customPayTo_Recipient Bank_value")
	private MobileElement recipientBankValue_lbl;
	
	@iOSXCUITFindBy(id = "text_Account Number_input")
	@AndroidFindBy(accessibility  = "text_Account Number_input")
	private MobileElement enterAccountNumber_txt;
	
	@iOSXCUITFindBy(id = "text_Recipient Name_input")
	@AndroidFindBy(accessibility  = "text_Recipient Name_input")
	private MobileElement enterRecipientName_txt;
	
	@iOSXCUITFindBy(id = "button_Next_txt")
	@AndroidFindBy(accessibility  = "button_Next_txt")
	private MobileElement next_btn;
	
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

	public BankListPage clickSnackBarClose() {
		click(snackBarCross_btn,"Snackbar Close button");
		return this;
	}
	
	public Boolean verifySelectRecipientBankNamePageDisplayed() {
		Boolean value=pageDisplayed(selectRecipientBank_lbl,"Select Recipient Bank Name page  ");
		return value;
	}
	public Boolean enterAccountDetailsPageDisplayed() {
		Boolean value=elementDisplayed(enterAccountDetails_lbl,"Enter Account Details page  ");
		return value;
	}
	
	public String getRecipientBankName() throws Throwable {
		String text=getText(recipientBankValue_lbl, "Recipient Bank Name ");
		return text;
	}
	
	public BankListPage enterRecipientName(String Value){
		sendKeys(enterRecipientName_txt,Value,"Recipient Name");
		return this;
	}
	
	public BankListPage enterAccountNumber(String Value){
		sendKeys(enterAccountNumber_txt,Value,"Account Number");
		return this;
	}
	
	public BankListPage enterSearchBankName(String Biller) throws Throwable{
		//searchBiller_txt.click();
		if(getPlatform().equalsIgnoreCase("iOS")) {
		sendKeysAndEnter(searchBank_txt,Biller,"Bank Name ");
		}
		else {
			sendKeys(searchBank_txt,Biller,"Bank Name ");
		}
		
		return this;
	}
	
	public BankListPage clickFirstBiller(){
		click(firstBankName_lbl,"Bank is selected ");
		return this;
	}
	
	public EnterAmountPage clickNextButton(){
		click(next_btn,"Next Button ");
		return new EnterAmountPage();
	}

}

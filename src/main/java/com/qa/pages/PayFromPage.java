package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class PayFromPage extends BaseTest {


	@iOSXCUITFindBy(id = "pageTitle_Pay From")
	@AndroidFindBy(accessibility  = "pageTitle_Pay From")
	private MobileElement payFromTitle_lbl;
	
	@iOSXCUITFindBy(id = "header_icon_arrowBlack_img")
	@AndroidFindBy(accessibility  = "header_icon_arrowBlack_img")
	private MobileElement back_btn;
	
	@iOSXCUITFindBy(id = "list_0_Bank Account")
	@AndroidFindBy(accessibility  = "list_0_Bank Account")
	private MobileElement bankAccountHeader_lbl;
	
	@iOSXCUITFindBy(id = "list_0_transactionDescName_txt")
	@AndroidFindBy(accessibility  = "list_0_transactionDescName_txt")
	private MobileElement accountName1_lbl;
	
	@iOSXCUITFindBy(id = "list_0_transactionDescription_txt")
	@AndroidFindBy(accessibility  = "list_0_transactionDescription_txt")
	private MobileElement accountNumber1_lbl;
	
	@iOSXCUITFindBy(id = "list_0_transactionAmount_txt")
	@AndroidFindBy(accessibility  = "list_0_transactionAmount_txt")
	private MobileElement amount1_lbl;
	
	
	
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

	public PayFromPage clickSnackBarClose() {
		click(snackBarCross_btn,"Snackbar Close button");
		return this;
	}
	
	public Boolean verifyPayFromPageDisplayed() {
		Boolean value=pageDisplayed(payFromTitle_lbl,"Pay From page  ");
		return value;
	}
	public Boolean verifyPayFromAccountNameDisplayed() {
		Boolean value=elementDisplayed(accountName1_lbl,"Pay From Account Name  ");
		return value;
	}
	
	public Boolean verifyPayFromAccountNumberDisplayed() {
		Boolean value=elementDisplayed(accountNumber1_lbl,"Pay From Account Number  ");
		return value;
	}
	
	public Boolean verifyPayFromAmountDisplayed() {
		Boolean value=elementDisplayed(amount1_lbl,"Pay From Amount  ");
		return value;
	}
	
	public Boolean verifyBackButtonDisplayed() {
		Boolean value=elementDisplayed(back_btn,"Back Button on pay from  ");
		return value;
	}
	
	public BillerDetailsPage clickPayFromAccount(){
		click(accountName1_lbl,"Pay From Account Number ");
		return new BillerDetailsPage();
	}
	
	public EnterAmountPage clickPayFromAccountFavPayment(){
		click(accountName1_lbl,"Pay From Account Number ");
		return new EnterAmountPage();
	}
	
	public PaymentsDashboardPage clickBackButton(){
		click(back_btn,"Back Button  ");
		return new PaymentsDashboardPage();
	}

	public String getPayFromHeader() throws Throwable {
		String text=getText(bankAccountHeader_lbl, "Bank Account Header ");
		return text;
	}
	
	public String getAccountName() throws Throwable {
		String text=getText(accountName1_lbl, "Account Name on PayFrom page");
		return text;
	}
	
	public String getAccountNumber() throws Throwable {
		String text=getText(accountNumber1_lbl, "Account Number on PayFrom page");
		return text;
	}
	
	public String getAmount() throws Throwable {
		String text=getText(amount1_lbl, "Amount on PayFrom page");
		return text;
	}
}

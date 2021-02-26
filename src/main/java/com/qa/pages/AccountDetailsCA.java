package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class AccountDetailsCA extends BaseTest{
	
	@iOSXCUITFindBy(id = "accountCard_0_accountName")
	@AndroidFindBy(accessibility  = "accountCard_0_accountName")
	private MobileElement businessAccount1_card;
	
	@iOSXCUITFindBy(id = "accountCard_0_quickAccess_ic")
	@AndroidFindBy(accessibility  = "accountCard_0_quickAccess_ic")
	private MobileElement quickAccess1_btn;
	
	@iOSXCUITFindBy(id = "header_icon_arrowBlack_img")
	@AndroidFindBy(accessibility  = "header_icon_arrowBlack_img")
	private MobileElement back_btn; 
	
	@iOSXCUITFindBy(id = "accountCard_0_accountName")
	@AndroidFindBy(accessibility  = "accountCard_0_accountName")
	private MobileElement accountName_lbl; 
	
	@iOSXCUITFindBy(id = "accountCard_0_accountNumber")
	@AndroidFindBy(accessibility  = "accountCard_0_accountNumber")
	private MobileElement accountNumber_lbl; 
	
	@iOSXCUITFindBy(id = "accountCard_0_AvailableBalance_Certificates")
	@AndroidFindBy(accessibility  = "accountCard_0_AvailableBalance_Certificates]")
	private MobileElement availableBalance_lbl; 
	
	@iOSXCUITFindBy(id = "accountCard_0_balance_txt")
	@AndroidFindBy(accessibility  = "accountCard_0_balance_txt")
	private MobileElement balance_lbl; 

	@iOSXCUITFindBy(id = "label_Account Details_txt")
	@AndroidFindBy(accessibility  = "label_Account Details_txt")
	private MobileElement accountDetails_lbl; 
	
	@iOSXCUITFindBy(id = "label_Account Name_txt")
	@AndroidFindBy(accessibility  = "label_Account Name_txt")
	private MobileElement accountNameLabel_lbl; 
	
	@iOSXCUITFindBy(id = "label_Account Name_value")
	@AndroidFindBy(accessibility  = "label_Account Name_value")
	private MobileElement accountNameValue_lbl; 
	
	@iOSXCUITFindBy(id = "label_Type of Account_txt")
	@AndroidFindBy(accessibility  = "label_Type of Account_txt")
	private MobileElement typeOfAccountLabel_lbl; 
	
	@iOSXCUITFindBy(id = "label_Type of Account_value")
	@AndroidFindBy(accessibility  = "label_Type of Account_value")
	private MobileElement typeOfAccountValue_lbl; 
	
	@iOSXCUITFindBy(id = "undefined_Nickname_txt")
	@AndroidFindBy(accessibility  = "undefined_Nickname_txt")
	private MobileElement nicknameLabel_lbl; 
	
	@iOSXCUITFindBy(id = "undefined_Nickname_value")
	@AndroidFindBy(accessibility  = "undefined_Nickname_value")
	private MobileElement nicknameValue_lbl; 
	
	@iOSXCUITFindBy(id = "label_Available Balance_txt")
	@AndroidFindBy(accessibility  = "label_Available Balance_txt")
	private MobileElement availableBalanceLabel_lbl; 
	
	@iOSXCUITFindBy(id = "label_Available Balance_value")
	@AndroidFindBy(accessibility  = "label_Available Balance_value")
	private MobileElement availableBalanceValue_lbl; 
	
	@iOSXCUITFindBy(id = "label_Current Balance_txt")
	@AndroidFindBy(accessibility  = "label_Current Balance_txt")
	private MobileElement currentBalanceLabel_lbl; 
	
	@iOSXCUITFindBy(id = "label_Current Balance_value")
	@AndroidFindBy(accessibility  = "label_Current Balance_value")
	private MobileElement currentBalanceValue_lbl; 
	
	@iOSXCUITFindBy(id = "label_One-Day Float_txt")
	@AndroidFindBy(accessibility  = "label_One-Day Float_txt")
	private MobileElement oneDayFloatLabel_lbl; 
	
	@iOSXCUITFindBy(id = "label_One-Day Float_value")
	@AndroidFindBy(accessibility  = "label_One-Day Float_value")
	private MobileElement oneDayFloatValue_lbl; 
	
	@iOSXCUITFindBy(id = "label_Two-Day Float_txt")
	@AndroidFindBy(accessibility  = "label_Two-Day Float_txt")
	private MobileElement twoDayFloatLabel_lbl; 
	
	@iOSXCUITFindBy(id = "label_Two-Day Float_value")
	@AndroidFindBy(accessibility  = "label_Two-Day Float_value")
	private MobileElement twoDayFloatValue_lbl; 
	
	@iOSXCUITFindBy(id = "label_Late Clearing/Outstation Cheque Float_txt")
	@AndroidFindBy(accessibility  = "label_Late Clearing/Outstation Cheque Float_txt")
	private MobileElement lateClearingOutstationChequeFloatLabel_lbl; 
	
	@iOSXCUITFindBy(id = "label_Late Clearing/Outstation cheque float_value")
	@AndroidFindBy(accessibility  = "label_Late Clearing/Outstation cheque float_value")
	private MobileElement lateClearingOutstationChequeFloatValue_lbl; 
	
	@iOSXCUITFindBy(id = "confirmationButton_Make a Transfer_txt")
	@AndroidFindBy(accessibility  = "confirmationButton_Make a Transfer_txt")
	private MobileElement makeATransfer_btn; 
	
	@iOSXCUITFindBy(id = "confirmationButton_Pay a Bill_txt")
	@AndroidFindBy(accessibility  = "confirmationButton_Pay a Bill_txt")
	private MobileElement payABill_btn; 
	
	@iOSXCUITFindBy(id = "label_Account Details_txt")
	@AndroidFindBy(accessibility  = "label_Account Details_txt")
	private MobileElement accountDetailsheader_btn; 
	
	@iOSXCUITFindBy(id = "pageTitle_Business Accounts")
	@AndroidFindBy(accessibility  = "pageTitle_Business Accounts")
	private MobileElement BusinessAccountsPageTitle_btn; 
	
	
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

	public AccountDetailsCA clickSnackBarClose() {
		click(snackBarCross_btn,"Snackbar Close button");
		return this;
	}
	
	
	public Boolean verifyCAcard1Displayed() throws Throwable {
		Boolean value=elementDisplayed(businessAccount1_card,"Business Account card on Account listing page");
		return value;
	}
	
	public Boolean verifyAccountNameOnCACard1() throws Throwable {
		Boolean value=elementDisplayed(accountName_lbl,"Account name on CA card");
		return value;
	}
	
	public Boolean verifyAccountNumberOnCACard1() throws Throwable {
		Boolean value=elementDisplayed(accountNumber_lbl,"Account number on CA card");
		return value;
	}
	
	public Boolean verifyAvailableBalanceOnCACard1() throws Throwable {
		Boolean value=elementDisplayed(balance_lbl,"Available Balance on CA card");
		return value;
	}
	
	public String getAccountName() {
		String text=getText(accountName_lbl, "Account Name");
		return text;
	}
	
	public String getAccountNumber() {
		String text=getText(accountNumber_lbl, "Account Number");
		return text;
	}
	
	public String getAvailableBalance() {
		String text=getText(balance_lbl, "Available balance");
		return text;
	}
	
	public Boolean verifyQuickAccessButton() throws Throwable {
		Boolean value=elementDisplayed(quickAccess1_btn,"Quick Access Button");
		return value;
	}
	
	public Boolean verifyBackButton() throws Throwable {
		Boolean value=elementDisplayed(back_btn,"Back Button");
		return value;
	}
	
	public Boolean verifyPageTitleDisplayed() throws Throwable {
		Boolean value=pageDisplayed(BusinessAccountsPageTitle_btn,"Business Accounts Page Title");
		return value;
	}
	
	public String getAccountDetailsPageTitle() {
		String text=getText(BusinessAccountsPageTitle_btn, "Account Listing Page Title");
		return text;
	}
	
	
	public Boolean verifyAccountDetailsHeaderHeaderDisplayed() throws Throwable {
		Boolean value=pageDisplayed(accountDetailsheader_btn,"Account Details Title");
		return value;
	}
	
	public String getAccountDetailsHeader() {
		String text=getText(accountDetailsheader_btn, "Account Details Page Title");
		return text;
	}
	
	public TransactionHistoryPage clickBackButton() {
		click(back_btn,"Back Button Account Listing Page ");
		return new TransactionHistoryPage();
	}
	
	
	public QuickAccess clickQuickAccessCTA() {
		click(quickAccess1_btn,"Quick Access CTA button");
		return new QuickAccess();
	}
	
	public Boolean verifyAccountNameDetailsDisplayed() throws Throwable {
		Boolean value=elementDisplayed(accountNameLabel_lbl,"Account Name Label");
		return value;
	}
	
	public String getAccountNameDetails() {
		String text=getText(accountNameValue_lbl, "Account Name value");
		return text;
	}
	
	public Boolean verifytypeOfAccountDisplayed() throws Throwable {
		Boolean value=elementDisplayed(typeOfAccountLabel_lbl,"Account Name Label");
		return value;
	}
	
	public String getTypeOfAccount() {
		String text=getText(typeOfAccountValue_lbl, "Account Name value");
		return text;
	}
	
	public Boolean verifyNicknameLabel() throws Throwable {
		Boolean value=elementDisplayed(nicknameLabel_lbl,"Account Name Label");
		return value;
	}
	
	public String getNicknameValue() {
		String text=getText(nicknameValue_lbl, "Account Name value");
		return text;
	}
	
	public EditNicknamePage clickNicknameLbl() {
		click(nicknameValue_lbl,"Nickname ");
		return new EditNicknamePage();
	}
	
	public Boolean verifyAvailBalanceLabel() throws Throwable {
		Boolean value=elementDisplayed(availableBalanceLabel_lbl,"Available Balance Label");
		return value;
	}
	
	public String getAvailBalanceValue() {
		String text=getText(availableBalanceValue_lbl, "Available Balance  value");
		return text;
	}
	
	public Boolean verifyCurrentbalanceLabel() throws Throwable {
		Boolean value=elementDisplayed(currentBalanceLabel_lbl,"Current Balance Label");
		return value;
	}
	
	public String getCurrentBalanceValue() {
		String text=getText(currentBalanceValue_lbl, "Current Balance  value");
		return text;
	}
	
	public Boolean verifyOneDayFloatLabel() throws Throwable {
		Boolean value=verticalSwipeTillElementDisplayed(oneDayFloatLabel_lbl,"One day float label");
		return value;
	}
	
	public Boolean verifyTwoDayFloatLabel() throws Throwable {
		Boolean value=verticalSwipeTillElementDisplayed(twoDayFloatValue_lbl,"Two day float label");
		return value;
	}
	
	public Boolean verifyLateClearance() throws Throwable {
		Boolean value=verticalSwipeTillElementDisplayed(lateClearingOutstationChequeFloatLabel_lbl,"Late Clearance Outstation Cheque Float");
		return value;
	}
	
	public Boolean verifyMakeATransferButton() throws Throwable {
		Boolean value=verticalSwipeTillElementDisplayed(makeATransfer_btn,"Make A transfer Button");
		return value;
	}
	
	public AccountDetailsCA clickMakeATransferbtn() throws Throwable {
		verticalSwipe(makeATransfer_btn,"Make A transfer button");
		return this;
	}
	
	public Boolean verifyPayABillButton() throws Throwable {
		Boolean value=verticalSwipeTillElementDisplayed(payABill_btn,"Pay A Bill Button");
		return value;
	}
	
	public AccountDetailsCA clickPayABillbtn() throws Throwable {
		verticalSwipe(payABill_btn,"Pay A bill button");
		return this;
	}
	
	
	
}

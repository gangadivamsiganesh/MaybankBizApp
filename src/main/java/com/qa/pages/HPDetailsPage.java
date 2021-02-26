package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class HPDetailsPage extends BaseTest{

	
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
	@AndroidFindBy(accessibility  = "accountCard_0_AvailableBalance_Certificates")
	private MobileElement outstandingBalance_lbl; 
	
	@iOSXCUITFindBy(id = "accountCard_0_balance_txt")
	@AndroidFindBy(accessibility  = "accountCard_0_balance_txt")
	private MobileElement balance_lbl; 
	
	@iOSXCUITFindBy(id = "pageTitle_Hire Purchase")
	@AndroidFindBy(accessibility  = "pageTitle_Hire Purchase")
	private MobileElement HPPageTitle_lbl;
	
	@iOSXCUITFindBy(id = "label_Loan Details_txt")
	@AndroidFindBy(accessibility  = "label_Loan Details_txt")
	private MobileElement LoanDetailsheader_lbl; 
	
	@iOSXCUITFindBy(id = "accountCard_0_EquipmentType")
	@AndroidFindBy(accessibility  = "accountCard_0_EquipmentType")
	private MobileElement HPEquipmentType_lbl;
	
	@iOSXCUITFindBy(id = "label_Account Name_txt")
	@AndroidFindBy(accessibility  = "label_Account Name_txt")
	private MobileElement accountNameLabel_lbl; 
	
	@iOSXCUITFindBy(id = "label_Type of Loan_txt")
	@AndroidFindBy(accessibility  = "label_Type of Loan_txt")
	private MobileElement typeOfLoanLabel_lbl; 
	
	@iOSXCUITFindBy(id = "label_Type of Loan_value")
	@AndroidFindBy(accessibility  = "label_Type of Loan_value")
	private MobileElement typeOfLoanValue_lbl; 
	
	@iOSXCUITFindBy(id = "undefined_Nickname_txt")
	@AndroidFindBy(accessibility  = "undefined_Nickname_txt")
	private MobileElement nickNameLabel_lbl; 
	
	@iOSXCUITFindBy(id = "undefined_Nickname_value")
	@AndroidFindBy(accessibility  = "undefined_Nickname_value")
	private MobileElement nickNameValue_lbl; 
	
	@iOSXCUITFindBy(id = "label_Monthly Instalment_txt")
	@AndroidFindBy(accessibility  = "label_Monthly Instalment_txt")
	private MobileElement monthlyInstallmentlabel_lbl; 
	
	@iOSXCUITFindBy(id = "label_Vehicle Reg./Serial Number_txt")
	@AndroidFindBy(accessibility  = "label_Vehicle Reg./Serial Number_txt")
	private MobileElement vehicleSerialOrRegNumlabel_lbl; 
	
	@iOSXCUITFindBy(id = "label_Total Paid_txt")
	@AndroidFindBy(accessibility  = "label_Total Paid_txt")
	private MobileElement totalPaidlabel_lbl; 
	
	@iOSXCUITFindBy(id = "label_Payment Due Date_txt")
	@AndroidFindBy(accessibility  = "label_Payment Due Date_txt")
	private MobileElement paymentDueDateLabel_lbl; 
	
	@iOSXCUITFindBy(id = "label_Late Clearing/Outstation Cheque Float_txt")
	@AndroidFindBy(accessibility  = "label_Late Clearing/Outstation Cheque Float_txt")
	private MobileElement lateClearingOutstationChequeFloatLabel_lbl; 
	
	@iOSXCUITFindBy(id = "label_Instalment Due_txt")
	@AndroidFindBy(accessibility  = "label_Instalment Due_txt")
	private MobileElement installementDueLabel_lbl; 
	
	@iOSXCUITFindBy(id = "label_Profit Rate_txt")
	@AndroidFindBy(accessibility  = "label_Profit Rate_txt")
	private MobileElement profitRatLabel_lbl; 
	
	@iOSXCUITFindBy(id = "label_Compensation Fee_txt")
	@AndroidFindBy(accessibility  = "label_Compensation Fee_txt")
	private MobileElement compensationFee_lbl; 
	
	@iOSXCUITFindBy(id = "label_Repayment Period_txt")
	@AndroidFindBy(accessibility  = "label_Repayment Period_txt")
	private MobileElement repaymentPeriod_lbl; 
	
	@iOSXCUITFindBy(id = "button_Pay Loan_txt")
	@AndroidFindBy(accessibility  = "button_Pay Loan_txt")
	private MobileElement payLoan_btn; 
	
	
	
	@iOSXCUITFindBy(id = "snackbarModal_message")
	@AndroidFindBy(accessibility = "snackbarModal_message")
	private MobileElement snackBarMsg_lbl;
	
	@iOSXCUITFindBy(id = "snackbarModal_msg_close_img")
	@AndroidFindBy(accessibility = "snackbarModal_msg_close_img")
	private MobileElement snackBarCross_btn;
	
	
	public Boolean verifyHPEquipmentDisplayed() throws Throwable {
		Boolean value=pageDisplayed(HPEquipmentType_lbl,"Hire Purchase Equipment ");
		return value;
	}
	
	public String getHPEquipmentType() {
		String text=getText(HPEquipmentType_lbl, "Hire Purchase Equipment");
		return text;
	}
	
	
	public String getSnackBarMsg() {
		String text=getText(snackBarMsg_lbl, "Snack Bar Message is ");
		return text;
	}

	public HPDetailsPage clickSnackBarClose() {
		click(snackBarCross_btn,"Snackbar Close button");
		return this;
	}
	
	
	public Boolean verifyCard1Displayed() throws Throwable {
		Boolean value=elementDisplayed(businessAccount1_card,"Hire Purchase Card");
		return value;
	}
	
	public Boolean verifyAccountNameOnCard1() throws Throwable {
		Boolean value=elementDisplayed(accountName_lbl,"Account name on HP card");
		return value;
	}
	
	public Boolean verifyAccountNumberOnCard1() throws Throwable {
		Boolean value=elementDisplayed(accountNumber_lbl,"Account number on HP card");
		return value;
	}
	
	public Boolean verifyOutstandingBalanceOnCard1() throws Throwable {
		Boolean value=elementDisplayed(balance_lbl,"Available Balance on HP card");
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
		String text=getText(balance_lbl, "Outstanding balance");
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
		Boolean value=pageDisplayed(HPPageTitle_lbl,"Hire Purchase Title");
		return value;
	}
	
	public String getLoansDetailsPageTitle() {
		String text=getText(HPPageTitle_lbl, "Hire Purchase Page Title");
		return text;
	}
	
	
	public Boolean verifyLoansDetailsHeaderDisplayed() throws Throwable {
		Boolean value=pageDisplayed(LoanDetailsheader_lbl,"HP Loan Details Title");
		return value;
	}
	
	public String getLoanDetailsHeader() {
		String text=getText(LoanDetailsheader_lbl, "HP Loan Details Page Title");
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
	
	public Boolean verifyAccountNamelabelDisplayed() throws Throwable {
		Boolean value=elementDisplayed(accountNameLabel_lbl,"Account name");
		return value;
	}
	
	public Boolean verifyTypeOflabelDisplayed() throws Throwable {
		Boolean value=elementDisplayed(typeOfLoanLabel_lbl,"Type of loan");
		return value;
	}
	
	public String getTypeOfLoanValue() {
		String text=getText(typeOfLoanValue_lbl, "Type of loan value ");
		return text;
	}
	public Boolean verifyNicknamelabelDisplayed() throws Throwable {
		Boolean value=elementDisplayed(nickNameLabel_lbl,"Nickname label");
		return value;
	}
	
	public String getNicknameValue() {
		String text=getText(nickNameValue_lbl, "Nickname value ");
		return text;
	}
	
	public EditNicknamePage clickNicknameLbl() {
		click(nickNameValue_lbl,"Nickname ");
		return new EditNicknamePage();
	}
	
	public Boolean verifyVehicleRegOrSerialNumLabel() throws Throwable {
		Boolean value=verticalSwipeTillElementDisplayed(vehicleSerialOrRegNumlabel_lbl,"Vehicle Reg oe Serial Number");
		return value;
	}
	
	public Boolean verifyMonthlyInstallmentLabel() throws Throwable {
		Boolean value=verticalSwipeTillElementDisplayed(monthlyInstallmentlabel_lbl,"Monthly Installment label");
		return value;
	}
	
	public Boolean verifyTotalPaidLabel() throws Throwable {
		Boolean value=verticalSwipeTillElementDisplayed(totalPaidlabel_lbl,"Total Paid label");
		return value;
	}
	
	public Boolean verifyPaymentDueDateLabel() throws Throwable {
		Boolean value=verticalSwipeTillElementDisplayed(paymentDueDateLabel_lbl,"Payment Due Date label");
		return value;
	}
	
	public Boolean verifyLateClearingOutstationChequeFloatLabel() throws Throwable {
		Boolean value=verticalSwipeTillElementDisplayed(lateClearingOutstationChequeFloatLabel_lbl,"Late Clearing Outstation Cheque Float label");
		return value;
	}
	
	public Boolean verifyInstallmentDueLabel() throws Throwable {
		Boolean value=verticalSwipeTillElementDisplayed(installementDueLabel_lbl,"Installment Due Date label");
		return value;
	}
	
	
	public Boolean verifyProfitRateLabel() throws Throwable {
		Boolean value=verticalSwipeTillElementDisplayed(profitRatLabel_lbl,"Profit Rate label");
		return value;
	}
	
	public Boolean verifyCompensationFeeLabel() throws Throwable {
		Boolean value=verticalSwipeTillElementDisplayed(compensationFee_lbl,"Compensation Fee label");
		return value;
	}
	
	public Boolean verifyRepaymentPeriodLabel() throws Throwable {
		Boolean value=verticalSwipeTillElementDisplayed(repaymentPeriod_lbl,"Payment Period label");
		return value;
	}
	
	
	public Boolean verifyPayLoanButton() throws Throwable {
		Boolean value=verticalSwipeTillElementDisplayed(payLoan_btn,"Pay Loan button");
		return value;
	}
	
	public HPDetailsPage clickPayLoanbtn() throws Throwable {
		verticalSwipe(payLoan_btn,"Pay Loan button");
		return this;
	}
}

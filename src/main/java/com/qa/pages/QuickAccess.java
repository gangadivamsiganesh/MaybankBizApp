package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class QuickAccess extends BaseTest{
	
	@iOSXCUITFindBy(id = "accountCard_Transaction History_txt")
	@AndroidFindBy(accessibility  = "accountCard_Transaction History_txt")
	private MobileElement transactionHistory_CTA;
	
	@iOSXCUITFindBy(id = "accountCard_Account Details_txt")
	@AndroidFindBy(accessibility  = "accountCard_Account Details_txt")
	private MobileElement accountDetails_CTA;
	
	@iOSXCUITFindBy(id = "accountCard_Make a Transfer_txt")
	@AndroidFindBy(accessibility  = "accountCard_Make a Transfer_txt")
	private MobileElement makeATransfer_CTA;
	
	@iOSXCUITFindBy(id = "accountCard_Pay a Bill_txt")
	@AndroidFindBy(accessibility  = "accountCard_Pay a Bill_txt")
	private MobileElement payABill_CTA;

	@iOSXCUITFindBy(id = "accountCard_Download Statement_txt")
	@AndroidFindBy(accessibility  = "accountCard_Download Statement_txt")
	private MobileElement downloadStatement_CTA;	
	
	@iOSXCUITFindBy(id = "accountCard_Export Transaction as CSV_txt")
	@AndroidFindBy(accessibility  = "accountCard_Export Transaction as CSV_txt")
	private MobileElement exportTransactionAsCSV_CTA;	
	
	@iOSXCUITFindBy(id = "accountCard_Loan Details_txt")
	@AndroidFindBy(accessibility  = "accountCard_Loan Details_txt")
	private MobileElement loanDetails_CTA;
	
	@iOSXCUITFindBy(id = "accountCard_Pay Loan_txt")
	@AndroidFindBy(accessibility  = "accountCard_Pay Loan_txt")
	private MobileElement payLoan_CTA;
	
	public Boolean verifyTransactionHistoryCTADisplayed() throws Throwable {
		Boolean value=elementDisplayed(transactionHistory_CTA,"Transaction History Quick Access option");
		return value;
	}
	
	public Boolean verifyAccountDetailsCTADisplayed() throws Throwable {
		Boolean value=elementDisplayed(accountDetails_CTA,"Account Details Quick Access option");
		return value;
	}
	
	public Boolean verifyMakeATransferCTADisplayed() throws Throwable {
		Boolean value=elementDisplayed(makeATransfer_CTA,"Make Transfer Quick Access option");
		return value;
	}
	
	public Boolean verifyPayABillCTADisplayed() throws Throwable {
		Boolean value=elementDisplayed(payABill_CTA,"Pay A Bill Quick Access option");
		return value;
	}
	
	public Boolean verifyDownloadStatementCTADisplayed() throws Throwable {
		Boolean value=elementDisplayed(downloadStatement_CTA,"Download statement Quick Access option");
		return value;
	}
	
	public Boolean verifyExportTransactionCTADisplayed() throws Throwable {
		Boolean value=elementDisplayed(exportTransactionAsCSV_CTA,"Export Transaction  As CSV CTA Quick Access option");
		return value;
	}
	
	public Boolean verifyLoanDetailsCTADisplayed() throws Throwable {
		Boolean value=elementDisplayed(loanDetails_CTA,"Loan Details Quick Access option");
		return value;
	}
	
	public Boolean verifyPayLoanCTADisplayed() throws Throwable {
		Boolean value=elementDisplayed(payLoan_CTA,"Pay Loan CTA Quick Access option");
		return value;
	}
}


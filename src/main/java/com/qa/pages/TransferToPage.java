package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class TransferToPage extends BaseTest{
	

	@iOSXCUITFindBy(id = "pageTitle_Transfer To")
	@AndroidFindBy(accessibility  = "pageTitle_Transfer To")
	private MobileElement TransferTo_lbl;
	
	@iOSXCUITFindBy(id = "header_icon_arrowBlack_img")
	@AndroidFindBy(accessibility  = "header_icon_arrowBlack_img")
	private MobileElement back_btn;
	
	@iOSXCUITFindBy(id = "sectionList_0_Bank Account")
	@AndroidFindBy(accessibility  = "sectionList_0_Bank Account")
	private MobileElement bankAccountHeader_lbl;
	
	@iOSXCUITFindBy(id = "sectionList_0_transactionDescName_txt")
	@AndroidFindBy(accessibility  = "sectionList_0_transactionDescName_txt")
	private MobileElement accountName1_lbl;
	
	@iOSXCUITFindBy(id = "sectionList_0_transactionDescription_txt")
	@AndroidFindBy(accessibility  = "sectionList_0_transactionDescription_txt")
	private MobileElement accountNumber1_lbl;
	
	@iOSXCUITFindBy(id = "sectionList_0_transactionAmount_txt")
	@AndroidFindBy(accessibility  = "sectionList_0_transactionAmount_txt")
	private MobileElement amount1_lbl;
	
	
	
	public Boolean verifyTransferToPageDisplayed() {
		Boolean value=pageDisplayed(TransferTo_lbl,"Transfer To page  ");
		return value;
	}
	public Boolean verifyTransferToAccountNameDisplayed() {
		Boolean value=elementDisplayed(accountName1_lbl,"Transfer To Account Name  ");
		return value;
	}
	
	public Boolean verifyTransferToAccountNumberDisplayed() {
		Boolean value=elementDisplayed(accountNumber1_lbl,"Transfer To Account Number  ");
		return value;
	}
	
	public Boolean verifyTransferToAmountDisplayed() {
		Boolean value=elementDisplayed(amount1_lbl,"Transfer To Amount  ");
		return value;
	}
	
	public Boolean verifyBackButtonDisplayed() {
		Boolean value=elementDisplayed(back_btn,"Back Button on Transfer To page  ");
		return value;
	}
	
	public EnterAmountPage clickTransferToAccount(){
		click(accountName1_lbl,"Transfer To Account Number ");
		return new EnterAmountPage();
	}
	
	
	public TransferDashboardPage clickBackButton(){
		click(back_btn,"Back Button  ");
		return new TransferDashboardPage();
	}

	public String getTransferToHeader() throws Throwable {
		String text=getText(bankAccountHeader_lbl, "Bank Account Header ");
		return text;
	}
	
	public String getAccountName() throws Throwable {
		String text=getText(accountName1_lbl, "Account Name on TransferTo page");
		return text;
	}
	
	public String getAccountNumber() throws Throwable {
		String text=getText(accountNumber1_lbl, "Account Number on TransferTo page");
		return text;
	}
	
	public String getAmount() throws Throwable {
		String text=getText(amount1_lbl, "Available Balance on TransferTo page");
		return text;
	}

}

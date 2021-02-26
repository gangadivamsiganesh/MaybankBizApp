package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class TransferFromPage extends BaseTest{

	@iOSXCUITFindBy(id = "pageTitle_Transfer From")
	@AndroidFindBy(accessibility  = "pageTitle_Transfer From")
	private MobileElement TransferFrom_lbl;
	
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
	
	
	
	public Boolean verifyTransferFromPageDisplayed() {
		Boolean value=pageDisplayed(TransferFrom_lbl,"Transfer From page  ");
		return value;
	}
	public Boolean verifyTransferFromAccountNameDisplayed() {
		Boolean value=elementDisplayed(accountName1_lbl,"Transfer From Account Name  ");
		return value;
	}
	
	public Boolean verifyTransferFromAccountNumberDisplayed() {
		Boolean value=elementDisplayed(accountNumber1_lbl,"Transfer From Account Number  ");
		return value;
	}
	
	public Boolean verifyTransferFromAmountDisplayed() {
		Boolean value=elementDisplayed(amount1_lbl,"Transfer From Amount  ");
		return value;
	}
	
	public Boolean verifyBackButtonDisplayed() {
		Boolean value=elementDisplayed(back_btn,"Back Button on Transfer from  ");
		return value;
	}
	
	public TransferToPage clickTransferFromAccount(){
		click(accountName1_lbl,"Transfer From Account Number ");
		return new TransferToPage();
	}
	
	public BankListPage clickTransferFromAccountThirdPartyTrasfer(){
		click(accountName1_lbl,"Transfer From Account Number ");
		return new BankListPage();
	}
	
	public DuitNowSelectIDPage clickTransferFromAccountDuitNowTrasfer(){
		click(accountName1_lbl,"Transfer From Account Number ");
		return new DuitNowSelectIDPage();
	}
	
	
	public TransferDashboardPage clickBackButton(){
		click(back_btn,"Back Button  ");
		return new TransferDashboardPage();
	}

	public String getTransferFromHeader() throws Throwable {
		String text=getText(bankAccountHeader_lbl, "Bank Account Header ");
		return text;
	}
	
	public String getAccountName() throws Throwable {
		String text=getText(accountName1_lbl, "Account Name on TransferFrom page");
		return text;
	}
	
	public String getAccountNumber() throws Throwable {
		String text=getText(accountNumber1_lbl, "Account Number on TransferFrom page");
		return text;
	}
	
	public String getAmount() throws Throwable {
		String text=getText(amount1_lbl, "Amount on TransferFrom page");
		return text;
	}
	
	
}

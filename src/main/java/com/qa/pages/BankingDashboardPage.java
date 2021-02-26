package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class BankingDashboardPage extends BaseTest {
	
	@iOSXCUITFindBy(id = "cardList_Business Accounts_txt")
	@AndroidFindBy(accessibility  = "cardList_Business Accounts_txt")
	private MobileElement businessAccounts_card;
	
	@iOSXCUITFindBy(id = "cardList_accounts_txt")
	@AndroidFindBy(accessibility  = "cardList_accounts_txt")
	private MobileElement numOfAccountsBA_lbl;
	
	@iOSXCUITFindBy(id = "cardList_Available Balance_txt")
	@AndroidFindBy(accessibility  = "cardList_Available Balance_txt")
	private MobileElement availableBalBA_lbl;
	
	@iOSXCUITFindBy(id = "cardList_balance_txt")
	@AndroidFindBy(accessibility  = "cardList_balance_txt")
	private MobileElement availableBalBA_txt;
	
	@iOSXCUITFindBy(id = "cardList_Fixed Deposit_txt")
	@AndroidFindBy(accessibility = "cardList_Fixed Deposit_txt")
	private MobileElement fixedDeposit_card;
	
	@iOSXCUITFindBy(id = "cardList_accounts_txt")
	@AndroidFindBy(accessibility  = "cardList_accounts_txt")
	private MobileElement numOfAccountsFD_lbl;
	
	@iOSXCUITFindBy(id = "cardList_Total Amount_txt")
	@AndroidFindBy(accessibility  = "cardList_Total Amount_txt")
	private MobileElement totalAmountFD_lbl;
	
	@iOSXCUITFindBy(id = "cardList_balance_txt")
	@AndroidFindBy(accessibility  = "cardList_balance_txt")
	private MobileElement totalAmountFD_txt;
	
	@iOSXCUITFindBy(id = "cardList_Loans_txt")
	@AndroidFindBy(accessibility = "cardList_Loans_txt")
	private MobileElement loans_card;
	
	@iOSXCUITFindBy(id = "cardList_accounts_txt")
	@AndroidFindBy(accessibility  = "cardList_accounts_txt")
	private MobileElement numOfAccountsTL_lbl;
	
	@iOSXCUITFindBy(id = "cardList_Outstanding Balance_txt")
	@AndroidFindBy(accessibility  = "cardList_Outstanding Balance_txt")
	private MobileElement outstandingBalTL_lbl;
	
	@iOSXCUITFindBy(id = "cardList_balance_txt")
	@AndroidFindBy(accessibility  = "cardList_balance_txt")
	private MobileElement outstandingBalTL_txt;
	
	@iOSXCUITFindBy(id = "cardList_Hire Purchase_txt")
	@AndroidFindBy(accessibility = "cardList_Hire Purchase_txt")
	private MobileElement hirePurchase_card;
	
	@iOSXCUITFindBy(id = "cardList_accounts_txt")
	@AndroidFindBy(accessibility  = "cardList_accounts_txt")
	private MobileElement numOfAccountsHP_lbl;
	
	@iOSXCUITFindBy(id = "cardList_Outstanding Balance_txt")
	@AndroidFindBy(accessibility  = "cardList_Outstanding Balance_txt")
	private MobileElement outstandingBalHP_lbl;
	
	@iOSXCUITFindBy(id = "cardList_balance_txt")
	@AndroidFindBy(accessibility  = "cardList_balance_txt")
	private MobileElement outstandingBalHP_txt;
	
	
	@iOSXCUITFindBy(id = "pageHeader_left_grid_img")
	@AndroidFindBy(accessibility = "pageHeader_left_grid_img")
	private MobileElement helpCTA_btn;
	
	@iOSXCUITFindBy(id = "pageHeader_Banking_txt")
	@AndroidFindBy(accessibility = "pageHeader_Banking_txt")
	private MobileElement bankingTitle_lbl;
	
	@iOSXCUITFindBy(id = "cardList_ASSETS_txt")
	@AndroidFindBy(accessibility = "cardList_ASSETS_txt")
	private MobileElement assets_btn;
	
	@iOSXCUITFindBy(id = "cardList_LIABILITIES_txt")
	@AndroidFindBy(accessibility = "cardList_LIABILITIES_txt")
	private MobileElement liabilities_btn;
	
	@iOSXCUITFindBy(id = "pageHeader_right_logout_img")
	@AndroidFindBy(accessibility = "pageHeader_right_logout_img")
	private MobileElement logout_btn;
	
	@iOSXCUITFindBy(id = "cardList_Payment_txt")
	@AndroidFindBy(accessibility = "cardList_Payment_txt")
	private MobileElement payment_icon;
	
	@iOSXCUITFindBy(id = "cardList_Transfer_txt")
	@AndroidFindBy(accessibility = "cardList_Transfer_txt")
	private MobileElement transfer_icon;
	
	@iOSXCUITFindBy(id = "cardList_Approvals_txt")
	@AndroidFindBy(accessibility = "cardList_Approvals_txt")
	private MobileElement approval_icon;
	
	@iOSXCUITFindBy(id = "cardList_Inbox_txt")
	@AndroidFindBy(accessibility = "cardList_Inbox_txt")
	private MobileElement inbox_icon;
	
	@iOSXCUITFindBy(id = "cardList_Invoices_txt")
	@AndroidFindBy(accessibility = "cardList_Invoices_txt")
	private MobileElement invoice_icon;
	
	@iOSXCUITFindBy(id = "cardList_Business_txt")
	@AndroidFindBy(accessibility = "cardList_Business_txt")
	private MobileElement business_icon;
	WebDriverWait w =new WebDriverWait(getDriver(),10000);
	
	public Boolean verifyBankingDashboardisplayed() {
		Boolean value=pageDisplayed(bankingTitle_lbl,"Banking Dashboard");
		return value;
	}
	
	public AccountListing clickBusinessAccountCard(){
		click(businessAccounts_card,"Business Account Card");
		return new AccountListing();
	}
	
	public BankingDashboardPage scrollToFD() throws InterruptedException{
		scrollToCard();
		return this;
	}
	public AccountListing clickFD(){
		click(fixedDeposit_card,"Fixed Deposit Card");
		return new AccountListing();
	}
	public BankingDashboardPage clickAssetsIconx(){
		click(assets_btn,"Assets Icon");
		return this;
	}
	
	public BankingDashboardPage clickLiabilitiesIcon(){
		click(liabilities_btn,"Liabilities Icon");
		return this;
	}
	
	public ControlCenterPage clickHelpButton(){
		click(helpCTA_btn,"Help Button");
		return new ControlCenterPage();
	}
	
	public BankingDashboardPage swipeToCard(String type) throws Throwable {
		if(type.equalsIgnoreCase("FixedDeposit")||type.equalsIgnoreCase("HirePurchase")) {
			scrollToCard();
		}
		return this;
	}
	
	public String getTextOfBAcard() {
		String text=getText(businessAccounts_card, "Business Account card text");
		return text;
	}
	
	public Boolean verifyBAcardDisplayed() {
		Boolean value=elementDisplayed(businessAccounts_card,"Business Account card");
		return value;
	}
	
	public String getTextOfNumOfAccBA() {
		String text=getText(numOfAccountsBA_lbl, "Number of Accounts");
		return text;
	}
	public String getTextOfAvailBalLabelLbBA() {
		String text=getText(availableBalBA_lbl, "Available Balance label");
		return text;
	}
	
	public String getTextOfAvailBalBA() {
		String text=getText(availableBalBA_txt, "Available Balance");
		return text;
	}
	
	
	public String getTextOfFDcard() {
		String text=getText(fixedDeposit_card, "Fixed Deposit card text");
		return text;
	}
	
	public Boolean verifyFDcardDisplayed() {
		Boolean value=elementDisplayed(fixedDeposit_card,"Fixed Deposit card");
		return value;
	}
	
	public String getTextOfNumOfAccFD() {
		String text=getText(numOfAccountsFD_lbl, "Number of Accounts");
		return text;
	}
	
	public String getTextOfTotalAmountFD() {
		String text=getText(totalAmountFD_txt, "Total Amount ");
		return text;
	}
	
	public String getTextOfTotalAmountLabelFD() {
		String text=getText(totalAmountFD_lbl, "Total Amount ");
		return text;
	}
	
	public String getTextOfTLcard() {
		String text=getText(loans_card, "Term Loan card text");
		return text;
	}
	public AccountListing clickLoansCard(){
		click(loans_card,"Term Loan Card");
		return new AccountListing();
	}
	
	public AccountListing clickHPCard(){
		click(hirePurchase_card,"Hire Purchase card on Banking Dashboard");
		return new AccountListing();
	}
	
	
	public Boolean verifyTLCardDisplayed() {
		Boolean value=pageDisplayed(loans_card,"Term Loan card");
		return value;
	}
	
	public String getTextOfNumOfAccTL() {
		String text=getText(numOfAccountsTL_lbl, "Number of Accounts");
		return text;
	}
	
	public String getTextOfOutStandingBalLabelTL() {
		String text=getText(outstandingBalTL_lbl, "Outstanding Balance");
		return text;
	}
	
	
	public String getTextOfOutStandingBalTL() {
		String text=getText(outstandingBalTL_txt, "Outstanding Balance");
		return text;
	}
	
	public String getTextOfHPcard() {
		String text=getText(hirePurchase_card, "Hire Purchase card text");
		return text;
	}
	public Boolean verifyHPCardDisplayed() {
		Boolean value=pageDisplayed(hirePurchase_card,"Hire Purchase card");
		return value;
	}
	
	public String getTextOfNumOfAccHP() {
		String text=getText(numOfAccountsHP_lbl, "Number of Accounts");
		return text;
	}
	public String getTextOfOutStandingBalLabelHP() {
		String text=getText(outstandingBalHP_lbl, "Outstanding Balance");
		return text;
	}
	
	public String getTextOfOutStandingBalHP() {
		String text=getText(outstandingBalHP_txt, "Outstanding Balance");
		return text;
	}

	public Boolean verifyPaymentsIconDisplayed() throws InterruptedException {
		//w.until(ExpectedConditions.visibilityOf(payment_icon));
		Thread.sleep(10000);
		
		Boolean value=elementDisplayed(payment_icon,"Payment Icon");
		return value;
	}
	
	public PaymentsDashboardPage clickPaymentsIcon(){
		click(payment_icon,"Payment Icon");
		return new PaymentsDashboardPage();
	}
	
	public Boolean verifyApprovalIconDisplayed() {
		Boolean value=elementDisplayed(approval_icon,"Approval Icon");
		return value;
	}
	
	public ApprovalDashboardPage clickApprovalIcon(){
		click(approval_icon,"Approval Icon");
		return new ApprovalDashboardPage();
	}
	
	public Boolean verifyTransferIcononDisplayed() {
		Boolean value=elementDisplayed(transfer_icon,"Transfer Icon");
		return value;
	}
	
	public TransferDashboardPage clickTransferIcon(){
		click(transfer_icon,"Transfer Icon");
		return new TransferDashboardPage();
	}
	
	public Boolean verifyInboxIconDisplayed() {
		Boolean value=elementDisplayed(inbox_icon,"Inbox Icon");
		return value;
	}
	
	public BankingDashboardPage clickInboxIcon(){
		click(inbox_icon,"Inbox Icon");
		return this;
	}
	
	public Boolean verifyInvoiceIconDisplayed() {
		Boolean value=elementDisplayed(invoice_icon,"InvoiceIcon");
		return value;
	}
	public BankingDashboardPage clickInvoiceIcon(){
		click(invoice_icon,"Invoice Icon");
		return this;
	}
	
	public Boolean verifyBusinessIconDisplayed() throws Throwable {
		Boolean value=verticalSwipeTillElementDisplayed(business_icon,"BusinessIcon");
		return value;
	}
	
	public BankingDashboardPage clickBusinessIcon(){
		click(business_icon,"Business Icon");
		return this;
	}
	
	public Boolean verifyHelpCTADisplayed() {
		Boolean value=elementDisplayed(helpCTA_btn,"Help CTA Button");
		return value;
	}
	public Boolean verifyLogoutBtnDisplayed() {
		Boolean value=elementDisplayed(logout_btn,"Logout Button");
		return value;
	}
	
	public Boolean verifyAssetsIconDisplayed() {
		Boolean value=elementDisplayed(assets_btn,"Assets Icon");
		return value;
	}
	
	public Boolean verifyLiabilitiesIconDisplayed() {
		Boolean value=elementDisplayed(liabilities_btn,"Liabilities Icon");
		return value;
	}
	
	public LogoutPage clickLogout(){
		click(logout_btn,"Logout Button");
		return new LogoutPage();
	}

}

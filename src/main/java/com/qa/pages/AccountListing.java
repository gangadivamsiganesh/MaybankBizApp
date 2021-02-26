package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class AccountListing extends BaseTest{
	
	@iOSXCUITFindBy(id = "accountCard_0_accountName")
	@AndroidFindBy(accessibility  = "accountCard_0_accountName")
	private MobileElement businessAccount1_card;
	
	@iOSXCUITFindBy(id = "**/XCUIElementTypeOther[`label CONTAINS \"Business Accounts\"`]")
	@AndroidFindBy(accessibility  = "accountCard_1_cta")
	private MobileElement businessAccount2_card;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label CONTAINS \"Business Accounts\"`]")
	@AndroidFindBy(accessibility  = "accountCard_3_cta")
	private MobileElement businessAccount3_card;
	
	@iOSXCUITFindBy(id = "accountCard_0_quickAccess_ic")
	@AndroidFindBy(accessibility  = "accountCard_0_quickAccess_ic")
	private MobileElement quickAccess1_btn;
	
	@iOSXCUITFindBy(id = "accountCard_1_quickAccess_ic")
	@AndroidFindBy(accessibility  = "accountCard_1_quickAccess_ic")
	private MobileElement quickAccess2_btn;
	
	@iOSXCUITFindBy(id = "accountCard_2_quickAccess_ic")
	@AndroidFindBy(accessibility  = "accountCard_2_quickAccess_ic")
	private MobileElement quickAccess3_btn;
	
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
	private MobileElement availableBalance_lbl; 
	
	@iOSXCUITFindBy(id = "accountCard_0_balance_txt")
	@AndroidFindBy(accessibility  = "accountCard_0_balance_txt")
	private MobileElement Balance_lbl; 
	
	@iOSXCUITFindBy(id = "pageTitle_Business Accounts")
	@AndroidFindBy(accessibility  = "pageTitle_Business Accounts")
	private MobileElement BAPageTitle_lbl; 
	
	@iOSXCUITFindBy(id = "pageTitle_Loans")
	@AndroidFindBy(accessibility  = "pageTitle_Loans")
	private MobileElement TLPageTitle_lbl;
	
	@iOSXCUITFindBy(id = "pageTitle_Hire Purchase")
	@AndroidFindBy(accessibility  = "pageTitle_Hire Purchase")
	private MobileElement HPPageTitle_lbl;
	
	@iOSXCUITFindBy(id = "accountCard_0_EquipmentType")
	@AndroidFindBy(accessibility  = "accountCard_0_EquipmentType")
	private MobileElement HPEquipmentType_lbl;
	
	@iOSXCUITFindBy(id = "pageTitle_Fixed Deposits")
	@AndroidFindBy(accessibility  = "pageTitle_Fixed Deposits")
	private MobileElement FDPageTitle_lbl;
	

	
	
	public Boolean verifyCard1Displayed(String msg) throws Throwable {
		Boolean value=elementDisplayed(businessAccount1_card,msg);
		return value;
	}
	
	public Boolean verifyAccountNameOnCard1(String msg) throws Throwable {
		Boolean value=elementDisplayed(accountName_lbl,msg);
		return value;
	}
	
	public Boolean verifyAccountNumberOnCard1(String msg) throws Throwable {
		Boolean value=elementDisplayed(accountNumber_lbl,msg);
		return value;
	}
	
	public Boolean verifyAvailableBalanceOnCard1(String msg) throws Throwable {
		Boolean value=elementDisplayed(Balance_lbl,msg);
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
		String text=getText(Balance_lbl, "Available balance");
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
		Boolean value=pageDisplayed(BAPageTitle_lbl,"Business Accounts Page Title");
		return value;
	}
	
	public String getAccListingPageTitle() {
		String text=getText(BAPageTitle_lbl, "Account Listing Page Title");
		return text;
	}
	
	public Boolean verifyCerticatesOnFDCard() throws Throwable {
		Boolean value=elementDisplayed(availableBalance_lbl,"Certificates on FD card");
		return value;
	}
	
	public String getAvailBalOutStandingBal() {
		String text=getText(availableBalance_lbl, "AvailBal/Outstanding Bal");
		return text;
	}
	
	public Boolean verifyTLPageTitleDisplayed() throws Throwable {
		Boolean value=pageDisplayed(TLPageTitle_lbl,"Term Loan Page Title");
		return value;
	}
	
	public String getTLAccListingPageTitle() {
		String text=getText(TLPageTitle_lbl, "Term Loan Page Title");
		return text;
	}
	
	public Boolean verifyHPEquipmentDisplayed() throws Throwable {
		Boolean value=pageDisplayed(HPEquipmentType_lbl,"Hire Purchase Equipment ");
		return value;
	}
	
	public String getHPEquipmentType() {
		String text=getText(HPEquipmentType_lbl, "Hire Purchase Equipment");
		return text;
	}
	
	public Boolean verifyHPPageTitleDisplayed() throws Throwable {
		Boolean value=pageDisplayed(HPPageTitle_lbl,"Hire Purchase  Page Title");
		return value;
	}
	
	public String getHPAccListingPageTitle() {
		String text=getText(HPPageTitle_lbl, "Hire Purchase Page Title");
		return text;
	}
	
	
	public BankingDashboardPage clickBackButton() {
		click(back_btn,"Back Button Account Listing Page ");
		return new BankingDashboardPage();
	}
	
	public TransactionHistoryPage clickCard(String msg) {
		click(businessAccount1_card,msg);
		return new TransactionHistoryPage();
	}
	
	public QuickAccess clickQuickAccessCTA() {
		click(quickAccess1_btn,"Quick Access CTA button");
		return new QuickAccess();
	}
	
	public Boolean verifyFDPageTitleDisplayed() throws Throwable {
		Boolean value=pageDisplayed(FDPageTitle_lbl,"Fixed Deposit Account List Page Title");
		return value;
	}
	
	public FDCertificateListingPage clickFDCard() {
		click(businessAccount1_card,"FD card on account listing page");
		return new FDCertificateListingPage();
	}
	
}

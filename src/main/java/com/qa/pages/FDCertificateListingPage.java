package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class FDCertificateListingPage extends BaseTest{

	@iOSXCUITFindBy(id = "pageTitle_Fixed Deposits")
	@AndroidFindBy(accessibility  = "pageTitle_Fixed Deposits")
	private MobileElement FDPageTitle_lbl;
	
	@iOSXCUITFindBy(id = "label_My Certificates_txt")
	@AndroidFindBy(accessibility  = "label_My Certificates_txt")
	private MobileElement MyCertificates_lbl;
	
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
	
	@iOSXCUITFindBy(id = "list_Certificate_0")
	@AndroidFindBy(accessibility  = "list_Certificate_0")
	private MobileElement CertificateNumber1_lbl; 
	
	@iOSXCUITFindBy(id = "list_Amount_0")
	@AndroidFindBy(accessibility  = "list_Amount_0")
	private MobileElement CertificateAmount_lbl; 
	
	@iOSXCUITFindBy(id = "list_Date_0")
	@AndroidFindBy(accessibility  = "list_Date_0")
	private MobileElement CertificateCreatedDate_lbl; 
	

	public Boolean verifyFDCertificatePageDisplayed() throws Throwable {
		Boolean value=pageDisplayed(MyCertificates_lbl,"FD Cerificate Listing Page");
		return value;
	}
	public Boolean verifyBackButton() throws Throwable {
		Boolean value=elementDisplayed(back_btn,"Back Button");
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
	
	public String getTotalAmountLabel() {
		String text=getText(availableBalance_lbl, "Total amount on FD card");
		return text;
	}
	
	public String getCertificateNumberLabel() {
		String text=getText(CertificateNumber1_lbl, "Cerificate Number on FD Certificate Details");
		return text;
	}
	
	public String getCertificateAmountLabel() {
		String text=getText(CertificateAmount_lbl, "Cerificate Amount on FD Certificate Details");
		return text;
	}

	public String getFDCertificatePageTitle() {
		String text=getText(FDPageTitle_lbl, "Page Title on FD Certificate Details");
		return text;
	}
	public String getCertificateCreatedDate() {
		String text=getText(CertificateCreatedDate_lbl, "Cerificate Created Date on FD Certificate Details");
		return text;
	}
	
	public Boolean verifyCertificateNumber1() throws Throwable {
		Boolean value=elementDisplayed(CertificateNumber1_lbl,"Certificate Number on My certtificates displayed");
		return value;
	}
	
	
	public Boolean verifyCertificateAmount1() throws Throwable {
		Boolean value=elementDisplayed(CertificateAmount_lbl,"Certificate Amount on My certtificates displayed");
		return value;
	}
	
	public Boolean verifyCertificateCreatedDate1() throws Throwable {
		Boolean value=elementDisplayed(CertificateCreatedDate_lbl,"Certificate created Date on My certtificates displayed");
		return value;
	}
	public AccountListing clickBackButton() {
		click(back_btn,"Back Button on FD Certificate Details Page ");
		return new AccountListing();
	}
	
	public FDReviewCertificatePage clickCertificate() {
		click(CertificateNumber1_lbl,"certificate on FD certificate listing page ");
		return new FDReviewCertificatePage();
	}
}

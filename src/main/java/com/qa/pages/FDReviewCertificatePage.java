package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class FDReviewCertificatePage extends BaseTest{
	
	@iOSXCUITFindBy(id = "header_Review Certificate_txt")
	@AndroidFindBy(accessibility  = "header_Review Certificate_txt")
	private MobileElement reviewCertificateHeader_lbl;
	
	@iOSXCUITFindBy(id = "currencyHeader_amount_txt")
	@AndroidFindBy(accessibility  = "currencyHeader_amount_txt")
	private MobileElement amountValue_lbl;
	
	@iOSXCUITFindBy(id = "label_header_txt")
	@AndroidFindBy(accessibility  = "label_header_txt")
	private MobileElement certicateName_lbl;
	
	@iOSXCUITFindBy(id = "label_Islamic Fixed Deposit_accountName")
	@AndroidFindBy(accessibility  = "label_Islamic Fixed Deposit_accountName")
	private MobileElement certicateNumber_lbl;
	
	@iOSXCUITFindBy(id = "grid_FD Account No._value")
	@AndroidFindBy(accessibility  = "grid_FD Account No._value")
	private MobileElement fdAccountNumberValue_lbl;
	
	@iOSXCUITFindBy(id = "grid_FD Account No._txt")
	@AndroidFindBy(accessibility  = "grid_FD Account No._txt")
	private MobileElement fdAccountNumberlabel_lbl;

	
	public Boolean verifyReviewCertificatePageTitleDisplayed() throws Throwable {
		Boolean value=pageDisplayed(reviewCertificateHeader_lbl,"Review Certificate page");
		return value;
	}
	
	public String getAmountValue() {
		String text=getText(amountValue_lbl, "Amount on review caertificate Page");
		return text;
	}
	
	public String getCertificateName() {
		String text=getText(certicateName_lbl, "Certificate Name on review caertificate Page");
		return text;
	}
	
	public String getCertificateNumber() {
		String text=getText(certicateNumber_lbl, "Certificate Number on review caertificate Page");
		return text;
	}
	
	public String getFDAccountNumber() {
		String text=getText(fdAccountNumberValue_lbl, "FD Account Number on review caertificate Page");
		return text;
	}
	
}

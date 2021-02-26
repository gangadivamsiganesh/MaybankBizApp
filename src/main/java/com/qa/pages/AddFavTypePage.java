package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class AddFavTypePage extends BaseTest{

	@iOSXCUITFindBy(id = "label_What type of favourite would you like to add?_txt")
	@AndroidFindBy(accessibility  = "label_What type of favourite would you like to add?_txt")
	private MobileElement addFavTypeTitle_lbl;
	
	@iOSXCUITFindBy(id = "header_icon_arrowBlack_img")
	@AndroidFindBy(accessibility  = "header_icon_arrowBlack_img")
	private MobileElement back_btn;
	
	@iOSXCUITFindBy(id = "list_1_Bill Payment")
	@AndroidFindBy(accessibility  = "list_1_Bill Payment")
	private MobileElement billPayment_btn;
	
	@iOSXCUITFindBy(id = "list_1_JomPAY")
	@AndroidFindBy(accessibility  = "list_1_JomPAY")
	private MobileElement jompayBillPayment_btn;
	
	@iOSXCUITFindBy(id = "list_1_Other Accounts")
	@AndroidFindBy(accessibility  = "list_1_Other Accounts")
	private MobileElement otherAccounts_btn;
	
	@iOSXCUITFindBy(id = "list_1_DuitNow")
	@AndroidFindBy(accessibility  = "list_1_DuitNow")
	private MobileElement DuitNow_btn;
	
	public Boolean verifyAddFavPageDisplayed() {
		Boolean value=pageDisplayed(addFavTypeTitle_lbl,"Add Fav Type Page title ");
		return value;
	}
	
	public Boolean verifyBackButtonDisplayed() {
		Boolean value=elementDisplayed(back_btn,"Back Button ");
		return value;
	}
	
	public Boolean verifyBillPaymentButtonDisplayed() {
		Boolean value=elementDisplayed(billPayment_btn,"Add Fav Bill Payment Button ");
		return value;
	}
	
	public Boolean verifyJompayBillPaymentDisplayed() {
		Boolean value=elementDisplayed(jompayBillPayment_btn,"Jompay Bill Payment ");
		return value;
	}
	
	public BillerDetailsPage clickBillPaymentButton() throws InterruptedException{
		click(billPayment_btn,"Bill Payment Button ");
		return new BillerDetailsPage();
	}
	
	public BillerDetailsPage clickJompayBillPaymentButton() throws InterruptedException{
		click(jompayBillPayment_btn,"Jompay Bill Payment Button ");
		return new BillerDetailsPage();
	}
	
	public PaymentsDashboardPage clickBackButton() throws InterruptedException{
		click(back_btn,"Back Button ");
		return new PaymentsDashboardPage();
	}
	
}

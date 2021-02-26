package com.qa.pages;

import com.aventstack.extentreports.Status;
import com.qa.BaseTest;
import com.qa.reports.ExtentReport;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class EnterAmountPage extends BaseTest {
	
	@iOSXCUITFindBy(id = "pageTitle_Enter Amount")
	@AndroidFindBy(accessibility  = "pageTitle_Enter Amount")
	private MobileElement enterAmountTitle_lbl;
	
	@iOSXCUITFindBy(id = "header_icon_arrowBlack_img")
	@AndroidFindBy(accessibility  = "header_icon_arrowBlack_img")
	private MobileElement back_btn;
	
	@iOSXCUITFindBy(id = "amount")
	@AndroidFindBy(accessibility  = "amount")
	private MobileElement amount_lbl;
	
	@iOSXCUITFindBy(id = "currency")
	@AndroidFindBy(accessibility  = "currency")
	private MobileElement currency_lbl;
	
	@iOSXCUITFindBy(id = "undefined_error_message")
	@AndroidFindBy(accessibility  = "undefined_error_message")
	private MobileElement errorMsg_lbl;
	
	@iOSXCUITFindBy(id = "key_1")
	@AndroidFindBy(accessibility = "key_1")
	private MobileElement keyboard1_btn;
	
	@iOSXCUITFindBy(id = "key_2")
	@AndroidFindBy(accessibility = "key_2")
	private MobileElement keyboard2_btn;
	
	@iOSXCUITFindBy(id = "key_3")
	@AndroidFindBy(accessibility = "key_3")
	private MobileElement keyboard3_btn;
	
	@iOSXCUITFindBy(id = "key_4")
	@AndroidFindBy(accessibility = "key_4")
	private MobileElement keyboard4_btn;
	
	@iOSXCUITFindBy(id = "key_5")
	@AndroidFindBy(accessibility = "key_5")
	private MobileElement keyboard5_btn;
	
	@iOSXCUITFindBy(id = "key_6")
	@AndroidFindBy(accessibility = "key_6")
	private MobileElement keyboard6_btn;
	
	@iOSXCUITFindBy(id = "key_7")
	@AndroidFindBy(accessibility = "key_7")
	private MobileElement keyboard7_btn;
	
	@iOSXCUITFindBy(id = "key_8")
	@AndroidFindBy(accessibility = "key_8")
	private MobileElement keyboard8_btn;
	
	@iOSXCUITFindBy(id = "key_9")
	@AndroidFindBy(accessibility = "key_9")
	private MobileElement keyboard9_btn;
	
	@iOSXCUITFindBy(id = "key_0")
	@AndroidFindBy(accessibility = "key_0")
	private MobileElement keyboard0_btn;
	
	@iOSXCUITFindBy(id = "customKeyboardRemoveImg")
	@AndroidFindBy(accessibility = "customKeyboardRemoveImg")
	private MobileElement keyboardBack_btn;
	
	@iOSXCUITFindBy(id = "customKeyboardProceedImg")
	@AndroidFindBy(accessibility = "customKeyboardProceedImg")
	private MobileElement keyboardDone_btn;
	
	
	public BillerDetailsPage clickBackButton() {
		click(back_btn,"Back Button on enter Amount page");
		return new BillerDetailsPage();
	}
	
	public Boolean verifyEnterAmountPageDisplayed() {
		Boolean value=pageDisplayed(enterAmountTitle_lbl,"Enter Amount Page  ");
		return value;
	}
	
	public Boolean verifyBackButtonDisplayed() {
		Boolean value=elementDisplayed(back_btn,"Back Button on Amount Page");
		return value;
	}
	
	public Boolean verifyAmountDisplayed() {
		Boolean value=elementDisplayed(amount_lbl,"Amount on enter amount page");
		return value;
	}
	
	public String getAmount() throws Throwable {
		String text=getText(amount_lbl, "Amount is ");
		return text;
	}
	
	public String getCurrency() throws Throwable {
		String text=getText(currency_lbl, "Currency is ");
		return text;
	}
	
	
	public PaymentsDetailsPage enterAmount(String Amount) throws Throwable {
		sendAmount(Amount);
		return new PaymentsDetailsPage();	
	}
	
	public TransferDetailsPage enterTransferAmount(String Amount) throws Throwable {
		sendAmount(Amount);
		return new TransferDetailsPage();	
	}
	
	public void sendAmount(String Amount) throws Throwable{
		String amount=Amount.concat("00");
		System.out.println(amount);
		//String OTP1="1234567890"
		for(int i=0;i<amount.length();i++){
			char keyValue = amount.charAt(i);
			switch (keyValue) {
				case '0':
					click(keyboard0_btn);
					break;
				case '1':
					click(keyboard1_btn);
					break;
				case '2':
					click(keyboard2_btn);
					break;
				case '3':
					click(keyboard3_btn);
					break;
				case '4':
					click(keyboard4_btn);
					break;
				case '5':
					click(keyboard5_btn);
					break;
				case '6':
					click(keyboard6_btn);
					break;
				case '7':
					click(keyboard7_btn);
					break;
				case '8':
					click(keyboard8_btn);
					break;
				case '9':
					click(keyboard9_btn);
					break;
				default:
					System.out.println("Amount is blank");
			}
		}
		click(keyboardDone_btn);
		ExtentReport.getTest().log(Status.INFO, "Entered Amount" +Amount.concat(".00"));
	}

}

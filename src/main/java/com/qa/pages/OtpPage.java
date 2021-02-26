package com.qa.pages;

import com.aventstack.extentreports.Status;
import com.qa.BaseTest;
import com.qa.reports.ExtentReport;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class OtpPage extends BaseTest {
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]")
	@AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.TextView[1]")
	private MobileElement OTP_lbl;	
	
	
	@iOSXCUITFindBy(id = "otpResendTxt")
	@AndroidFindBy(accessibility = "otpResendTxt")
	private MobileElement OTPresend_lnk;
	
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
	
	@iOSXCUITFindBy(id = "button_Confirm_txt")
	@AndroidFindBy(accessibility = "button_Confirm_txt")
	private MobileElement confirm_btn;	
	
	public OtpPage clickConfirm_btn(){
		pageDisplayed(confirm_btn,"Confirm Button displayed");
		click(confirm_btn,"Confirm Button");
		return this;
	}
	
	public OtpPage getOTP(){
		String OTP=getText(OTP_lbl,"OTP");
		System.out.println(OTP);
		return this;
	}
	
	public ConfirmationPage enterOTP() throws Throwable{
		String OTP=getOTPText(OTP_lbl,"Fetch OTP",OTPresend_lnk);
		System.out.println(OTP);
		OTP=OTP.substring(5,11);
		System.out.println(OTP);
		//String OTP1="1234567890"
		for(int i=0;i<OTP.length();i++){
			char keyValue = OTP.charAt(i);
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
					System.out.println("NO OTP");
			}
		}
		click(keyboardDone_btn);
		ExtentReport.getTest().log(Status.INFO, "Entered OTP");
		return new ConfirmationPage();
	}
	public void sendOTP() throws Throwable {
		
		String OTP=getOTPText(OTP_lbl,"Fetch OTP",OTPresend_lnk);
		System.out.println(OTP);
		OTP=OTP.substring(5,11);
		System.out.println(OTP);
		//String OTP1="1234567890"
		for(int i=0;i<OTP.length();i++){
			char keyValue = OTP.charAt(i);
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
					System.out.println("NO OTP");
			}
		}
		click(keyboardDone_btn);
		ExtentReport.getTest().log(Status.INFO, "Entered OTP");
		
	}
	
	public ThankYouPage enterOTP_Transfers() throws Throwable {
		sendOTP();
		return new ThankYouPage();
		
	}
	}
	

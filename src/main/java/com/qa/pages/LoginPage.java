package com.qa.pages;

import java.util.HashMap;

import org.openqa.selenium.JavascriptExecutor;
import com.qa.BaseTest;
import com.qa.utils.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;


public class LoginPage extends BaseTest {
	
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Login to M2U Biz\"`]")
	@AndroidFindBy(accessibility = "introScreen_Login to M2U Biz_txt")
	private MobileElement loginM2U_btn;
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Welcome\"`]")
	@AndroidFindBy(accessibility = "pageTitle_Welcome")
	private MobileElement welcome_lbl;
	
	@iOSXCUITFindBy(id = "introPagingSecondHeader")
	@AndroidFindBy(accessibility = "intoPagingSecondHeader")
	private MobileElement introPageHeader_lbl;
	
	@iOSXCUITFindBy(id = "introPagingSecondTxt")
	@AndroidFindBy(accessibility = "intoPagingSecondTxt")
	private MobileElement introPageHeaderDesc_lbl;
	
	@iOSXCUITFindBy(id = "noteEndHC_3_help_txt")
	@AndroidFindBy(accessibility = "noteEndHC_3_help_txt")
	private MobileElement noAccount_lbl;

	
	
	/* Login Page Username **/
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTextField[`name == \"text_Username_input\"`]")
	@AndroidFindBy(accessibility = "text_Username_input")
	private MobileElement userName_txt;
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Help?\"`]")
	@AndroidFindBy(accessibility = "header_Help?_txt")
	private MobileElement help_lnk;
	
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Next\"`]")
	@AndroidFindBy(accessibility = "button_Next_txt")
	private MobileElement next_btn;
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"maybankHeaderImage\"`]")
	@AndroidFindBy(accessibility = "maybankHeaderImage")
	private MobileElement loginPageTitle_lbl;

	@iOSXCUITFindBy(id = "label_Let's get you and your business logged in _txt")
	@AndroidFindBy(accessibility = "label_Let's get you and your business logged in _txt")
	private MobileElement loginPageHeaderDesc_lbl;
	
	@iOSXCUITFindBy(id = "header_icon_crossBlack_img")
	@AndroidFindBy(accessibility = "header_icon_crossBlack_img")
	private MobileElement 	cross_btn;
	
	/* Security Phase*/
	
	@iOSXCUITFindBy(id = "securityImageAndPhrase_Is this your security phrase?")
	@AndroidFindBy(accessibility = "securityImageAndPhrase_Is this your security phrase?")
	private MobileElement securityPhraseHeader_txt;
	
	@iOSXCUITFindBy(id = "securityImageAndPhrase_user_name_txt")
	@AndroidFindBy(accessibility = "securityImageAndPhrase_user_name_txt")
	private MobileElement securityPhrase_txt;
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Yes\"`]")
	@AndroidFindBy(accessibility = "confirmationButton_Yes_txt")
	private MobileElement securePhraseYes_btn;
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Not Mine\"`]")
	@AndroidFindBy(accessibility = "confirmationButton_Not Mine_txt")
	private MobileElement securePhraseNotMine_btn;
	

	
	
	/* Password Page*/
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"inputPassword_securityPhrase\"`]")
	@AndroidFindBy(accessibility = "inputPassword_securityPhrase")
	private MobileElement passwordSecurityPhrase_txt;
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeSecureTextField[`name == \"inputPassword_input\"`]")
	@AndroidFindBy(accessibility = "inputPassword_input")
	private MobileElement password_txt;
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Next\"`]")
	@AndroidFindBy(accessibility = "button_Next_txt")
	private MobileElement nextPswd_btn;
	
	@iOSXCUITFindBy(id = "inputPassword_eye_icon")
	@AndroidFindBy(accessibility = "inputPassword_eye_icon")
	private MobileElement eye_btn;
	
	@iOSXCUITFindBy(id = "inputPassword_0_err_msg")
	@AndroidFindBy(accessibility = "inputPassword_0_err_msg")
	private MobileElement passwordErrMsg_lbl;
	
	@iOSXCUITFindBy(id = "message_message")
	@AndroidFindBy(accessibility = "message_message")
	private MobileElement snackbarErrMsg_lbl;
	
	@iOSXCUITFindBy(id = "message_msg_close_img")
	@AndroidFindBy(accessibility = "message_msg_close_img")
	private MobileElement snackbarCross_btn;
	
	/* Activate Biometric Page */
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Quick Touch\"`]")
	@AndroidFindBy(accessibility = "pageTitle_Quick Touch")
	private MobileElement quickTouchTitle_lbl;
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Activate Quick Touch?\"`]")
	@AndroidFindBy(accessibility = "activateId_Activate Quick Touch?")
	private MobileElement activateQuickTouchHeader_lbl;
	
	@iOSXCUITFindBy(id = "activateId_quick_touch_desc")
	@AndroidFindBy(accessibility = "activateId_quick_touch_desc")
	private MobileElement activateQuickTouchDesc_lbl;
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Activate Now\"`]")
	@AndroidFindBy(accessibility = "activateId_Activate Now_txt")
	private MobileElement activateNow_btn;
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Skip This\"`]")
	@AndroidFindBy(accessibility = "activateId_Skip This_txt")
	private MobileElement skip_btn;
	
	/* Lets Start Page */
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Launch M2U Biz\"`]")
	@AndroidFindBy(accessibility = "label_user_name_header")
	private MobileElement letsStartHeader_txt;
	
	@iOSXCUITFindBy(id = "label_desc")
	@AndroidFindBy(accessibility = "label_desc")
	private MobileElement letsStartHeaderDesc_txt;
	
	@iOSXCUITFindBy(id = "button_Launch M2U Biz_txt")
	@AndroidFindBy(accessibility = "button_Launch M2U Biz_txt")
	private MobileElement letsStart_btn;
	
	
	/* Subsequent Login */
	
	@iOSXCUITFindBy(id = "secondTimeLoginTitle")
	@AndroidFindBy(accessibility = "secondTimeLoginTitle")
	private MobileElement subsequentLoginHeader_btn;
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeSecureTextField[`name == \"loginPassInput\"`]")
	@AndroidFindBy(accessibility = "loginPassInput")
	//@AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"loginPass\")")
	private MobileElement subsequentEnterPassword_txt;
	
	@iOSXCUITFindBy(id = "button_Login_txt")
	@AndroidFindBy(accessibility = "button_Login_txt")
	private MobileElement subsequentlogin_btn;
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Help?\"`]")
	@AndroidFindBy(accessibility = "header_Help?_txt")
	private MobileElement subsequentLoginHelp_lnk;
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`name == \"header_icon_grid_img\"`]/XCUIElementTypeImage")
	@AndroidFindBy(accessibility = "header_icon_grid_img")
	private MobileElement subsequentLoginCC_btn;
	
	@iOSXCUITFindBy(id = "loginEyeTouchImg")
	@AndroidFindBy(accessibility = "loginEyeTouchImg")
	private MobileElement subsequentLoginEyeIcon_img;
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \" OTP \"`][2]")
	@AndroidFindBy(xpath = "Test")
	private MobileElement OTP1_lbl;	
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]")
	@AndroidFindBy(xpath = "Test")
	private MobileElement OTP2_lbl;	
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]")
	@AndroidFindBy(xpath = "Test")
	private MobileElement OTP_lbl;	
	
	
	TestUtils utils = new TestUtils();
	
	/* Welcome Screen Actions*/
	
	public String getNoAccountText() {
		String text=getText(noAccount_lbl,"No Account");
		return text;
	}
	
	public String getIntroPageTitle() {
		String text=getText(welcome_lbl,"welcome Page Title");
		return text;
	}
	
	public Boolean verifyIntroPageDisplayed() {
		Boolean value=elementDisplayed(welcome_lbl,"Welcome Page");
		return value;
	}
	
	public Boolean verifyLoginToM2UBizButtonDisplayed() {
		Boolean value=elementDisplayed(loginM2U_btn,"Login to M2U Biz button");
		return value;
	}
	
	public LoginPage clickLoginToM2UBizButton() {
		click(loginM2U_btn,"Login to M2U Biz button");
		return this;
	}
	
	public String getIntroPageHeader() {
		String text=getText(introPageHeader_lbl,"welcome Page Header");
		return text;
	}
	
	
	public String getIntroPageHeaderDesc() {
		String text=getText(introPageHeaderDesc_lbl,"Intro Page Header Description");
		return text;
	}
	
	
	/* Username Page Actions */
	

	public LoginPage enterUserName(String UserName){
		sendKeys(userName_txt,UserName,"User Name");
		return this;
	}
	
	public LoginPage clickNextbtn() {
		click(next_btn,"Next button");
		return this;
	}
	
	public String getLoginPageTitle() {
		String text=getText(loginPageTitle_lbl, "Login Page Title");
		return text;
	}
	
	public String getUsernamePageHeader() {
		String text=getText(loginPageHeaderDesc_lbl, "UserName Page Header");
		return text;
	}
	
	public LoginPage clickCrossButton() {
		click(cross_btn,"Close button");
		return this;
	}
	
	public Boolean verifyCrossButtonDisplayed() {
		Boolean value=elementDisplayed(cross_btn,"Cross button");
		return value;
	}
	
	public LoginPage clickHelpButton() {
		click(help_lnk,"Help button");
		return this;
	}
	
	public Boolean verifyHelpDisplayed() {
		Boolean value=elementDisplayed(help_lnk,"Help button");
		return value;
	}
	
	
	/* Security Phrase Actions */
	
	public LoginPage clickSecurityPhraseYesbtn() {
		click(securePhraseYes_btn,"Yes Button");
		return this;
	}
	
	public Boolean verifySecurityYesButtonDisplayed() {
		Boolean value=elementDisplayed(securePhraseYes_btn,"Security Phrase Yes button");
		return value;
	}
	
	public String getSecurityPhraseHeaderText() {
		String text=getText(securityPhraseHeader_txt, "Security Image Header");
		return text;
	}
	
	public String getSecurityPhrase() {
		String text=getText(securityPhrase_txt, "Security Phrase");
		return text;
	}
	
	public LoginPage clickSecurityPhraseNotMinebtn() {
		click(securePhraseNotMine_btn,"Not Mine Button");
		return this;
	}
	
	public Boolean verifySecurityPhraseNotMineButtonDisplayed() {
		Boolean value=elementDisplayed(securePhraseNotMine_btn,"Not Mine button");
		return value;
	}
	
	/* Password Page Actions */
	
	public Boolean loginPageDisplayed() {
		Boolean value=pageDisplayed(password_txt,"Subsequent Login Page Displayed");
		return value;
		
	}
	public LoginPage enterPassword(String Password){
		sendKeys(password_txt,Password,"Password");
		return this;
	}
	
	public String getSecurityPhrasePassword() {
		String text=getText(passwordSecurityPhrase_txt, "Security Phrase");
		return text;
	}

	public LoginPage clickEyeIcon() {
		click(eye_btn,"Next Button");
		return this;	
	}
	
	public LoginPage clickNextPswdbtn() {
		click(nextPswd_btn,"Next Button");
		return this;
	}
	
	public String getPasswordErrorMsg() {
		String text=getText(passwordErrMsg_lbl, "Password Error Msg");
		return text;
	}
	
	public String getPasswordErrorSnackBar() {
		String text=getText(snackbarErrMsg_lbl, "Password Error Msg");
		return text;
	}
	
	public LoginPage clickSnackBarCrossBtn() {
		click(snackbarCross_btn,"Click on snackbar cross button");
		return this;
		
	}
	

	
	/* QuickTouch Page Actions */
	
	
	public String getQuickTouchHeader() {
		String text=getText(activateQuickTouchHeader_lbl, "QuickTouch Header");
		return text;
	}
	
	public String getQuickTouchHeaderDesc() {
		String text=getText(activateQuickTouchDesc_lbl, "QuickTouch Header");
		return text;
	}
	
	public String getQuickTouchTitle() {
		String text=getText(quickTouchTitle_lbl, "QuickTouch Title");
		return text;
	}

	public Boolean verifyQuickTouchActivateNowDisplayed() {
		Boolean value=elementDisplayed(activateNow_btn,"Quick Touch Activate Now button");
		return value;
	}
	
	public Boolean verifyQuickTouchSkipThisDisplayed() {
		Boolean value=elementDisplayed(skip_btn,"Quick Touch Skip This button");
		return value;
	}
	
	public LoginPage clickSkipbtn() {
		click(skip_btn,"Skip Button");
		return this;
	}
	
	
	/* LetsStart Page Actions */
	
	public BankingDashboardPage clickLetsStartbtn() {
		click(letsStart_btn,"Lets Start Button");
		return new BankingDashboardPage();
	}
	
	public String getLetsStartHeaderDesc() {
		String text=getText(letsStartHeaderDesc_txt, "Lets Start Header");
		return text;
	}
	
	public String getLetsStartHeader() {
		String text=getText(letsStartHeader_txt, "Lets Start Header");
		return text;
	}
	
	/* Subsequent Login Page Actions */
	
	public LoginPage enterSubSequentPassword(String Password){
		sendKeys(subsequentEnterPassword_txt,Password,"Password");
		return this;
	}

	
	public BankingDashboardPage clickLoginButton() {
		click(subsequentlogin_btn,"login button");
		return new BankingDashboardPage();
	}
	
	

	
	
    public boolean swipeNotWorkingToDirection(MobileElement el, String direction) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            HashMap<String, String> swipeObject = new HashMap<String, String>();
            if (direction.equals("d")) {
                swipeObject.put("direction", "down");
                System.out.println("scrolled");
            } else if (direction.equals("u")) {
                swipeObject.put("direction", "up");
                System.out.println("scrolled");
            } else if (direction.equals("l")) {
                swipeObject.put("direction", "left");
            } else if (direction.equals("r")) {
                swipeObject.put("direction", "right");
            }
            swipeObject.put("element", el.getId());
            js.executeScript("mobile:swipe", swipeObject);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
	
		

	
	}
	



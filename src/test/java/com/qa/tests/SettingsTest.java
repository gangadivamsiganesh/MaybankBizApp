package com.qa.tests;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.BaseTest;
import com.qa.pages.BankingDashboardPage;
import com.qa.pages.ConfirmationPage;
import com.qa.pages.ControlCenterPage;
import com.qa.pages.ErrorMessagePage;
import com.qa.pages.LoginPage;
import com.qa.pages.MyDevicesPage;
import com.qa.pages.NotificationPage;
import com.qa.pages.OtpPage;
import com.qa.pages.PersonalProfilePage;
import com.qa.pages.SecurityPage;
import com.qa.pages.SecurityPhrasePage;
import com.qa.pages.BusinessProfilePage;
import com.qa.pages.SettingsPage;
import com.qa.utils.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class SettingsTest extends BaseTest {
	
	LoginPage loginPage;
	OtpPage otpPage;
	BankingDashboardPage dashboardPage;
	ControlCenterPage controlCenterPage;
	NotificationPage notificationPage;
	BusinessProfilePage profilePage;
	ConfirmationPage confirmationPage;
	SettingsPage settingsPage;
	BusinessProfilePage businessProfilePage;
	PersonalProfilePage personalProfilePage;
	MyDevicesPage myDevicesPage;
	SecurityPage securityPage;
	SecurityPhrasePage securityPhrasePage;
	ErrorMessagePage errorMessagePage;
	TestUtils utils = new TestUtils();


	@BeforeMethod(alwaysRun=true)
	public void beforeMethod(Method m) {
		loginPage=new LoginPage();
		System.out.println("\n" + "***********Starting Test:" +m.getName() +"************"+"\n");
	
	}
	@AfterMethod(alwaysRun=true)
	public void afterMethod(Method m) {
		closeApp();
		launchApp();
		
		
	}
	
	@Test(groups = { "SmokeTest","RegressionTest" })
	public void TC001_Verify_UI_Elements_of_Settings_Page() throws Throwable {
		SoftAssert softAssert=new SoftAssert();
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		controlCenterPage=dashboardPage.clickHelpButton();
		settingsPage=controlCenterPage.clickSettingsIcon();
		softAssert.assertTrue(settingsPage.settingsPageTitleDisplayed());
		String Title=settingsPage.getSettingsPageTitle();
		verifyText(Title,"Settings");
		softAssert.assertTrue(settingsPage.profileButtonDisplayed());
		softAssert.assertTrue(settingsPage.myDevicesDisplayed());
		softAssert.assertTrue(settingsPage.securityButtonDisplayed());
		softAssert.assertTrue(settingsPage.notificationButtonDisplayed());
		softAssert.assertAll();
	}
	
	
	@Test(groups = {"RegressionTest"})
	public void TC002_Verify_cross_button_functionality_on_SettingsPage() throws Throwable {
		SoftAssert softAssert=new SoftAssert();
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		controlCenterPage=dashboardPage.clickHelpButton();
		settingsPage=controlCenterPage.clickSettingsIcon();
		softAssert.assertTrue(settingsPage.settingsPageTitleDisplayed());
		String Title=settingsPage.getSettingsPageTitle();
		verifyText(Title,"Settings");
		settingsPage.clickCrossButton();
		controlCenterPage.verifyControlCenterPageDisplayed();
		softAssert.assertAll();
	}
	
	@Test(groups = { "SmokeTest","RegressionTest" })
	public void TC003_Verify_UI_Elements_of_BusinessProile_Page() throws Throwable {
		SoftAssert softAssert=new SoftAssert();
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		controlCenterPage=dashboardPage.clickHelpButton();
		settingsPage=controlCenterPage.clickSettingsIcon();
		businessProfilePage=settingsPage.clickProfile();
		softAssert.assertTrue(businessProfilePage.verifyBusinessProfilePageDisplayed());
		softAssert.assertTrue(businessProfilePage.verifyEditProfileButtonDisplayed());
		softAssert.assertTrue(businessProfilePage.verifyManagePageButtonDisplayed());
		softAssert.assertTrue(businessProfilePage.verifyAddressDisplayed());
		softAssert.assertTrue(businessProfilePage.verifyPhoneNumberDisplayed());
		softAssert.assertTrue(businessProfilePage.verifyEmailAddressDisplayed());
		softAssert.assertTrue(businessProfilePage.verifyWebsiteLabelDisplayed());
		softAssert.assertTrue(businessProfilePage.verifyViewPersonalButtonDisplayed());
		softAssert.assertAll();
		
	}
	@Test(groups = { "SmokeTest","RegressionTest","Demo" })
	public void TC004_Update_BusinessProfile_Website() throws Throwable {
		SoftAssert softAssert=new SoftAssert();
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		controlCenterPage=dashboardPage.clickHelpButton();
		settingsPage=controlCenterPage.clickSettingsIcon();
		businessProfilePage=settingsPage.clickProfile();
		String website=randomString("website",7);
		businessProfilePage.clickWebsite();
		businessProfilePage.enterWebsite(website);
		businessProfilePage.clickDoneBtn();
		businessProfilePage.clickConfirmBtn();
		String snacbarMsg=businessProfilePage.getSnackBarMsg();
		verifyTextContains(snacbarMsg,getStrings().get("BusinessProfileWebsite_SnackbarMsg"));
		businessProfilePage.clickSnackBarClose();
		String websiteNew=businessProfilePage.getWebsiteValue();
		//verifyText(website,websiteNew);
		softAssert.assertAll();
		
	}
	
	@Test(groups = {"RegressionTest"})
	public void TC005_verify_crossButton_functionality_of_BusinessProfilePage() throws Throwable {
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		controlCenterPage=dashboardPage.clickHelpButton();
		settingsPage=controlCenterPage.clickSettingsIcon();
		businessProfilePage=settingsPage.clickProfile();
		Assert.assertTrue(businessProfilePage.verifyBusinessProfilePageDisplayed());
		businessProfilePage.clickCrossButton();
		String Title=settingsPage.getSettingsPageTitle();
		verifyText(Title,"Settings");
	}
	

	
	
	@Test(groups = { "SmokeTest","RegressionTest" })
	public void TC006_Verify_UI_Elements_of_PersonalProile_Page() throws Throwable {
		SoftAssert softAssert=new SoftAssert();
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		controlCenterPage=dashboardPage.clickHelpButton();
		settingsPage=controlCenterPage.clickSettingsIcon();
		businessProfilePage=settingsPage.clickProfile();
		personalProfilePage=businessProfilePage.clickViewPersonalProfile();
		softAssert.assertTrue(personalProfilePage.verifyPersonalProfilePageDisplayed());
		softAssert.assertEquals(personalProfilePage.getPersonalProfileHeader(), "Personal Profile");
		softAssert.assertTrue(personalProfilePage.fullNameDisplayed());
		softAssert.assertTrue(personalProfilePage.emailDisplayed());
		softAssert.assertTrue(personalProfilePage.mobileDisplayed());
		softAssert.assertTrue(personalProfilePage.viewBusinessProfileBtnDisplayed());
		softAssert.assertTrue(personalProfilePage.editProfileIconDisplayed());
		softAssert.assertTrue(personalProfilePage.manageIconDisplayed());
		softAssert.assertAll();	
	}
	
	@Test(groups = { "SmokeTest","RegressionTest" , "Demo"})
	public void TC007_Update_PersonalProfile_Email() throws Throwable {
		SoftAssert softAssert=new SoftAssert();
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		controlCenterPage=dashboardPage.clickHelpButton();
		settingsPage=controlCenterPage.clickSettingsIcon();
		businessProfilePage=settingsPage.clickProfile();
		personalProfilePage=businessProfilePage.clickViewPersonalProfile();
		softAssert.assertTrue(personalProfilePage.verifyPersonalProfilePageDisplayed());
		personalProfilePage.clickPersonalEmail();
		String email=randomString("email",7);
		personalProfilePage.enterEmail(email);
		personalProfilePage.clickDoneBtn();
		personalProfilePage.clickConfirmBtn();
		String snacbarMsg=personalProfilePage.getSnackBarMsg();
		verifyTextContains(snacbarMsg,getStrings().get("PersonalProfileEmail_SnackbarMsg"));
		personalProfilePage.clickSnackBarClose();
		String emailNew=personalProfilePage.getEmailText();
		//verifyText(email,emailNew);
		softAssert.assertAll();	
		
	}
	
	@Test(groups = {"RegressionTest"})
	public void TC008_verify_crossButton_functionality_of_PersonalProfilePage() throws Throwable {
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		controlCenterPage=dashboardPage.clickHelpButton();
		settingsPage=controlCenterPage.clickSettingsIcon();
		businessProfilePage=settingsPage.clickProfile();
		personalProfilePage=businessProfilePage.clickViewPersonalProfile();
		Boolean pageDisplayed=personalProfilePage.verifyPersonalProfilePageDisplayed();
		Assert.assertTrue(pageDisplayed);
		personalProfilePage.clickCrossButton();
		String Title=settingsPage.getSettingsPageTitle();
		verifyText(Title,"Settings");
		
	}
	
	
	
	@Test(groups = {"RegressionTest"})
	public void TC009_Verify_Notification() throws Throwable {
		SoftAssert softAssert=new SoftAssert();
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		controlCenterPage=dashboardPage.clickHelpButton();
		settingsPage=controlCenterPage.clickSettingsIcon();
		notificationPage=settingsPage.clickNotificationButton();
		Assert.assertTrue(notificationPage.verifyNotificationPageDisplayed());

		notificationPage.clickImmediate_toggle();
		Boolean checkbox=notificationPage.Time10CheckboxDisplayed();
		if(checkbox==false) {
			notificationPage.clickSetATime_toggle();
		}
		softAssert.assertTrue(notificationPage.verifyImmediateToggleDisplayed());
		softAssert.assertTrue(notificationPage.verifySetATimeToggleDisplayed());
		softAssert.assertTrue(notificationPage.verifyTime10CheckboxDisplayed());
		softAssert.assertTrue(notificationPage.verifyTime15CheckboxDisplayed());
		softAssert.assertTrue(notificationPage.verifyTime17CheckboxDisplayed());
		softAssert.assertTrue(notificationPage.verifyTime20CheckboxDisplayed());
		softAssert.assertTrue(notificationPage.verifyDoneButtonDisplayed());
		softAssert.assertAll();	

	}
	
	@Test(groups = {"RegressionTest"})
	public void TC010_Verify_Notification_selectTime_errorMsg() throws Throwable {
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		controlCenterPage=dashboardPage.clickHelpButton();
		settingsPage=controlCenterPage.clickSettingsIcon();
		notificationPage=settingsPage.clickNotificationButton();
		Assert.assertTrue(notificationPage.verifyNotificationPageDisplayed());

		notificationPage.clickImmediate_toggle();
		Boolean checkbox=notificationPage.Time10CheckboxDisplayed();
		if(checkbox==false) {
			notificationPage.clickSetATime_toggle();
		}
		String errMsg=notificationPage.getErrTxt();
		verifyText(errMsg,getStrings().get("Notification_SelectATimeError_Msg"));
	
	}
	
	@Test(groups = {"RegressionTest"})
	public void TC011_Validate_to_add_time_for_Notification() throws Throwable {
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		controlCenterPage=dashboardPage.clickHelpButton();
		settingsPage=controlCenterPage.clickSettingsIcon();
		notificationPage=settingsPage.clickNotificationButton();
		Assert.assertTrue(notificationPage.verifyNotificationPageDisplayed());

		notificationPage.clickImmediate_toggle();
		Boolean checkbox=notificationPage.Time10CheckboxDisplayed();
		if(checkbox==false) {
			notificationPage.clickSetATime_toggle();
		}
		notificationPage.clickTime10ckkbox();
		otpPage=notificationPage.clickDone_btn();
		otpPage.clickConfirm_btn();
		confirmationPage=otpPage.enterOTP();
		String actulaMsg=confirmationPage.getSuccessfullMsg();
		String expectedMsg=getStrings().get("Notification_Success");
		verifyText(actulaMsg,expectedMsg);
		verifyText(confirmationPage.getSuccessfullMsgDesc(),"10:00");
		settingsPage=confirmationPage.clickBackToSettingsButton();
		String Title=settingsPage.getSettingsPageTitle();
		verifyText(Title,"Settings");
		
		
	
	}
	
	@Test(groups = {"RegressionTest"})
	public void TC012_Validate_crossButtonFunctionality_on_NotificationSuccesfullySetPage() throws Throwable {
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		controlCenterPage=dashboardPage.clickHelpButton();
		settingsPage=controlCenterPage.clickSettingsIcon();
		notificationPage=settingsPage.clickNotificationButton();
		Assert.assertTrue(notificationPage.verifyNotificationPageDisplayed());

		notificationPage.clickImmediate_toggle();
		Boolean checkbox=notificationPage.Time10CheckboxDisplayed();
		if(checkbox==false) {
			notificationPage.clickSetATime_toggle();
		}
		notificationPage.clickTime10ckkbox();
		otpPage=notificationPage.clickDone_btn();
		otpPage.clickConfirm_btn();
		confirmationPage=otpPage.enterOTP();
		String actulaMsg=confirmationPage.getSuccessfullMsg();
		String expectedMsg=getStrings().get("Notification_Success");
		verifyText(actulaMsg,expectedMsg);
		verifyText(confirmationPage.getSuccessfullMsgDesc(),"10:00");
		settingsPage=confirmationPage.clickCrossbutton();
		String Title=settingsPage.getSettingsPageTitle();
		verifyText(Title,"Settings");
		
		
	
	}
	
	@Test(groups = { "SmokeTest","RegressionTest" })
	public void TC013_Verify_UI_Elements_of_MyDevicesPage() throws Throwable {
		SoftAssert softAssert=new SoftAssert();
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		controlCenterPage=dashboardPage.clickHelpButton();
		settingsPage=controlCenterPage.clickSettingsIcon();
		myDevicesPage=settingsPage.clickMyDevices();
		Assert.assertTrue(myDevicesPage.myDevicesPageDisplayed());
		softAssert.assertTrue(myDevicesPage.crossButtonDisplayed());
		softAssert.assertTrue(myDevicesPage.device1Displayed());
		myDevicesPage.clickDevice();
		myDevicesPage.editButtonDisplayed();
		myDevicesPage.removeButtonDisplayed();
		softAssert.assertAll();
	}
	
	@Test(groups = {"RegressionTest"})
	public void TC014_Update_deviceName() throws Throwable {

		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		controlCenterPage=dashboardPage.clickHelpButton();
		settingsPage=controlCenterPage.clickSettingsIcon();
		myDevicesPage=settingsPage.clickMyDevices();
		Assert.assertTrue(myDevicesPage.myDevicesPageDisplayed());
		myDevicesPage.clickDevice();
		myDevicesPage.clickEditButton();
		String deviceName=randomString("alphabetic",7);
		myDevicesPage.enterDeviceName(deviceName);
		myDevicesPage.clickDoneButton();
		String snackBarMsg=myDevicesPage.getSnackBarMsg();
		String expectedMsg=getStrings().get("UpdateMyDevice");
		verifyText(snackBarMsg,expectedMsg);
		myDevicesPage.clickSnackBarClose();
		String newDevicename=myDevicesPage.getDeviceName();
		verifyText(deviceName,newDevicename);
		
	}
	@Test(groups = {"RegressionTest  "})
	public void TC015_verify_crossButton_functionality_on_MyDevicesName() throws Throwable {

		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		controlCenterPage=dashboardPage.clickHelpButton();
		settingsPage=controlCenterPage.clickSettingsIcon();
		myDevicesPage=settingsPage.clickMyDevices();
		Assert.assertTrue(myDevicesPage.myDevicesPageDisplayed());
	 settingsPage=myDevicesPage.clickCrossButton();
		String Title=settingsPage.getSettingsPageTitle();
		verifyText(Title,"Settings");
	}
	
	@Test(groups = { "SmokeTest","RegressionTest" })
	public void TC016_verify_UI_elements_of_SecurityPage() throws Throwable {
		SoftAssert softAssert=new SoftAssert();
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		controlCenterPage=dashboardPage.clickHelpButton();
		settingsPage=controlCenterPage.clickSettingsIcon();
		securityPage=settingsPage.clickSecurityButton();
		Assert.assertTrue(securityPage.securityPageDisplayed());
		softAssert.assertTrue(securityPage.changePasswordDisplayed());
		softAssert.assertTrue(securityPage.securityPhraseDisplayed());
		softAssert.assertTrue(securityPage.securityImageDisplayed());
		softAssert.assertTrue(securityPage.securityQuestionsButtonDisplayed());
		softAssert.assertTrue(securityPage.quickTouchToggleDisplayed());
		softAssert.assertAll();
		
	}
	
	@Test(groups = {"RegressionTest"})
	public void TC017_verify_CrossButton_functionslity_of_SecurityPage() throws Throwable {
		
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		controlCenterPage=dashboardPage.clickHelpButton();
		settingsPage=controlCenterPage.clickSettingsIcon();
		securityPage=settingsPage.clickSecurityButton();
		Assert.assertTrue(securityPage.securityPageDisplayed());
		settingsPage=securityPage.clickCrossButton();
		String Title=settingsPage.getSettingsPageTitle();
		verifyText(Title,"Settings");
	}
	
	@Test(groups = {"RegressionTest"})
	public void TC018_verify_QuickTouch_Functionality_for_DeviceNot_Registered_For_Biometric() throws Throwable {
		SoftAssert softAssert=new SoftAssert();
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		controlCenterPage=dashboardPage.clickHelpButton();
		settingsPage=controlCenterPage.clickSettingsIcon();
		securityPage=settingsPage.clickSecurityButton();
		errorMessagePage=securityPage.clickQuickTouch();
		softAssert.assertTrue(errorMessagePage.goToSettingsButtonDisplayed());
		String actualMsg=errorMessagePage.getErrorMessage();
		String expectedMsg="Touch ID Not Set Up";
		verifyText(actualMsg,expectedMsg);
		String actualMsgDesc=errorMessagePage.getErrorMsgDesc();
		String expectedMsgDesc="Head over to Settings to get it up and running!";
		verifyText(actualMsgDesc,expectedMsgDesc);
		softAssert.assertTrue(errorMessagePage.crossButtonDisplayed());
		securityPage=errorMessagePage.clickCrossButton();
		Assert.assertTrue(securityPage.securityPageDisplayed());
		softAssert.assertAll();
		
	}
	
	@Test(groups = { "SmokeTest","RegressionTest" })
		public void TC019_verify_UI_elements_of_SecurityPhrasePage() throws Throwable {
			SoftAssert softAssert=new SoftAssert();
			loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
			dashboardPage=loginPage.clickLoginButton();
			controlCenterPage=dashboardPage.clickHelpButton();
			settingsPage=controlCenterPage.clickSettingsIcon();
			securityPage=settingsPage.clickSecurityButton();
			Assert.assertTrue(securityPage.securityPageDisplayed());
			securityPhrasePage=securityPage.clickSecurityPhrase();
			softAssert.assertTrue(securityPhrasePage.securityPhrasePageDisplayed());
			softAssert.assertTrue(securityPhrasePage.crossButtonDisplayed());
			softAssert.assertTrue(securityPhrasePage.currentSecurityPhraseDisplayed());
			softAssert.assertTrue(securityPhrasePage.newSecurityPhraseDisplayed());
			securityPhrasePage.clickSecurityPhrase();
			softAssert.assertTrue(securityPhrasePage.doneButtonDisplayed());
			softAssert.assertAll();
		}
	
	@Test(groups = {"RegressionTest"})
	public void TC020_Change_Security_Phrase() throws Throwable {
	
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		controlCenterPage=dashboardPage.clickHelpButton();
		settingsPage=controlCenterPage.clickSettingsIcon();
		securityPage=settingsPage.clickSecurityButton();
		securityPhrasePage=securityPage.clickSecurityPhrase();
		String securityPhrase=securityPhrasePage.getCurrentSecurityPhrase();
		securityPhrasePage.enterSecurityPhrase(securityPhrase);
		otpPage=securityPhrasePage.clickDoneButton();
		otpPage.clickConfirm_btn();
		otpPage.enterOTP();
		String snackBarMsg=securityPage.getSnackBarMsg();
		String expectedMsg=getStrings().get("SecurityPhrase_msg");
		verifyText(snackBarMsg,expectedMsg);
		
	}
	

	@Test(groups = {"RegressionTest"})
	public void TC021_verify_SecurityPhrase_cross_button_functionality() throws Throwable {
		SoftAssert softAssert=new SoftAssert();
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		controlCenterPage=dashboardPage.clickHelpButton();
		settingsPage=controlCenterPage.clickSettingsIcon();
		securityPage=settingsPage.clickSecurityButton();
		securityPhrasePage=securityPage.clickSecurityPhrase();
		softAssert.assertTrue(securityPhrasePage.securityPhrasePageDisplayed());
		securityPage=securityPhrasePage.clickCrossButton();
		softAssert.assertTrue(securityPage.securityPageDisplayed());
		softAssert.assertAll();
		
	}	
}

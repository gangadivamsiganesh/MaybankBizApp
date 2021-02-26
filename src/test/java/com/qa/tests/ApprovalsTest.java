package com.qa.tests;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.BaseTest;
import com.qa.pages.ApprovalDashboardPage;
import com.qa.pages.ApprovalFilterPage;
import com.qa.pages.BankingDashboardPage;
import com.qa.pages.BusinessProfilePage;
import com.qa.pages.ConfirmationPage;
import com.qa.pages.ControlCenterPage;
import com.qa.pages.LoginPage;
import com.qa.pages.MyDevicesPage;
import com.qa.pages.NotificationPage;
import com.qa.pages.OtpPage;
import com.qa.pages.PersonalProfilePage;
import com.qa.pages.ReviewDetailsPage;
import com.qa.pages.SettingsPage;
import com.qa.pages.ThankYouPage;
import com.qa.utils.TestUtils;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class ApprovalsTest extends BaseTest

{

	LoginPage loginPage;
	OtpPage otpPage;
	BankingDashboardPage dashboardPage;
	ControlCenterPage controlCenterPage;
	NotificationPage notificationPage;
	BusinessProfilePage profilePage;
	ConfirmationPage confirmationPage;
	ApprovalDashboardPage approvalDashboardPage;
	ApprovalFilterPage approvalFilterPage;
	SettingsPage settingsPage;
	BusinessProfilePage businessProfilePage;
	PersonalProfilePage personalProfilePage;
	MyDevicesPage myDevicesPage;
	ReviewDetailsPage reviewDetailsPage;
	ThankYouPage thankYouPage;
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
	
	
	//@Test(groups = { "Demo"}) 
	public void chnageToMakerFlow() throws InterruptedException{
		Boolean paymentIcon=false;
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		paymentIcon=dashboardPage.verifyPaymentsIconDisplayed();
		if(paymentIcon==false) {
			controlCenterPage=dashboardPage.clickHelpButton();
			settingsPage=controlCenterPage.clickSettingsIcon();
			myDevicesPage=settingsPage.clickMyDevices();
			Assert.assertTrue(myDevicesPage.myDevicesPageDisplayed());
			MobileElement e=(MobileElement) getDriver().findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"Current Device\")"));
			e.click();
			myDevicesPage.clickRemoveButton();
			myDevicesPage.clickYesButton();		
			String IntroPageTitle=loginPage.getIntroPageTitle();
			verifyText(IntroPageTitle,"Welcome");
			scrollToCard();
			loginPage.clickLoginToM2UBizButton();
			loginPage.enterUserName(loginUsers.getJSONObject("makerCredentials").getString("username"));
			loginPage.clickNextbtn();
			loginPage.clickSecurityPhraseYesbtn();

			loginPage.enterPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
				loginPage.clickNextPswdbtn();
				loginPage.clickSkipbtn();
				dashboardPage=loginPage.clickLetsStartbtn();
				Assert.assertTrue(dashboardPage.verifyBankingDashboardisplayed());
				}
	}
	@Test(groups = { "Demo"}) 
	public void approvalTest1() throws Throwable {
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		Assert.assertTrue(dashboardPage.verifyBankingDashboardisplayed());
		approvalDashboardPage=dashboardPage.clickApprovalIcon();
		approvalDashboardPage.verifyApprovalDashboardisplayed();
		approvalFilterPage=approvalDashboardPage.clickOnFilter();
		
		//approvalDashboardPage.clickOnRecord();
		//approvalFilterPage.clickviewFilterbtn();
		approvalFilterPage.sortBybtn();
		approvalFilterPage.clickonLatest();
		approvalDashboardPage=approvalFilterPage.clickonApplyFilter();
		reviewDetailsPage=approvalDashboardPage.clickOnRecord();
		otpPage=reviewDetailsPage.clickApproveButton();
		otpPage.clickConfirm_btn();
		thankYouPage=otpPage.enterOTP_Transfers();
		thankYouPage.verifyThankYouPageDisplayed();
		
		
	}
		
		


	
	
}

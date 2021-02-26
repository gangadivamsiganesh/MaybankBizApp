package com.qa.tests;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.BaseTest;
import com.qa.pages.BankingDashboardPage;
import com.qa.pages.ConfirmationPage;
import com.qa.pages.ControlCenterPage;
import com.qa.pages.LoginPage;
import com.qa.pages.LogoutPage;
import com.qa.pages.NotificationPage;
import com.qa.pages.OtpPage;
import com.qa.pages.BusinessProfilePage;
import com.qa.pages.SettingsPage;
import com.qa.utils.TestUtils;

public class ControlCenterTest extends BaseTest{
	
	
	LoginPage loginPage;
	OtpPage otpPage;
	BankingDashboardPage dashboardPage;
	ControlCenterPage controlCenterPage;
	NotificationPage notificationPage;
	BusinessProfilePage profilePage;
	LogoutPage logoutPage;
	ConfirmationPage confirmationPage;
	SettingsPage settingsPage;
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
	
	@Test(groups = { "SmokeTest","RegressionTest1" })
	public void tc001_verify_UI_elements_of_ControlCenterPage() {
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		Assert.assertTrue(dashboardPage.verifyBankingDashboardisplayed());
		controlCenterPage=dashboardPage.clickHelpButton();
		controlCenterPage.verifyControlCenterPageDisplayed();
		Boolean profileImg=controlCenterPage.verifyProfileImageDisplayed();
		Assert.assertTrue(profileImg);
		Boolean Username=controlCenterPage.verifyUserNameDisplayed();
		Assert.assertTrue(Username);
		Boolean crossBtn=controlCenterPage.verifyCrossIconDisplayed();
		Assert.assertTrue(crossBtn);
		Boolean logout=controlCenterPage.verifyLogoutIconDisplayed();
		Assert.assertTrue(logout);
		//String msg=controlCenterPage.getControlCenterHeaderMsg();
		//verifyText(msg,"Business Accounts");
		Boolean apply=controlCenterPage.verifyApplyIconDisplayed();
		Assert.assertTrue(apply);
		Boolean myArticles=controlCenterPage.verifyMyArticlesIconDisplayed();
		Assert.assertTrue(myArticles);
		Boolean events=controlCenterPage.verifyEventsIconDisplayed();
		Assert.assertTrue(events);
		Boolean settings=controlCenterPage.verifySettingsIconDisplayed();
		Assert.assertTrue(settings);
		Boolean help=controlCenterPage.verifyHelpIconDisplayed();
		Assert.assertTrue(help);
		
	}
	
	@Test(groups = {"RegressionTest"})
	public void tc002_verify_logout_from_controlCenter() {
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		Assert.assertTrue(dashboardPage.verifyBankingDashboardisplayed());
		controlCenterPage=dashboardPage.clickHelpButton();
		controlCenterPage.verifyControlCenterPageDisplayed();
		logoutPage=controlCenterPage.clickLogoutButton();
		String msg=logoutPage.getLogoutMsg();
		verifyText(msg,"Logout Successful");
		
	}
	
	
	@Test(groups = { "SmokeTest","RegressionTest" })
	public void tc003_verify_crossBtn_functionality_from_controlCenter() throws Throwable {
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		Assert.assertTrue(dashboardPage.verifyBankingDashboardisplayed());
		controlCenterPage=dashboardPage.clickHelpButton();
		controlCenterPage.verifyControlCenterPageDisplayed();
		controlCenterPage.clickCrossButton();
		Assert.assertTrue(dashboardPage.verifyBankingDashboardisplayed());
	}
	
	@Test(groups = {"RegressionTest"})
	public void tc004_verify_user_navigates_to_SettingsPage_by_clicking_on_settings_icon_on_controlcenter() {
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		Assert.assertTrue(dashboardPage.verifyBankingDashboardisplayed());
		controlCenterPage=dashboardPage.clickHelpButton();
		controlCenterPage.verifyControlCenterPageDisplayed();
		settingsPage=controlCenterPage.clickSettingsIcon();
		Assert.assertTrue(settingsPage.verifySettingsPageDisplayed());
	}

	@Test(groups = {"RegressionTest"})
	public void tc005_verify_user_navigates_to_Profile_Page_by_clicking_on_UserProfile_icon_on_controlcenter() {
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		Assert.assertTrue(dashboardPage.verifyBankingDashboardisplayed());
		controlCenterPage=dashboardPage.clickHelpButton();
		controlCenterPage.verifyControlCenterPageDisplayed();
		profilePage=controlCenterPage.clickUserprofile();
		Assert.assertTrue(profilePage.verifyBusinessProfilePageDisplayed());
	}
}

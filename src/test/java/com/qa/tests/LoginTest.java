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
import com.qa.pages.NotificationPage;
import com.qa.pages.OtpPage;
import com.qa.pages.BusinessProfilePage;
import com.qa.utils.TestUtils;

public class LoginTest extends BaseTest {
	LoginPage loginPage;
	OtpPage otpPage;
	BankingDashboardPage dashboardPage;
	ControlCenterPage controlCenterPage;
	NotificationPage notificationPage;
	BusinessProfilePage profilePage;
	ConfirmationPage confirmationPage;
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
	
	@Test(groups = {"RegressionTest"})
	public void tc001_verify_login_functionality_with_invalid_credentials() throws Throwable{
		scrollToCard();
		loginPage.clickLoginToM2UBizButton();
		loginPage.enterUserName("Test123");
		loginPage.clickNextbtn();	
		String securityPhrase=loginPage.getSecurityPhrase();
		verifyTextContains(securityPhrase,"Random_Phrase");
		loginPage.clickSecurityPhraseYesbtn();
		loginPage.enterPassword("testte");
		loginPage.clickNextPswdbtn();
		String ErrMsg=loginPage.getPasswordErrorMsg();
		verifyTextContains(ErrMsg,getStrings().get("PasswordErrMsg_LessThan8"));
		loginPage.enterPassword("testtests");
		loginPage.clickNextPswdbtn();
		ErrMsg=loginPage.getPasswordErrorMsg();
		verifyTextContains(ErrMsg,getStrings().get("PasswordErrMsg_MoreThan8"));
		loginPage.enterPassword("Test@123");
		loginPage.clickNextPswdbtn();
		ErrMsg=loginPage.getPasswordErrorSnackBar();
		verifyTextContains(ErrMsg,getStrings().get("PasswordSnackBarErrMsg"));
		loginPage.clickSnackBarCrossBtn();
	}
	
	@Test(groups = { "SmokeTest","RegressionTest","Demo" })
	public void tc002_verify_login_functionality_and_UI_elements_of_LoginPage() throws Throwable {
		
		String IntroPageTitle=loginPage.getIntroPageTitle();
		verifyText(IntroPageTitle,"Welcome");
		scrollToCard();
		//String IntroPageHeader=loginPage.getIntroPageHeader();
		//verifyText(IntroPageHeader,"From Insight to Foresight");
		//String IntroPageHeaderDesc=loginPage.getIntroPageHeaderDesc();
		//verifyText(IntroPageHeaderDesc,"Get insights on your cash flow and anticipate what may be around the corner.");		
		//String IntroPageNoAccount=loginPage.getIntroPageHeader();
		//verifyText(IntroPageNoAccount,"FromInsighttoForesight");
		loginPage.clickLoginToM2UBizButton();
		//verifyText(LoginPageTitle,"Login");
		//String LoginPageHeader=loginPage.getUsernamePageHeader();
		//verifyText(LoginPageHeader,"Let's get you and your business logged in");
		
		Boolean crossBtnIsDisplayed=loginPage.verifyCrossButtonDisplayed();
		Assert.assertTrue(crossBtnIsDisplayed);
		Boolean helpBtnIsDisplayed=loginPage.verifyHelpDisplayed();
		Assert.assertTrue(helpBtnIsDisplayed);
		//IntroPageNoAccount=loginPage.getIntroPageHeader();
		//verifyText(IntroPageNoAccount,"No account? Apply Now");
		loginPage.enterUserName(loginUsers.getJSONObject("makerCredentials").getString("username"));
			loginPage.clickNextbtn();
		String SecurityPhraseDesc=loginPage.getSecurityPhraseHeaderText();
		verifyText(SecurityPhraseDesc,"Is this your security phrase?");
		Boolean YesbtnDisplayed=loginPage.verifySecurityYesButtonDisplayed();
		Assert.assertTrue(YesbtnDisplayed);

		Boolean NotMinebtnDisplayed=loginPage.verifySecurityPhraseNotMineButtonDisplayed();
		Assert.assertTrue(NotMinebtnDisplayed);
		
		Boolean SecurityPhraseCrossBtnIsDisplayed=loginPage.verifyCrossButtonDisplayed();
		Assert.assertTrue(SecurityPhraseCrossBtnIsDisplayed);
		loginPage.clickSecurityPhraseYesbtn();
		Assert.assertTrue(helpBtnIsDisplayed);
		Assert.assertTrue(crossBtnIsDisplayed);
		
		loginPage.enterPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
			loginPage.clickNextPswdbtn();
		
		String QuickTouchTitle=loginPage.getQuickTouchTitle();
		verifyText(QuickTouchTitle,"Quick Touch");
		
		String QuickTouchHreader=loginPage.getQuickTouchHeader();
		verifyText(QuickTouchHreader,"Activate Quick Touch?");
		
		String QuickTouchHreaderDesc=loginPage.getQuickTouchHeaderDesc();
		verifyText(QuickTouchHreaderDesc,"Allow fingerprint recognition for quicker login and transaction authorisation.");
		
		Assert.assertTrue(loginPage.verifyQuickTouchActivateNowDisplayed());
		Assert.assertTrue(loginPage.verifyQuickTouchSkipThisDisplayed());
		loginPage.clickSkipbtn();
		
		String welcomeScreenHeaderDesc=loginPage.getLetsStartHeaderDesc();
		verifyText(welcomeScreenHeaderDesc,"You’re set up for on-the-go business banking with Maybank2U Biz.");
		dashboardPage=loginPage.clickLetsStartbtn();
		Assert.assertTrue(dashboardPage.verifyBankingDashboardisplayed());
		
	}
	@Test(groups = {"RegressionTest"})
	public void tc003_verify_subsequent_login_with_invalid_password() throws Throwable {
		loginPage.enterSubSequentPassword("Test@1234");
		loginPage.clickLoginButton();
		String ErrMsg=loginPage.getPasswordErrorSnackBar();
		verifyTextContains(ErrMsg,getStrings().get("PasswordSnackBarErrMsg"));
		loginPage.clickSnackBarCrossBtn();
		
	}
	
	@Test(groups = { "SmokeTest","RegressionTest" })
	public void tc004_verify_subsequent_login_with_valid_password() throws Throwable {
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		Assert.assertTrue(dashboardPage.verifyBankingDashboardisplayed());
		
	}
	

	


}

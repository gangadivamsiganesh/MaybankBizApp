package com.qa.tests;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.BaseTest;
import com.qa.pages.BankingDashboardPage;
import com.qa.pages.BusinessProfilePage;
import com.qa.pages.ConfirmationPage;
import com.qa.pages.ControlCenterPage;
import com.qa.pages.LoginPage;
import com.qa.pages.LogoutPage;
import com.qa.pages.NotificationPage;
import com.qa.pages.OtpPage;
import com.qa.utils.TestUtils;

public class BankingDashBoardTest extends BaseTest{
	
	LoginPage loginPage;
	OtpPage otpPage;
	BankingDashboardPage dashboardPage;
	ControlCenterPage controlCenterPage;
	NotificationPage notificationPage;
	BusinessProfilePage profilePage;
	LogoutPage logoutPage;
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
	@Test(groups = { "SmokeTest" ,"RegressionTest"})
	public void tc001_verify_UI_elements_of_BusinessAccounts_Dasboard_Maker() throws Throwable {
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		Assert.assertTrue(dashboardPage.verifyBankingDashboardisplayed());
		Boolean helpCTA=dashboardPage.verifyHelpCTADisplayed();
		Assert.assertTrue(helpCTA);
		Boolean logoutCTA=dashboardPage.verifyLogoutBtnDisplayed();
		Assert.assertTrue(logoutCTA);
		Boolean assets=dashboardPage.verifyAssetsIconDisplayed();
		Assert.assertTrue(assets);
		Boolean liabilities=dashboardPage.verifyLiabilitiesIconDisplayed();
		Assert.assertTrue(liabilities);
		Boolean payments=dashboardPage.verifyPaymentsIconDisplayed();
		Assert.assertTrue(payments);
		Boolean approval=dashboardPage.verifyApprovalIconDisplayed();
		Assert.assertTrue(approval);
		Boolean transfer=dashboardPage.verifyTransferIcononDisplayed();
		Assert.assertTrue(transfer);
		Boolean inbox=dashboardPage.verifyInboxIconDisplayed();
		Assert.assertTrue(inbox);
		Boolean invoice=dashboardPage.verifyInvoiceIconDisplayed();
		Assert.assertTrue(invoice);
		Boolean business=dashboardPage.verifyBusinessIconDisplayed();
		Assert.assertTrue(business);
		Boolean BAcard=dashboardPage.verifyBAcardDisplayed();
		Assert.assertTrue(BAcard);
		String BACardName=dashboardPage.getTextOfBAcard();
		verifyText(BACardName,"Business Accounts");
		String BACardAvailableBalLabel=dashboardPage.getTextOfAvailBalLabelLbBA();
		verifyText(BACardAvailableBalLabel,"Available Balance");
		
	}
	
	@Test(groups = { "SmokeTest","RegressionTest" })
	public void tc002_verify_UI_elements_of_FixedDeposit_Dasboard_Maker() throws Throwable {
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		Assert.assertTrue(dashboardPage.verifyBankingDashboardisplayed());
		dashboardPage.swipeToCard("FixedDeposit");
		Boolean FDcard=dashboardPage.verifyFDcardDisplayed();
		Assert.assertTrue(FDcard);
		String FDCardName=dashboardPage.getTextOfFDcard();
		verifyText(FDCardName,"Fixed Deposit");
		String FDTotalAmount=dashboardPage.getTextOfTotalAmountLabelFD();
		verifyText(FDTotalAmount,"Total Amount");
		Boolean helpCTA=dashboardPage.verifyHelpCTADisplayed();
		Assert.assertTrue(helpCTA);
		Boolean logoutCTA=dashboardPage.verifyLogoutBtnDisplayed();
		Assert.assertTrue(logoutCTA);
		Boolean assets=dashboardPage.verifyAssetsIconDisplayed();
		Assert.assertTrue(assets);
		Boolean liabilities=dashboardPage.verifyLiabilitiesIconDisplayed();
		Assert.assertTrue(liabilities);
		Boolean payments=dashboardPage.verifyPaymentsIconDisplayed();
		Assert.assertTrue(payments);
		Boolean approval=dashboardPage.verifyApprovalIconDisplayed();
		Assert.assertTrue(approval);
		Boolean transfer=dashboardPage.verifyTransferIcononDisplayed();
		Assert.assertTrue(transfer);
		Boolean inbox=dashboardPage.verifyInboxIconDisplayed();
		Assert.assertTrue(inbox);
		Boolean invoice=dashboardPage.verifyInvoiceIconDisplayed();
		Assert.assertTrue(invoice);
		Boolean business=dashboardPage.verifyBusinessIconDisplayed();
		Assert.assertTrue(business);
		
	}
	
	@Test(groups = { "SmokeTest","RegressionTest" })
	public void tc003_verify_UI_elements_of_TermLoan_Dasboard_Maker() throws Throwable {
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		Assert.assertTrue(dashboardPage.verifyBankingDashboardisplayed());
		dashboardPage.clickLiabilitiesIcon();
		Boolean card=dashboardPage.verifyTLCardDisplayed();
		Assert.assertTrue(card);
		String CardName=dashboardPage.getTextOfTLcard();
		verifyText(CardName,"Loans");
		String outstandingBal=dashboardPage.getTextOfOutStandingBalLabelTL();
		verifyText(outstandingBal,"Outstanding Balance");
		Boolean helpCTA=dashboardPage.verifyHelpCTADisplayed();
		Assert.assertTrue(helpCTA);
		Boolean logoutCTA=dashboardPage.verifyLogoutBtnDisplayed();
		Assert.assertTrue(logoutCTA);
		Boolean assets=dashboardPage.verifyAssetsIconDisplayed();
		Assert.assertTrue(assets);
		Boolean liabilities=dashboardPage.verifyLiabilitiesIconDisplayed();
		Assert.assertTrue(liabilities);
		Boolean payments=dashboardPage.verifyPaymentsIconDisplayed();
		Assert.assertTrue(payments);
		Boolean approval=dashboardPage.verifyApprovalIconDisplayed();
		Assert.assertTrue(approval);
		Boolean transfer=dashboardPage.verifyTransferIcononDisplayed();
		Assert.assertTrue(transfer);
		Boolean inbox=dashboardPage.verifyInboxIconDisplayed();
		Assert.assertTrue(inbox);
		Boolean invoice=dashboardPage.verifyInvoiceIconDisplayed();
		Assert.assertTrue(invoice);
		Boolean business=dashboardPage.verifyBusinessIconDisplayed();
		Assert.assertTrue(business);
		
	}
	
	
	@Test(groups = { "SmokeTest" ,"RegressionTest"})
	public void tc004_verify_UI_elements_of_HirePurchase_Dasboard_Maker() throws Throwable {
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		Assert.assertTrue(dashboardPage.verifyBankingDashboardisplayed());
		dashboardPage.clickLiabilitiesIcon();
		dashboardPage.swipeToCard("HirePurchase");
		Boolean HPcard=dashboardPage.verifyHPCardDisplayed();
		Assert.assertTrue(HPcard);
		String CardName=dashboardPage.getTextOfHPcard();
		verifyText(CardName,"Hire Purchase");
		String outstandingBal=dashboardPage.getTextOfOutStandingBalLabelHP();
		verifyText(outstandingBal,"Outstanding Balance");
		Boolean helpCTA=dashboardPage.verifyHelpCTADisplayed();
		Assert.assertTrue(helpCTA);
		Boolean logoutCTA=dashboardPage.verifyLogoutBtnDisplayed();
		Assert.assertTrue(logoutCTA);
		Boolean assets=dashboardPage.verifyAssetsIconDisplayed();
		Assert.assertTrue(assets);
		Boolean liabilities=dashboardPage.verifyLiabilitiesIconDisplayed();
		Assert.assertTrue(liabilities);
		Boolean payments=dashboardPage.verifyPaymentsIconDisplayed();
		Assert.assertTrue(payments);
		Boolean approval=dashboardPage.verifyApprovalIconDisplayed();
		Assert.assertTrue(approval);
		Boolean transfer=dashboardPage.verifyTransferIcononDisplayed();
		Assert.assertTrue(transfer);
		Boolean inbox=dashboardPage.verifyInboxIconDisplayed();
		Assert.assertTrue(inbox);
		Boolean invoice=dashboardPage.verifyInvoiceIconDisplayed();
		Assert.assertTrue(invoice);
		Boolean business=dashboardPage.verifyBusinessIconDisplayed();
		Assert.assertTrue(business);
		
	}
	@Test(groups = {"SmokeTest","RegressionTest"})
	public void tc005_verify_logout_from_banking_dashboard() throws Throwable {
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		Assert.assertTrue(dashboardPage.verifyBankingDashboardisplayed());
		logoutPage=dashboardPage.clickLogout();
		String msg=logoutPage.getLogoutMsg();
		verifyText(msg,"Logout Successful");
		
	}
	
	@Test(groups = { "SmokeTest","RegressionTest" })
	public void tc006_verify_control_centerCTA_from_banking_dashboard() throws Throwable {
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		Assert.assertTrue(dashboardPage.verifyBankingDashboardisplayed());
		controlCenterPage=dashboardPage.clickHelpButton();
		controlCenterPage.verifyControlCenterPageDisplayed();
		
	}
	
	
}

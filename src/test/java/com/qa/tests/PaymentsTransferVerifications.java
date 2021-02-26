package com.qa.tests;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.BaseTest;
import com.qa.pages.AddFavSuccessfulPage;
import com.qa.pages.AddFavTypePage;
import com.qa.pages.ApprovalDashboardPage;
import com.qa.pages.ApprovalFilterPage;
import com.qa.pages.BankListPage;
import com.qa.pages.BankingDashboardPage;
import com.qa.pages.BillerDetailsPage;
import com.qa.pages.BusinessProfilePage;
import com.qa.pages.CalenderPage;
import com.qa.pages.ConfirmationPage;
import com.qa.pages.ControlCenterPage;
import com.qa.pages.DuitNowSelectIDPage;
import com.qa.pages.EnterAmountPage;
import com.qa.pages.LoginPage;
import com.qa.pages.LogoutPage;
import com.qa.pages.MyDevicesPage;
import com.qa.pages.NotificationPage;
import com.qa.pages.OtpPage;
import com.qa.pages.PayFromPage;
import com.qa.pages.PaymentsDashboardPage;
import com.qa.pages.PaymentsDetailsPage;
import com.qa.pages.ReviewDetailsPage;
import com.qa.pages.SettingsPage;
import com.qa.pages.ThankYouPage;
import com.qa.pages.TransferDashboardPage;
import com.qa.pages.TransferDetailsPage;
import com.qa.pages.TransferFromPage;
import com.qa.pages.TransferToPage;
import com.qa.utils.TestUtils;

public class PaymentsTransferVerifications extends BaseTest{

	LoginPage loginPage;
	OtpPage otpPage;
	BankingDashboardPage dashboardPage;
	ControlCenterPage controlCenterPage;
	NotificationPage notificationPage;
	BusinessProfilePage profilePage;
	LogoutPage logoutPage;
	ConfirmationPage confirmationPage;
	PaymentsDashboardPage paymentsDashboardPage;
	PayFromPage payFromPage;
	BillerDetailsPage billerDetailsPage;
	EnterAmountPage enterAmountPage;
	PaymentsDetailsPage paymentsDetailsPage;
	ReviewDetailsPage reviewDetailsPage;
	ThankYouPage thankYouPage;
	SettingsPage settingsPage;
	MyDevicesPage myDevicesPage;
	CalenderPage calenderPage;
	AddFavSuccessfulPage addFavSuccessfulPage;
	ApprovalDashboardPage approvalDashboardPage;
	ApprovalFilterPage approvalFilterPage;
	AddFavTypePage addFavTypePage;
	TransferDashboardPage transferDashboardPage;
	TransferFromPage transferFromPage;
	TransferToPage transferToPage;
	TransferDetailsPage transferDetailsPage;
	BankListPage bankListPage;
	DuitNowSelectIDPage duitNowSelectIDPage;
	TestUtils utils = new TestUtils();

	@BeforeMethod(alwaysRun=true)
	public void beforeMethod(Method m) throws InterruptedException {
		loginPage=new LoginPage();
		System.out.println("\n" + "***********Starting Test:" +m.getName() +"************"+"\n");	

	}
	@AfterMethod(alwaysRun=true)
	public void afterMethod(Method m) {
		closeApp();
		launchApp();
	}
	
	
	@Test(groups = { "SmokeTest","RegressionTest" })
	public void tc001_verify_UI_elements_of_PaymentsDashboardPage() throws Throwable {
		
		SoftAssert softAssert=new SoftAssert();
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		Assert.assertTrue(dashboardPage.verifyBankingDashboardisplayed());
		paymentsDashboardPage=dashboardPage.clickPaymentsIcon();
		Assert.assertTrue(paymentsDashboardPage.verifyPaymentDashboardisplayed());
		Assert.assertTrue(paymentsDashboardPage.verifyBackButtonDisplayed());
		softAssert.assertTrue(paymentsDashboardPage.verifyRecentSectionDisplayed());
		softAssert.assertTrue(paymentsDashboardPage.verifyPaymentsSectionDisplayed());
		softAssert.assertTrue(paymentsDashboardPage.verifyNewBillPaymentIconDisplayed());
		softAssert.assertTrue(paymentsDashboardPage.verifyJompayIconDisplayed());
		softAssert.assertTrue(paymentsDashboardPage.verifyFavouritesSectionDisplayed());
		softAssert.assertTrue(paymentsDashboardPage.verifyFavSearchDisplayed());
		softAssert.assertTrue(paymentsDashboardPage.verifyFavSearchIconDisplayed());
		softAssert.assertTrue(paymentsDashboardPage.verifyAddNewFavButtonDisplayed());
		softAssert.assertAll();
	}
	
	@Test(groups = {"RegressionTest"})
	public void tc002_verify_backButton_Functionality_On_PaymentsDashboardPage() throws Throwable {
		
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		Assert.assertTrue(dashboardPage.verifyBankingDashboardisplayed());
		paymentsDashboardPage=dashboardPage.clickPaymentsIcon();
		Assert.assertTrue(paymentsDashboardPage.verifyPaymentDashboardisplayed());
		dashboardPage=paymentsDashboardPage.clickBackbutton();
		Assert.assertTrue(dashboardPage.verifyBankingDashboardisplayed());
	}
	
	@Test(groups = {"RegressionTest"})
	public void tc003_verify_UI_elements_of_PayFromScreen() throws Throwable {
		
		SoftAssert softAssert=new SoftAssert();
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		Assert.assertTrue(dashboardPage.verifyBankingDashboardisplayed());
		paymentsDashboardPage=dashboardPage.clickPaymentsIcon();
		Assert.assertTrue(paymentsDashboardPage.verifyPaymentDashboardisplayed());
		payFromPage=paymentsDashboardPage.clickJomPayPayment();
		Assert.assertTrue(payFromPage.verifyPayFromPageDisplayed());
		String header=payFromPage.getPayFromHeader();
		verifyText(header,"Bank Account");
		softAssert.assertTrue(payFromPage.verifyBackButtonDisplayed());
		softAssert.assertTrue(payFromPage.verifyPayFromAccountNameDisplayed());
		softAssert.assertTrue(payFromPage.verifyPayFromAccountNumberDisplayed());
		softAssert.assertTrue(payFromPage.verifyPayFromAmountDisplayed());
		softAssert.assertAll();
	}
	
	@Test(groups = {"RegressionTest"})
	public void tc004_verify_UI_elements_of_JompayBillerDetailsPage() throws Throwable {
		
		SoftAssert softAssert=new SoftAssert();
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		Assert.assertTrue(dashboardPage.verifyBankingDashboardisplayed());
		paymentsDashboardPage=dashboardPage.clickPaymentsIcon();
		Assert.assertTrue(paymentsDashboardPage.verifyPaymentDashboardisplayed());
		payFromPage=paymentsDashboardPage.clickJomPayPayment();
		Assert.assertTrue(payFromPage.verifyPayFromPageDisplayed());
		billerDetailsPage=payFromPage.clickPayFromAccount();
		Assert.assertTrue(billerDetailsPage.verifyJompayBillerDetailsPageDisplayed());
		softAssert.assertTrue(billerDetailsPage.verifyBackButtonDisplayed());
		softAssert.assertTrue(billerDetailsPage.verifyBillerCodeLabelDisplayed());
		softAssert.assertTrue(billerDetailsPage.verifyReferenceNumber1Displayed());
		softAssert.assertTrue(billerDetailsPage.verifyReferenceNumber2Displayed());
		softAssert.assertTrue(billerDetailsPage.verifyContinueButtonDisplayed());
		softAssert.assertAll();
	}
	
	@Test(groups = {"RegressionTest"})
	public void tc005_verify_UI_elements_of_JompayPaymentDetailsPage() throws Throwable {
		
		SoftAssert softAssert=new SoftAssert();
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		Assert.assertTrue(dashboardPage.verifyBankingDashboardisplayed());
		paymentsDashboardPage=dashboardPage.clickPaymentsIcon();
		Assert.assertTrue(paymentsDashboardPage.verifyPaymentDashboardisplayed());
		payFromPage=paymentsDashboardPage.clickJomPayPayment();
		Assert.assertTrue(payFromPage.verifyPayFromPageDisplayed());
		billerDetailsPage=payFromPage.clickPayFromAccount();
		Assert.assertTrue(billerDetailsPage.verifyJompayBillerDetailsPageDisplayed());
		billerDetailsPage.enterBillerCode(loginUsers.getJSONObject("jompayBillerDetails").getString("billerCode"));
		billerDetailsPage.enterReferenceNumber1(loginUsers.getJSONObject("jompayBillerDetails").getString("ref1"));
		billerDetailsPage.enterReferenceNumber2(loginUsers.getJSONObject("jompayBillerDetails").getString("ref2"));
		enterAmountPage=billerDetailsPage.clickContinueButton();
		Assert.assertTrue(enterAmountPage.verifyEnterAmountPageDisplayed());
		String amount=randomString("numeric",3);
		paymentsDetailsPage=enterAmountPage.enterAmount(amount);
		Assert.assertTrue(paymentsDetailsPage.verifyJompayPaymentDetailsPageDisplayed());
		softAssert.assertTrue(paymentsDetailsPage.verifyBackButtonDisplayed());
		softAssert.assertTrue(paymentsDetailsPage.verifyPayFromHeaderDisplayed());
		softAssert.assertTrue(paymentsDetailsPage.verifyPayToHeaderDisplayed());
		softAssert.assertTrue(paymentsDetailsPage.verifyReferenceNumber1LabelDisplayed());
		softAssert.assertTrue(paymentsDetailsPage.verifyReferenceNumber2LabelDisplayed());
		softAssert.assertTrue(paymentsDetailsPage.verifyAmountLabelDisplayed());
		softAssert.assertTrue(paymentsDetailsPage.verifyPaymentDateDisplayed());
		softAssert.assertTrue(paymentsDetailsPage.verifyAddToFavDisplayed());
		softAssert.assertTrue(paymentsDetailsPage.verifyNicknameLabelDisplayed());
		softAssert.assertTrue(paymentsDetailsPage.verifyContinueButtonDisplayed());
		softAssert.assertAll();
		
	}
	@Test(groups = { "SmokeTest","RegressionTest" })
	 
	public void tc006_verify_UI_elements_of_TransferDashboard() throws Throwable {
		
		SoftAssert softAssert=new SoftAssert();
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		Assert.assertTrue(dashboardPage.verifyBankingDashboardisplayed());
		transferDashboardPage=dashboardPage.clickTransferIcon();
		Assert.assertTrue(transferDashboardPage.verifyTransferDashboardisplayed());
		softAssert.assertTrue(transferDashboardPage.verifyRecentSectionDisplayed());
		softAssert.assertTrue(transferDashboardPage.verifyNewTransferSectionDisplayed());
		softAssert.assertTrue(transferDashboardPage.verifyFavouritesSectionDisplayed());
		softAssert.assertTrue(transferDashboardPage.verifyOwnAccountLoanTransferIconDisplayed());
		softAssert.assertTrue(transferDashboardPage.verifyOtherAccountsTransferIconDisplayed());
		softAssert.assertTrue(transferDashboardPage.verifyDuitNowTransferIconDisplayed());
		softAssert.assertTrue(transferDashboardPage.verifyFavSearchDisplayed());
		softAssert.assertTrue(transferDashboardPage.verifyFavBillerAccNumberDisplayed());
		softAssert.assertTrue(transferDashboardPage.verifyAddNewFavButtonDisplayed());
		softAssert.assertAll();
		
	}
	
	@Test(groups = {"RegressionTest"})
	public void tc007_verify_backButton_functionality_on_TransferDashboard() throws Throwable {
		
		SoftAssert softAssert=new SoftAssert();
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		Assert.assertTrue(dashboardPage.verifyBankingDashboardisplayed());
		transferDashboardPage=dashboardPage.clickTransferIcon();
		Assert.assertTrue(transferDashboardPage.verifyTransferDashboardisplayed());
		dashboardPage=transferDashboardPage.clickBackbutton();
		Assert.assertTrue(dashboardPage.verifyBankingDashboardisplayed());
	}
}

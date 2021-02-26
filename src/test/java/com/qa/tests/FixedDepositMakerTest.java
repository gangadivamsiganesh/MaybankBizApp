package com.qa.tests;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.BaseTest;
import com.qa.pages.AccountListing;
import com.qa.pages.BankingDashboardPage;
import com.qa.pages.BusinessProfilePage;
import com.qa.pages.ConfirmationPage;
import com.qa.pages.ControlCenterPage;
import com.qa.pages.FDCertificateListingPage;
import com.qa.pages.FDReviewCertificatePage;
import com.qa.pages.HPDetailsPage;
import com.qa.pages.LoginPage;
import com.qa.pages.LogoutPage;
import com.qa.pages.NotificationPage;
import com.qa.pages.OtpPage;
import com.qa.pages.QuickAccess;
import com.qa.pages.TransactionHistoryPage;
import com.qa.utils.TestUtils;

public class FixedDepositMakerTest extends BaseTest{
		
		LoginPage loginPage;
		OtpPage otpPage;
		BankingDashboardPage dashboardPage;
		ControlCenterPage controlCenterPage;
		NotificationPage notificationPage;
		BusinessProfilePage profilePage;
		LogoutPage logoutPage;
		ConfirmationPage confirmationPage;
		AccountListing accountListingPage;
		QuickAccess quickAccessPage;
		TransactionHistoryPage transactionHistoryPage;
		FDCertificateListingPage fDCertificateListingPage;
		FDReviewCertificatePage fDReviewCertificatePage;
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
		public void tc001_verify_UI_elements_of_FixedDeposit_AccountListing_Page_Maker() throws Throwable {
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
			String FDNumOfAccounts=dashboardPage.getTextOfNumOfAccFD();
			String TotalAmount=dashboardPage.getTextOfTotalAmountFD();
			accountListingPage=dashboardPage.clickFD();
			Assert.assertTrue(accountListingPage.verifyFDPageTitleDisplayed(), "FD Account Listing page not displayed");
			Boolean backButton=accountListingPage.verifyBackButton();
			Assert.assertTrue(backButton);
			Boolean accountName=accountListingPage.verifyAccountNameOnCard1("Account name on FD card");
			Assert.assertTrue(accountName,"Account Name on FD card is not displayed on FD listing page");
			Boolean accountNum=accountListingPage.verifyAccountNumberOnCard1("Account number on FD card");
			Assert.assertTrue(accountNum,"Account Number on FD card is not displayed on FD listing page");
			Boolean availBal=accountListingPage.verifyAvailableBalanceOnCard1("Total Balance on FD card");
			Assert.assertTrue(availBal);
			Assert.assertTrue(accountListingPage.verifyCerticatesOnFDCard(),"Number of certificates on FD card on listing page not displayed");
			
			
		}
		
		@Test(groups = {"RegressionTest"})
		public void tc002_verify_backButton_functionalityOnAccountListingPage() throws Throwable {
		
			loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
			dashboardPage=loginPage.clickLoginButton();
			Assert.assertTrue(dashboardPage.verifyBankingDashboardisplayed());
			dashboardPage.swipeToCard("FixedDeposit");
			Boolean FDcard=dashboardPage.verifyFDcardDisplayed();
			accountListingPage=dashboardPage.clickFD();
			Assert.assertTrue(accountListingPage.verifyFDPageTitleDisplayed(), "FD Account Listing page not displayed");
			dashboardPage=accountListingPage.clickBackButton();
			Assert.assertTrue(dashboardPage.verifyFDcardDisplayed(), "FD card on Banking Dash board displayed");
			
		
		}
		

		@Test(groups = { "SmokeTest","RegressionTest" })
		public void tc003_verify_UI_elements_of_FixedDeposit_CertificateDetails_Page_() throws Throwable {
			loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
			dashboardPage=loginPage.clickLoginButton();
			Assert.assertTrue(dashboardPage.verifyBankingDashboardisplayed());
			dashboardPage.swipeToCard("FixedDeposit");
			Boolean FDcard=dashboardPage.verifyFDcardDisplayed();
			Assert.assertTrue(FDcard);
			accountListingPage=dashboardPage.clickFD();
			Assert.assertTrue(accountListingPage.verifyFDPageTitleDisplayed(), "FD Account Listing page not displayed");
			fDCertificateListingPage=accountListingPage.clickFDCard();
			Assert.assertTrue(fDCertificateListingPage.verifyFDCertificatePageDisplayed());
			verifyText(fDCertificateListingPage.getFDCertificatePageTitle(),"Fixed Deposits");
			Assert.assertTrue(fDCertificateListingPage.verifyBackButton());
			Boolean accountName=fDCertificateListingPage.verifyAccountNameOnCard1("Account name on FD card");
			Assert.assertTrue(accountName,"Account Name on FD card is not displayed on FD listing page");
			Boolean accountNum=fDCertificateListingPage.verifyAccountNumberOnCard1("Account number on FD card");
			Assert.assertTrue(accountNum,"Account Number on FD card is not displayed on FD listing page");
			verifyText(fDCertificateListingPage.getTotalAmountLabel(),"Total Amount");
			Boolean availBal=fDCertificateListingPage.verifyAvailableBalanceOnCard1("Total Amount on FD card");
			Assert.assertTrue(availBal);
			Assert.assertTrue(fDCertificateListingPage.verifyCertificateNumber1());
			Assert.assertTrue(fDCertificateListingPage.verifyCertificateAmount1());
			Assert.assertTrue(fDCertificateListingPage.verifyCertificateCreatedDate1());			
			
		}
		

		@Test(groups = {"RegressionTest"})
		public void tc004_verify_BackBtn_navigation_of_FixedDeposit_CertificateDetails_Page_() throws Throwable {
			loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
			dashboardPage=loginPage.clickLoginButton();
			Assert.assertTrue(dashboardPage.verifyBankingDashboardisplayed());
			dashboardPage.swipeToCard("FixedDeposit");
			Boolean FDcard=dashboardPage.verifyFDcardDisplayed();
			Assert.assertTrue(FDcard);
			accountListingPage=dashboardPage.clickFD();
			Assert.assertTrue(accountListingPage.verifyFDPageTitleDisplayed(), "FD Account Listing page not displayed");
			fDCertificateListingPage=accountListingPage.clickFDCard();
			Assert.assertTrue(fDCertificateListingPage.verifyFDCertificatePageDisplayed());
			accountListingPage=fDCertificateListingPage.clickBackButton();
			Assert.assertTrue(accountListingPage.verifyFDPageTitleDisplayed(), "FD Account Listing page not displayed");
			dashboardPage=accountListingPage.clickBackButton();
			Assert.assertTrue(dashboardPage.verifyFDcardDisplayed(), "FD card on Banking Dash board displayed");
		}
		
		@Test(groups = { "SmokeTest","RegressionTest" })
		public void tc005_verify_UI_elements_of_FixedDeposit_CertificateDetails_Page_() throws Throwable {
			loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
			dashboardPage=loginPage.clickLoginButton();
			Assert.assertTrue(dashboardPage.verifyBankingDashboardisplayed());
			dashboardPage.swipeToCard("FixedDeposit");
			Boolean FDcard=dashboardPage.verifyFDcardDisplayed();
			Assert.assertTrue(FDcard);
			accountListingPage=dashboardPage.clickFD();
			Assert.assertTrue(accountListingPage.verifyFDPageTitleDisplayed(), "FD Account Listing page not displayed");
			fDCertificateListingPage=accountListingPage.clickFDCard();
			Assert.assertTrue(fDCertificateListingPage.verifyFDCertificatePageDisplayed());
			verifyText(fDCertificateListingPage.getFDCertificatePageTitle(),"Fixed Deposits");
			String FDAccNumber=fDCertificateListingPage.getAccountNumber();
			String FDAccName=fDCertificateListingPage.getAccountName();
			String certificateNum=fDCertificateListingPage.getCertificateNumberLabel();
			String certificateAmount=fDCertificateListingPage.getCertificateAmountLabel();
			fDReviewCertificatePage=fDCertificateListingPage.clickCertificate();
			Assert.assertTrue(fDReviewCertificatePage.verifyReviewCertificatePageTitleDisplayed());
			verifyText(fDReviewCertificatePage.getAmountValue(),certificateAmount);
			verifyText(fDReviewCertificatePage.getCertificateName(),FDAccName);
			verifyText(fDReviewCertificatePage.getCertificateNumber(),certificateNum);
			verifyText(fDReviewCertificatePage.getFDAccountNumber(),FDAccNumber);
		}
		
}

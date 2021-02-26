package com.qa.tests;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.BaseTest;
import com.qa.pages.AccountDetailsCA;
import com.qa.pages.AccountListing;
import com.qa.pages.BankingDashboardPage;
import com.qa.pages.BusinessProfilePage;
import com.qa.pages.ConfirmationPage;
import com.qa.pages.ControlCenterPage;
import com.qa.pages.EditNicknamePage;
import com.qa.pages.LoanDetailsPage;
import com.qa.pages.LoginPage;
import com.qa.pages.LogoutPage;
import com.qa.pages.NotificationPage;
import com.qa.pages.OtpPage;
import com.qa.pages.QuickAccess;
import com.qa.pages.TransactionHistoryPage;
import com.qa.utils.TestUtils;

public class LoansTest extends BaseTest{
	
	
	
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
	AccountDetailsCA accountDetailsPage;
	LoanDetailsPage loanDetailsPage;
	EditNicknamePage editNicknamePage;
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
	public void tc001_verify_UI_elements_of_TL_AccountListingPage() throws Throwable {
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		Assert.assertTrue(dashboardPage.verifyBankingDashboardisplayed());
		dashboardPage.clickLiabilitiesIcon();
		Boolean card=dashboardPage.verifyTLCardDisplayed();
		Assert.assertTrue(card);
		String CardName=dashboardPage.getTextOfTLcard();
		verifyText(CardName,"Loans");
		accountListingPage=dashboardPage.clickLoansCard();
		String pageTitle=accountListingPage.getTLAccListingPageTitle();
		verifyText(pageTitle,"Loans");
		Boolean cardDisplayed=accountListingPage.verifyCard1Displayed("Term Loan Card ");
		Assert.assertTrue(cardDisplayed);
		Boolean backButton=accountListingPage.verifyBackButton();
		Assert.assertTrue(backButton);
		Boolean accountName=accountListingPage.verifyAccountNameOnCard1("Term Loan Account Name");
		Assert.assertTrue(accountName);
		Boolean accountNum=accountListingPage.verifyAccountNumberOnCard1("Term Loan Account number");
		Assert.assertTrue(accountNum);
		Boolean availBal=accountListingPage.verifyAvailableBalanceOnCard1("Outstanding Balance");
		Assert.assertTrue(availBal);
		Boolean quickAccessBtn=accountListingPage.verifyQuickAccessButton();
		Assert.assertTrue(quickAccessBtn);

	}


	@Test(groups = {"RegressionTest"})
	public void tc002_verify_backButton_functionality_On_TermLoan_AccountListingPage() throws Throwable {
	
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		Assert.assertTrue(dashboardPage.verifyBankingDashboardisplayed());
		dashboardPage.clickLiabilitiesIcon();
		Boolean card=dashboardPage.verifyTLCardDisplayed();
		Assert.assertTrue(card);
		String CardName=dashboardPage.getTextOfTLcard();
		verifyText(CardName,"Loans");
		accountListingPage=dashboardPage.clickLoansCard();
		Assert.assertTrue(accountListingPage.verifyTLPageTitleDisplayed());
		dashboardPage=accountListingPage.clickBackButton();
		Assert.assertTrue(dashboardPage.verifyTLCardDisplayed());
	
	}
	
	@Test(groups = {"RegressionTest"})
	public void tc003_verify_TL_AccountListingQuickAccessOptions() throws Throwable {
	
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		Assert.assertTrue(dashboardPage.verifyBankingDashboardisplayed());
		dashboardPage.clickLiabilitiesIcon();
		Boolean card=dashboardPage.verifyTLCardDisplayed();
		Assert.assertTrue(card);
		String CardName=dashboardPage.getTextOfTLcard();
		verifyText(CardName,"Loans");
		accountListingPage=dashboardPage.clickLoansCard();
		Assert.assertTrue(accountListingPage.verifyTLPageTitleDisplayed());
		quickAccessPage=accountListingPage.clickQuickAccessCTA();
		Boolean transactionHistory=quickAccessPage.verifyTransactionHistoryCTADisplayed();
		Assert.assertTrue(transactionHistory);
		Boolean loanDetails=quickAccessPage.verifyLoanDetailsCTADisplayed();
		Assert.assertTrue(loanDetails);
		Boolean downloadStatement=quickAccessPage.verifyDownloadStatementCTADisplayed();
		Assert.assertTrue(downloadStatement);
		Boolean payLoan=quickAccessPage.verifyPayLoanCTADisplayed();
		Assert.assertTrue(payLoan);

	}
	
	@Test(groups = { "SmokeTest","RegressionTest" })
	public void tc004_verify_UIElements_of_TermLoan_TransactionHistory() throws Throwable {
	
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		Assert.assertTrue(dashboardPage.verifyBankingDashboardisplayed());
		dashboardPage.clickLiabilitiesIcon();
		Boolean card=dashboardPage.verifyTLCardDisplayed();
		Assert.assertTrue(card);
		String CardName=dashboardPage.getTextOfTLcard();
		verifyText(CardName,"Loans");
		accountListingPage=dashboardPage.clickLoansCard();
		transactionHistoryPage=accountListingPage.clickCard("Term Loan card on account listing page ");
		Boolean transactionHistory=transactionHistoryPage.verifyTransactionHistoryHeaderDisplayed();
		Assert.assertTrue(transactionHistory);
		String header=transactionHistoryPage.getTransactionHistory();
		verifyText(header,"Transaction History");
		String pageTitle=transactionHistoryPage.getTLPageTitle();
		verifyText(pageTitle,"Loans");
		Boolean cardDisplayed=transactionHistoryPage.verifyCard1Displayed("Loans card on Transaction history page");
		Assert.assertTrue(cardDisplayed);
		Boolean backButton=transactionHistoryPage.verifyBackButton();
		Assert.assertTrue(backButton);
		Boolean accountName=transactionHistoryPage.verifyAccountNameOnCard1("Account name on TL card");
		Assert.assertTrue(accountName);
		Boolean accountNum=transactionHistoryPage.verifyAccountNumberOnCard1("Account number on TL card");
		Assert.assertTrue(accountNum);
		Boolean availBal=transactionHistoryPage.verifyAvailableBalanceOnCard1("Outstanding Bal on TL cards");
		Assert.assertTrue(availBal);
		Boolean quickAccessBtn=transactionHistoryPage.verifyQuickAccessButton();
		Assert.assertTrue(quickAccessBtn);
		
	}
	
	@Test(groups = {"RegressionTest"})
	public void tc005_verify_backButton_functionalityOn_TL_TransactionHistoryPage() throws Throwable {
	
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		Assert.assertTrue(dashboardPage.verifyBankingDashboardisplayed());
		dashboardPage.clickLiabilitiesIcon();
		Boolean card=dashboardPage.verifyTLCardDisplayed();
		Assert.assertTrue(card);
		String CardName=dashboardPage.getTextOfTLcard();
		verifyText(CardName,"Loans");
		accountListingPage=dashboardPage.clickLoansCard();
		transactionHistoryPage=accountListingPage.clickCard("Term Loan card on account listing page ");
		Boolean transactionHistory=transactionHistoryPage.verifyTransactionHistoryHeaderDisplayed();
		Assert.assertTrue(transactionHistory);
		String header=transactionHistoryPage.getTransactionHistory();
		verifyText(header,"Transaction History");
		accountListingPage=transactionHistoryPage.clickBackButton();
		Boolean accountListing=accountListingPage.verifyTLPageTitleDisplayed();
		Assert.assertTrue(accountListing);
	
	}
	
	@Test(groups = { "SmokeTest","RegressionTest" })
	public void tc006_verify_TL_TransactionHistory_QuickAccessOptions() throws Throwable {
	

		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		Assert.assertTrue(dashboardPage.verifyBankingDashboardisplayed());
		dashboardPage.clickLiabilitiesIcon();
		Boolean card=dashboardPage.verifyTLCardDisplayed();
		Assert.assertTrue(card);
		String CardName=dashboardPage.getTextOfTLcard();
		verifyText(CardName,"Loans");
		accountListingPage=dashboardPage.clickLoansCard();
		transactionHistoryPage=accountListingPage.clickCard("Term Loan card on account listing page ");
		Boolean transactionHistory=transactionHistoryPage.verifyTransactionHistoryHeaderDisplayed();
		Assert.assertTrue(transactionHistory);
		quickAccessPage=transactionHistoryPage.clickQuickAccessCTA();
		Boolean loanDetails=quickAccessPage.verifyLoanDetailsCTADisplayed();
		Assert.assertTrue(loanDetails);
		Boolean downloadStatement=quickAccessPage.verifyDownloadStatementCTADisplayed();
		Assert.assertTrue(downloadStatement);
		Boolean payLoan=quickAccessPage.verifyPayLoanCTADisplayed();
		Assert.assertTrue(payLoan);
	}
	
	@Test(groups = { "SmokeTest","RegressionTest" })
	public void tc007_verify_UI_elements_of_TL_LoanDetailsPage() throws Throwable {
		
		
		SoftAssert softAssert=new SoftAssert();
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		Assert.assertTrue(dashboardPage.verifyBankingDashboardisplayed());
		dashboardPage.clickLiabilitiesIcon();
		Boolean card=dashboardPage.verifyTLCardDisplayed();
		Assert.assertTrue(card);
		String CardName=dashboardPage.getTextOfTLcard();
		verifyText(CardName,"Loans");
		accountListingPage=dashboardPage.clickLoansCard();
		transactionHistoryPage=accountListingPage.clickCard("Term Loan card on account listing page ");
		Boolean transactionHistory=transactionHistoryPage.verifyTransactionHistoryHeaderDisplayed();
		Assert.assertTrue(transactionHistory);
		loanDetailsPage=transactionHistoryPage.clickTLCard();
		Assert.assertTrue(loanDetailsPage.verifyLoansDetailsHeaderDisplayed());
		
		Boolean cardDisplayed=loanDetailsPage.verifyCard1Displayed();
		softAssert.assertTrue(cardDisplayed);
		Boolean backButton=loanDetailsPage.verifyBackButton();
		softAssert.assertTrue(backButton);
		Boolean accountName=loanDetailsPage.verifyAccountNameOnCard1();
		softAssert.assertTrue(accountName);
		Boolean accountNum=loanDetailsPage.verifyAccountNumberOnCard1();
		softAssert.assertTrue(accountNum);
		Boolean availBal=loanDetailsPage.verifyOutstandingBalanceOnCard1();
		softAssert.assertTrue(availBal);
		Boolean quickAccessBtn=loanDetailsPage.verifyQuickAccessButton();
		softAssert.assertTrue(quickAccessBtn);
		String typeOfLoan=loanDetailsPage.getTypeOfLoanValue();
		softAssert.assertTrue(loanDetailsPage.verifyAccountNamelabelDisplayed());
		softAssert.assertTrue(loanDetailsPage.verifyTypeOflabelDisplayed());
		softAssert.assertTrue(loanDetailsPage.verifyNicknamelabelDisplayed());
		if(typeOfLoan.contentEquals("Maybank Islamic Loan")) {
			softAssert.assertTrue(loanDetailsPage.verifyMonthlyInstallmentLabel());
			softAssert.assertTrue(loanDetailsPage.verifyOutstandingBalanceLabel());
			softAssert.assertTrue(loanDetailsPage.verifyOutstandingCostOfFinanceLabel());
			softAssert.assertTrue(loanDetailsPage.verifyOutstandingGPPLabel());
			softAssert.assertTrue(loanDetailsPage.verifyPaymentDueDateLabel());
			softAssert.assertTrue(loanDetailsPage.verifyInstallmentDueLabel());
			softAssert.assertTrue(loanDetailsPage.verifyPaymentInAdvanceLabel());
			softAssert.assertTrue(loanDetailsPage.verifyProfitRateLabel());
			softAssert.assertTrue(loanDetailsPage.verifyTotalAssetPriceLabel());
			softAssert.assertTrue(loanDetailsPage.verifyCustomerOwershipLabel());
			softAssert.assertTrue(loanDetailsPage.verifyPayLoanButton());
			
		}
		else if(typeOfLoan.contentEquals("Conventional Loan")) {
			softAssert.assertTrue(loanDetailsPage.verifyMonthlyInstallmentLabel());
			softAssert.assertTrue(loanDetailsPage.verifyOutstandingBalanceLabel());
			softAssert.assertTrue(loanDetailsPage.verifyOutstandingProgressiveInterestLabel());
			softAssert.assertTrue(loanDetailsPage.verifyPaymentDueDateLabel());
			softAssert.assertTrue(loanDetailsPage.verifyInstallmentDueLabel());
			softAssert.assertTrue(loanDetailsPage.verifyPaymentInAdvanceLabel());
			softAssert.assertTrue(loanDetailsPage.verifyInterestRateLabel());
			softAssert.assertTrue(loanDetailsPage.verifyAdvancePaymentAvailableForReviewLabel());
			softAssert.assertTrue(loanDetailsPage.verifyPayLoanButton());
			
		}
		softAssert.assertAll();  	
	}
	
	
	@Test(groups = {"RegressionTest"})
	public void tc008_verify_backButtonFunctionality_on_LoanDetailsPage() throws Throwable {
		

		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		Assert.assertTrue(dashboardPage.verifyBankingDashboardisplayed());
		dashboardPage.clickLiabilitiesIcon();
		Boolean card=dashboardPage.verifyTLCardDisplayed();
		Assert.assertTrue(card);
		String CardName=dashboardPage.getTextOfTLcard();
		verifyText(CardName,"Loans");
		accountListingPage=dashboardPage.clickLoansCard();
		transactionHistoryPage=accountListingPage.clickCard("Term Loan card on account listing page ");
		Boolean transactionHistory=transactionHistoryPage.verifyTransactionHistoryHeaderDisplayed();
		Assert.assertTrue(transactionHistory);
		loanDetailsPage=transactionHistoryPage.clickTLCard();
		Assert.assertTrue(loanDetailsPage.verifyLoansDetailsHeaderDisplayed());
		transactionHistoryPage=loanDetailsPage.clickBackButton();
		Boolean transactionHistory1=transactionHistoryPage.verifyTransactionHistoryHeaderDisplayed();
		Assert.assertTrue(transactionHistory1);
		
	}
	
	@Test(groups = {"RegressionTest"})
	public void tc009_verify_TL_LoanDetails_QuickAccessOptions() throws Throwable {
	

		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		Assert.assertTrue(dashboardPage.verifyBankingDashboardisplayed());
		dashboardPage.clickLiabilitiesIcon();
		String CardName=dashboardPage.getTextOfTLcard();
		verifyText(CardName,"Loans");
		accountListingPage=dashboardPage.clickLoansCard();
		transactionHistoryPage=accountListingPage.clickCard("Term Loan card");
		Boolean transactionHistory=transactionHistoryPage.verifyTransactionHistoryHeaderDisplayed();
		Assert.assertTrue(transactionHistory);
		loanDetailsPage=transactionHistoryPage.clickTLCard();
		Boolean accountDetails=loanDetailsPage.verifyLoansDetailsHeaderDisplayed();
		Assert.assertTrue(accountDetails);
		quickAccessPage=loanDetailsPage.clickQuickAccessCTA();
		Boolean loanDetails=quickAccessPage.verifyTransactionHistoryCTADisplayed();
		Assert.assertTrue(loanDetails);
		Boolean downloadStatement=quickAccessPage.verifyDownloadStatementCTADisplayed();
		Assert.assertTrue(downloadStatement);
		Boolean payLoan=quickAccessPage.verifyPayLoanCTADisplayed();
		Assert.assertTrue(payLoan);
	}
	
	@Test(groups = { "SmokeTest","RegressionTest" })
	public void tc010_validate_TL_CardDeatils_on_AccountListing_TransactionHistory_LoanDetailsPage() throws Throwable {
	
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		Assert.assertTrue(dashboardPage.verifyBankingDashboardisplayed());
		dashboardPage.clickLiabilitiesIcon();
		String CardName=dashboardPage.getTextOfTLcard();
		verifyText(CardName,"Loans");
		accountListingPage=dashboardPage.clickLoansCard();
		String accountName=accountListingPage.getAccountName();
		String accountNumber=accountListingPage.getAccountNumber();
		String availableBalance=accountListingPage.getAvailableBalance();
		transactionHistoryPage=accountListingPage.clickCard("Term Loan card");
		Boolean transactionHistory=transactionHistoryPage.verifyTransactionHistoryHeaderDisplayed();
		Assert.assertTrue(transactionHistory);
		String accountNameTL=transactionHistoryPage.getAccountName();
		String accountNumberTL=transactionHistoryPage.getAccountNumber();
		String availableBalanceTL=transactionHistoryPage.getAvailableBalance("Outstanding balance");
		verifyText(accountName,accountNameTL);
		verifyText(accountNumber,accountNumberTL);
		verifyText(availableBalance,availableBalanceTL);
		loanDetailsPage=transactionHistoryPage.clickTLCard();
		Boolean accountDetails=loanDetailsPage.verifyLoansDetailsHeaderDisplayed();
		Assert.assertTrue(accountDetails);
		String accountNameAD=loanDetailsPage.getAccountName();
		String accountNumberAD=loanDetailsPage.getAccountNumber();
		String availableBalanceAD=loanDetailsPage.getAvailableBalance();
		verifyText(accountName,accountNameAD);
		verifyText(accountNumber,accountNumberAD);
		verifyText(availableBalance,availableBalanceAD);
	}
	
	@Test(groups = {"RegressionTest","Demo"})
	public void tc011_update_TL_nickname() throws Throwable {
		
		
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		Assert.assertTrue(dashboardPage.verifyBankingDashboardisplayed());
		dashboardPage.clickLiabilitiesIcon();
		String CardName=dashboardPage.getTextOfTLcard();
		verifyText(CardName,"Loans");
		accountListingPage=dashboardPage.clickLoansCard();
		transactionHistoryPage=accountListingPage.clickCard("Term Loan card");
		Boolean transactionHistory=transactionHistoryPage.verifyTransactionHistoryHeaderDisplayed();
		Assert.assertTrue(transactionHistory);
		loanDetailsPage=transactionHistoryPage.clickTLCard();
		Boolean accountDetails=loanDetailsPage.verifyLoansDetailsHeaderDisplayed();
		Assert.assertTrue(accountDetails);
		String nickname=randomString("alphabetic",7);
		editNicknamePage=loanDetailsPage.clickNicknameLbl();
		editNicknamePage.verifyEditNicknamePageDisplayed();
		editNicknamePage.enterNickName(nickname);
		loanDetailsPage=editNicknamePage.clickDoneBtnTL();
		String snackbarMsg=loanDetailsPage.getSnackBarMsg();
		verifyText(snackbarMsg,getStrings().get("UpdateNickname"));
		loanDetailsPage.clickSnackBarClose();
		String nicknameAccountdetails=loanDetailsPage.getNicknameValue();
		verifyText(nicknameAccountdetails, nickname);
		String nicknameADCard=loanDetailsPage.getAccountName();
		verifyText(nicknameADCard, nickname);
		transactionHistoryPage=loanDetailsPage.clickBackButton();
		Assert.assertTrue(transactionHistoryPage.verifyTransactionHistoryHeaderDisplayed());
		String nicknameTLCard=transactionHistoryPage.getAccountName();
		verifyText(nicknameTLCard, nickname);
		accountListingPage=transactionHistoryPage.clickBackButton();
		Assert.assertTrue(accountListingPage.verifyTLPageTitleDisplayed());
		String nicknameALCard=accountListingPage.getAccountName();
		verifyText(nicknameALCard, nickname);
		
	}
	

		
	
}

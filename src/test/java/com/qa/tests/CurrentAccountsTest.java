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
import com.qa.pages.LoginPage;
import com.qa.pages.LogoutPage;
import com.qa.pages.NotificationPage;
import com.qa.pages.OtpPage;
import com.qa.pages.QuickAccess;
import com.qa.pages.TransactionHistoryPage;
import com.qa.utils.TestUtils;

public class CurrentAccountsTest extends BaseTest{
	
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
	public void tc001_verify_UI_elements_of_CA_AccountListingPage() throws Throwable {
	
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		accountListingPage=dashboardPage.clickBusinessAccountCard();
		String pageTitle=accountListingPage.getAccListingPageTitle();
		verifyText(pageTitle,"Business Accounts");
		Boolean cardDisplayed=accountListingPage.verifyCard1Displayed("Business Account card on Account listing page");
		Assert.assertTrue(cardDisplayed);
		Boolean backButton=accountListingPage.verifyBackButton();
		Assert.assertTrue(backButton);
		Boolean accountName=accountListingPage.verifyAccountNameOnCard1("Account name on CA card");
		Assert.assertTrue(accountName);
		Boolean accountNum=accountListingPage.verifyAccountNumberOnCard1("Account number on CA card");
		Assert.assertTrue(accountNum);
		Boolean availBal=accountListingPage.verifyAvailableBalanceOnCard1("Available Balance on CA card");
		Assert.assertTrue(availBal);
		Boolean quickAccessBtn=accountListingPage.verifyQuickAccessButton();
		Assert.assertTrue(quickAccessBtn);

	}
	
	@Test(groups = {"RegressionTest"})
	public void tc002_verify_backButton_functionalityOnAccountListingPage() throws Throwable {
	
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		accountListingPage=dashboardPage.clickBusinessAccountCard();
		accountListingPage.verifyPageTitleDisplayed();
		dashboardPage=accountListingPage.clickBackButton();
		Boolean pageDisplayed=dashboardPage.verifyBankingDashboardisplayed();
		Assert.assertTrue(pageDisplayed);
	
	}
	
	@Test(groups = {"RegressionTest"})
	public void tc003_verify_CA_AccountListingQuickAccessOptions() throws Throwable {
	
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		accountListingPage=dashboardPage.clickBusinessAccountCard();
		accountListingPage.verifyPageTitleDisplayed();
		quickAccessPage=accountListingPage.clickQuickAccessCTA();
		Boolean transactionHistory=quickAccessPage.verifyTransactionHistoryCTADisplayed();
		Assert.assertTrue(transactionHistory);
		Boolean accountDetails=quickAccessPage.verifyAccountDetailsCTADisplayed();
		Assert.assertTrue(accountDetails);
		Boolean downloadStatement=quickAccessPage.verifyDownloadStatementCTADisplayed();
		Assert.assertTrue(downloadStatement);
		Boolean exportTransaction=quickAccessPage.verifyExportTransactionCTADisplayed();
		Assert.assertTrue(exportTransaction);
		Boolean payBill=quickAccessPage.verifyPayABillCTADisplayed();
		Assert.assertTrue(payBill);
		Boolean makeTransfer=quickAccessPage.verifyMakeATransferCTADisplayed();
		Assert.assertTrue(makeTransfer);
	}
	
	@Test(groups = { "SmokeTest","RegressionTest" })
	public void tc004_verify_UIElements_of_CA_TransactionHistory() throws Throwable {
	
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		accountListingPage=dashboardPage.clickBusinessAccountCard();
		accountListingPage.verifyPageTitleDisplayed();
		transactionHistoryPage=accountListingPage.clickCard("Business Account card");
		Boolean transactionHistory=transactionHistoryPage.verifyTransactionHistoryHeaderDisplayed();
		Assert.assertTrue(transactionHistory);
		String header=transactionHistoryPage.getTransactionHistory();
		verifyText(header,"Transaction History");
		String pageTitle=transactionHistoryPage.getAccListingPageTitle();
		verifyText(pageTitle,"Business Accounts");
		Boolean cardDisplayed=transactionHistoryPage.verifyCard1Displayed("Business Account card on Transaction History page");
		Assert.assertTrue(cardDisplayed);
		Boolean backButton=transactionHistoryPage.verifyBackButton();
		Assert.assertTrue(backButton);
		Boolean accountName=transactionHistoryPage.verifyAccountNameOnCard1("Account name on CA card");
		Assert.assertTrue(accountName);
		Boolean accountNum=transactionHistoryPage.verifyAccountNumberOnCard1("Account number on CA card");
		Assert.assertTrue(accountNum);
		Boolean availBal=transactionHistoryPage.verifyAvailableBalanceOnCard1("Available Balance on CA card");
		Assert.assertTrue(availBal);
		Boolean quickAccessBtn=transactionHistoryPage.verifyQuickAccessButton();
		Assert.assertTrue(quickAccessBtn);
		
	}
	
	@Test(groups = {"RegressionTest"})
	public void tc005_verify_backButton_functionalityOn_CATransactionHistoryPage() throws Throwable {
	
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		accountListingPage=dashboardPage.clickBusinessAccountCard();
		accountListingPage.verifyPageTitleDisplayed();
		transactionHistoryPage=accountListingPage.clickCard("Business Account card");
		Boolean transactionHistory=transactionHistoryPage.verifyTransactionHistoryHeaderDisplayed();
		Assert.assertTrue(transactionHistory);
		accountListingPage=transactionHistoryPage.clickBackButton();
		Boolean accountListing=accountListingPage.verifyPageTitleDisplayed();
		Assert.assertTrue(accountListing);
	
	}
	

	@Test(groups = {"RegressionTest"})
	public void tc006_verify_CA_TransactionHistory_QuickAccessOptions() throws Throwable {
	
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		accountListingPage=dashboardPage.clickBusinessAccountCard();
		accountListingPage.verifyPageTitleDisplayed();
		transactionHistoryPage=accountListingPage.clickCard("Business Account card");
		Boolean transactionHistory=transactionHistoryPage.verifyTransactionHistoryHeaderDisplayed();
		Assert.assertTrue(transactionHistory);
		quickAccessPage=transactionHistoryPage.clickQuickAccessCTA();
		Boolean accountDetails=quickAccessPage.verifyAccountDetailsCTADisplayed();
		Assert.assertTrue(accountDetails);
		Boolean downloadStatement=quickAccessPage.verifyDownloadStatementCTADisplayed();
		Assert.assertTrue(downloadStatement);
		Boolean exportTransaction=quickAccessPage.verifyExportTransactionCTADisplayed();
		Assert.assertTrue(exportTransaction);
		Boolean payBill=quickAccessPage.verifyPayABillCTADisplayed();
		Assert.assertTrue(payBill);
		Boolean makeTransfer=quickAccessPage.verifyMakeATransferCTADisplayed();
		Assert.assertTrue(makeTransfer);
	}
	
	
	@Test(groups = { "SmokeTest","RegressionTest" })
	public void tc007_verify_UI_elements_of_CA_AccountDetailsPage() throws Throwable {
		
		
		SoftAssert softAssert=new SoftAssert();
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		accountListingPage=dashboardPage.clickBusinessAccountCard();
		accountListingPage.verifyPageTitleDisplayed();
		transactionHistoryPage=accountListingPage.clickCard("Business Account card");
		Boolean transactionHistory=transactionHistoryPage.verifyTransactionHistoryHeaderDisplayed();
		Assert.assertTrue(transactionHistory);
		accountDetailsPage=transactionHistoryPage.clickCard("Business Account card");
		Boolean accountDetails=accountDetailsPage.verifyAccountDetailsHeaderHeaderDisplayed();
		Assert.assertTrue(accountDetails);
		String pageTitle=accountDetailsPage.getAccountDetailsPageTitle();
		verifyText(pageTitle,"Business Accounts");
		Boolean cardDisplayed=accountDetailsPage.verifyCAcard1Displayed();
		softAssert.assertTrue(cardDisplayed,"CA card not displayed");
		Boolean backButton=accountDetailsPage.verifyBackButton();
		softAssert.assertTrue(backButton,"Back button not displayed");
		Boolean accountName=accountDetailsPage.verifyAccountNameOnCACard1();
		softAssert.assertTrue(accountName,"Account Name not displayed");
		Boolean accountNum=accountDetailsPage.verifyAccountNumberOnCACard1();
		softAssert.assertTrue(accountNum,"Account Number not displayed");
		Boolean availBal=accountDetailsPage.verifyAvailableBalanceOnCACard1();
		softAssert.assertTrue(availBal,"Available balance not displayed");
		Boolean quickAccessBtn=accountDetailsPage.verifyQuickAccessButton();
		softAssert.assertTrue(quickAccessBtn,"Quick Access Button not displayed");
		Boolean accountnamelabel=accountDetailsPage.verifyAccountNameDetailsDisplayed();
		softAssert.assertTrue(accountnamelabel,"Account name label is not displayed");
		Boolean typeOfAccount=accountDetailsPage.verifytypeOfAccountDisplayed();
		softAssert.assertTrue(typeOfAccount,"Type of account not displayed");
		Boolean nickname=accountDetailsPage.verifyNicknameLabel();
		softAssert.assertTrue(nickname,"Nickname not displayed");
		Boolean availBalDetails=accountDetailsPage.verifyAvailBalanceLabel();
		softAssert.assertTrue(availBalDetails,"Available balance label is not displayed");
		Boolean currentBal=accountDetailsPage.verifyCurrentbalanceLabel();
		softAssert.assertTrue(currentBal,"Current balance label not displayed");
		Boolean onedayFloat=accountDetailsPage.verifyOneDayFloatLabel();
		softAssert.assertTrue(onedayFloat,"OneDay float not displayed");
		Boolean twodayFloat=accountDetailsPage.verifyTwoDayFloatLabel();
		softAssert.assertTrue(twodayFloat,"Two day float not displayed");
		Boolean lateClearing=accountDetailsPage.verifyLateClearance();
		softAssert.assertTrue(lateClearing,"Late Clearing not displayed");
		Boolean makeAtransferBtn=accountDetailsPage.verifyMakeATransferButton();
		softAssert.assertTrue(makeAtransferBtn,"Make a Transfer button not displayed");
		Boolean payABillBtn=accountDetailsPage.verifyPayABillButton();
		softAssert.assertTrue(payABillBtn,"Pay A Bill button not displayed");
		softAssert.assertAll();

	}
	

	@Test(groups = {"RegressionTest"})
	public void tc008_verify_backButtonFunctionality_on_AccountDetailsPage() throws Throwable {
		
		
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		accountListingPage=dashboardPage.clickBusinessAccountCard();
		accountListingPage.verifyPageTitleDisplayed();
		transactionHistoryPage=accountListingPage.clickCard("Business Account card");
		Boolean transactionHistory=transactionHistoryPage.verifyTransactionHistoryHeaderDisplayed();
		Assert.assertTrue(transactionHistory);
		accountDetailsPage=transactionHistoryPage.clickCard("Business Account card");
		Assert.assertTrue(accountDetailsPage.verifyAccountDetailsHeaderHeaderDisplayed());
		transactionHistoryPage=accountDetailsPage.clickBackButton();
		Boolean transactionHistory1=transactionHistoryPage.verifyTransactionHistoryHeaderDisplayed();
		Assert.assertTrue(transactionHistory1);
		
	}
	
	@Test(groups = {"RegressionTest"})
	public void tc009_verify_CA_AccountDetails_QuickAccessOptions() throws Throwable {
	
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		accountListingPage=dashboardPage.clickBusinessAccountCard();
		accountListingPage.verifyPageTitleDisplayed();
		transactionHistoryPage=accountListingPage.clickCard("Business Account card");
		Boolean transactionHistory=transactionHistoryPage.verifyTransactionHistoryHeaderDisplayed();
		Assert.assertTrue(transactionHistory);
		accountDetailsPage=transactionHistoryPage.clickCard("Business Account card");
		Assert.assertTrue(accountDetailsPage.verifyAccountDetailsHeaderHeaderDisplayed());
		quickAccessPage=accountDetailsPage.clickQuickAccessCTA();
		Boolean transactionHistory1=quickAccessPage.verifyTransactionHistoryCTADisplayed();
		Assert.assertTrue(transactionHistory1);
		Boolean downloadStatement=quickAccessPage.verifyDownloadStatementCTADisplayed();
		Assert.assertTrue(downloadStatement);
		Boolean exportTransaction=quickAccessPage.verifyExportTransactionCTADisplayed();
		Assert.assertTrue(exportTransaction);
		Boolean payBill=quickAccessPage.verifyPayABillCTADisplayed();
		Assert.assertTrue(payBill);
		Boolean makeTransfer=quickAccessPage.verifyMakeATransferCTADisplayed();
		Assert.assertTrue(makeTransfer);
	}
	
	@Test(groups = { "SmokeTest","RegressionTest" })
	public void tc010_verify_CAcardDeatils_on_AccountListing_TransactionHistory_AccountDetails() throws Throwable {
	
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		accountListingPage=dashboardPage.clickBusinessAccountCard();
		accountListingPage.verifyPageTitleDisplayed();
		String accountName=accountListingPage.getAccountName();
		String accountNumber=accountListingPage.getAccountNumber();
		String availableBalance=accountListingPage.getAvailableBalance();
		transactionHistoryPage=accountListingPage.clickCard("Business Account card");
		Boolean transactionHistory=transactionHistoryPage.verifyTransactionHistoryHeaderDisplayed();
		Assert.assertTrue(transactionHistory);
		String accountNameTL=transactionHistoryPage.getAccountName();
		String accountNumberTL=transactionHistoryPage.getAccountNumber();
		String availableBalanceTL=transactionHistoryPage.getAvailableBalance("Available balance");
		verifyText(accountName,accountNameTL);
		verifyText(accountNumber,accountNumberTL);
		verifyText(availableBalance,availableBalanceTL);
		accountDetailsPage=transactionHistoryPage.clickCard("Business Account card");
		Boolean accountDetails=accountDetailsPage.verifyAccountDetailsHeaderHeaderDisplayed();
		Assert.assertTrue(accountDetails);
		String accountNameAD=accountDetailsPage.getAccountName();
		String accountNumberAD=accountDetailsPage.getAccountNumber();
		String availableBalanceAD=accountDetailsPage.getAvailableBalance();
		verifyText(accountName,accountNameAD);
		verifyText(accountNumber,accountNumberAD);
		verifyText(availableBalance,availableBalanceAD);
	}
	
	@Test(groups = {"RegressionTest","Demo"})
	public void tc011_update_CA_nickname() throws Throwable {
		
		
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		accountListingPage=dashboardPage.clickBusinessAccountCard();
		accountListingPage.verifyPageTitleDisplayed();
		transactionHistoryPage=accountListingPage.clickCard("Business Account card");
		Boolean transactionHistory=transactionHistoryPage.verifyTransactionHistoryHeaderDisplayed();
		Assert.assertTrue(transactionHistory);
		accountDetailsPage=transactionHistoryPage.clickCard("Business Account card");
		Boolean accountDetails=accountDetailsPage.verifyAccountDetailsHeaderHeaderDisplayed();
		Assert.assertTrue(accountDetails);
		String nickname=randomString("alphabetic",7);
		editNicknamePage=accountDetailsPage.clickNicknameLbl();
		editNicknamePage.verifyEditNicknamePageDisplayed();
		editNicknamePage.enterNickName(nickname);
		accountDetailsPage=editNicknamePage.clickDoneBtn();
		String snackbarMsg=accountDetailsPage.getSnackBarMsg();
		verifyText(snackbarMsg,getStrings().get("UpdateNickname"));
		accountDetailsPage.clickSnackBarClose();
		String nicknameAccountdetails=accountDetailsPage.getNicknameValue();
		verifyText(nicknameAccountdetails, nickname);
		String nicknameADCard=accountDetailsPage.getAccountName();
		verifyText(nicknameADCard, nickname);
		transactionHistoryPage=accountDetailsPage.clickBackButton();
		Assert.assertTrue(transactionHistoryPage.verifyTransactionHistoryHeaderDisplayed());
		String nicknameTLCard=transactionHistoryPage.getAccountName();
		verifyText(nicknameTLCard, nickname);
		accountListingPage=transactionHistoryPage.clickBackButton();
		accountListingPage.verifyPageTitleDisplayed();
		String nicknameALCard=accountListingPage.getAccountName();
		verifyText(nicknameALCard, nickname);
		
	}
		

		
	

	
		

}

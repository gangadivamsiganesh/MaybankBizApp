package com.qa.tests;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.BaseTest;
import com.qa.pages.AccountListing;
import com.qa.pages.BankingDashboardPage;
import com.qa.pages.BusinessProfilePage;
import com.qa.pages.ConfirmationPage;
import com.qa.pages.ControlCenterPage;
import com.qa.pages.EditNicknamePage;
import com.qa.pages.HPDetailsPage;
import com.qa.pages.LoginPage;
import com.qa.pages.LogoutPage;
import com.qa.pages.NotificationPage;
import com.qa.pages.OtpPage;
import com.qa.pages.QuickAccess;
import com.qa.pages.TransactionHistoryPage;
import com.qa.utils.TestUtils;

public class HirePurchaseTest extends BaseTest{
	
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
	HPDetailsPage hpDetailsPage;
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
	public void tc001_verify_UI_elements_of_HP_AccountListingPage() throws Throwable {
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		Assert.assertTrue(dashboardPage.verifyBankingDashboardisplayed());
		dashboardPage.clickLiabilitiesIcon();
		dashboardPage.verifyTLCardDisplayed();
		dashboardPage.swipeToCard("HirePurchase");
		Boolean HPcard=dashboardPage.verifyHPCardDisplayed();
		Assert.assertTrue(HPcard);
		accountListingPage=dashboardPage.clickHPCard();
		Assert.assertTrue(accountListingPage.verifyHPPageTitleDisplayed());
		String pageTitle=accountListingPage.getHPAccListingPageTitle();
		verifyText(pageTitle,"Hire Purchase");
		Boolean cardDisplayed=accountListingPage.verifyCard1Displayed("Hire Purchase");
		Assert.assertTrue(cardDisplayed);
		Boolean backButton=accountListingPage.verifyBackButton();
		Assert.assertTrue(backButton);
		Boolean accountName=accountListingPage.verifyAccountNameOnCard1("Hire Purchase Account Name");
		Assert.assertTrue(accountName);
		Boolean accountNum=accountListingPage.verifyAccountNumberOnCard1("Hire Purchase Account number");
		Assert.assertTrue(accountNum);
		Assert.assertTrue(accountListingPage.verifyHPEquipmentDisplayed());
		Boolean availBal=accountListingPage.verifyAvailableBalanceOnCard1("Outstanding Balance");
		Assert.assertTrue(availBal);
		Boolean quickAccessBtn=accountListingPage.verifyQuickAccessButton();
		Assert.assertTrue(quickAccessBtn);

	}


	@Test(groups = {"RegressionTest"})
	public void tc002_verify_backButton_functionality_On_HirePurchase_AccountListingPage() throws Throwable {
	
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		Assert.assertTrue(dashboardPage.verifyBankingDashboardisplayed());
		dashboardPage.clickLiabilitiesIcon();
		dashboardPage.verifyTLCardDisplayed();
		dashboardPage.swipeToCard("HirePurchase");
		Boolean HPcard=dashboardPage.verifyHPCardDisplayed();
		Assert.assertTrue(HPcard);
		accountListingPage=dashboardPage.clickHPCard();
		Assert.assertTrue(accountListingPage.verifyHPPageTitleDisplayed());
		dashboardPage=accountListingPage.clickBackButton();
		Assert.assertTrue(dashboardPage.verifyHPCardDisplayed());
	
	}
	
	@Test(groups = {"RegressionTest"})
	public void tc003_verify_HP_AccountListingQuickAccessOptions() throws Throwable {
	
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		Assert.assertTrue(dashboardPage.verifyBankingDashboardisplayed());
		dashboardPage.clickLiabilitiesIcon();
		dashboardPage.verifyTLCardDisplayed();
		dashboardPage.swipeToCard("HirePurchase");
		Boolean HPcard=dashboardPage.verifyHPCardDisplayed();
		Assert.assertTrue(HPcard);
		accountListingPage=dashboardPage.clickHPCard();
		Assert.assertTrue(accountListingPage.verifyHPPageTitleDisplayed());
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
		dashboardPage.verifyTLCardDisplayed();
		dashboardPage.swipeToCard("HirePurchase");
		Boolean HPcard=dashboardPage.verifyHPCardDisplayed();
		Assert.assertTrue(HPcard);
		accountListingPage=dashboardPage.clickHPCard();
		Assert.assertTrue(accountListingPage.verifyHPPageTitleDisplayed());
		transactionHistoryPage=accountListingPage.clickCard("Hire Purchase card on account listing page ");
		Boolean transactionHistory=transactionHistoryPage.verifyTransactionHistoryHeaderDisplayed();
		Assert.assertTrue(transactionHistory);
		String header=transactionHistoryPage.getTransactionHistory();
		verifyText(header,"Transaction History");
		String pageTitle=transactionHistoryPage.getHPTransactionHistoryPageTitle();
		verifyText(pageTitle,"Hire Purchase");
		Boolean cardDisplayed=transactionHistoryPage.verifyCard1Displayed("Hire Purchase on Transaction history page");
		Assert.assertTrue(cardDisplayed);
		Boolean backButton=transactionHistoryPage.verifyBackButton();
		Assert.assertTrue(backButton);
		Boolean accountName=transactionHistoryPage.verifyAccountNameOnCard1("Account name on HP card");
		Assert.assertTrue(accountName);
		Boolean accountNum=transactionHistoryPage.verifyAccountNumberOnCard1("Account number on HP card");
		Assert.assertTrue(accountNum);
		Boolean availBal=transactionHistoryPage.verifyAvailableBalanceOnCard1("Outstanding Bal on HP cards");
		Assert.assertTrue(availBal);
		Boolean equipmentType=transactionHistoryPage.verifyHPEquipmentDisplayed();
		Assert.assertTrue(equipmentType);
		Boolean quickAccessBtn=transactionHistoryPage.verifyQuickAccessButton();
		Assert.assertTrue(quickAccessBtn);
		
	}
	
	@Test(groups = {"RegressionTest"})
	public void tc005_verify_backButton_functionalityOn_HP_TransactionHistoryPage() throws Throwable {
	
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		Assert.assertTrue(dashboardPage.verifyBankingDashboardisplayed());
		dashboardPage.clickLiabilitiesIcon();
		dashboardPage.verifyTLCardDisplayed();
		dashboardPage.swipeToCard("HirePurchase");
		Boolean HPcard=dashboardPage.verifyHPCardDisplayed();
		Assert.assertTrue(HPcard);
		accountListingPage=dashboardPage.clickHPCard();
		Assert.assertTrue(accountListingPage.verifyHPPageTitleDisplayed());
		transactionHistoryPage=accountListingPage.clickCard("Hire Purchase card on account listing page ");
		Boolean transactionHistory=transactionHistoryPage.verifyTransactionHistoryHeaderDisplayed();
		Assert.assertTrue(transactionHistory);
		String header=transactionHistoryPage.getTransactionHistory();
		verifyText(header,"Transaction History");
		accountListingPage=transactionHistoryPage.clickBackButton();
		Boolean accountListing=accountListingPage.verifyHPPageTitleDisplayed();
		Assert.assertTrue(accountListing);
	
	}
	
	@Test(groups = {"RegressionTest"})
	public void tc006_verify_HP_TransactionHistory_QuickAccessOptions() throws Throwable {
	

		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		Assert.assertTrue(dashboardPage.verifyBankingDashboardisplayed());
		dashboardPage.clickLiabilitiesIcon();
		dashboardPage.verifyTLCardDisplayed();
		dashboardPage.swipeToCard("HirePurchase");
		Boolean HPcard=dashboardPage.verifyHPCardDisplayed();
		Assert.assertTrue(HPcard);
		accountListingPage=dashboardPage.clickHPCard();
		Assert.assertTrue(accountListingPage.verifyHPPageTitleDisplayed());
		transactionHistoryPage=accountListingPage.clickCard("Hire Purchase card on account listing page ");
		Boolean transactionHistory=transactionHistoryPage.verifyTransactionHistoryHeaderDisplayed();
		Assert.assertTrue(transactionHistory);
		String header=transactionHistoryPage.getTransactionHistory();
		verifyText(header,"Transaction History");
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
		dashboardPage.verifyTLCardDisplayed();
		dashboardPage.swipeToCard("HirePurchase");
		Boolean HPcard=dashboardPage.verifyHPCardDisplayed();
		Assert.assertTrue(HPcard);
		accountListingPage=dashboardPage.clickHPCard();
		Assert.assertTrue(accountListingPage.verifyHPPageTitleDisplayed());
		transactionHistoryPage=accountListingPage.clickCard("Hire Purchase card on account listing page ");
		Boolean transactionHistory=transactionHistoryPage.verifyTransactionHistoryHeaderDisplayed();
		Assert.assertTrue(transactionHistory);
		String header=transactionHistoryPage.getTransactionHistory();
		verifyText(header,"Transaction History");
		hpDetailsPage=transactionHistoryPage.clickHPCard();
		Assert.assertTrue(hpDetailsPage.verifyLoansDetailsHeaderDisplayed());
		Boolean cardDisplayed=hpDetailsPage.verifyCard1Displayed();
		softAssert.assertTrue(cardDisplayed);
		Boolean backButton=hpDetailsPage.verifyBackButton();
		softAssert.assertTrue(backButton);
		Boolean accountName=hpDetailsPage.verifyAccountNameOnCard1();
		softAssert.assertTrue(accountName);
		Boolean equipmentType=hpDetailsPage.verifyHPEquipmentDisplayed();
		softAssert.assertTrue(equipmentType);
		Boolean accountNum=hpDetailsPage.verifyAccountNumberOnCard1();
		softAssert.assertTrue(accountNum);
		Boolean availBal=hpDetailsPage.verifyOutstandingBalanceOnCard1();
		softAssert.assertTrue(availBal);
		Boolean quickAccessBtn=hpDetailsPage.verifyQuickAccessButton();
		softAssert.assertTrue(quickAccessBtn);
		String typeOfLoan=hpDetailsPage.getTypeOfLoanValue();
		softAssert.assertTrue(hpDetailsPage.verifyAccountNamelabelDisplayed());
		softAssert.assertTrue(hpDetailsPage.verifyTypeOflabelDisplayed());
		softAssert.assertTrue(hpDetailsPage.verifyNicknamelabelDisplayed());
		if(typeOfLoan.contentEquals("Islamic")) {
			softAssert.assertTrue(hpDetailsPage.verifyVehicleRegOrSerialNumLabel());
			softAssert.assertTrue(hpDetailsPage.verifyTotalPaidLabel());
			softAssert.assertTrue(hpDetailsPage.verifyMonthlyInstallmentLabel());
			softAssert.assertTrue(hpDetailsPage.verifyPaymentDueDateLabel());
			softAssert.assertTrue(hpDetailsPage.verifyLateClearingOutstationChequeFloatLabel());
			softAssert.assertTrue(hpDetailsPage.verifyInstallmentDueLabel());
			softAssert.assertTrue(hpDetailsPage.verifyProfitRateLabel());
			softAssert.assertTrue(hpDetailsPage.verifyCompensationFeeLabel());
			softAssert.assertTrue(hpDetailsPage.verifyRepaymentPeriodLabel());
			softAssert.assertTrue(hpDetailsPage.verifyPayLoanButton());
			
		}
		else if(typeOfLoan.contentEquals("Conventional Loan")) {
			softAssert.assertTrue(hpDetailsPage.verifyVehicleRegOrSerialNumLabel());
			softAssert.assertTrue(hpDetailsPage.verifyTotalPaidLabel());
			softAssert.assertTrue(hpDetailsPage.verifyMonthlyInstallmentLabel());
			softAssert.assertTrue(hpDetailsPage.verifyPaymentDueDateLabel());
			softAssert.assertTrue(hpDetailsPage.verifyLateClearingOutstationChequeFloatLabel());
			softAssert.assertTrue(hpDetailsPage.verifyInstallmentDueLabel());
			softAssert.assertTrue(hpDetailsPage.verifyProfitRateLabel());
			softAssert.assertTrue(hpDetailsPage.verifyCompensationFeeLabel());
			softAssert.assertTrue(hpDetailsPage.verifyRepaymentPeriodLabel());
			softAssert.assertTrue(hpDetailsPage.verifyPayLoanButton());
			
		}
		softAssert.assertAll();  	
	}
	
	
	@Test(groups = {"RegressionTest"})
	public void tc008_verify_backButtonFunctionality_on_HPDetailsPage() throws Throwable {
		

		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		Assert.assertTrue(dashboardPage.verifyBankingDashboardisplayed());
		dashboardPage.clickLiabilitiesIcon();
		dashboardPage.verifyTLCardDisplayed();
		dashboardPage.swipeToCard("HirePurchase");
		Boolean HPcard=dashboardPage.verifyHPCardDisplayed();
		Assert.assertTrue(HPcard);
		accountListingPage=dashboardPage.clickHPCard();
		Assert.assertTrue(accountListingPage.verifyHPPageTitleDisplayed());
		transactionHistoryPage=accountListingPage.clickCard("Hire Purchase card on account listing page ");
		Boolean transactionHistory=transactionHistoryPage.verifyTransactionHistoryHeaderDisplayed();
		Assert.assertTrue(transactionHistory);
		String header=transactionHistoryPage.getTransactionHistory();
		verifyText(header,"Transaction History");
		hpDetailsPage=transactionHistoryPage.clickHPCard();
		Assert.assertTrue(hpDetailsPage.verifyLoansDetailsHeaderDisplayed());;
		transactionHistoryPage=hpDetailsPage.clickBackButton();
		Boolean transactionHistory1=transactionHistoryPage.verifyTransactionHistoryHeaderDisplayed();
		Assert.assertTrue(transactionHistory1);
		
	}
	
	@Test(groups = {"RegressionTest"})
	public void tc009_verify_HP_LoanDetails_QuickAccessOptions() throws Throwable {
	

		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		Assert.assertTrue(dashboardPage.verifyBankingDashboardisplayed());
		dashboardPage.clickLiabilitiesIcon();
		dashboardPage.verifyTLCardDisplayed();
		dashboardPage.swipeToCard("HirePurchase");
		Boolean HPcard=dashboardPage.verifyHPCardDisplayed();
		Assert.assertTrue(HPcard);
		accountListingPage=dashboardPage.clickHPCard();
		Assert.assertTrue(accountListingPage.verifyHPPageTitleDisplayed());
		transactionHistoryPage=accountListingPage.clickCard("Hire Purchase card on account listing page ");
		Boolean transactionHistory=transactionHistoryPage.verifyTransactionHistoryHeaderDisplayed();
		Assert.assertTrue(transactionHistory);
		String header=transactionHistoryPage.getTransactionHistory();
		verifyText(header,"Transaction History");
		hpDetailsPage=transactionHistoryPage.clickHPCard();
		Assert.assertTrue(hpDetailsPage.verifyLoansDetailsHeaderDisplayed());
		quickAccessPage=hpDetailsPage.clickQuickAccessCTA();
		Boolean loanDetails=quickAccessPage.verifyTransactionHistoryCTADisplayed();
		Assert.assertTrue(loanDetails);
		Boolean downloadStatement=quickAccessPage.verifyDownloadStatementCTADisplayed();
		Assert.assertTrue(downloadStatement);
		Boolean payLoan=quickAccessPage.verifyPayLoanCTADisplayed();
		Assert.assertTrue(payLoan);
	}
	
	@Test(groups = { "SmokeTest","RegressionTest" })
	public void tc010_validate_HP_CardDeatils_on_AccountListing_TransactionHistory_LoanDetailsPage() throws Throwable {
	
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		Assert.assertTrue(dashboardPage.verifyBankingDashboardisplayed());
		dashboardPage.clickLiabilitiesIcon();
		dashboardPage.verifyTLCardDisplayed();
		dashboardPage.swipeToCard("HirePurchase");
		Boolean HPcard=dashboardPage.verifyHPCardDisplayed();
		Assert.assertTrue(HPcard);
		accountListingPage=dashboardPage.clickHPCard();
		Assert.assertTrue(accountListingPage.verifyHPPageTitleDisplayed());
		String accountName=accountListingPage.getAccountName();
		String accountNumber=accountListingPage.getAccountNumber();
		String equipmentType=accountListingPage.getHPEquipmentType();
		String availableBalance=accountListingPage.getAvailableBalance();
		transactionHistoryPage=accountListingPage.clickCard("Hire Purchase card");
		Boolean transactionHistory=transactionHistoryPage.verifyTransactionHistoryHeaderDisplayed();
		Assert.assertTrue(transactionHistory);
		String accountNameTL=transactionHistoryPage.getAccountName();
		String accountNumberTL=transactionHistoryPage.getAccountNumber();
		String equipmentTypeTL=transactionHistoryPage.getHPEquipmentType();
		String availableBalanceTL=transactionHistoryPage.getAvailableBalance("Outstanding balance");
		verifyText(accountName,accountNameTL);
		verifyText(accountNumber,accountNumberTL);
		verifyText(equipmentType,equipmentTypeTL);
		verifyText(availableBalance,availableBalanceTL);
		hpDetailsPage=transactionHistoryPage.clickHPCard();
		Assert.assertTrue(hpDetailsPage.verifyLoansDetailsHeaderDisplayed());
		String accountNameAD=hpDetailsPage.getAccountName();
		String accountNumberAD=hpDetailsPage.getAccountNumber();
		String equipmentTypeAD=hpDetailsPage.getHPEquipmentType();
		String availableBalanceAD=hpDetailsPage.getAvailableBalance();
		verifyText(accountName,accountNameAD);
		verifyText(accountNumber,accountNumberAD);
		verifyText(equipmentType,equipmentTypeAD);
		verifyText(availableBalance,availableBalanceAD);
	}
	
	
	
	@Test(groups = {"RegressionTest","Demo"})
	public void tc011_update_TL_nickname() throws Throwable {
		
		
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		dashboardPage=loginPage.clickLoginButton();
		Assert.assertTrue(dashboardPage.verifyBankingDashboardisplayed());
		dashboardPage.clickLiabilitiesIcon();
		dashboardPage.verifyTLCardDisplayed();
		dashboardPage.swipeToCard("HirePurchase");
		Boolean HPcard=dashboardPage.verifyHPCardDisplayed();
		Assert.assertTrue(HPcard);
		accountListingPage=dashboardPage.clickHPCard();
		Assert.assertTrue(accountListingPage.verifyHPPageTitleDisplayed());
		transactionHistoryPage=accountListingPage.clickCard("Hire Purchase card on account listing page ");
		Boolean transactionHistory=transactionHistoryPage.verifyTransactionHistoryHeaderDisplayed();
		Assert.assertTrue(transactionHistory);
		String header=transactionHistoryPage.getTransactionHistory();
		verifyText(header,"Transaction History");
		hpDetailsPage=transactionHistoryPage.clickHPCard();
		Assert.assertTrue(hpDetailsPage.verifyLoansDetailsHeaderDisplayed());
		String nickname=randomString("alphabetic",7);
		editNicknamePage=hpDetailsPage.clickNicknameLbl();
		editNicknamePage.verifyEditNicknamePageDisplayed();
		editNicknamePage.enterNickName(nickname);
		hpDetailsPage=editNicknamePage.clickDoneBtnHP();
		String snackbarMsg=hpDetailsPage.getSnackBarMsg();
		verifyText(snackbarMsg,getStrings().get("UpdateNickname"));
		hpDetailsPage.clickSnackBarClose();
		String nicknameAccountdetails=hpDetailsPage.getNicknameValue();
		verifyText(nicknameAccountdetails, nickname);
		String nicknameADCard=hpDetailsPage.getAccountName();
		verifyText(nicknameADCard, nickname);
		transactionHistoryPage=hpDetailsPage.clickBackButton();
		Assert.assertTrue(transactionHistoryPage.verifyTransactionHistoryHeaderDisplayed());
		String nicknameTLCard=transactionHistoryPage.getAccountName();
		verifyText(nicknameTLCard, nickname);
		accountListingPage=transactionHistoryPage.clickBackButton();
		Assert.assertTrue(accountListingPage.verifyHPPageTitleDisplayed());
		String nicknameALCard=accountListingPage.getAccountName();
		verifyText(nicknameALCard, nickname);
		
	}
	

}

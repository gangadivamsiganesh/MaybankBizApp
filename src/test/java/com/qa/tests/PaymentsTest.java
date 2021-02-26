package com.qa.tests;

import java.lang.reflect.Method;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.BaseTest;
import com.qa.pages.AddFavSuccessfulPage;
import com.qa.pages.AddFavTypePage;
import com.qa.pages.ApprovalDashboardPage;
import com.qa.pages.ApprovalFilterPage;
import com.qa.pages.BankingDashboardPage;
import com.qa.pages.BillerDetailsPage;
import com.qa.pages.BusinessProfilePage;
import com.qa.pages.CalenderPage;
import com.qa.pages.ConfirmationPage;
import com.qa.pages.ControlCenterPage;
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
import com.qa.utils.TestUtils;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;




public class PaymentsTest extends BaseTest{
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
	TestUtils utils = new TestUtils();
	WebDriverWait w;

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
	public void tc001_verify_Jompay_Immediate_Payment() throws Throwable {
		
		SoftAssert softAssert=new SoftAssert();
		changeToMaker();
		paymentsDashboardPage=dashboardPage.clickPaymentsIcon();
		Assert.assertTrue(paymentsDashboardPage.verifyPaymentDashboardisplayed());
		payFromPage=paymentsDashboardPage.clickJomPayPayment();
		Assert.assertTrue(payFromPage.verifyPayFromPageDisplayed());
		String accountName=payFromPage.getAccountName();
		String accountNum=payFromPage.getAccountNumber();
		billerDetailsPage=payFromPage.clickPayFromAccount();
		Assert.assertTrue(billerDetailsPage.verifyJompayBillerDetailsPageDisplayed());
		String billerCode=loginUsers.getJSONObject("jompayBillerDetails").getString("billerCode");
		String ref1=loginUsers.getJSONObject("jompayBillerDetails").getString("ref1");
		String ref2=loginUsers.getJSONObject("jompayBillerDetails").getString("ref2");
		billerDetailsPage.enterBillerCode(billerCode);
		billerDetailsPage.enterReferenceNumber1(ref1);
		billerDetailsPage.enterReferenceNumber2(ref2);
		enterAmountPage=billerDetailsPage.clickContinueButton();
		Assert.assertTrue(enterAmountPage.verifyEnterAmountPageDisplayed());
		String amount=randomString("numeric",2);
		paymentsDetailsPage=enterAmountPage.enterAmount(amount);
		Assert.assertTrue(paymentsDetailsPage.verifyJompayPaymentDetailsPageDisplayed());
		String accountNamePD=paymentsDetailsPage.getPayFromAccountname();
		String accountNumberPD=paymentsDetailsPage.getPayFromAccountNumber();
		verifyText(accountNamePD,accountName);
		verifyText(accountNum,accountNumberPD);
		String Ref1PD=paymentsDetailsPage.getReferenceNumber1();
		String Ref2PD=paymentsDetailsPage.getReferenceNumber2();
		verifyText(ref1,Ref1PD);
		verifyText(ref2,Ref2PD);
		String amountPD=paymentsDetailsPage.getAmount();
		verifyText(amount.concat(".00"),amountPD);
		String nickname=randomString("alphabetic",8);
		//paymentsDetailsPage.clickAddFavTogglebtn();
		paymentsDetailsPage.enterNickname(nickname);
		reviewDetailsPage=paymentsDetailsPage.clickContinueButton();
		Assert.assertTrue(reviewDetailsPage.verifyReviewDetailsPageDisplayed());
		String amountRD=reviewDetailsPage.getAmount();
		verifyText(amount.concat(".00"),amountRD);
		String nicknameRD=reviewDetailsPage.getAddNicknameValue();
		String FromAccNameRD=reviewDetailsPage.getFromAccountNameAccountName();
		String FromAccNumRD=reviewDetailsPage.getFromAccountNameAccountNumber();
		String Ref1RD=reviewDetailsPage.getReferenceNumber1();
		String Ref2RD=reviewDetailsPage.getReferenceNumber2();
		verifyText(nicknameRD,nickname);
		verifyText(FromAccNameRD,accountName);
		verifyText(FromAccNumRD,accountNum);
		verifyText(Ref1RD,ref1);
		verifyText(Ref2RD,ref2);
		ThankYouPage thankYouPage=reviewDetailsPage.clickContinueButton();
		try {
			thankYouPage.clickSnackBarClose();
		}catch(Exception e) {
			
		}
		Assert.assertTrue(thankYouPage.verifyThankYouPageDisplayed());
		verifyText(thankYouPage.getHeaderStatusValue(),"Sent For Approval");
		String amountTY=thankYouPage.getAmountValue();
		verifyText(amountTY,amountPD);
		String referenceID=thankYouPage.getRefrenceIDValue();
		String status=thankYouPage.getStatusValue();
		verifyText(status,"Pending");
		String payFromAccNameTY=thankYouPage.getPayFromAccountNameValue();
		String payFromAccNumTY=thankYouPage.getPayFromAccNumberValue();
		verifyText(payFromAccNameTY,accountName);
		verifyText(payFromAccNumTY,accountNum);
		String ref1TY=thankYouPage.getRefNum1Value();
		String ref2TY=thankYouPage.getRefNum2Value();
		verifyText(ref1TY,ref1);
		verifyText(ref2TY,ref2);
		paymentsDashboardPage=thankYouPage.clickDoneButton();
		Assert.assertTrue(paymentsDashboardPage.verifyPaymentDashboardisplayed());
		dashboardPage=paymentsDashboardPage.clickBackbutton();
		dashboardPage.verifyBankingDashboardisplayed();
		changeToChecker();
		ApproveFirstRecord();
		softAssert.assertAll();
	}

	
	@Test(groups = {"RegressionTest"})
		public void tc002_verify_Jompay_Future_Payment() throws Throwable {
			
			SoftAssert softAssert=new SoftAssert();
			changeToMaker();
			paymentsDashboardPage=dashboardPage.clickPaymentsIcon();
			Assert.assertTrue(paymentsDashboardPage.verifyPaymentDashboardisplayed());
			payFromPage=paymentsDashboardPage.clickJomPayPayment();
			Assert.assertTrue(payFromPage.verifyPayFromPageDisplayed());
			String accountName=payFromPage.getAccountName();
			String accountNum=payFromPage.getAccountNumber();
			billerDetailsPage=payFromPage.clickPayFromAccount();
			Assert.assertTrue(billerDetailsPage.verifyJompayBillerDetailsPageDisplayed());
			String billerCode=loginUsers.getJSONObject("jompayBillerDetails").getString("billerCode");
			String ref1=loginUsers.getJSONObject("jompayBillerDetails").getString("ref1");
			String ref2=loginUsers.getJSONObject("jompayBillerDetails").getString("ref2");
			billerDetailsPage.enterBillerCode(billerCode);
			billerDetailsPage.enterReferenceNumber1(ref1);
			billerDetailsPage.enterReferenceNumber2(ref2);
			enterAmountPage=billerDetailsPage.clickContinueButton();
			Assert.assertTrue(enterAmountPage.verifyEnterAmountPageDisplayed());
			String amount=randomString("numeric",2);
			paymentsDetailsPage=enterAmountPage.enterAmount(amount);
			Assert.assertTrue(paymentsDetailsPage.verifyJompayPaymentDetailsPageDisplayed());
			String accountNamePD=paymentsDetailsPage.getPayFromAccountname();
			String accountNumberPD=paymentsDetailsPage.getPayFromAccountNumber();
			verifyText(accountNamePD,accountName);
			verifyText(accountNum,accountNumberPD);
			String Ref1PD=paymentsDetailsPage.getReferenceNumber1();
			String Ref2PD=paymentsDetailsPage.getReferenceNumber2();
			verifyText(ref1,Ref1PD);
			verifyText(ref2,Ref2PD);
			String amountPD=paymentsDetailsPage.getAmount();
			verifyText(amount.concat(".00"),amountPD);
			calenderPage=paymentsDetailsPage.clickCalender();
			paymentsDetailsPage=calenderPage.clickFutureDate();
			String date=paymentsDetailsPage.getDate();
			String nickname=randomString("alphabetic",8);
			paymentsDetailsPage.enterNickname(nickname);
			reviewDetailsPage=paymentsDetailsPage.clickContinueButton();
			Assert.assertTrue(reviewDetailsPage.verifyReviewDetailsPageDisplayed());
			String amountRD=reviewDetailsPage.getAmount();
			verifyText(amount.concat(".00"),amountRD);
			String dateRD=reviewDetailsPage.getScheduledForDate();
			String nicknameRD=reviewDetailsPage.getAddNicknameValue();
			String FromAccNameRD=reviewDetailsPage.getFromAccountNameAccountName();
			String FromAccNumRD=reviewDetailsPage.getFromAccountNameAccountNumber();
			String Ref1RD=reviewDetailsPage.getReferenceNumber1();
			String Ref2RD=reviewDetailsPage.getReferenceNumber2();
			verifyText(dateRD,date);
			verifyText(nicknameRD,nickname);
			verifyText(FromAccNameRD,accountName);
			verifyText(FromAccNumRD,accountNum);
			verifyText(Ref1RD,ref1);
			verifyText(Ref2RD,ref2);
			ThankYouPage thankYouPage=reviewDetailsPage.clickContinueButton();
			try {
				thankYouPage.clickSnackBarClose();
			}catch(Exception e) {
				
			}
			Assert.assertTrue(thankYouPage.verifyThankYouPageDisplayed());
			verifyText(thankYouPage.getHeaderStatusValue(),"Sent For Approval");
			String amountTY=thankYouPage.getAmountValue();
			
			verifyText(amountTY,amountPD);
			String ScheduledForTY=thankYouPage.getScheduledForDate();
			verifyText(ScheduledForTY,date);
			String referenceID=thankYouPage.getRefrenceIDValue();
			String status=thankYouPage.getStatusValue();
			verifyText(status,"Pending");
			String payFromAccNameTY=thankYouPage.getPayFromAccountNameValue();
			String payFromAccNumTY=thankYouPage.getPayFromAccNumberValue();
			verifyText(payFromAccNameTY,accountName);
			verifyText(payFromAccNumTY,accountNum);
			String ref1TY=thankYouPage.getRefNum1Value();
			String ref2TY=thankYouPage.getRefNum2Value();
			verifyText(ref1TY,ref1);
			verifyText(ref2TY,ref2);
			paymentsDashboardPage=thankYouPage.clickDoneButton();
			Assert.assertTrue(paymentsDashboardPage.verifyPaymentDashboardisplayed());
			dashboardPage=paymentsDashboardPage.clickBackbutton();
			dashboardPage.verifyBankingDashboardisplayed();
			changeToChecker();
			ApproveFirstRecord();
			softAssert.assertAll();
		}
	
	@Test(groups = {"RegressionTest"})
	public void tc003_verify_FavouriteJompay_Immediate_Payment() throws Throwable {
		
		SoftAssert softAssert=new SoftAssert();
		changeToMaker();
		paymentsDashboardPage=dashboardPage.clickPaymentsIcon();
		Assert.assertTrue(paymentsDashboardPage.verifyPaymentDashboardisplayed());
		paymentsDashboardPage.searchFav("jompay");
		payFromPage=paymentsDashboardPage.clickFavouritePayment();
		Assert.assertTrue(payFromPage.verifyPayFromPageDisplayed());
		String accountName=payFromPage.getAccountName();
		String accountNum=payFromPage.getAccountNumber();
		enterAmountPage=payFromPage.clickPayFromAccountFavPayment();
		Assert.assertTrue(enterAmountPage.verifyEnterAmountPageDisplayed());
		String amount=randomString("numeric",2);
		paymentsDetailsPage=enterAmountPage.enterAmount(amount);
		Assert.assertTrue(paymentsDetailsPage.verifyJompayPaymentDetailsPageDisplayed());
		String accountNamePD=paymentsDetailsPage.getPayFromAccountname();
		String accountNumberPD=paymentsDetailsPage.getPayFromAccountNumber();
		verifyText(accountNamePD,accountName);
		verifyText(accountNum,accountNumberPD);
		String Ref1PD=paymentsDetailsPage.getReferenceNumber1();
		String amountPD=paymentsDetailsPage.getAmount();
		verifyText(amount.concat(".00"),amountPD);
		reviewDetailsPage=paymentsDetailsPage.clickContinueButton();
		Assert.assertTrue(reviewDetailsPage.verifyReviewDetailsPageDisplayed());
		String NicknameRD=reviewDetailsPage.getNickname();
		String amountRD=reviewDetailsPage.getAmount();
		verifyText(amount.concat(".00"),amountRD);
		
		softAssert.assertTrue(reviewDetailsPage.verifyNickNameLabelDisplayed());
		String FromAccNameRD=reviewDetailsPage.getFromAccountNameAccountName();
		String FromAccNumRD=reviewDetailsPage.getFromAccountNameAccountNumber();
		String Ref1RD=reviewDetailsPage.getReferenceNumber1();
		verifyText(FromAccNameRD,accountName);
		verifyText(FromAccNumRD,accountNum);
		verifyText(Ref1RD,Ref1PD);
		ThankYouPage thankYouPage=reviewDetailsPage.clickContinueButton();
		try {
			thankYouPage.clickSnackBarClose();
		}catch(Exception e) {
			
		}
		Assert.assertTrue(thankYouPage.verifyThankYouPageDisplayed());
		verifyText(thankYouPage.getHeaderStatusValue(),"Sent For Approval");
		String amountTY=thankYouPage.getAmountValue();
		verifyText(amountTY,amountPD);
		String NicknameTY=thankYouPage.getNicknameValue();
		verifyText(NicknameTY,NicknameRD);
		String referenceID=thankYouPage.getRefrenceIDValue();
		String status=thankYouPage.getStatusValue();
		verifyText(status,"Pending");
		String payFromAccNameTY=thankYouPage.getPayFromAccountNameValue();
		String payFromAccNumTY=thankYouPage.getPayFromAccNumberValue();
		verifyText(payFromAccNameTY,accountName);
		verifyText(payFromAccNumTY,accountNum);
		String ref1TY=thankYouPage.getRefNum1Value();
		String ref2TY=thankYouPage.getRefNum2Value();
		verifyText(ref1TY,Ref1PD);
		paymentsDashboardPage=thankYouPage.clickDoneButton();
		Assert.assertTrue(paymentsDashboardPage.verifyPaymentDashboardisplayed());
		dashboardPage=paymentsDashboardPage.clickBackbutton();
		dashboardPage.verifyBankingDashboardisplayed();
		changeToChecker();
		ApproveFirstRecord();
		softAssert.assertAll();
	}
	
	@Test(groups = { "SmokeTest","RegressionTest" })
	public void tc004_verify_Future_FavouriteJompay_Payment() throws Throwable {
		
		SoftAssert softAssert=new SoftAssert();
		changeToMaker();
		paymentsDashboardPage=dashboardPage.clickPaymentsIcon();
		Assert.assertTrue(paymentsDashboardPage.verifyPaymentDashboardisplayed());
		paymentsDashboardPage.searchFav("jompay");
		payFromPage=paymentsDashboardPage.clickFavouritePayment();
		Assert.assertTrue(payFromPage.verifyPayFromPageDisplayed());
		String accountName=payFromPage.getAccountName();
		String accountNum=payFromPage.getAccountNumber();
		enterAmountPage=payFromPage.clickPayFromAccountFavPayment();
		Assert.assertTrue(enterAmountPage.verifyEnterAmountPageDisplayed());
		String amount=randomString("numeric",2);
		paymentsDetailsPage=enterAmountPage.enterAmount(amount);
		Assert.assertTrue(paymentsDetailsPage.verifyJompayPaymentDetailsPageDisplayed());
		String accountNamePD=paymentsDetailsPage.getPayFromAccountname();
		String accountNumberPD=paymentsDetailsPage.getPayFromAccountNumber();
		verifyText(accountNamePD,accountName);
		verifyText(accountNum,accountNumberPD);
		String Ref1PD=paymentsDetailsPage.getReferenceNumber1();
		String amountPD=paymentsDetailsPage.getAmount();
		verifyText(amount.concat(".00"),amountPD);
		calenderPage=paymentsDetailsPage.clickCalender();
		paymentsDetailsPage=calenderPage.clickFutureDate();
		String date=paymentsDetailsPage.getDate();
		reviewDetailsPage=paymentsDetailsPage.clickContinueButton();
		Assert.assertTrue(reviewDetailsPage.verifyReviewDetailsPageDisplayed());
		String NicknameRD=reviewDetailsPage.getNickname();
		String amountRD=reviewDetailsPage.getAmount();
		verifyText(amount.concat(".00"),amountRD);
		softAssert.assertTrue(reviewDetailsPage.verifyNickNameLabelDisplayed());
		String dateRD=reviewDetailsPage.getScheduledForDate();
		String FromAccNameRD=reviewDetailsPage.getFromAccountNameAccountName();
		String FromAccNumRD=reviewDetailsPage.getFromAccountNameAccountNumber();
		String Ref1RD=reviewDetailsPage.getReferenceNumber1();
		verifyText(dateRD,date);
		verifyText(FromAccNameRD,accountName);
		verifyText(FromAccNumRD,accountNum);
		verifyText(Ref1RD,Ref1PD);
		ThankYouPage thankYouPage=reviewDetailsPage.clickContinueButton();
		try {
			thankYouPage.clickSnackBarClose();
		}catch(Exception e) {
			
		}
		Assert.assertTrue(thankYouPage.verifyThankYouPageDisplayed());
		verifyText(thankYouPage.getHeaderStatusValue(),"Sent For Approval");
		String amountTY=thankYouPage.getAmountValue();
		verifyText(amountTY,amountPD);
		String ScheduledForTY=thankYouPage.getScheduledForDate();
		verifyText(ScheduledForTY,date);
		String NicknameTY=thankYouPage.getNicknameValue();
		verifyText(NicknameTY,NicknameRD);
		String referenceID=thankYouPage.getRefrenceIDValue();
		String status=thankYouPage.getStatusValue();
		verifyText(status,"Pending");
		String payFromAccNameTY=thankYouPage.getPayFromAccountNameValue();
		String payFromAccNumTY=thankYouPage.getPayFromAccNumberValue();
		verifyText(payFromAccNameTY,accountName);
		verifyText(payFromAccNumTY,accountNum);
		String ref1TY=thankYouPage.getRefNum1Value();
		String ref2TY=thankYouPage.getRefNum2Value();
		verifyText(ref1TY,Ref1PD);
		paymentsDashboardPage=thankYouPage.clickDoneButton();
		Assert.assertTrue(paymentsDashboardPage.verifyPaymentDashboardisplayed());
		dashboardPage=paymentsDashboardPage.clickBackbutton();
		dashboardPage.verifyBankingDashboardisplayed();
		changeToChecker();
		ApproveFirstRecord();
		softAssert.assertAll();
	}
	
	@Test(groups = {"RegressionTest"})
	public void tc005_verify_Immediate_Bill_Payment() throws Throwable {
		
		SoftAssert softAssert=new SoftAssert();
		changeToMaker();
		paymentsDashboardPage=dashboardPage.clickPaymentsIcon();
		Assert.assertTrue(paymentsDashboardPage.verifyPaymentDashboardisplayed());
		payFromPage=paymentsDashboardPage.clickNewBillPayment();
		Assert.assertTrue(payFromPage.verifyPayFromPageDisplayed());
		String accountName=payFromPage.getAccountName();
		String accountNum=payFromPage.getAccountNumber();
		billerDetailsPage=payFromPage.clickPayFromAccount();
		billerDetailsPage.enterSearchBiller("21st Century");
		billerDetailsPage.clickFirstBiller();
		Assert.assertTrue(billerDetailsPage.verifyBillerDetailsPageDisplayed());
		String ref=randomString("numeric",8);
		billerDetailsPage.enterReferenceNumber(ref);
		enterAmountPage=billerDetailsPage.clickContinueButton();
		Assert.assertTrue(enterAmountPage.verifyEnterAmountPageDisplayed());
		String amount=randomString("numeric",3);
		paymentsDetailsPage=enterAmountPage.enterAmount(amount);
		Assert.assertTrue(paymentsDetailsPage.verifyBillPaymentDetailsPageDisplayed());
		String accountNamePD=paymentsDetailsPage.getPayFromAccountname();
		String accountNumberPD=paymentsDetailsPage.getPayFromAccountNumber();
		verifyText(accountNamePD,accountName);
		verifyText(accountNum,accountNumberPD);
		String RefPD=paymentsDetailsPage.getReferenceNumber();
		verifyText(RefPD,ref);
		String amountPD=paymentsDetailsPage.getAmount();
		verifyText(amount.concat(".00"),amountPD);
		String nickname=randomString("alphabetic",8);
		paymentsDetailsPage.enterNickname(nickname);
		reviewDetailsPage=paymentsDetailsPage.clickContinueButton();
		Assert.assertTrue(reviewDetailsPage.verifyReviewDetailsPageDisplayed());
		String amountRD=reviewDetailsPage.getAmount();
		verifyText(amount.concat(".00"),amountRD);
		String nicknameRD=reviewDetailsPage.getAddNicknameValue();
		String FromAccNameRD=reviewDetailsPage.getFromAccountNameAccountName();
		String FromAccNumRD=reviewDetailsPage.getFromAccountNameAccountNumber();
		String RefRD=reviewDetailsPage.getReferenceNumber();
		verifyText(nicknameRD,nickname);
		verifyText(FromAccNameRD,accountName);
		verifyText(FromAccNumRD,accountNum);
		verifyText(RefRD,ref);
		ThankYouPage thankYouPage=reviewDetailsPage.clickContinueButton();
		Assert.assertTrue(thankYouPage.verifyThankYouPageDisplayed());
		verifyText(thankYouPage.getHeaderStatusValue(),"Sent For Approval");
		String amountTY=thankYouPage.getAmountValue();
		verifyText(amountTY,amountPD);
		String referenceID=thankYouPage.getRefrenceIDValue();
		String status=thankYouPage.getStatusValue();
		verifyText(status,"Pending");
		String payFromAccNameTY=thankYouPage.getPayFromAccountNameValue();
		String payFromAccNumTY=thankYouPage.getPayFromAccNumberValue();
		verifyText(payFromAccNameTY,accountName);
		verifyText(payFromAccNumTY,accountNum);
		String refTY=thankYouPage.getReferenceNumberValue();
		String AddNicknameTY=thankYouPage.getAddNicknameValue();
		String AddFavReferenceID=thankYouPage.getAddFavRefIDValue();
		verifyText(AddNicknameTY,nickname);
		verifyText(refTY,ref);
		paymentsDashboardPage=thankYouPage.clickDoneButton();
		Assert.assertTrue(paymentsDashboardPage.verifyPaymentDashboardisplayed());
		dashboardPage=paymentsDashboardPage.clickBackbutton();
		dashboardPage.verifyBankingDashboardisplayed();
		changeToChecker();
		ApproveFirstRecord();
		softAssert.assertAll();
	}

	
	@Test(groups = { "SmokeTest","RegressionTest" })
		public void tc006_verify_Future_BillPayment() throws Throwable {
			
			

			SoftAssert softAssert=new SoftAssert();
			changeToMaker();
			paymentsDashboardPage=dashboardPage.clickPaymentsIcon();
			Assert.assertTrue(paymentsDashboardPage.verifyPaymentDashboardisplayed());
			payFromPage=paymentsDashboardPage.clickNewBillPayment();
			Assert.assertTrue(payFromPage.verifyPayFromPageDisplayed());
			String accountName=payFromPage.getAccountName();
			String accountNum=payFromPage.getAccountNumber();
			billerDetailsPage=payFromPage.clickPayFromAccount();
			billerDetailsPage.enterSearchBiller("21st Century");
			billerDetailsPage.clickFirstBiller();
			Assert.assertTrue(billerDetailsPage.verifyBillerDetailsPageDisplayed());
			String ref=randomString("numeric",8);
			billerDetailsPage.enterReferenceNumber(ref);
			enterAmountPage=billerDetailsPage.clickContinueButton();
			Assert.assertTrue(enterAmountPage.verifyEnterAmountPageDisplayed());
			String amount=randomString("numeric",3);
			paymentsDetailsPage=enterAmountPage.enterAmount(amount);
			Assert.assertTrue(paymentsDetailsPage.verifyBillPaymentDetailsPageDisplayed());
			String accountNamePD=paymentsDetailsPage.getPayFromAccountname();
			String accountNumberPD=paymentsDetailsPage.getPayFromAccountNumber();
			verifyText(accountNamePD,accountName);
			verifyText(accountNum,accountNumberPD);
			String RefPD=paymentsDetailsPage.getReferenceNumber();
			verifyText(RefPD,ref);
			String amountPD=paymentsDetailsPage.getAmount();
			verifyText(amount.concat(".00"),amountPD);
			calenderPage=paymentsDetailsPage.clickCalender();
			paymentsDetailsPage=calenderPage.clickFutureDate();
			String date=paymentsDetailsPage.getDate();
			String nickname=randomString("alphabetic",8);
			paymentsDetailsPage.enterNickname(nickname);
			reviewDetailsPage=paymentsDetailsPage.clickContinueButton();
			Assert.assertTrue(reviewDetailsPage.verifyReviewDetailsPageDisplayed());
			String amountRD=reviewDetailsPage.getAmount();
			verifyText(amount.concat(".00"),amountRD);
			String dateRD=reviewDetailsPage.getScheduledForDate();
			String nicknameRD=reviewDetailsPage.getAddNicknameValue();
			String FromAccNameRD=reviewDetailsPage.getFromAccountNameAccountName();
			String FromAccNumRD=reviewDetailsPage.getFromAccountNameAccountNumber();
			String RefRD=reviewDetailsPage.getReferenceNumber();
			verifyText(dateRD,date);
			verifyText(nicknameRD,nickname);
			verifyText(FromAccNameRD,accountName);
			verifyText(FromAccNumRD,accountNum);
			verifyText(RefRD,ref);
			ThankYouPage thankYouPage=reviewDetailsPage.clickContinueButton();
			Assert.assertTrue(thankYouPage.verifyThankYouPageDisplayed());
			verifyText(thankYouPage.getHeaderStatusValue(),"Sent For Approval");
			String amountTY=thankYouPage.getAmountValue();
			verifyText(amountTY,amountPD);
			String ScheduledForTY=thankYouPage.getScheduledForDate();
			verifyText(ScheduledForTY,date);
			String referenceID=thankYouPage.getRefrenceIDValue();
			String status=thankYouPage.getStatusValue();
			verifyText(status,"Pending");
			String payFromAccNameTY=thankYouPage.getPayFromAccountNameValue();
			String payFromAccNumTY=thankYouPage.getPayFromAccNumberValue();
			verifyText(payFromAccNameTY,accountName);
			verifyText(payFromAccNumTY,accountNum);
			String refTY=thankYouPage.getReferenceNumberValue();
			String AddNicknameTY=thankYouPage.getAddNicknameValue();
			String AddFavReferenceID=thankYouPage.getAddFavRefIDValue();
			verifyText(AddNicknameTY,nickname);
			verifyText(refTY,ref);
			paymentsDashboardPage=thankYouPage.clickDoneButton();
			Assert.assertTrue(paymentsDashboardPage.verifyPaymentDashboardisplayed());
			dashboardPage=paymentsDashboardPage.clickBackbutton();
			dashboardPage.verifyBankingDashboardisplayed();
			changeToChecker();
			ApproveFirstRecord();
			softAssert.assertAll();
		}
	
	@Test(groups = { "SmokeTest","RegressionTest","Demo" })
	public void tc007_verify_Favourite_Immediate_BillPayment() throws Throwable {

		SoftAssert softAssert=new SoftAssert();
		changeToMaker();
		paymentsDashboardPage=dashboardPage.clickPaymentsIcon();
		Assert.assertTrue(paymentsDashboardPage.verifyPaymentDashboardisplayed());
		paymentsDashboardPage.searchFav("21st Century");
		payFromPage=paymentsDashboardPage.clickFavouritePayment();
		Assert.assertTrue(payFromPage.verifyPayFromPageDisplayed());
		String accountName=payFromPage.getAccountName();
		String accountNum=payFromPage.getAccountNumber();
		enterAmountPage=payFromPage.clickPayFromAccountFavPayment();
		Assert.assertTrue(enterAmountPage.verifyEnterAmountPageDisplayed());
		String amount=randomString("numeric",2);
		paymentsDetailsPage=enterAmountPage.enterAmount(amount);
		Assert.assertTrue(paymentsDetailsPage.verifyBillPaymentDetailsPageDisplayed());
		String accountNamePD=paymentsDetailsPage.getPayFromAccountname();
		String accountNumberPD=paymentsDetailsPage.getPayFromAccountNumber();
		verifyText(accountNamePD,accountName);
		verifyText(accountNum,accountNumberPD);
		String RefPD=paymentsDetailsPage.getReferenceNumber();
		String amountPD=paymentsDetailsPage.getAmount();
		verifyText(amount.concat(".00"),amountPD);
		reviewDetailsPage=paymentsDetailsPage.clickContinueButton();
		Assert.assertTrue(reviewDetailsPage.verifyReviewDetailsPageDisplayed());
		String NicknameRD=reviewDetailsPage.getNickname();
		String amountRD=reviewDetailsPage.getAmount();
		String RefRD=reviewDetailsPage.getReferenceNumber();
		verifyText(amount.concat(".00"),amountRD);
		String FromAccNameRD=reviewDetailsPage.getFromAccountNameAccountName();
		String FromAccNumRD=reviewDetailsPage.getFromAccountNameAccountNumber();
		verifyText(FromAccNameRD,accountName);
		verifyText(FromAccNumRD,accountNum);
		verifyText(RefRD,RefPD);
		ThankYouPage thankYouPage=reviewDetailsPage.clickContinueButton();
		Assert.assertTrue(thankYouPage.verifyThankYouPageDisplayed());
		verifyText(thankYouPage.getHeaderStatusValue(),"Sent For Approval");
		String amountTY=thankYouPage.getAmountValue();
		verifyText(amountTY,amountPD);		
		String NicknameTY=thankYouPage.getNicknameValue();
		verifyText(NicknameTY,NicknameRD);
		String referenceID=thankYouPage.getRefrenceIDValue();
		String status=thankYouPage.getStatusValue();
		verifyText(status,"Pending");
		String payFromAccNameTY=thankYouPage.getPayFromAccountNameValue();
		String payFromAccNumTY=thankYouPage.getPayFromAccNumberValue();
		verifyText(payFromAccNameTY,accountName);
		verifyText(payFromAccNumTY,accountNum);
		String refTY=thankYouPage.getReferenceNumberValue();

		verifyText(refTY,RefRD);
		paymentsDashboardPage=thankYouPage.clickDoneButton();
		Assert.assertTrue(paymentsDashboardPage.verifyPaymentDashboardisplayed());
		dashboardPage=paymentsDashboardPage.clickBackbutton();
		dashboardPage.verifyBankingDashboardisplayed();
		changeToChecker();
		ApproveFirstRecordFav();
		softAssert.assertAll();
		
	}
	
	@Test(groups = {"RegressionTest","Demo"})
	public void tc008_verify_Future_FavouriteJompay_Payment() throws Throwable {
		
		SoftAssert softAssert=new SoftAssert();
		changeToMaker();
		paymentsDashboardPage=dashboardPage.clickPaymentsIcon();
		Assert.assertTrue(paymentsDashboardPage.verifyPaymentDashboardisplayed());
		paymentsDashboardPage.searchFav("21st Century");
		payFromPage=paymentsDashboardPage.clickFavouritePayment();
		Assert.assertTrue(payFromPage.verifyPayFromPageDisplayed());
		String accountName=payFromPage.getAccountName();
		String accountNum=payFromPage.getAccountNumber();
		enterAmountPage=payFromPage.clickPayFromAccountFavPayment();
		Assert.assertTrue(enterAmountPage.verifyEnterAmountPageDisplayed());
		String amount=randomString("numeric",2);
		paymentsDetailsPage=enterAmountPage.enterAmount(amount);
		Assert.assertTrue(paymentsDetailsPage.verifyBillPaymentDetailsPageDisplayed());
		String accountNamePD=paymentsDetailsPage.getPayFromAccountname();
		String accountNumberPD=paymentsDetailsPage.getPayFromAccountNumber();
		verifyText(accountNamePD,accountName);
		verifyText(accountNum,accountNumberPD);
		String RefPD=paymentsDetailsPage.getReferenceNumber();
		String amountPD=paymentsDetailsPage.getAmount();
		verifyText(amount.concat(".00"),amountPD);
		calenderPage=paymentsDetailsPage.clickCalender();
		paymentsDetailsPage=calenderPage.clickFutureDate();
		String date=paymentsDetailsPage.getDate();
		reviewDetailsPage=paymentsDetailsPage.clickContinueButton();
		Assert.assertTrue(reviewDetailsPage.verifyReviewDetailsPageDisplayed());
		String NicknameRD=reviewDetailsPage.getNickname();
		String amountRD=reviewDetailsPage.getAmount();
		String RefRD=reviewDetailsPage.getReferenceNumber();
		verifyText(amount.concat(".00"),amountRD);
		String dateRD=reviewDetailsPage.getScheduledForDate();
		verifyText(dateRD,date);
		String FromAccNameRD=reviewDetailsPage.getFromAccountNameAccountName();
		String FromAccNumRD=reviewDetailsPage.getFromAccountNameAccountNumber();
		verifyText(FromAccNameRD,accountName);
		verifyText(FromAccNumRD,accountNum);
		verifyText(RefRD,RefPD);
		ThankYouPage thankYouPage=reviewDetailsPage.clickContinueButton();
		Assert.assertTrue(thankYouPage.verifyThankYouPageDisplayed());
		verifyText(thankYouPage.getHeaderStatusValue(),"Sent For Approval");
		String amountTY=thankYouPage.getAmountValue();
		verifyText(amountTY,amountPD);
		String ScheduledForTY=thankYouPage.getScheduledForDate();
		String referenceID=thankYouPage.getRefrenceIDValue();
		verifyText(ScheduledForTY,date);
		String status=thankYouPage.getStatusValue();
		verifyText(status,"Pending");
		String payFromAccNameTY=thankYouPage.getPayFromAccountNameValue();
		String payFromAccNumTY=thankYouPage.getPayFromAccNumberValue();
		verifyText(payFromAccNameTY,accountName);
		verifyText(payFromAccNumTY,accountNum);
		String refTY=thankYouPage.getReferenceNumberValue();
		String NicknameTY=thankYouPage.getNicknameValue();
		verifyText(NicknameTY,NicknameRD);
		verifyText(refTY,RefRD);
		paymentsDashboardPage=thankYouPage.clickDoneButton();
		Assert.assertTrue(paymentsDashboardPage.verifyPaymentDashboardisplayed());	
		dashboardPage=paymentsDashboardPage.clickBackbutton();
		dashboardPage.verifyBankingDashboardisplayed();
		changeToChecker();
		ApproveFirstRecordFav();
		softAssert.assertAll();
	}
	
	@Test(groups = { "SmokeTest","RegressionTest" })
	public void tc009_verify_Add_Jompay_Favourite() throws Throwable {
		
		SoftAssert softAssert=new SoftAssert();
		changeToMaker();
		paymentsDashboardPage=dashboardPage.clickPaymentsIcon();
		Assert.assertTrue(paymentsDashboardPage.verifyPaymentDashboardisplayed());
		addFavTypePage=paymentsDashboardPage.clickAddFavPayment();
		Assert.assertTrue(addFavTypePage.verifyAddFavPageDisplayed());
		billerDetailsPage=addFavTypePage.clickJompayBillPaymentButton();
		Assert.assertTrue(billerDetailsPage.verifyJompayBillerDetailsPageDisplayed());
		String billerCode=loginUsers.getJSONObject("jompayBillerDetails").getString("billerCode");
		String Ref1=randomString("alphanumeric",7);
		String Ref2=randomString("alphanumeric",7);
		String nickname=randomString("alphabetic",7);
		billerDetailsPage.enterBillerCode(billerCode);
		billerDetailsPage.enterReferenceNumber1(Ref1);
		billerDetailsPage.enterReferenceNumber2(Ref2);
		billerDetailsPage.enterNickname(nickname);
		reviewDetailsPage=billerDetailsPage.clickNextButton();
		Assert.assertTrue(reviewDetailsPage.verifyReviewDetailsPageDisplayed());
		String nicknameRD=reviewDetailsPage.getNickname();
		String Ref1RD=reviewDetailsPage.getReferenceNumber1();
		String Ref2RD=reviewDetailsPage.getReferenceNumber2();
		verifyText(nicknameRD,nickname);
		verifyText(Ref1RD,Ref1);
		verifyText(Ref2RD,Ref2);
		addFavSuccessfulPage=reviewDetailsPage.clickAddFavButton();
		Assert.assertTrue(addFavSuccessfulPage.verifyAddFavSuccesssfulPageDisplayed());
		paymentsDashboardPage=addFavSuccessfulPage.clickDoneButton();
		Assert.assertTrue(paymentsDashboardPage.verifyPaymentDashboardisplayed());
		dashboardPage=paymentsDashboardPage.clickBackbutton();
		dashboardPage.verifyBankingDashboardisplayed();
		changeToChecker();
		ApproveFirstRecord();
		softAssert.assertAll();
	}
	
	@Test(groups = { "SmokeTest","RegressionTest" })
	public void tc010_verify_Add_BillPayment_Favourite() throws Throwable {
		
		SoftAssert softAssert=new SoftAssert();
		changeToMaker();
		paymentsDashboardPage=dashboardPage.clickPaymentsIcon();
		Assert.assertTrue(paymentsDashboardPage.verifyPaymentDashboardisplayed());
		addFavTypePage=paymentsDashboardPage.clickAddFavPayment();
		Assert.assertTrue(addFavTypePage.verifyAddFavPageDisplayed());
		billerDetailsPage=addFavTypePage.clickBillPaymentButton();
		billerDetailsPage.enterSearchBiller("21st Century");
		billerDetailsPage.clickFirstBiller();
		Assert.assertTrue(billerDetailsPage.verifyBillerDetailsPageDisplayed());
		String billerCode=loginUsers.getJSONObject("BillPaymentDetails").getString("billerCode");
		String ReferenceNumber=randomString("alphanumeric",7);
		String nickname=randomString("alphabetic",7);
		billerDetailsPage.enterReferenceNumber(ReferenceNumber);
		billerDetailsPage.enterNickname(nickname);
		reviewDetailsPage=billerDetailsPage.clickContinueButtonAddFav();
		Assert.assertTrue(reviewDetailsPage.verifyReviewDetailsPageDisplayed());
		String nicknameRD=reviewDetailsPage.getNickname();
		String Ref1RD=reviewDetailsPage.getReferenceNumber();
		verifyText(nicknameRD,nickname);
		verifyText(Ref1RD,ReferenceNumber);
		addFavSuccessfulPage=reviewDetailsPage.clickAddFavButton();
		Assert.assertTrue(addFavSuccessfulPage.verifyAddFavSuccesssfulPageDisplayed());
		paymentsDashboardPage=addFavSuccessfulPage.clickDoneButton();
		Assert.assertTrue(paymentsDashboardPage.verifyPaymentDashboardisplayed());
		dashboardPage=paymentsDashboardPage.clickBackbutton();
		dashboardPage.verifyBankingDashboardisplayed();
		changeToChecker();
		ApproveFirstRecord();
		softAssert.assertAll();
	}
	
	@Test(groups = {  })
	public void tc011_verify_Add_Jompay_Favourite_Negative() throws Throwable {
		
		SoftAssert softAssert=new SoftAssert();
		changeToMaker();
		paymentsDashboardPage=dashboardPage.clickPaymentsIcon();
		Assert.assertTrue(paymentsDashboardPage.verifyPaymentDashboardisplayed());
		addFavTypePage=paymentsDashboardPage.clickAddFavPayment();
		Assert.assertTrue(addFavTypePage.verifyAddFavPageDisplayed());
		billerDetailsPage=addFavTypePage.clickJompayBillPaymentButton();
		Assert.assertTrue(billerDetailsPage.verifyJompayBillerDetailsPageDisplayed());
		String billerCode=loginUsers.getJSONObject("jompayBillerDetails").getString("billerCode");
		String Ref1=loginUsers.getJSONObject("jompayBillerDetails").getString("ref1");
		String Ref2=loginUsers.getJSONObject("jompayBillerDetails").getString("ref2");
		String nickname=randomString("alphabetic",7);
		billerDetailsPage.enterBillerCode(billerCode);
		billerDetailsPage.enterReferenceNumber1(Ref1);
		billerDetailsPage.enterReferenceNumber2(Ref2);
		billerDetailsPage.enterNickname(nickname);
		reviewDetailsPage=billerDetailsPage.clickNextButton();
		Assert.assertTrue(reviewDetailsPage.verifyReviewDetailsPageDisplayed());
		String nicknameRD=reviewDetailsPage.getNickname();
		String Ref1RD=reviewDetailsPage.getReferenceNumber1();
		String Ref2RD=reviewDetailsPage.getReferenceNumber2();
		verifyText(nicknameRD,nickname);
		verifyText(Ref1RD,Ref1);
		verifyText(Ref2RD,Ref2);
		addFavSuccessfulPage=reviewDetailsPage.clickAddFavButton();
		Assert.assertTrue(addFavSuccessfulPage.verifyAddFavSuccesssfulPageDisplayed());
		paymentsDashboardPage=addFavSuccessfulPage.clickDoneButton();
		Assert.assertTrue(paymentsDashboardPage.verifyPaymentDashboardisplayed());
		dashboardPage=paymentsDashboardPage.clickBackbutton();
		dashboardPage.verifyBankingDashboardisplayed();
		changeToChecker();
		ApproveFirstRecord();
		softAssert.assertAll();
	}
	
	public void changeToChecker() throws InterruptedException {
		controlCenterPage=dashboardPage.clickHelpButton();
		settingsPage=controlCenterPage.clickSettingsIcon();
		myDevicesPage=settingsPage.clickMyDevices();
		Assert.assertTrue(myDevicesPage.myDevicesPageDisplayed());
	   // MobileElement e=(MobileElement) getDriver().findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"Current Device\")"));
		
	  //  e.click();
		myDevicesPage.clickontheCurrentdevice();
		myDevicesPage.clickRemoveButton();
		myDevicesPage.clickYesButton();		
		String IntroPageTitle=loginPage.getIntroPageTitle();
		verifyText(IntroPageTitle,"Welcome");
		scrollToCard();
		loginPage.clickLoginToM2UBizButton();
		loginPage.enterUserName(loginUsers.getJSONObject("checkerCredentials").getString("username"));
		loginPage.clickNextbtn();
		loginPage.clickSecurityPhraseYesbtn();
		loginPage.enterPassword(loginUsers.getJSONObject("checkerCredentials").getString("password"));
			loginPage.clickNextPswdbtn();
			loginPage.clickSkipbtn();
			dashboardPage=loginPage.clickLetsStartbtn();
			Assert.assertTrue(dashboardPage.verifyBankingDashboardisplayed());
	}
	public void changeToMaker() throws InterruptedException {
		
Boolean Intropage=false;
Intropage=loginPage.verifyIntroPageDisplayed();
if(Intropage==true)
    {
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
	
		loginPage.enterSubSequentPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
		Boolean paymentIcon=false;
		dashboardPage=loginPage.clickLoginButton();
		Thread.sleep(10000);
		paymentIcon=dashboardPage.verifyPaymentsIconDisplayed();
		if(paymentIcon==false) {
			controlCenterPage=dashboardPage.clickHelpButton();
			settingsPage=controlCenterPage.clickSettingsIcon();
			myDevicesPage=settingsPage.clickMyDevices();
			Assert.assertTrue(myDevicesPage.myDevicesPageDisplayed());
			
          //  MobileElement e=(MobileElement) getDriver().findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"Current Device\")"));
		//	e.click();
			
			myDevicesPage.clickontheCurrentdevice();
			myDevicesPage.clickRemoveButton();
			myDevicesPage.clickYesButton();		
			String IntroPageTitle=loginPage.getIntroPageTitle();
			verifyText(IntroPageTitle,"Welcome");
			scrollToCard();
			loginPage.clickLoginToM2UBizButton();
			loginPage.enterUserName(loginUsers.getJSONObject("makerCredentials").getString("username"));
			loginPage.clickNextbtn();
			loginPage.clickSecurityPhraseYesbtn();
			loginPage.loginPageDisplayed();
			loginPage.enterPassword(loginUsers.getJSONObject("makerCredentials").getString("password"));
				loginPage.clickNextPswdbtn();
				loginPage.clickSkipbtn();
				dashboardPage=loginPage.clickLetsStartbtn();
				Assert.assertTrue(dashboardPage.verifyBankingDashboardisplayed());
				}
		
	}
	
	public void ApproveFirstRecord() throws Throwable {
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
	public void ApproveFirstRecordFav() throws Throwable {
		approvalDashboardPage=dashboardPage.clickApprovalIcon();
		approvalDashboardPage.verifyApprovalDashboardisplayed();
		approvalFilterPage=approvalDashboardPage.clickOnFilter();
		
		//approvalDashboardPage.clickOnRecord();
		//approvalFilterPage.clickviewFilterbtn();
		approvalFilterPage.sortBybtn();
		approvalFilterPage.clickonLatest();
		approvalDashboardPage=approvalFilterPage.clickonApplyFilter();
		reviewDetailsPage=approvalDashboardPage.clickOnRecord();
		thankYouPage=reviewDetailsPage.clickApproveButtonFavTransaction();
		thankYouPage.verifyThankYouPageDisplayed();
	}
	
		
}

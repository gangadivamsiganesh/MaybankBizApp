package com.qa.pages;

import java.math.BigDecimal;

import com.aventstack.extentreports.Status;
import com.qa.BaseTest;
import com.qa.reports.ExtentReport;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ThankYouPage extends BaseTest{

	@iOSXCUITFindBy(id = "receipt_pageTitle")
	@AndroidFindBy(accessibility  = "receipt_pageTitle")
	private MobileElement ThankYouPageTitle_lbl;

	@iOSXCUITFindBy(id = "header_icon_crossBlack_img")
	@AndroidFindBy(accessibility  = "header_icon_crossBlack_img")
	private MobileElement cross_btn;

	@iOSXCUITFindBy(id = "header_icon_shareBold_img")
	@AndroidFindBy(accessibility  = "header_icon_shareBold_img")
	private MobileElement share_btn;

	@iOSXCUITFindBy(id = "label_Status_txt")
	@AndroidFindBy(accessibility  = "label_Status_txt")
	private MobileElement thankYouPageHeader_lbl;

	@iOSXCUITFindBy(id = "label_Date_txt")
	@AndroidFindBy(accessibility  = "label_Date_txt")
	private MobileElement thankYouPageDate_lbl;

	@iOSXCUITFindBy(id = "label_Amount_txt")
	@AndroidFindBy(accessibility  = "label_Amount_txt")
	private MobileElement amount_lbl;

	@iOSXCUITFindBy(id = "label_amount_txt")
	@AndroidFindBy(accessibility  = "label_amount_txt")
	private MobileElement amountValue_lbl;

	@iOSXCUITFindBy(id = "grid_Scheduled For_txt")
	@AndroidFindBy(accessibility  = "grid_Scheduled For_txt")
	private MobileElement scheduledFor_lbl;

	@iOSXCUITFindBy(id = "grid_Scheduled For_value")
	@AndroidFindBy(accessibility  = "grid_Scheduled For_value")
	private MobileElement scheduledForValue_lbl;

	@iOSXCUITFindBy(id = "grid_Biller Code_txt")
	@AndroidFindBy(accessibility  = "grid_Biller Code_txt")
	private MobileElement billerCode_lbl;

	@iOSXCUITFindBy(id = "grid_Biller Code_value")
	@AndroidFindBy(accessibility  = "grid_Biller Code_value")
	private MobileElement billerCodeValue_lbl;

	@iOSXCUITFindBy(id = "grid_Reference ID_txt")
	@AndroidFindBy(accessibility  = "grid_Reference ID_txt")
	private MobileElement referenceIDLabel_lbl;

	@iOSXCUITFindBy(id = "grid_Reference ID_value")
	@AndroidFindBy(accessibility  = "grid_Reference ID_value")
	private MobileElement referenceIDValue_lbl;

	@iOSXCUITFindBy(id = "grid_Status_txt")
	@AndroidFindBy(accessibility  = "grid_Status_txt")
	private MobileElement statusLabel_lbl;

	@iOSXCUITFindBy(id = "grid_Status_value")
	@AndroidFindBy(accessibility  = "grid_Status_value")
	private MobileElement statusValue_lbl;

	@iOSXCUITFindBy(id = "grid_Pay From_txt")
	@AndroidFindBy(accessibility  = "grid_Pay From_txt")
	private MobileElement payFromLabel_lbl;

	@iOSXCUITFindBy(id = "grid_accountName_txt")
	@AndroidFindBy(accessibility  = "grid_accountName_txt")
	private MobileElement payFromAccName_lbl;

	@iOSXCUITFindBy(id = "grid_accountNumber_txt")
	@AndroidFindBy(accessibility  = "grid_accountNumber_txt")
	private MobileElement payFromAccNumber_lbl;

	@iOSXCUITFindBy(id = "grid_Ref-1 Number_txt")
	@AndroidFindBy(accessibility  = "grid_Ref-1 Number_txt")
	private MobileElement referenceNumber1_lbl;

	@iOSXCUITFindBy(id = "grid_Ref-1 Number_value")
	@AndroidFindBy(accessibility  = "grid_Ref-1 Number_value")
	private MobileElement referenceNumber1Value_lbl;

	@iOSXCUITFindBy(id = "grid_Reference Number_txt")
	@AndroidFindBy(accessibility  = "grid_Reference Number_txt")
	private MobileElement referenceNumber_lbl;

	@iOSXCUITFindBy(id = "grid_Reference Number_value")
	@AndroidFindBy(accessibility  = "grid_Reference Number_value")
	private MobileElement referenceNumberValue_lbl;

	@iOSXCUITFindBy(id = "grid_Ref-2 Number_txt")
	@AndroidFindBy(accessibility  = "grid_Ref-2 Number_txt")
	private MobileElement referenceNumber2_lbl;

	@iOSXCUITFindBy(id = "grid_Ref-2 Number_value")
	@AndroidFindBy(accessibility  = "grid_Ref-2 Number_value")
	private MobileElement referenceNumber2Value_lbl;

	@iOSXCUITFindBy(id = "grid_Add Nickname_txt")
	@AndroidFindBy(accessibility  = "grid_Add Nickname_txt")
	private MobileElement addNicknameLabel_lbl;

	@iOSXCUITFindBy(id = "grid_Add NickName_value")
	@AndroidFindBy(accessibility  = "grid_Add NickName_value")
	private MobileElement addNicknameValue_lbl;

	@iOSXCUITFindBy(id = "grid_Add Favourite Reference ID_txt")
	@AndroidFindBy(accessibility  = "grid_Add Favourite Reference ID_txt")
	private MobileElement addFavReferenceID_lbl;

	@iOSXCUITFindBy(id = "grid_Add Favourite Reference ID_value")
	@AndroidFindBy(accessibility  = "grid_Add Favourite Reference ID_value")
	private MobileElement addFavReferenceIDValue_lbl;

	@iOSXCUITFindBy(id = "grid_Notes_txt")
	@AndroidFindBy(accessibility  = "grid_Notes_txt")
	private MobileElement notes_lbl;

	@iOSXCUITFindBy(id = "grid_Notes_value")
	@AndroidFindBy(accessibility  = "grid_Notes_value")
	private MobileElement notesValue_lbl;

	@iOSXCUITFindBy(id = "grid_Nickname_txt")
	@AndroidFindBy(accessibility  = "grid_Nickname_txt")
	private MobileElement nickname_lbl;

	@iOSXCUITFindBy(id = "grid_Nickname_value")
	@AndroidFindBy(accessibility  = "grid_Nickname_value")
	private MobileElement nicknameValue_lbl;

	@iOSXCUITFindBy(id = "downloadReceipt_txt")
	@AndroidFindBy(accessibility  = "downloadReceipt_txt")
	private MobileElement downloadReciept_btn;	

	@iOSXCUITFindBy(id = "receipt_Done_txt")
	@AndroidFindBy(accessibility  = "receipt_Done_txt")
	private MobileElement done_btn;	

	@iOSXCUITFindBy(id = "grid_Available Balance_txt")
	@AndroidFindBy(accessibility  = "grid_Available Balance_txt")
	private MobileElement availableBalance_lbl;	

	@iOSXCUITFindBy(id = "grid_Available Balance_value")
	@AndroidFindBy(accessibility  = "grid_Available Balance_value")
	private MobileElement availableBalanceValue_lbl;	

	@iOSXCUITFindBy(id = "grid_Recipient Reference_txt")
	@AndroidFindBy(accessibility  = "grid_Recipient Reference_txt")
	private MobileElement recipientReference_lbl;

	@iOSXCUITFindBy(id = "grid_Recipient Reference_value")
	@AndroidFindBy(accessibility  = "grid_Recipient Reference_value")
	private MobileElement recipientReferenceValue_lbl;

	@iOSXCUITFindBy(id = "grid_Payment Details_txt")
	@AndroidFindBy(accessibility  = "grid_Payment Details_txt")
	private MobileElement paymentDetails_lbl;

	@iOSXCUITFindBy(id = "grid_Payment Details_value")
	@AndroidFindBy(accessibility  = "grid_Payment Details_value")
	private MobileElement paymentDetailsValue_lbl;

	@iOSXCUITFindBy(id = "grid_From Account_txt")
	@AndroidFindBy(accessibility  = "grid_From Account_txt")
	private MobileElement fromAccount_lbl;

	@iOSXCUITFindBy(id = "grid_Transfer To_txt")
	@AndroidFindBy(accessibility  = "grid_Transfer To_txt")
	private MobileElement transferTo_lbl;
	
	@iOSXCUITFindBy(id = "grid_Start Date_value")
	@AndroidFindBy(accessibility  = "grid_Start Date_value")
	private MobileElement startDateValue_lbl;

	@iOSXCUITFindBy(id = "grid_End Date_value")
	@AndroidFindBy(accessibility  = "grid_End Date_value")
	private MobileElement endDateValue_lbl;
	
	@iOSXCUITFindBy(id = "grid_Recipient Bank_txt")
	@AndroidFindBy(accessibility  = "grid_Recipient Bank_txt")
	private MobileElement recipientBank_lbl;
	
	@iOSXCUITFindBy(id = "grid_Recipient Bank_value")
	@AndroidFindBy(accessibility  = "grid_Recipient Bank_value")
	private MobileElement recipientBankValue_lbl;
	
	@iOSXCUITFindBy(id = "grid_Recipient_txt")
	@AndroidFindBy(accessibility  = "grid_Recipient_txt")
	private MobileElement recipientLabel_lbl;
	
	
	@iOSXCUITFindBy(id = "grid_Recipient_value")
	@AndroidFindBy(accessibility  = "grid_Recipient_value")
	private MobileElement recipientValue_lbl;
	
	@iOSXCUITFindBy(id = "grid_Mobile Number_txt")
	@AndroidFindBy(accessibility  = "grid_Mobile Number_txt")
	private MobileElement mobileNumberLabel_lbl;
	
	@iOSXCUITFindBy(id = "grid_Mobile Number_value")
	@AndroidFindBy(accessibility  = "grid_Mobile Number_value")
	private MobileElement mobileNumberValue_lbl;
	
	@iOSXCUITFindBy(id = "grid_Transfer Type_value")
	@AndroidFindBy(accessibility  = "grid_Transfer Type_value")
	private MobileElement transferTypeValue_lbl;
	
	@iOSXCUITFindBy(id = "grid_Transfer Mode_value")
	@AndroidFindBy(accessibility  = "grid_Transfer Mode_value")
	private MobileElement transferModeValue_lbl;

	@iOSXCUITFindBy(id = "snackbarModal_message")
	@AndroidFindBy(accessibility = "snackbarModal_message")
	private MobileElement snackBarMsg_lbl;

	@iOSXCUITFindBy(id = "snackbarModal_msg_close_img")
	@AndroidFindBy(accessibility = "snackbarModal_msg_close_img")
	private MobileElement snackBarCross_btn;


	public String getSnackBarMsg() {
		String text=getText(snackBarMsg_lbl, "Snack Bar Message is ");
		return text;
	}

	public ThankYouPage clickSnackBarClose() throws Throwable {
		click(snackBarCross_btn,"Snackbar Close button");
		return this;
	}

	public PaymentsDashboardPage clickCrossButton() throws Throwable {
		click(cross_btn,"Cross button on Thank You page ");
		return new PaymentsDashboardPage();
	}
	public Boolean verifyThankYouPageDisplayed() {
		Boolean value=pageDisplayed(ThankYouPageTitle_lbl,"Thank You Page Title");
		return value;
	}

	public Boolean verifyCrossButtonDisplayed() {
		Boolean value=elementDisplayed(cross_btn,"Cross button on ThankYou Page");
		return value;
	}

	public Boolean verifyShareReceiptButtonDisplayed() {
		Boolean value=elementDisplayed(share_btn,"Share Reciept button on ThankYou Page");
		return value;
	}

	public Boolean verifyAmountLabelDisplayed() {
		Boolean value=elementDisplayed(amount_lbl,"Amount Label button on ThankYou Page");
		return value;
	}


	public String getThankYouPageHeader() {
		String text=getText(thankYouPageHeader_lbl, "Thank You Page Header");
		return text;
	}

	public String getThankYouPageHeaderDate() {
		String text=getText(thankYouPageDate_lbl, "Thank You Page Header Date");
		return text;
	}

	public String getAmountValue() {
		String text=getText(amountValue_lbl, "Amount on Thank you page ");
		text=text.substring(3);
		return text;
	}

	public Boolean verifyScheduledForDisplayed() {
		Boolean value=elementDisplayed(scheduledFor_lbl,"Schedule For label on ThankYou Page");
		return value;
	}

	public String getScheduledForDate() throws Throwable {
		verticalSwipeTillElementDisplayed(scheduledForValue_lbl," Scheduled for value");
		String text=getText(scheduledForValue_lbl, "Scheduled For value on Thank you page ");
		return text;
	}

	public Boolean verifyBillerCodeDisplayed() {
		Boolean value=elementDisplayed(billerCode_lbl,"Biller Code label on ThankYou Page");
		return value;
	}

	public String getBillerCodeValue() {
		String text=getText(billerCodeValue_lbl, "Biller code value on Thank you page ");
		return text;
	}

	public String getStartDate() throws InterruptedException {
		verticalSwipeTillElementDisplayed(startDateValue_lbl,"Start Date ");
		String text=getText(startDateValue_lbl, "Start Date value on Thank you page ");
		return text;
	}
	
	public String getEndDate() throws InterruptedException {
		verticalSwipeTillElementDisplayed(endDateValue_lbl," End Date ");
		String text=getText(endDateValue_lbl, "End Date value on Thank you page ");
		return text;
	}

	public String getRecipientBank() throws InterruptedException {
		verticalSwipeTillElementDisplayed(recipientBankValue_lbl," Recipient Bank ");
		String text=getText(recipientBankValue_lbl, "Recipient Bank value on Thank you page ");
		return text;
	}
	
	public Boolean verifyReferenceIDLabelDisplayed() throws Throwable {
		verticalSwipeTillElementDisplayed(referenceIDLabel_lbl,"Reference ID ");
		Boolean value=elementDisplayed(referenceIDLabel_lbl,"Reference ID label on ThankYou Page");
		return value;
	}

	public String getRefrenceIDValue() throws Throwable {
		verticalSwipeTillElementDisplayed(referenceIDValue_lbl,"Reference ID  ");
		String text=getText(referenceIDValue_lbl, "Reference ID value on Thank you page ");
		return text;
	}

	public Boolean verifyNicknameLabelDisplayed() throws Throwable {

		Boolean value=elementDisplayed(nickname_lbl,"Nickname on ThankYou Page");
		return value;
	}

	public String getNicknameValue() throws Throwable {
		verticalSwipeTillElementDisplayed(nicknameValue_lbl,"Nickname value ");
		String text=getText(nicknameValue_lbl, "Nickname on Thank you page ");
		return text;
	}

	public String getHeaderStatusValue() throws Throwable {

		String text=getText(thankYouPageHeader_lbl, "Thank You page header  ");
		return text;
	}

	public Boolean verifyStatusLabelDisplayed() throws Throwable {
		verticalSwipeTillElementDisplayed(statusLabel_lbl,"Status value ");
		Boolean value=elementDisplayed(statusLabel_lbl,"Status label on ThankYou Page");
		return value;
	}

	public String getStatusValue() throws Throwable {
		verticalSwipeTillElementDisplayed(statusValue_lbl,"Status value ");
		String text=getText(statusValue_lbl, "Status value on Thank you page ");
		return text;
	}

	public Boolean verifyPayFromLabelDisplayed() throws Throwable {
		verticalSwipeTillElementDisplayed(payFromLabel_lbl,"Pay From Account Name on Thank you page ");
		Boolean value=elementDisplayed(payFromLabel_lbl,"Pay From label on ThankYou Page");
		return value;
	}

	public String getPayFromAccountNameValue() throws Throwable {
		verticalSwipeTillElementDisplayed(payFromAccName_lbl,"Pay from account name ");
		String text=getText(payFromAccName_lbl, "Pay From Account Name on Thank you page ");
		return text;
	}

	public String getPayFromAccNumberValue() throws Throwable {
		verticalSwipeTillElementDisplayed(payFromAccNumber_lbl,"Pay From Account Number on Thank you page ");
		String text=getText(payFromAccNumber_lbl, "Pay From Account Number on Thank you page ");
		return text;
	}


	public Boolean verifyReferenceNumber1LabelDisplayed() throws Throwable {
		verticalSwipeTillElementDisplayed(referenceNumber1_lbl,"Reference Number 1 label on ThankYou Page ");
		Boolean value=elementDisplayed(referenceNumber1_lbl,"Reference Number 1 label on ThankYou Page");
		return value;
	}
	public Boolean verifyReferenceNumberLabelDisplayed() throws Throwable {
		verticalSwipeTillElementDisplayed(referenceNumber_lbl," Reference Number");
		Boolean value=elementDisplayed(referenceNumber_lbl,"Reference Number  label on ThankYou Page");
		return value;
	}

	public String getRefNum1Value() throws Throwable {
		verticalSwipeTillElementDisplayed(referenceNumber1Value_lbl,"ReferenceNumber1 value on Thank you page");
		String text=getText(referenceNumber1Value_lbl, "ReferenceNumber1 value on Thank you page ");
		return text;
	}

	public String getReferenceNumberValue() throws Throwable {
		verticalSwipeTillElementDisplayed(referenceNumberValue_lbl," referenceNumberValue_lbl");
		String text=getText(referenceNumberValue_lbl, "ReferenceNumber value on Thank you page ");
		return text;
	}

	public Boolean verifyReferenceNumber2LabelDisplayed() throws InterruptedException {
		verticalSwipeTillElementDisplayed(referenceNumber2_lbl,"Reference Number 2 label on ThankYou Page ");
		Boolean value=elementDisplayed(referenceNumber2_lbl,"Reference Number 2 label on ThankYou Page");
		return value;
	}

	public String getRefNum2Value() throws Throwable {
		verticalSwipeTillElementDisplayed(referenceNumber2_lbl,"ReferenceNumber2 value on Thank you page ");
		String text=getText(referenceNumber2Value_lbl, "ReferenceNumber2 value on Thank you page ");
		return text;
	}

	public Boolean verifyAddNicknameLabelDisplayed() throws Throwable {
		verticalSwipeTillElementDisplayed(addNicknameLabel_lbl,"Add Nickname label on ThankYou Page ");
		Boolean value=elementDisplayed(addNicknameLabel_lbl,"Add Nickname label on ThankYou Page");
		return value;
	}

	public String getAddNicknameValue() throws Throwable {
		verticalSwipeTillElementDisplayed(addNicknameValue_lbl,"Nickname value on Thank you page");
		String text=getText(addNicknameValue_lbl, "Nickname value on Thank you page ");
		return text;
	}

	public Boolean verifyAddFavReferenceIDLabelDisplayed() throws Throwable {
		verticalSwipeTillElementDisplayed(addFavReferenceID_lbl," Add Fav Reference id displayed");
		Boolean value=elementDisplayed(addFavReferenceID_lbl,"Add Fav Reference ID label on ThankYou Page");
		return value;
	}

	public String getAddFavRefIDValue() throws Throwable {
		verticalSwipeTillElementDisplayed(addFavReferenceIDValue_lbl," Add Fav Reference id displayed ");
		String text=getText(addFavReferenceIDValue_lbl, "Add Fav Reference ID value on Thank you page ");
		return text;
	}

	public Boolean verifyNotesLabelDisplayed() throws Throwable {
		verticalSwipeTillElementDisplayed(notes_lbl,"Notes section displayed ");
		Boolean value=elementDisplayed(notes_lbl,"Notes label on ThankYou Page");
		return value;
	}

	public String getNotesValue() throws Throwable {
		verticalSwipeTillElementDisplayed(notes_lbl,"Notes value ");
		String text=getText(notesValue_lbl, "Notes value on Thank you page ");
		return text;
	}

	public Boolean verifyDownloadRecieptButtonDisplayed() throws Throwable {
		verticalSwipeTillElementDisplayed(downloadReciept_btn," Download reciept");
		Boolean value=elementDisplayed(downloadReciept_btn,"Download reciept button on ThankYou Page");
		return value;
	}


	public Boolean verifyDoneButtonDisplayed() throws Throwable {
		verticalSwipeTillElementDisplayed(done_btn,"Done button ");
		Boolean value=elementDisplayed(done_btn,"Done button on ThankYou Page");
		return value;
	}

	public Boolean verifyAvailBalanceLabelDisplayed() throws Throwable {
		Boolean value=verticalSwipeTillElementDisplayed(availableBalance_lbl,"Available Balance on Thank You page ");
		return value;
	}

	public Boolean verifyRecipientreferenceLabelDisplayed() throws Throwable {
		Boolean value=verticalSwipeTillElementDisplayed(recipientReference_lbl,"Recipient Reference on Thank You page ");
		return value;
	}

	public Boolean verifyPaymentDetailsLabelDisplayed() throws Throwable {
		Boolean value=verticalSwipeTillElementDisplayed(paymentDetails_lbl,"Payment Details label on Thank You page ");
		return value;
	}

	public Boolean verifyFromAccountLabelDisplayed() throws Throwable {
		Boolean value=verticalSwipeTillElementDisplayed(fromAccount_lbl,"From Account label on Thank You page ");
		return value;
	}

	public Boolean verifyTransferToLabelDisplayed() throws Throwable {
		Boolean value=verticalSwipeTillElementDisplayed(transferTo_lbl,"Transfer To label on Thank You page ");
		return value;
	}
	
	public Boolean verifyRecipientLabelDisplayed() throws Throwable {
		Boolean value=verticalSwipeTillElementDisplayed(recipientLabel_lbl,"Recipient label on Thank You page ");
		return value;
	}	
	
	public Boolean verifyMobileNmberLabelDisplayed() throws Throwable {
		Boolean value=verticalSwipeTillElementDisplayed(mobileNumberLabel_lbl,"Mobile Number label on Thank You page ");
		return value;
	}	

	public String getAvailableBalanceValue() throws Throwable {
		verticalSwipeTillElementDisplayed(availableBalanceValue_lbl,"Available Balance ");
		String text=getText(availableBalanceValue_lbl, "Available Balance on Thank you page ");
		return text;
	}
	
	public String getRecipientValue() throws Throwable {
		verticalSwipeTillElementDisplayed(recipientValue_lbl,"Recipient Value ");
		String text=getText(recipientValue_lbl, "Recipient Value on Thank you page ");
		return text;
	}
	
	public String getMobileNumberValue() throws Throwable {
		verticalSwipeTillElementDisplayed(mobileNumberValue_lbl,"Mobile Number ");
		String text=getText(mobileNumberValue_lbl, "Mobile Number Value on Thank you page ");
		return text;
	}
	
	public String getTransferTypeValue() throws Throwable {
		verticalSwipeTillElementDisplayed(transferTypeValue_lbl,"Transfer Type  ");
		String text=getText(transferTypeValue_lbl, "Transfer Type Value on Thank you page ");
		return text;
	}
	
	public String getTransferModeValue() throws Throwable {
		verticalSwipeTillElementDisplayed(transferModeValue_lbl,"Transfer Mode ");
		String text=getText(transferModeValue_lbl, "Transfer Mode on Thank you page ");
		return text;
	}

	public String getRecipientReferenceValue() throws Throwable {
		verticalSwipeTillElementDisplayed(recipientReferenceValue_lbl,"Recipient Reference ");
		String text=getText(recipientReferenceValue_lbl, "Recipient Reference value on Thank you page ");
		return text;
	}

	public String getPaymentDetailsValue() throws Throwable {
		verticalSwipeTillElementDisplayed(paymentDetailsValue_lbl,"Payment Details ");
		String text=getText(paymentDetailsValue_lbl, "Payment Details value on Thank you page ");
		return text;
	}

	public PaymentsDashboardPage clickDoneButton() throws Throwable {
		verticalSwipeTillElementDisplayed(done_btn," Done button");
		click(done_btn,"Done button on Thank You page ");
		return new PaymentsDashboardPage();
	}

	public void checkAvailableBalance(String AvailBalAfter, String AvailBalBefore, String Amount) {
		
		AvailBalAfter=AvailBalAfter.substring(3);
		AvailBalAfter=AvailBalAfter.replace(",", "");
		BigDecimal AvailBalanceAfter = new BigDecimal(AvailBalAfter);
		AvailBalBefore=AvailBalBefore.substring(3);
		AvailBalBefore=AvailBalBefore.replace(",", "");
		BigDecimal AvailBalanceBefore = new BigDecimal(AvailBalBefore);
		Amount=Amount.concat(".00");
		BigDecimal amount = new BigDecimal(Amount);
		BigDecimal bal=AvailBalanceBefore.subtract(amount);
		int result=AvailBalanceAfter.compareTo(bal);
		if(result==0) {

			ExtentReport.getTest().log(Status.INFO,"Available Balance " +AvailBalanceAfter +" is matching with " +bal);

		}
		else {
			ExtentReport.getTest().fail("Available Balance " +AvailBalanceAfter +" is not matching with " +bal);
		}

	}

	public TransferDashboardPage clickTransferDoneButton() throws Throwable {
		verticalSwipeTillElementDisplayed(done_btn," Done button");
		click(done_btn,"Done button on Thank You page ");
		return new TransferDashboardPage();
	}
}


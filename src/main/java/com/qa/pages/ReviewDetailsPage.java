package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ReviewDetailsPage extends BaseTest{
	
	@iOSXCUITFindBy(id = "header_Review Details_txt")
	@AndroidFindBy(accessibility  = "header_Review Details_txt")
	private MobileElement reviewDetailsTitle_lbl;
	
	@iOSXCUITFindBy(id = "currencyHeader_amount_txt")
	@AndroidFindBy(accessibility  = "currencyHeader_amount_txt")
	private MobileElement amountValue_lbl;
	
	@iOSXCUITFindBy(id = "label_header_txt")
	@AndroidFindBy(accessibility  = "label_header_txt")
	private MobileElement payToHeader_lbl;
	
	@iOSXCUITFindBy(id = "label_Transfer To_accountName")
	@AndroidFindBy(accessibility  = "label_Transfer To_accountName")
	private MobileElement transferToAccName_lbl;
	
	@iOSXCUITFindBy(id = "label_Pay To_accountName")
	@AndroidFindBy(accessibility  = "label_Pay To_accountName")
	private MobileElement payToAccountName_lbl;
	
	@iOSXCUITFindBy(id = "grid_Scheduled For_txt")
	@AndroidFindBy(accessibility  = "grid_Scheduled For_txt")
	private MobileElement scheduledFor_lbl;
	
	@iOSXCUITFindBy(id = "grid_Scheduled For_value")
	@AndroidFindBy(accessibility  = "grid_Scheduled For_value")
	private MobileElement scheduledForValue_lbl;
	
	
	@iOSXCUITFindBy(id = "grid_From Account Name_txt")
	@AndroidFindBy(accessibility  = "grid_From Account Name_txt")
	private MobileElement fromAccountNameLabel_lbl;
	
	@iOSXCUITFindBy(id = "grid_From Account Name_value")
	@AndroidFindBy(accessibility  = "grid_From Account Name_value")
	private MobileElement fromAccountNameValue_lbl;
	
	@iOSXCUITFindBy(id = "grid_From Account Number_txt")
	@AndroidFindBy(accessibility  = "grid_From Account Number_txt")
	private MobileElement fromAccountNumberLabel_lbl;
	
	@iOSXCUITFindBy(id = "grid_From Account Number_value")
	@AndroidFindBy(accessibility  = "grid_From Account Number_value")
	private MobileElement fromAccountNumberValue_lbl;	
	
	@iOSXCUITFindBy(id = "grid_To Account Number_txt")
	@AndroidFindBy(accessibility  = "grid_To Account Number_txt")
	private MobileElement toAccountNumberLabel_lbl;
	
	@iOSXCUITFindBy(id = "grid_To Account Number_value")
	@AndroidFindBy(accessibility  = "grid_To Account Number_value")
	private MobileElement toAccountNumberValue_lbl;
	
	@iOSXCUITFindBy(id = "grid_Recipient Reference_txt")
	@AndroidFindBy(accessibility  = "grid_Recipient Reference_txt")
	private MobileElement reciepientReference_lbl;
	
	@iOSXCUITFindBy(id = "grid_Recipient Reference_value")
	@AndroidFindBy(accessibility  = "grid_Recipient Reference_value")
	private MobileElement reciepientReferenceValue_lbl;
	
	@iOSXCUITFindBy(id = "grid_Payment Details_txt")
	@AndroidFindBy(accessibility  = "grid_Payment Details_txt")
	private MobileElement paymentsDetails_lbl;
	
	@iOSXCUITFindBy(id = "grid_Payment Details_value")
	@AndroidFindBy(accessibility  = "grid_Payment Details_value")
	private MobileElement paymentsDetailsValue_lbl;
	
	@iOSXCUITFindBy(id = "grid_Ref-1 Number_txt")
	@AndroidFindBy(accessibility  = "grid_Ref-1 Number_txt")
	private MobileElement refNumber1Label_lbl;
	
	@iOSXCUITFindBy(id = "grid_Ref-1 Number_value")
	@AndroidFindBy(accessibility  = "grid_Ref-1 Number_value")
	private MobileElement ref1Number1Value_lbl;	
	
	@iOSXCUITFindBy(id = "grid_Reference Number_txt")
	@AndroidFindBy(accessibility  = "grid_Reference Number_txt")
	private MobileElement referenceNumberLabel_lbl;
	
	@iOSXCUITFindBy(id = "grid_Reference Number_value")
	@AndroidFindBy(accessibility  = "grid_Reference Number_value")
	private MobileElement referenceNumberValue_lbl;	
	
	@iOSXCUITFindBy(id = "grid_Ref-2 Number_txt")
	@AndroidFindBy(accessibility  = "grid_Ref-2 Number_txt")
	private MobileElement refNumber2Label_lbl;
	
	@iOSXCUITFindBy(id = "grid_Ref-2 Number_value")
	@AndroidFindBy(accessibility  = "grid_Ref-2 Number_value")
	private MobileElement ref1Number2Value_lbl;	
	
	@iOSXCUITFindBy(id = "noteEndWithUnderline_4_help_txt")
	@AndroidFindBy(accessibility  = "noteEndWithUnderline_4_help_txt")
	private MobileElement reviewDetailsNotes_lbl;	
	
	@iOSXCUITFindBy(id = "button_Confirm_txt")
	@AndroidFindBy(accessibility  = "button_Confirm_txt")
	private MobileElement confirm_btn;
	
	@iOSXCUITFindBy(id = "grid_Add Nickname_txt")
	@AndroidFindBy(accessibility  = "grid_Add Nickname_txt")
	private MobileElement AddNickNameLabel_lbl;
	
	@iOSXCUITFindBy(id = "grid_Add Nickname_txt")
	@AndroidFindBy(accessibility  = "grid_Add Nickname_value")
	private MobileElement AddNickNameValue_lbl;
	
	
	@iOSXCUITFindBy(id = "grid_Nickname_txt")
	@AndroidFindBy(accessibility  = "grid_Nickname_txt")
	private MobileElement Nickname_lbl;
	
	@iOSXCUITFindBy(id = "grid_Nickname_value")
	@AndroidFindBy(accessibility  = "grid_Nickname_value")
	private MobileElement NicknameValue_lbl;
	
	@iOSXCUITFindBy(id = "grid_Recipient Bank_txt")
	@AndroidFindBy(accessibility  = "grid_Recipient Bank_txt")
	private MobileElement recipientBank_lbl;
	
	@iOSXCUITFindBy(id = "grid_Start Date_txt")
	@AndroidFindBy(accessibility  = "grid_Start Date_txt")
	private MobileElement startDate_lbl;
	
	@iOSXCUITFindBy(id = "grid_Start Date_value")
	@AndroidFindBy(accessibility  = "grid_Start Date_value")
	private MobileElement startDateValue_lbl;
	
	@iOSXCUITFindBy(id = "grid_End Date_txt")
	@AndroidFindBy(accessibility  = "grid_End Date_txt")
	private MobileElement endDate_lbl;
	
	@iOSXCUITFindBy(id = "grid_End Date_value")
	@AndroidFindBy(accessibility  = "grid_End Date_value")
	private MobileElement endDateValue_lbl;
	
	@iOSXCUITFindBy(id = "grid_Recipient Bank_value")
	@AndroidFindBy(accessibility  = "grid_Recipient Bank_value")
	private MobileElement recipientBankValue_lbl;
	
	@iOSXCUITFindBy(id = "grid_Mobile Number_txt")
	@AndroidFindBy(accessibility  = "grid_Mobile Number_txt")
	private MobileElement mobileNumber_lbl;
	
	@iOSXCUITFindBy(id = "confirmationButton_Approve_txt")
	@AndroidFindBy(accessibility  = "confirmationButton_Approve_txt")
	private MobileElement approve_btn;
	
	@iOSXCUITFindBy(id = "confirmationButton_Reject_txt")
	@AndroidFindBy(accessibility  = "confirmationButton_Reject_txt")
	private MobileElement reject_btn;
	
	@iOSXCUITFindBy(id = "grid_Mobile Number_value")
	@AndroidFindBy(accessibility  = "grid_Mobile Number_value")
	private MobileElement mobileNumberValue_lbl;
	
	@iOSXCUITFindBy(id = "button_Add To Favourites_txt")
	@AndroidFindBy(accessibility  = "button_Add To Favourites_txt")
	private MobileElement addToFav_btn;
	
	public Boolean verifyReviewDetailsPageDisplayed() {
		Boolean value=pageDisplayed(reviewDetailsTitle_lbl,"Review Details Page  ");
		return value;
	}
	
	public Boolean verifyAmountLabelDisplayed() {
		Boolean value=elementDisplayed(amountValue_lbl,"Amount on review details page ");
		return value;
	}
	
	public Boolean verifyPayToHeaderDisplayed() {
		Boolean value=elementDisplayed(payToHeader_lbl,"Pay To Header ");
		return value;
	}
	
	public Boolean verifyFromAccountNameLabelDisplayed() {
		Boolean value=elementDisplayed(fromAccountNameLabel_lbl,"From Account name label ");
		return value;
	}
	
	public Boolean verifyFromAccountNumberLabelDisplayed() {
		Boolean value=elementDisplayed(fromAccountNumberLabel_lbl,"From Account number label ");
		return value;
	}
	
	public Boolean verifyReferenceNumber1LabelDisplayed() {
		Boolean value=elementDisplayed(refNumber1Label_lbl,"Reference number 1 label ");
		return value;
	}
	
	public Boolean verifyReferenceNumberLabelDisplayed() {
		Boolean value=elementDisplayed(referenceNumberLabel_lbl,"Reference number label ");
		return value;
	}
	public Boolean verifyReferenceNumber2LabelDisplayed() {
		Boolean value=elementDisplayed(refNumber2Label_lbl,"Reference number 2 label ");
		return value;
	}
	
	public Boolean verifyPayToAccountNameDisplayed() {
		Boolean value=elementDisplayed(payToAccountName_lbl,"Pay To Account Name ");
		return value;
	}
	
	public Boolean verifyReviewDetailsPageNotesDisplayed() {
		Boolean value=elementDisplayed(reviewDetailsNotes_lbl,"Review Details Page Notes ");
		return value;
	}
	
	public Boolean verifyAddNickNameLabelDisplayed() {
		Boolean value=elementDisplayed(AddNickNameLabel_lbl,"Add Nickname Label ");
		return value;
	}
	
	public Boolean verifyScheduledForLabelDisplayed() {
		Boolean value=elementDisplayed(scheduledFor_lbl,"Scheduled for label on review details ");
		return value;
	}
	public Boolean verifyToAccountNumberLabelDisplayed() {
		Boolean value=elementDisplayed(toAccountNumberLabel_lbl,"To Account Number label on review details ");
		return value;
	}
	
	public Boolean verifyReciepientRefrenceLabelDisplayed() {
		Boolean value=elementDisplayed(reciepientReference_lbl,"Recipient Reference Label ");
		return value;
	}
	
	public Boolean verifyPaymentDetailsLabelDisplayed() {
		Boolean value=elementDisplayed(paymentsDetails_lbl,"Payment Details Label ");
		return value;
	}
	
	public Boolean verifyStartDateLabelDisplayed() {
		Boolean value=elementDisplayed(startDate_lbl,"Start Date Label ");
		return value;
	}
	
	public Boolean verifyEndDateLabelDisplayed() {
		Boolean value=elementDisplayed(endDate_lbl,"End Date Label ");
		return value;
	}
	
	public Boolean verifyNickNameLabelDisplayed() {
		Boolean value=elementDisplayed(Nickname_lbl,"Nickname Label ");
		return value;
	}
	public Boolean verifyRecipientBankLabelDisplayed() {
		Boolean value=elementDisplayed(recipientBank_lbl,"Recipient Bank Label ");
		return value;
	}
	
	public Boolean verifyMobileNumberLabelDisplayed() {
		Boolean value=elementDisplayed(mobileNumber_lbl,"Mobile Number Label ");
		return value;
	}
	
	public String getMobileNumberValue() throws Throwable {
		String text=getText(mobileNumberValue_lbl, "Mobile Number ");
		return text;
	}
	
	public String getRecipientBankValue() throws Throwable {
		String text=getText(recipientBankValue_lbl, "Recipient Bank Name ");
		return text;
	}
	
	public String getNickname() throws Throwable {
		String text=getText(NicknameValue_lbl, "Nickname on review details page ");
		return text;
	}
	
	public String getAmount() throws Throwable {
		String text=getText(amountValue_lbl, "Amount on review details page ");
		text=text.substring(3);
		return text;
	}
	
	public String getPayToAccountName() throws Throwable {
		String text=getText(payToAccountName_lbl, "Pay To Account Name ");
		return text;
	}
	
	public String getStartDate() throws Throwable {
		String text=getText(startDateValue_lbl, "Start Date ");
		return text;
	}
	
	public String getEndDate() throws Throwable {
		String text=getText(endDateValue_lbl, "End Date  ");
		return text;
	}
	
	public String getFromAccountNameAccountName() throws Throwable {
		String text=getText(fromAccountNameValue_lbl, "From Account Name on review details page ");
		return text;
	}
	
	public String getFromAccountNameAccountNumber() throws Throwable {
		String text=getText(fromAccountNumberValue_lbl, "From Account Number on review details page ");
		return text;
	}
	
	public String getReferenceNumber1() throws Throwable {
		String text=getText(ref1Number1Value_lbl, "Reference Number on review details page ");
		return text;
	}
	public String getReferenceNumber() throws Throwable {
		String text=getText(referenceNumberValue_lbl, "Reference Number on review details page ");
		return text;
	}
	
	public String getToAccountNumber() throws Throwable {
		String text=getText(toAccountNumberValue_lbl, "to Account Number");
		return text;
	}
	
	public String getScheduledForDate() throws Throwable {
		String text=getText(scheduledForValue_lbl, "Scheduled For Date ");
		return text;
	}
	
	public String getRecipientReferenceValue() throws Throwable {
		String text=getText(reciepientReferenceValue_lbl, "Recipient reference value ");
		return text;
	}
	public String getPaymentDetailsValue() throws Throwable {
		String text=getText(paymentsDetailsValue_lbl, "Payment Details Value ");
		return text;
	}
	
	public String getReferenceNumber2() throws Throwable {
		String text=getText(ref1Number2Value_lbl, "Reference Number 2 on review details page ");
		return text;
	}
	
	public String getAddNicknameValue() throws Throwable {
		String text=getText(AddNickNameValue_lbl, "Nickname on review details page ");
		return text;
	}
	
	public String getTransferToLabel() throws Throwable {
		String text=getText(payToHeader_lbl, "Transfer To on review details page ");
		return text;
	}
	
	public String getTransferToAccountName() throws Throwable {
		String text=getText(transferToAccName_lbl, "Transfer To Account Name on review details page ");
		return text;
	}
	
	public ThankYouPage clickContinueButton() throws InterruptedException{
		//verticalSwipeTillElementDisplayed(confirm_btn,"Calender ");
		click(confirm_btn,"Review Details Confirm Button ");
		return new ThankYouPage();
	}	
	
	public OtpPage clickContinueButton_FraudMakerFlow() throws InterruptedException{
		//verticalSwipeTillElementDisplayed(confirm_btn,"Calender ");
		click(confirm_btn,"Review Details Confirm Button ");
		return new OtpPage();
	}	
	
	public AddFavSuccessfulPage clickAddFavButton() throws InterruptedException{
		//verticalSwipeTillElementDisplayed(confirm_btn,"Calender ");
		click(addToFav_btn,"Review Details Add to Fav Button ");
		return new AddFavSuccessfulPage();
	}	
	
	
	public OtpPage clickApproveButton() throws InterruptedException{
		verticalSwipeTillElementDisplayed(confirm_btn,"Calender ");
		click(approve_btn,"Review Details Approve Button ");
		return new OtpPage();
	}	
	
	public ThankYouPage clickApproveButtonFavTransaction() throws InterruptedException{
		verticalSwipeTillElementDisplayed(confirm_btn,"Calender ");
		click(approve_btn,"Review Details Approve Button ");
		return new ThankYouPage();
	}
	
	
	

}

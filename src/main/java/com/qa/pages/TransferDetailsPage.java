package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class TransferDetailsPage extends BaseTest{
	
	@iOSXCUITFindBy(id = "pageTitle_Own Account Transfer")
	@AndroidFindBy(accessibility  = "pageTitle_Own Account Transfer")
	private MobileElement ownAccountTransfer_lbl;
	
	@iOSXCUITFindBy(id = "pageTitle_Other Accounts Transfer")
	@AndroidFindBy(accessibility  = "pageTitle_Other Accounts Transfer")
	private MobileElement otherAccountTransfer_lbl;
	
	@iOSXCUITFindBy(id = "pageTitle_DuitNow")
	@AndroidFindBy(accessibility  = "pageTitle_DuitNow")
	private MobileElement duitNow_lbl;
	
	@iOSXCUITFindBy(id = "header_icon_crossBlack_img")
	@AndroidFindBy(accessibility  = "header_icon_crossBlack_img")
	private MobileElement back_btn;
	
	@iOSXCUITFindBy(id = "payFrom_0_Transfer From")
	@AndroidFindBy(accessibility  = "payFrom_0_Transfer From")
	private MobileElement transferFromHeader_lbl;
	
	@iOSXCUITFindBy(id = "payTo_Transfer To_txt")
	@AndroidFindBy(accessibility  = "payTo_Transfer To_txt")
	private MobileElement transferToHeader_lbl;
	
	@iOSXCUITFindBy(id = "payFrom_0_transactionDescName_txt")
	@AndroidFindBy(accessibility  = "payFrom_0_transactionDescName_txt")
	private MobileElement transferFromAccName_lbl;
	
	@iOSXCUITFindBy(id = "payFrom_0_transactionAmount_txt")
	@AndroidFindBy(accessibility  = "payFrom_0_transactionAmount_txt")
	private MobileElement transferFromAccNumber_lbl;
	
	@iOSXCUITFindBy(id = "payTo_accountName_txt")
	@AndroidFindBy(accessibility  = "payTo_accountName_txt")
	private MobileElement transferToAccName_lbl;
	
	@iOSXCUITFindBy(id = "payTo_accountNumber_txt")
	@AndroidFindBy(accessibility  = "payTo_accountNumber_txt")
	private MobileElement transferToAccNumber_lbl;
	
	@iOSXCUITFindBy(id = "undefined_Amount in MYR_txt")
	@AndroidFindBy(accessibility  = "undefined_Amount in MYR_txt")
	private MobileElement amount_lbl;
	
	@iOSXCUITFindBy(id = "undefined_Amount in MYR_value")
	@AndroidFindBy(accessibility  = "undefined_Amount in MYR_value")
	private MobileElement amountValue_lbl;
	
	@iOSXCUITFindBy(id = "recurringWithCount_Date_txt")
	@AndroidFindBy(accessibility  = "recurringWithCount_Date_txt")
	private MobileElement date_lbl;
	
	@iOSXCUITFindBy(id = "recurringWithCount_Date_value")
	@AndroidFindBy(accessibility  = "recurringWithCount_Date_value")
	private MobileElement dateValue_lbl;
	
	
	@iOSXCUITFindBy(id = "recurringWithCount_Date_img")
	@AndroidFindBy(accessibility  = "recurringWithCount_Date_img")
	private MobileElement calender_img;

	@iOSXCUITFindBy(id = "text_Recipient Reference_txt")
	@AndroidFindBy(accessibility  = "text_Recipient Reference_txt")
	private MobileElement recieptReference_lbl;
	
	@iOSXCUITFindBy(id = "text_Recipient Reference_input")
	@AndroidFindBy(accessibility  = "text_Recipient Reference_input")
	private MobileElement recieptReferenceValue_txt;
	
	@iOSXCUITFindBy(id = "text_Payment Details (Optional)_txt")
	@AndroidFindBy(accessibility  = "text_Payment Details (Optional)_txt")
	private MobileElement paymentDetails_lbl;
	
	@iOSXCUITFindBy(id = "text_Payment Details (Optional)_input")
	@AndroidFindBy(accessibility  = "text_Payment Details (Optional)_input")
	private MobileElement paymentDetailsValue_txt;

	@iOSXCUITFindBy(id = "button_Continue_txt")
	@AndroidFindBy(accessibility  = "button_Continue_txt")
	private MobileElement continue_Btn;
	
	@iOSXCUITFindBy(id = "Add to Favourites_unchecked")
	@AndroidFindBy(accessibility  = "Add to Favourites_unchecked")
	private MobileElement addTofavToggleUnchecked_btn;
	
	@iOSXCUITFindBy(id = "Add to Favourites_checked")
	@AndroidFindBy(accessibility  = "Add to Favourites_checked")
	private MobileElement addTofavTogglechecked_btn;
	
	@iOSXCUITFindBy(id = "fav_Favourite Nickname_txt")
	@AndroidFindBy(accessibility  = "fav_Favourite Nickname_txt")
	private MobileElement nickName_lbl;
	
	@iOSXCUITFindBy(id = "fav_Favourite Nickname_input")
	@AndroidFindBy(accessibility  = "fav_Favourite Nickname_input")
	private MobileElement nickName_txt;
	
	@iOSXCUITFindBy(id = "select_Transfer Type_value")
	@AndroidFindBy(accessibility  = "select_Transfer Type_value")
	private MobileElement transferType_lbl;
	
	@iOSXCUITFindBy(id = "select_Transfer Mode_value")
	@AndroidFindBy(accessibility  = "select_Transfer Mode_value")
	private MobileElement transferModelbl;
	
	@iOSXCUITFindBy(id = "select_Funds Transfer_txt")
	@AndroidFindBy(accessibility  = "select_Funds Transfer_txt")
	private MobileElement selectFundTransfer_lbl;
	
	@iOSXCUITFindBy(id = "select_Credit Card Payment_txt")
	@AndroidFindBy(accessibility  = "select_Credit Card Payment_txt")
	private MobileElement selectCreditCardPayment_lbl;
	
	@iOSXCUITFindBy(id = "select_Instant Transfer_txt")
	@AndroidFindBy(accessibility  = "select_Instant Transfer_txt")
	private MobileElement selectInstantTransfer_lbl;
	
	@iOSXCUITFindBy(id = "select_GIRO_txt")
	@AndroidFindBy(accessibility  = "select_GIRO_txt")
	private MobileElement selectGiro_lbl;
	
	@iOSXCUITFindBy(id = "recurringWithCount_recurring_unchecked_ic")
	@AndroidFindBy(accessibility  = "recurringWithCount_recurring_unchecked_ic")
	private MobileElement setrecurring_rdb;
	
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

	public TransferDetailsPage clickSnackBarClose() {
		click(snackBarCross_btn,"Snackbar Close button");
		return this;
	}
	
	
	public Boolean verifyOwnAccountTransferDetailsPageDisplayed() {
		Boolean value=pageDisplayed(ownAccountTransfer_lbl,"Own Account Transfer Details Page  ");
		return value;
	}
	
	
	public Boolean verifyOtherAccountsTransferDetailsPageDisplayed() {
		Boolean value=pageDisplayed(otherAccountTransfer_lbl,"Other Accounts Transfer Details Page  ");
		return value;
	}
	
	public Boolean verifyDuitNowTransferDetailsPageDisplayed() {
		Boolean value=pageDisplayed(duitNow_lbl,"DuitNow Transfer Details Page  ");
		return value;
	}
	
	public Boolean verifyBackButtonDisplayed() {
		Boolean value=elementDisplayed(back_btn,"Back Button on Payment Deatils Page ");
		return value;
	}
	public Boolean verifyTransferFromHeaderDisplayed() {
		Boolean value=elementDisplayed(transferFromHeader_lbl,"Transfer From Header ");
		return value;
	}
	
	public Boolean verifyTransferToHeaderDisplayed() {
		Boolean value=elementDisplayed(transferToHeader_lbl,"Transfer TO Header ");
		return value;
	}
	
	public Boolean verifyAmountLabelDisplayed() {
		Boolean value=elementDisplayed(amount_lbl,"Amount Label");
		return value;
	}
	
	
	public Boolean verifyDateLabelDisplayed() throws Throwable {
		Boolean value=verticalSwipeTillElementDisplayed(date_lbl,"Date Label");
		return value;
	}
	
	public Boolean verifyCalenderIconDisplayed() throws Throwable {
		Boolean value=verticalSwipeTillElementDisplayed(calender_img,"Calender Icon");
		return value;
	}
	
	public Boolean verifyRecieptReferenceLabelDisplayed() throws Throwable {
		Boolean value=verticalSwipeTillElementDisplayed(recieptReference_lbl,"Reciept Refrence Label");
		return value;
	}
	
	public Boolean verifyPaymentDetailsLabelDisplayed() throws Throwable {
		Boolean value=verticalSwipeTillElementDisplayed(paymentDetails_lbl,"Payment Details Label");
		return value;
	}
	
	public String getTransferFromAccName() throws Throwable {
		String text=getText(transferFromAccName_lbl, "Transfer From Account Name  ");
		return text;
	}
	
	public String getTransferFromAccNumber() throws Throwable {
		String text=getText(transferFromAccNumber_lbl, "Transfer From Account Number  ");
		return text;
	}
	
	public String getTransferToAccName() throws Throwable {
		String text=getText(transferToAccName_lbl, "Transfer To Account Name  ");
		return text;
	}
	
	public String getTransferToAccNumber() throws Throwable {
		String text=getText(transferToAccNumber_lbl, "Transfer To Account Number  ");
		return text;
	}
	
	public String getAmount() throws Throwable {
		String text=getText(amountValue_lbl, "Amount on payment details page  ");
		return text;
	}
	
	public String getDate() throws Throwable {
		verticalSwipeTillElementDisplayed(dateValue_lbl,"Calender ");
		String text=getText(dateValue_lbl, "Date  ");
		return text;
	}
	
	
	public CalenderPage clickCalender() throws Throwable{
		verticalSwipeTillElementDisplayed(dateValue_lbl,"Calender ");
		click(dateValue_lbl,"Transfer Details calender ");
		return new CalenderPage();
	}
	
	public TransferDetailsPage clickTransferType() throws Throwable{
		verticalSwipeTillElementDisplayed(transferType_lbl,"Transfer Type ");
		click(transferType_lbl,"Transfer Type ");
		return this;
	}
	
	public TransferDetailsPage selectFundTransfer() throws Throwable{
		click(selectFundTransfer_lbl,"Fund Transfer ");
		return this;
	}
	
	public TransferDetailsPage selectCreditCardPayment() throws Throwable{
		click(selectCreditCardPayment_lbl,"Credit Card Payment ");
		return this;
	}
	
	public TransferDetailsPage clickTransferMode() throws Throwable{
		verticalSwipeTillElementDisplayed(transferModelbl,"Transfer Mode ");
		click(transferModelbl,"Transfer Mode ");
		return this;
	}
	
	public TransferDetailsPage selectGIRO() throws Throwable{
		click(selectGiro_lbl,"GIRO ");
		return this;
	}
	
	public TransferDetailsPage selectInstantTransfer() throws Throwable{
		click(selectInstantTransfer_lbl,"Instant Transfer ");
		return this;
	}
	
	public TransferDetailsPage enterReceiptRefrencePaymentDetails(String recieptReferenceeference, String paymentDetails) throws Throwable{
		verticalSwipeTillElementDisplayed(recieptReferenceValue_txt,"Reciept Reference");
		sendKeysWithEnterIos(recieptReferenceValue_txt,recieptReferenceeference,"Reciept Refrence");
		if(getPlatform().equalsIgnoreCase("android")) {
		verticalSwipeTillElementDisplayed(paymentDetailsValue_txt,"Payment Details");
		}
		sendKeysWithEnterIos(paymentDetailsValue_txt,paymentDetails,"Payment Details");
		return this;
	}
	
	public TransferDetailsPage enterPaymentDetails(String Value) throws Throwable{
		verticalSwipeTillElementDisplayed(paymentDetailsValue_txt,"Payment Details");
		sendKeys(paymentDetailsValue_txt,Value,"Payment Details");
		return this;
	}
	
	public TransferDetailsPage clickAddFavTogglebtn() throws InterruptedException{
		verticalSwipeTillElementDisplayed(addTofavTogglechecked_btn,"Add to Fav toggle button ");
		click(addTofavTogglechecked_btn,"Add to Fav toggle button  ");
		return this;
	}	
	
	public TransferDetailsPage clickSetRecurringRdb() throws InterruptedException{
		verticalSwipeTillElementDisplayed(setrecurring_rdb,"Set Recurring Radio Button ");
		click(setrecurring_rdb,"Set Recurring Radio Button ");
		return this;
	}	
	
	public ReviewDetailsPage clickContinueButton() throws InterruptedException{
		verticalSwipeTillElementDisplayed(continue_Btn,"Continue ");
		click(continue_Btn,"Transfer Details Continue button ");
		return new ReviewDetailsPage();
	}	
	
	
}

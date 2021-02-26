package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class PaymentsDetailsPage extends BaseTest{

	@iOSXCUITFindBy(id = "pageTitle_JomPAY")
	@AndroidFindBy(accessibility  = "pageTitle_JomPAY")
	private MobileElement jomPayTitle_lbl;
	
	@iOSXCUITFindBy(id = "pageTitle_Bill Payment")
	@AndroidFindBy(accessibility  = "pageTitle_Bill Payment")
	private MobileElement billPaymentTitle_lbl;
	
	@iOSXCUITFindBy(id = "header_icon_crossBlack_img")
	@AndroidFindBy(accessibility  = "header_icon_crossBlack_img")
	private MobileElement back_btn;
	
	@iOSXCUITFindBy(id = "payFrom_0_Pay From")
	@AndroidFindBy(accessibility  = "payFrom_0_Pay From")
	private MobileElement payFromHeader_lbl;
	
	@iOSXCUITFindBy(id = "payFrom_Pay From_AccountName")
	@AndroidFindBy(accessibility  = "payFrom_Pay From_AccountName")
	private MobileElement payFromAccountName_lbl;
	
	@iOSXCUITFindBy(id = "payFrom_Pay From_AccountNumber")
	@AndroidFindBy(accessibility  = "payFrom_Pay From_AccountNumber")
	private MobileElement payFromAccountNumber_lbl;
	
	@iOSXCUITFindBy(id = "payTo_Pay To_txt")
	@AndroidFindBy(accessibility  = "payTo_Pay To_txt")
	private MobileElement payToHeader_lbl;
	
	@iOSXCUITFindBy(id = "undefined_Biller Code_txt")
	@AndroidFindBy(accessibility  = "undefined_Biller Code_txt")
	private MobileElement billerCode_lbl;
	
	@iOSXCUITFindBy(id = "undefined_Biller Code_value")
	@AndroidFindBy(accessibility  = "undefined_Biller Code_value")
	private MobileElement billerCodeValue_lbl;
	
	@iOSXCUITFindBy(id = "text_Ref-1 Number_txt")
	@AndroidFindBy(accessibility  = "text_Ref-1 Number_txt")
	private MobileElement refNumber1_lbl;
	
	@iOSXCUITFindBy(id = "undefined_Reference Number_value")
	@AndroidFindBy(accessibility  = "undefined_Reference Number_value")
	private MobileElement referenceNumber_lbl;
	
	@iOSXCUITFindBy(id = "text_Ref-1 Number_input")
	@AndroidFindBy(accessibility  = "text_Ref-1 Number_input")
	private MobileElement refNumber1Value_lbl;
	
	@iOSXCUITFindBy(id = "text_Ref-2 Number (Optional)_txt")
	@AndroidFindBy(accessibility  = "text_Ref-2 Number (Optional)_txt")
	private MobileElement refNumber2_lbl;
	
	@iOSXCUITFindBy(id = "text_Ref-2 Number (Optional)_input")
	@AndroidFindBy(accessibility  = "text_Ref-2 Number (Optional)_input")
	private MobileElement refNumber2Value_lbl;
	
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
	
	@iOSXCUITFindBy(id = "fav_Add to Favourites_txt")
	@AndroidFindBy(accessibility  = "fav_Add to Favourites_txt")
	private MobileElement addTofav_lbl;
	
	@iOSXCUITFindBy(id = "fav_Make this biller a favourite_txt")
	@AndroidFindBy(accessibility  = "fav_Make this biller a favourite_txt")
	private MobileElement addTofavDesc_lbl;
	
	
	@iOSXCUITFindBy(id = "Add to Favourites_unchecked")
	@AndroidFindBy(accessibility  = "Add to Favourites_unchecked")
	private MobileElement addTofavToggleUnchecked_btn;
	
	@iOSXCUITFindBy(id = "Add to Favourites_checked")
	@AndroidFindBy(accessibility  = "Add to Favourites_checked")
	private MobileElement addTofavTogglechecked_btn;
	
	@iOSXCUITFindBy(id = "fav_Nickname_txt")
	@AndroidFindBy(accessibility  = "fav_Nickname_txt")
	private MobileElement nickName_lbl;
	
	@iOSXCUITFindBy(id = "fav_Nickname_input")
	@AndroidFindBy(accessibility  = "fav_Nickname_input")
	private MobileElement nickName_txt;
	
	@iOSXCUITFindBy(id = "button_Continue_txt")
	@AndroidFindBy(accessibility  = "button_Continue_txt")
	private MobileElement continue_Btn;
	
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

	public PaymentsDetailsPage clickSnackBarClose() {
		click(snackBarCross_btn,"Snackbar Close button");
		return this;
	}
	

	public Boolean verifyJompayPaymentDetailsPageDisplayed() {
		Boolean value=pageDisplayed(jomPayTitle_lbl,"Jompay Payment Details Page  ");
		return value;
	}
	

	public Boolean verifyBillPaymentDetailsPageDisplayed() {
		Boolean value=pageDisplayed(billPaymentTitle_lbl,"Bill Payment Details Page  ");
		return value;
	}
	
	public Boolean verifyBackButtonDisplayed() {
		Boolean value=elementDisplayed(back_btn,"Back Button on Payment Deatils Page ");
		return value;
	}
	public Boolean verifyPayFromHeaderDisplayed() {
		Boolean value=elementDisplayed(payFromHeader_lbl,"Pay From Header ");
		return value;
	}
	
	public Boolean verifyReferenceNumber1LabelDisplayed() {
		Boolean value=elementDisplayed(refNumber1_lbl,"Reference Number 1");
		return value;
	}
	
	public Boolean verifyReferenceNumber2LabelDisplayed() {
		Boolean value=elementDisplayed(refNumber2_lbl,"Reference Number 2");
		return value;
	}
	
	public Boolean verifyAmountLabelDisplayed() {
		Boolean value=elementDisplayed(amount_lbl,"Amount Label");
		return value;
	}
	
	public Boolean verifyAddToFavDisplayed() throws Throwable {
		verticalSwipeTillElementDisplayed(addTofav_lbl,"Add to Fav label");
		Boolean value=elementDisplayed(addTofav_lbl,"Add to Fav label");
		return value;
	}
	
	public Boolean verifyPaymentDateDisplayed() throws Throwable {
		verticalSwipeTillElementDisplayed(date_lbl,"Payment Date label");
		Boolean value=elementDisplayed(date_lbl,"Payment Date label");
		return value;
	}
	
	public Boolean verifyNicknameLabelDisplayed() throws Throwable {
		verticalSwipeTillElementDisplayed(nickName_lbl,"Nickmame label");
		Boolean value=elementDisplayed(nickName_lbl,"Nickmame label");
		return value;
	}
	
	public Boolean verifyContinueButtonDisplayed() throws Throwable {
		verticalSwipeTillElementDisplayed(continue_Btn,"Continue Button");
		Boolean value=elementDisplayed(continue_Btn,"Continue Button");
		return value;
	}
	
	public Boolean verifyBillerCodeDisplayed() {
		Boolean value=elementDisplayed(billerCode_lbl,"Biller Code ");
		return value;
	}
	
	public Boolean verifyPayToHeaderDisplayed() {
		Boolean value=elementDisplayed(payToHeader_lbl,"Pay To Header ");
		return value;
	}
	
	public String getPayFromAccountname() throws Throwable {
		String text=getText(payFromAccountName_lbl, "Pay From Account Name ");
		return text;
	}
	
	public String getPayFromAccountNumber() throws Throwable {
		String text=getText(payFromAccountNumber_lbl, "Pay From Account Number ");
		return text;
	}
	
	public String getBillerCode() throws Throwable {
		String text=getText(billerCodeValue_lbl, "Biller code ");
		return text;
	}
	
	
	public String getReferenceNumber1() throws Throwable {
		String text=getText(refNumber1Value_lbl, "Reference Number1 ");
		return text;
	}
	
	public String getReferenceNumber() throws Throwable {
		String text=getText(referenceNumber_lbl, "Reference Number ");
		return text;
	}
	
	public String getReferenceNumber2() throws Throwable {
		String text=getText(refNumber2Value_lbl, "Reference Number2 ");
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
	
	public PaymentsDetailsPage clickAddFavTogglebtn() throws InterruptedException{
		verticalSwipeTillElementDisplayed(addTofavTogglechecked_btn,"Add to Fav toggle button ");
		click(addTofavTogglechecked_btn,"Add to Fav toggle button  ");
		return this;
	}	
	
	public CalenderPage clickCalender() throws Throwable{
		verticalSwipeTillElementDisplayed(dateValue_lbl,"Calender ");
		click(dateValue_lbl,"Payment Details calender ");
		return new CalenderPage();
	}
	
	public PaymentsDetailsPage enterNickname(String Nickname) throws Throwable{
		verticalSwipeTillElementDisplayed(nickName_txt,"Nickname ");
		sendKeys(nickName_txt,Nickname,"Nickname");
		return this;
	}
	
	public ReviewDetailsPage clickContinueButton() throws InterruptedException{
		verticalSwipeTillElementDisplayed(continue_Btn,"Continue ");
		click(continue_Btn,"Payment Details Continue button ");
		return new ReviewDetailsPage();
	}	
	
	
	
}

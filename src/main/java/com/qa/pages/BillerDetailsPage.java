package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class BillerDetailsPage extends BaseTest{

	@iOSXCUITFindBy(id = "label_Enter JomPAY details_txt")
	@AndroidFindBy(accessibility  = "label_Enter JomPAY details_txt")
	private MobileElement JompayHeader_lbl;
	
	@iOSXCUITFindBy(id = "label_Enter your bill details_txt")
	@AndroidFindBy(accessibility  = "label_Enter your bill details_txt")
	private MobileElement billerDetailsHeader_lbl;
	
	@iOSXCUITFindBy(id = "header_icon_arrowBlack_img")
	@AndroidFindBy(accessibility  = "header_icon_arrowBlack_img")
	private MobileElement back_btn;
	
	@iOSXCUITFindBy(id = "text_Biller Code_txt")
	@AndroidFindBy(accessibility  = "text_Biller Code_txt")
	private MobileElement billerCode_lbl;	
	
	@iOSXCUITFindBy(id = "text_Biller Code_input")
	@AndroidFindBy(accessibility  = "text_Biller Code_input")
	private MobileElement billerCode_txt;
	
	@iOSXCUITFindBy(id = "text_Ref-1 Number_txt")
	@AndroidFindBy(accessibility  = "text_Ref-1 Number_txt")
	private MobileElement refNumber1_lbl;
	
	@iOSXCUITFindBy(id = "text_Reference Number_input")
	@AndroidFindBy(accessibility  = "text_Reference Number_input")
	private MobileElement referenceNumber_lbl;
	
	@iOSXCUITFindBy(id = "text_Ref-1 Number_input")
	@AndroidFindBy(accessibility  = "text_Ref-1 Number_input")
	private MobileElement refNumber1_txt;
	
	@iOSXCUITFindBy(id = "text_Ref-2 Number (Optional)_txt")
	@AndroidFindBy(accessibility  = "text_Ref-2 Number (Optional)_txt")
	private MobileElement refNumber2_lbl;
	
	@iOSXCUITFindBy(id = "text_Ref-2 Number (Optional)_input")
	@AndroidFindBy(accessibility  = "text_Ref-2 Number (Optional)_input")
	private MobileElement refNumber2_txt;
	
	@iOSXCUITFindBy(id = "button_Continue_txt")
	@AndroidFindBy(accessibility  = "button_Continue_txt")
	private MobileElement continue_btn;
	
	@iOSXCUITFindBy(id = "text_1_err_msg")
	@AndroidFindBy(accessibility  = "text_1_err_msg")
	private MobileElement billerCodeErr_lbl;
	
	@iOSXCUITFindBy(id = "text_2_err_msg")
	@AndroidFindBy(accessibility  = "text_2_err_msg")
	private MobileElement refNumber1Err_lbl;
	
	@iOSXCUITFindBy(id = "text_3_err_msg")
	@AndroidFindBy(accessibility  = "text_3_err_msg")
	private MobileElement refNumber2Err_lbl;
	
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTextField[`name == \"list_1_search_input\"`][1]")
	@AndroidFindBy(accessibility  = "list_1_search_input")
	private MobileElement searchBiller_txt;
	
	@iOSXCUITFindBy(id = "list_BillerName_0")
	@AndroidFindBy(accessibility  = "list_BillerName_0")
	private MobileElement firstBiller_txt;
	
	@iOSXCUITFindBy(id = "text_Nickname_input")
	@AndroidFindBy(accessibility  = "text_Nickname_input")
	private MobileElement nickName_txt;
	
	@iOSXCUITFindBy(id = "button_Next_txt")
	@AndroidFindBy(accessibility  = "button_Next_txt")
	private MobileElement next_btn;
	
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

	public BillerDetailsPage clickSnackBarClose() {
		click(snackBarCross_btn,"Snackbar Close button");
		return this;
	}
	

	public Boolean verifyJompayBillerDetailsPageDisplayed() {
		Boolean value=pageDisplayed(JompayHeader_lbl,"Jompay Biller Details Page  ");
		return value;
	}
	
	
	public Boolean verifyBillerDetailsPageDisplayed() {
		Boolean value=pageDisplayed(billerDetailsHeader_lbl,"Biller Details Page  ");
		return value;
	}
	public Boolean verifyBackButtonDisplayed() {
		Boolean value=elementDisplayed(back_btn,"Back Button ");
		return value;
	}
	
	public Boolean verifyBillerCodeLabelDisplayed() {
		Boolean value=elementDisplayed(billerCode_lbl,"Biller code label ");
		return value;
	}
	
	public Boolean verifyReferenceNumber1Displayed() {
		Boolean value=elementDisplayed(refNumber1_lbl,"Reference Number1 label ");
		return value;
	}
	
	public Boolean verifyReferenceNumber2Displayed() {
		Boolean value=elementDisplayed(refNumber2_lbl,"Reference Number2 label ");
		return value;
	}
	
	public Boolean verifyContinueButtonDisplayed() {
		Boolean value=elementDisplayed(continue_btn,"Continue Button on Biller details  ");
		return value;
	}
	
	public BillerDetailsPage clickFavouritePayment(){
		click(back_btn,"Back button on Biller Details Page ");
		return new BillerDetailsPage();
	}
	
	public EnterAmountPage clickContinueButton(){
		click(continue_btn,"Continue button on Biller Details Page ");
		return new EnterAmountPage();
	}
	
	public ReviewDetailsPage clickContinueButtonAddFav(){
		click(continue_btn,"Continue button on Biller Details Page ");
		return new ReviewDetailsPage();
	}
	
	public BillerDetailsPage enterBillerCode(String BillerCode){
		sendKeys(billerCode_txt,BillerCode,"Biller Code");
		return this;
	}
	
	public BillerDetailsPage enterReferenceNumber1(String RefNumber1){
		sendKeys(refNumber1_txt,RefNumber1,"Reference Number 1 ");
		return this;
	}
	
	public BillerDetailsPage enterReferenceNumber(String RefNumber){
		sendKeys(referenceNumber_lbl,RefNumber,"Reference Number ");
		return this;
	}
	public BillerDetailsPage enterSearchBiller(String Biller) throws Throwable{
		//searchBiller_txt.click();
		if(getPlatform().equalsIgnoreCase("iOS")) {
		sendKeysAndEnter(searchBiller_txt,Biller,"Biller value ");
		}
		else {
			sendKeys(searchBiller_txt,Biller,"Biller value ");
		}
		
		return this;
	}
	
	public BillerDetailsPage enterNickname(String nickname){
		sendKeys(nickName_txt,nickname,"Nickname ");
		return this;
	}
	
	public BillerDetailsPage clickFirstBiller(){
		click(firstBiller_txt,"Biller is selected ");
		return this;
	}
	
	public ReviewDetailsPage clickNextButton(){
		click(next_btn,"Next Button ");
		return new ReviewDetailsPage();
	}
	
	public BillerDetailsPage enterReferenceNumber2(String RefNumber2){
		sendKeys(refNumber2_txt,RefNumber2,"Reference Number 2 ");
		return this;
	}

	public String getBillerCodeErrorMsg() throws Throwable {
		String text=getText(billerCodeErr_lbl, "Biller code error message ");
		return text;
	}
	
	public String getReferenceNumber1ErrorMsg() throws Throwable {
		String text=getText(refNumber1Err_lbl, "Reference Number 1 error message ");
		return text;
	}
	
	public String getReferenceNumber2ErrorMsg() throws Throwable {
		String text=getText(refNumber2Err_lbl, "Reference Number 2 error message ");
		return text;
	}
	

}

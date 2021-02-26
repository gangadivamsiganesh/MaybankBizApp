package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class EditNicknamePage extends BaseTest{
	
	@iOSXCUITFindBy(iOSClassChain = "header_icon_crossBlack_img")
	@AndroidFindBy(accessibility = "header_icon_crossBlack_img")
	private MobileElement cross_btn;
	
	@iOSXCUITFindBy(id = "label_Give this account a nickname_txt")
	@AndroidFindBy(accessibility = "label_Give this account a nickname_txt")
	private MobileElement editNicknamePageHeader_lbl;
	
	@iOSXCUITFindBy(id = "text_Nickname_txt")
	@AndroidFindBy(accessibility = "text_Nickname_txt")
	private MobileElement nickname_lbl;
	
	@iOSXCUITFindBy(id = "text_Nickname_input")
	@AndroidFindBy(accessibility = "text_Nickname_input")
	private MobileElement nickname_input;
	
	@iOSXCUITFindBy(id = "confirmationButton_Done_txt")
	@AndroidFindBy(accessibility = "confirmationButton_Done_txt")
	private MobileElement done_btn;
	
	@iOSXCUITFindBy(id = "confirmationButton_Restore Default_txt")
	@AndroidFindBy(accessibility = "confirmationButton_Restore Default_txt")
	private MobileElement restoreDefault_btn;
	
	

	
	public Boolean verifyEditNicknamePageDisplayed() {
		Boolean value=pageDisplayed(nickname_lbl,"Edit Nickname page displayed");
		return value;
	}
	
	public Boolean verifyNicknameLblDisplayed() {
		Boolean value=pageDisplayed(nickname_lbl,"Nick Name Label displayed");
		return value;
	}
	
	public EditNicknamePage enterNickName(String value) throws Throwable{
		sendKeys(nickname_input,value,"Nickname");
		return this;
	}
	
	public AccountDetailsCA clickDoneBtn(){
		click(done_btn,"Done button");
		return new AccountDetailsCA();
	}
	
	public LoanDetailsPage clickDoneBtnTL(){
		click(done_btn,"Done button");
		return new LoanDetailsPage();
	}
	public HPDetailsPage clickDoneBtnHP(){
		click(done_btn,"Done button");
		return new HPDetailsPage();
	}

}

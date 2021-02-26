package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class SecurityPhrasePage extends BaseTest {

	@iOSXCUITFindBy(id = "pageTitle_Security Phrase")
	@AndroidFindBy(accessibility ="pageTitle_Security Phrase")
	private MobileElement securityPhraseTitle_lbl;
	
	@iOSXCUITFindBy(id = "header_icon_crossBlack_img")
	@AndroidFindBy(accessibility ="header_icon_crossBlack_img")
	private MobileElement cross_btn;
	
	@iOSXCUITFindBy(id = "text_Current Security Phrase_txt")
	@AndroidFindBy(accessibility ="text_Current Security Phrase_txt")
	private MobileElement currentSecurityPhase_lbl;
	
	@iOSXCUITFindBy(id = "text_Current Security Phrase_input")
	@AndroidFindBy(accessibility ="text_Current Security Phrase_input")
	private MobileElement currentSecurityPhase_txt;
	
	@iOSXCUITFindBy(id = "text_New Security Phrase_txt")
	@AndroidFindBy(accessibility ="text_New Security Phrase_txt")
	private MobileElement newSecurityPhase_lbl;
	
	@iOSXCUITFindBy(id = "text_New Security Phrase_input")
	@AndroidFindBy(accessibility ="text_New Security Phrase_input")
	private MobileElement newSecurityPhrase_txt;
	
	@iOSXCUITFindBy(id = "button_Done_txt")
	@AndroidFindBy(accessibility ="button_Done_txt")
	private MobileElement done_btn;
	
	public Boolean securityPhrasePageDisplayed() {
		Boolean value=pageDisplayed(securityPhraseTitle_lbl,"Security Phrase Page");
		return value;
	}
	public Boolean crossButtonDisplayed() {
		Boolean value=pageDisplayed(cross_btn,"Cross Button");
		return value;
	}
	
	public Boolean currentSecurityPhraseDisplayed() {
		Boolean value=pageDisplayed(currentSecurityPhase_lbl,"Current Security Phrase");
		return value;
	}
	
	public Boolean doneButtonDisplayed() {
		Boolean value=pageDisplayed(done_btn,"Done Button");
		return value;
	}

	
	public Boolean newSecurityPhraseDisplayed() {
		Boolean value=pageDisplayed(newSecurityPhase_lbl,"New Security Phrase");
		return value;
	}
	public String getCurrentSecurityPhrase() {
		String text=getText(currentSecurityPhase_txt, "Current Security Phrase");
		return text;
	}
	
	public SecurityPhrasePage enterSecurityPhrase(String value) throws Throwable {
		sendKeys(newSecurityPhrase_txt,value,"Enter Security Phrase");
		return this;
	}
	
	public SecurityPage clickCrossButton() {
		click(cross_btn,"Cross Button");
		return new SecurityPage();
	}
	
	public SecurityPage clickSecurityPhrase() {
		click(currentSecurityPhase_lbl,"");
		return new SecurityPage();
	}
	
	public OtpPage clickDoneButton() {
		click(done_btn,"Done Button");
		return new OtpPage();
	}
	
	
}

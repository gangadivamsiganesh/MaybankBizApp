package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ControlCenterPage extends BaseTest {
	
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"Notifications\"`][2]")
	@AndroidFindBy(accessibility = "button_3_item_0_header")
	private MobileElement notification_btn;
	
	@iOSXCUITFindBy(id = "label_How can we help you today?_txt")
	@AndroidFindBy(accessibility = "label_How can we help you today?_txt")
	private MobileElement controlCenterWelcome_lbl;
	
	@iOSXCUITFindBy(id = "pageHeader_header_img")
	@AndroidFindBy(accessibility = "pageHeader_header_img")
	private MobileElement profile_img;
	
	@iOSXCUITFindBy(id = "pageHeader_userName_txt")
	@AndroidFindBy(accessibility = "pageHeader_userName_txt")
	private MobileElement username_lbl;
	
	@iOSXCUITFindBy(id = "pageHeader_logout_img")
	@AndroidFindBy(accessibility = "pageHeader_logout_img")
	private MobileElement logout_btn;
	
	@iOSXCUITFindBy(id = "pageHeader_crossBlack_img")
	@AndroidFindBy(accessibility = "pageHeader_crossBlack_img")
	private MobileElement cross_btn;
	
	@iOSXCUITFindBy(id = "cardList_Apply_txt")
	@AndroidFindBy(accessibility = "cardList_Apply_txt")
	private MobileElement apply_icon;
	
	@iOSXCUITFindBy(id = "cardList_My Articles_txt")
	@AndroidFindBy(accessibility = "cardList_My Articles_txt")
	private MobileElement myArticles_icon;
	
	@iOSXCUITFindBy(id = "cardList_Events_txt")
	@AndroidFindBy(accessibility = "cardList_Events_txt")
	private MobileElement events_icon;
	
	@iOSXCUITFindBy(id = "cardList_Settings_txt")
	@AndroidFindBy(accessibility = "cardList_Settings_txt")
	private MobileElement settings_icon;
	
	@iOSXCUITFindBy(id = "cardList_Help_txt")
	@AndroidFindBy(accessibility = "cardList_Help_txt")
	private MobileElement help_icon;
	
	
	
	
	
	public String getControlCenterHeaderMsg() {
		String text=getText(controlCenterWelcome_lbl, "Control Center header msg");
		return text;
	}
	
	public Boolean verifyControlCenterPageDisplayed() {
		Boolean value=elementDisplayed(settings_icon,"Control Center Page");
		return value;
	}
	
	public Boolean verifyProfileImageDisplayed() {
		Boolean value=elementDisplayed(profile_img,"Profile Image");
		return value;
	}

	public Boolean verifyUserNameDisplayed() {
		Boolean value=elementDisplayed(username_lbl,"UserName lable on Control center page");
		return value;
	}
	
	public BusinessProfilePage clickUserprofile(){
		click(username_lbl,"User profile link on Control Center page");
		return new BusinessProfilePage();
	}
	
	public LogoutPage clickLogoutButton(){
		click(logout_btn,"Logout button");
		return new LogoutPage();
	}
	
	public BankingDashboardPage clickCrossButton(){
		click(cross_btn,"Cross Button");
		return new BankingDashboardPage();
	}
	
	
	public Boolean verifyLogoutIconDisplayed() {
		Boolean value=elementDisplayed(logout_btn,"Logout icon on Control center page");
		return value;
	}
	
	
	public Boolean verifyCrossIconDisplayed() {
		Boolean value=elementDisplayed(cross_btn,"Cross Icon on Control center page");
		return value;
	}
	
	public Boolean verifyApplyIconDisplayed() {
		Boolean value=elementDisplayed(apply_icon,"Apply Icone on Control center page");
		return value;
	}

	
	public ControlCenterPage clickApplyIcon(){
		click(apply_icon,"Control Center Apply icon ");
		return this;
	}
	
	public Boolean verifyMyArticlesIconDisplayed() {
		Boolean value=elementDisplayed(myArticles_icon,"MyArticles Icon on Control center page");
		return value;
	}

	
	public ControlCenterPage clickMyArticlesIcon(){
		click(myArticles_icon,"Control Center My Articles icon ");
		return this;
	}
	
	public Boolean verifyEventsIconDisplayed() {
		Boolean value=elementDisplayed(events_icon,"Events Icon on Control center page");
		return value;
	}

	
	public ControlCenterPage clickEventsIcon(){
		click(events_icon,"Control Center Events icon ");
		return this;
	}
	
	
	public Boolean verifySettingsIconDisplayed() {
		Boolean value=elementDisplayed(settings_icon,"Settings Icon on Control center page");
		return value;
	}

	
	public SettingsPage clickSettingsIcon(){
		click(settings_icon,"Control Center Settings icon ");
		return new SettingsPage();
	}
	
	public Boolean verifyHelpIconDisplayed() {
		Boolean value=elementDisplayed(help_icon,"Help Icon on Control center page");
		return value;
	}

	
	public ControlCenterPage clickHelpIcon(){
		click(help_icon,"Control Center Help icon ");
		return this;
	}
	

	
}

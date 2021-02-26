package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class SettingsPage extends BaseTest {
	
	@iOSXCUITFindBy(id = "pageTitle_Settings")
	@AndroidFindBy(accessibility = "pageTitle_Settings")
	private MobileElement Settings_lbl;
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Profile\"`]")
	@AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Profile\")")
	private MobileElement profile_btn;
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"My Devices\"`]")
	@AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"My Devices\")")
	private MobileElement myDevices_btn;
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Security\"`]")
	@AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Security\")")
	private MobileElement security_btn;
	
	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Notifications\"`]")
	@AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Notifications\")")
	private MobileElement notifications_btn;

	@iOSXCUITFindBy(id = "header_icon_crossBlack_img")
	@AndroidFindBy(accessibility = "header_icon_crossBlack_img")
	private MobileElement cross_btn;
	
	@iOSXCUITFindBy(id = "pageTitle_Settings")
	@AndroidFindBy(accessibility = "pageTitle_Settings")
	private MobileElement settings_lbl;
	
	public Boolean verifySettingsPageDisplayed() {
		Boolean value=elementDisplayed(Settings_lbl,"Settings Page");
		return value;
	}
	

	public Boolean profileButtonDisplayed() {
		Boolean value=elementDisplayed(profile_btn,"Profile button");
		return value;
	}
	
	public BusinessProfilePage clickProfile(){
		click(profile_btn,"Profile button");
		return new BusinessProfilePage();
	}
	
	public Boolean myDevicesDisplayed() {
		Boolean value=elementDisplayed(myDevices_btn,"MyDevices button");
		return value;
	}
	
	public MyDevicesPage clickMyDevices(){
		click(myDevices_btn,"MyDevices button");
		return new MyDevicesPage();
	}
	
	public Boolean securityButtonDisplayed() {
		Boolean value=elementDisplayed(security_btn,"Security button");
		return value;
	}
	
	public SecurityPage clickSecurityButton(){
		click(security_btn,"Security button");
		return new SecurityPage();
	}
	
	public Boolean notificationButtonDisplayed() {
		Boolean value=elementDisplayed(notifications_btn,"Notifications button");
		return value;
	}
	
	public NotificationPage clickNotificationButton(){
		click(notifications_btn,"Notifications button");
		return new NotificationPage();
	}
	
	public Boolean settingsPageTitleDisplayed() {
		Boolean value=elementDisplayed(settings_lbl,"Settings Page ");
		return value;
	}
	
	public Boolean crossButtonDisplayed() {
		Boolean value=elementDisplayed(cross_btn,"Cross button on settings page ");
		return value;
	}
	
	public ControlCenterPage clickCrossButton(){
		click(cross_btn,"Cross Button");
		return new ControlCenterPage();
	}
	
	public String getSettingsPageTitle() {
		String text=getText(settings_lbl, "Settings Page");
		return text;
	}
	
}

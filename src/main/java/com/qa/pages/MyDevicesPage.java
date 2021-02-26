package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class MyDevicesPage extends BaseTest {
	
	@iOSXCUITFindBy(id = "pageTitle_My Devices")
	@AndroidFindBy(accessibility = "pageTitle_My Devices")
	private MobileElement myDeviceTitle_txt;
	
	@iOSXCUITFindBy(id = "list_0_transactionDescName_txt")
	@AndroidFindBy(accessibility = "list_0_transactionDescName_txt")
	private MobileElement device1_txt;
	
	@iOSXCUITFindBy(id = "header_icon_crossBlack_img")
	@AndroidFindBy(accessibility = "header_icon_crossBlack_img")
	private MobileElement cross_btn;
	
	
	@iOSXCUITFindBy(id = "list_0_subItem_0_Edit")
	@AndroidFindBy(accessibility = "list_0_subItem_0_Edit")
	private MobileElement edit_btn;
	
	@iOSXCUITFindBy(id = "list_0_subItem_1_Remove")
	@AndroidFindBy(accessibility = "list_0_subItem_1_Remove")
	private MobileElement remove_btn;
	
	@iOSXCUITFindBy(id = "text_Device Name_input")
	@AndroidFindBy(accessibility = "text_Device Name_input")
	private MobileElement deviceName_txt;
	
	@iOSXCUITFindBy(id = "button_Done_txt")
	@AndroidFindBy(accessibility = "button_Done_txt")
	private MobileElement done_Button;
	
	@iOSXCUITFindBy(id = "header_icon_crossBlack_img")
	@AndroidFindBy(accessibility = "header_icon_crossBlack_img")
	private MobileElement cross_Button;
	
	
	@iOSXCUITFindBy(id = "snackbarModal_message")
	@AndroidFindBy(accessibility = "snackbarModal_message")
	private MobileElement snackBarMsg_lbl;
	
	@iOSXCUITFindBy(id = "snackbarModal_msg_close_img")
	@AndroidFindBy(accessibility = "snackbarModal_msg_close_img")
	private MobileElement snackBarCross_btn;
	
	@iOSXCUITFindBy(id = "list_0_transactionAmount_txt")
	@AndroidFindBy(accessibility = "list_0_transactionAmount_txt")
	private MobileElement currentDevice1_lbl;
	
	@iOSXCUITFindBy(id = "list_1_transactionAmount_txt")
	@AndroidFindBy(accessibility = "list_1_transactionAmount_txt")
	private MobileElement currentDevice2_lbl;
	
	@iOSXCUITFindBy(id = "list_2_transactionAmount_txt")
	@AndroidFindBy(accessibility = "list_2_transactionAmount_txt")
	private MobileElement currentDevice3_lbl;
	
	@iOSXCUITFindBy(id = "list_Yes_txt")
	@AndroidFindBy(accessibility = "list_Yes_txt")
	private MobileElement yes_btn;
	
	
	
	

	
	
	public String getSnackBarMsg() {
		String text=getText(snackBarMsg_lbl, "Snack Bar Message is ");
		return text;
	}

	public MyDevicesPage clickSnackBarClose() {
		click(snackBarCross_btn,"Snackbar Close button");
		return this;
	}
	
	public Boolean myDevicesPageDisplayed() {
		Boolean value=pageDisplayed(myDeviceTitle_txt,"My devices page");
		return value;
	}

	public Boolean device1Displayed() {
		Boolean value=elementDisplayed(device1_txt,"Device ");
		return value;
	}
	
	public Boolean crossButtonDisplayed() {
		Boolean value=elementDisplayed(cross_Button,"Cross Button ");
		return value;
	}
	
	
	public Boolean editButtonDisplayed() {
		Boolean value=elementDisplayed(edit_btn,"Edit Button ");
		return value;
	}
	
	public Boolean removeButtonDisplayed() {
		Boolean value=elementDisplayed(remove_btn,"Remove Button ");
		return value;
	}
	

	public MyDevicesPage clickDevice() {
		click(device1_txt,"Device ");
		return this;
	}
	public MyDevicesPage clickEditButton() {
		click(edit_btn,"Edit button");
		return this;
	}
	public MyDevicesPage clickDoneButton() {
		click(done_Button,"Done button");
		return this;
	}
	
	public SettingsPage clickCrossButton() {
		click(cross_Button,"Cross button");
		return new SettingsPage();
	}
	
	public MyDevicesPage clickRemoveButton() {
		click(remove_btn,"remove button");
		return this;
	}
	
	public MyDevicesPage enterDeviceName(String value) throws Throwable {
		sendKeys(deviceName_txt,value,"Enter device Name ");
		return this;
	}
	
	public String getDeviceName() {
		String text=getText(device1_txt, "Device name is ");
		return text;
	}
	
	public String getCurrentDevice1Text() {
		String text=getText(currentDevice1_lbl, "Current Device1 value  ");
		return text;
	}
	
	public String getCurrentDevice2Text() {
		String text=getText(currentDevice2_lbl, "Current Device2 value  ");
		return text;
	}
	public String getCurrentDevice3Text() {
		String text=getText(currentDevice3_lbl, "Current Device3 value  ");
		return text;
	}
	
	public MyDevicesPage clickDevice1() {
		click(currentDevice1_lbl,"Device 1");
		return this;
	}
	
	public MyDevicesPage clickDevice2() {
		click(currentDevice2_lbl,"Device 2");
		return this;
	}
	
	public MyDevicesPage clickYesButton() {
		click(yes_btn,"Yes Button");
		return this;
	}
	public MyDevicesPage clickontheCurrentdevice()
	{
		
			if(currentDevice1_lbl.getText().contains("Current Device"))
					{
				currentDevice1_lbl.click();
					}
			else if(currentDevice2_lbl.getText().contains("Current Device"))
					{
				currentDevice2_lbl.click();
					}
			else if(currentDevice3_lbl.getText().contains("Current Device"))
					{
				currentDevice3_lbl.click();
					}
		
		return this;
	
	}
	
	

}

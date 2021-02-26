package com.qa.pages;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.Dimension;

import com.qa.BaseTest;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class CalenderPage extends BaseTest{

	@iOSXCUITFindBy(id = "list_0_Upcoming Scheduled Payments")
	@AndroidFindBy(accessibility ="list_0_Upcoming Scheduled Payments")
	private MobileElement upcomingPaymentsHeader_lbl;
	
	public PaymentsDetailsPage clickFutureDate() throws Throwable {
		selectFutureDate();
		return new PaymentsDetailsPage();
	}
	
	public TransferDetailsPage clickFutureTransferDate() throws Throwable {
		selectFutureDate();
		return new TransferDetailsPage();
	}
	
	
	

	public void selectFutureDate() throws Throwable {
		LocalDate currentDate = LocalDate.now(); 
		int dom = currentDate.getDayOfMonth(); 

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		c.setTime(new Date()); // Now use today date.
		c.add(Calendar.DATE, 15); // Adding 5 days
		String futureDate1 = sdf.format(c.getTime());
		futureDate1=futureDate1.substring(0,8);
		String iosDate=futureDate1.concat("28");
		String futureDate=futureDate1.concat("08");
		System.out.println(futureDate);

		if(dom<=20) {

			elementDisplayed(upcomingPaymentsHeader_lbl,"Calender Page Displayed");
			switch(getPlatform()) {
			case "Android":
				MobileElement e=(MobileElement) getDriver().findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"28\")"));
				waitForVisibility(e); 
				e.click();
				break;

			case "iOS":
				System.out.println(futureDate);
				String date=iosDate;
				MobileElement e1=(MobileElement) getDriver().findElement(MobileBy.name("native.calendar.SELECT_DATE_SLOT-"+date+""));
				waitForVisibility(e1); 
				e1.click();
				Thread.sleep(2000);
				break;
			}
		}
		else {
			elementDisplayed(upcomingPaymentsHeader_lbl,"Calender Page Displayed");
			Dimension size = getDriver().manage().window().getSize();
			int device_width = (int) (size.width);
			int device_height = (int) (size.height);
			int startY = (int) (device_height * 0.50);
			int endY = (int) (device_height * 0.2);
			int startX = (int) (device_width / 2);
			int endX = startX;
			TouchAction action=new TouchAction(getDriver());
			action.press(PointOption.point(startX, startY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500))).moveTo(PointOption.point(endX, endY)).release();
			getDriver().performTouchAction(action);
			Thread.sleep(1000);
			switch(getPlatform()) {
			case "Android":
				MobileElement e=(MobileElement) getDriver().findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"8\")"));
				waitForVisibility(e); 
				e.click();
				break;

			case "iOS":
				MobileElement e1=(MobileElement) getDriver().findElement(MobileBy.name("native.calendar.SELECT_DATE_SLOT-"+futureDate+""));
				waitForVisibility(e1); 
				e1.click();
				Thread.sleep(2000);
				break;
			}
		}
	}
}

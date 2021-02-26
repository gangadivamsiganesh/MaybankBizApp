package com.qa.tests;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

import org.testng.annotations.Test;

import com.google.common.base.CaseFormat;
import com.qa.BaseTest;

import io.appium.java_client.MobileBy;

public class randomNumber extends BaseTest {
	
	public void draw() {
		Random ran = new Random();
		int r = ran.nextInt(58) + 1;
		System.out.println(r);
	}

	//@Test
	 public void print() throws Exception {
		System.out.println(randomString("email",10));
		System.out.println(randomString("alphabetic",20));
		System.out.println(randomString("alphanumeric",20));
		System.out.println(randomString("numeric",20));
	   }
	// @Test
	public void date() {
		LocalDate currentDate = LocalDate.now(); 
		String dayOfWeek = getDayOfWeek(Calendar.DAY_OF_WEEK);
		DayOfWeek dow = currentDate.getDayOfWeek(); 
		int dom = currentDate.getDayOfMonth(); 
		int doy = currentDate.getDayOfYear(); 
		Month m = currentDate.getMonth(); 
		int y = currentDate.getYear(); 
		System.out.println(Calendar.DAY_OF_WEEK);
		
		System.out.println("current local date : " +  dayOfWeek); 
		System.out.println("dayOfWeek from a date in Java 8 : " + dow); 
		System.out.println("dayOfMonth from date in JDK 8: " + dom); 
		System.out.println("dayOfYear from a date in Java SE 8 : " + doy); 
		System.out.println("month from a date in Java 1.8 : " + m); 
		System.out.println("year from date in JDK 1.8 : " + y);
		
		//String result = CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, dow);

	}
	 
	 
	 private String getDayOfWeek(int value){
		    String day = "";
		    switch(value){
		    case 1:
		        day="Sunday";
		        break;
		    case 2:
		        day="Monday";
		        break;
		    case 3:
		        day="Tuesday";
		        break;
		    case 4:
		        day="Wednesday";
		        break;
		    case 5:
		        day="Thursday";
		        break;
		    case 6:
		        day="Friday";
		        break;
		    case 7:
		        day="Saturday";
		        break;
		    }
		    return day;
	 }
	 
	 public static String getDay(String day, String month, String year) {
		    return LocalDate.parse(day+"-"+month+"-"+year , DateTimeFormatter.ofPattern( "dd-MM-yyyy" ))
		            .getDayOfWeek()
		            .getDisplayName(TextStyle.FULL_STANDALONE , Locale.ENGLISH);
		}
 //@Test
 public void date1() {
	 System.out.println(getDay("28","10","2020"));
	 
	// Friday 30 October 2020 ,
 }
 
 @Test
 public void Month1() {
	 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	 Calendar c = Calendar.getInstance();
	 c.setTime(new Date()); // Now use today date.
	 c.add(Calendar.DATE, 15); // Adding 5 days
	 String output = sdf.format(c.getTime());
	 System.out.println(output);
	
 }
 
 public void selectDate() {
	 
	 LocalDate currentDate = LocalDate.now(); 
		String dayOfWeek = getDayOfWeek(Calendar.DAY_OF_WEEK);
		DayOfWeek dow = currentDate.getDayOfWeek(); 
		int dom = currentDate.getDayOfMonth(); 
		int doy = currentDate.getDayOfYear(); 
		Month m = currentDate.getMonth(); 
		int y = currentDate.getYear(); 
		//System.out.println(Calendar.DAY_OF_WEEK);
		
		if(dom<=28) {
			String searchText="30";
			 getDriver().findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\" "+searchText+"\")")).click();
		}
	 
	 
 }
}

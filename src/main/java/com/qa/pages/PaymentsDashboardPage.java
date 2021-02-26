package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class PaymentsDashboardPage extends BaseTest{
	
	@iOSXCUITFindBy(id = "pageTitle_Payment")
	@AndroidFindBy(accessibility  = "pageTitle_Payment")
	private MobileElement paymentsTitle_lbl;
	
	@iOSXCUITFindBy(id = "header_icon_arrowBlack_img")
	@AndroidFindBy(accessibility  = "header_icon_arrowBlack_img")
	private MobileElement back_btn;
	
	@iOSXCUITFindBy(id = "list_0_item_index_Recent")
	@AndroidFindBy(accessibility  = "list_0_item_index_Recent")
	private MobileElement recentHeader_lbl;
	
	@iOSXCUITFindBy(id = "list_0_item_index_New Payment")
	@AndroidFindBy(accessibility  = "list_0_item_index_New Payment")
	private MobileElement paymentHeader_lbl;

	@iOSXCUITFindBy(id = "list_0_Favourites")
	@AndroidFindBy(accessibility  = "list_0_Favourites")
	private MobileElement favouritesHeader_lbl;
	
	@iOSXCUITFindBy(id = "list_0_Search")
	@AndroidFindBy(accessibility  = "list_0_Search")
	private MobileElement search_txt;
	
	@iOSXCUITFindBy(id = "list_0_search_input")
	@AndroidFindBy(accessibility  = "list_0_search_input")
	private MobileElement searchInput_txt;
	
	@iOSXCUITFindBy(id = "list_0_Add New Favourite")
	@AndroidFindBy(accessibility  = "list_0_Add New Favourite")
	private MobileElement addToFav_btn;
	
	@iOSXCUITFindBy(id = "list_Bill Payment_txt")
	@AndroidFindBy(accessibility  = "list_Bill Payment_txt")
	private MobileElement billPayment_icon;
	
	@iOSXCUITFindBy(id = "list_JomPAY_txt")
	@AndroidFindBy(accessibility  = "list_JomPAY_txt")
	private MobileElement jomPay_icon;
	
	@iOSXCUITFindBy(id = "list_0_search_img")
	@AndroidFindBy(accessibility  = "list_0_search_img")
	private MobileElement search_icon;
	
	@iOSXCUITFindBy(id = "list_0_cross_img")
	@AndroidFindBy(accessibility  = "list_0_cross_img")
	private MobileElement searchCross_icon;
	
	@iOSXCUITFindBy(id = "list_fav_0_billerName")
	@AndroidFindBy(accessibility  = "list_fav_0_billerName")
	private MobileElement favBillerName1_lbl;
	
	@iOSXCUITFindBy(id = "list_fav_0_billerAccNumberDisplay")
	@AndroidFindBy(accessibility  = "list_fav_0_billerAccNumberDisplay")
	private MobileElement favBillerAccNum1_lbl;
	
	@iOSXCUITFindBy(id = "list_fav_0_nickName")
	@AndroidFindBy(accessibility  = "list_fav_0_nickName")
	private MobileElement favBillerNickname1_lbl;
	
	
	
	
	public Boolean verifyPaymentDashboardisplayed() {
		Boolean value=pageDisplayed(paymentsTitle_lbl,"Payments Dashboard");
		return value;
	}
	
	
	public Boolean verifyBackButtonDisplayed() {
		Boolean value=elementDisplayed(back_btn,"Back Button");
		return value;
	}
	
	public Boolean verifyRecentSectionDisplayed() {
		Boolean value=elementDisplayed(recentHeader_lbl,"Recent Payments section");
		return value;
	}
	
	public Boolean verifyPaymentsSectionDisplayed() {
		Boolean value=elementDisplayed(paymentHeader_lbl,"New Payments Payments section");
		return value;
	}
	
	public Boolean verifyFavouritesSectionDisplayed() {
		Boolean value=elementDisplayed(favouritesHeader_lbl,"Favourites Payments section");
		return value;
	}
	
	public Boolean verifyNewBillPaymentIconDisplayed() {
		Boolean value=elementDisplayed(billPayment_icon,"New Bill Payment icon");
		return value;
	}
	
	
	public Boolean verifyJompayIconDisplayed() {
		Boolean value=elementDisplayed(jomPay_icon,"New JomPay icon ");
		return value;
	}
	
	public Boolean verifyFavSearchDisplayed() throws Throwable {
		Boolean value=verticalSwipeTillElementDisplayed(search_txt,"Favourites Search ");
		return value;
	}
	
	public Boolean verifyAddNewFavButtonDisplayed() {
		Boolean value=elementDisplayed(addToFav_btn,"Add New Favourite  ");
		return value;
	}
	
	public BankingDashboardPage clickBackbutton(){
		click(back_btn,"Back Button");
		return new BankingDashboardPage();
	}
	
	public PayFromPage clickNewBillPayment(){
		click(billPayment_icon,"New Bill Payment icon");
		return new PayFromPage();
	}
	
	public AddFavTypePage clickAddFavPayment(){
		click(addToFav_btn,"Add New Favourite button ");
		return new AddFavTypePage();
	}
	
	public PayFromPage clickJomPayPayment(){
		click(jomPay_icon,"Jompay icon ");
		return new PayFromPage();
	}
	
	public PaymentsDashboardPage searchFav(String value) throws Throwable {
		verticalSwipeTillElementDisplayed(search_txt,"Favourites Search ");
		click(search_txt,"Search icon ");
		sendKeysAndEnter(searchInput_txt,value,"Search Favourite ");
		return this;
	}
	
	public Boolean verifyFavBillerNameDisplayed() throws Throwable {
		verticalSwipeTillElementDisplayed(favBillerName1_lbl,"Favourite Biller Name ");
		Boolean value=elementDisplayed(favBillerName1_lbl,"Favourite Biller Name  ");
		return value;
	}
	
	public Boolean verifyFavBillerNicknameDisplayed() throws Throwable {
		verticalSwipeTillElementDisplayed(favBillerNickname1_lbl,"Favourite Biller Nickname ");
		Boolean value=elementDisplayed(favBillerNickname1_lbl,"Favourite Biller Nickname  ");
		return value;
	}
	public Boolean verifyFavBillerAccNumberDisplayed() throws Throwable {
		verticalSwipeTillElementDisplayed(favBillerAccNum1_lbl,"Favourite Biller Account Number ");
		Boolean value=elementDisplayed(favBillerAccNum1_lbl,"Favourite Biller Account Number  ");
		return value;
	}
	
	public Boolean verifyFavSearchIconDisplayed() {
		Boolean value=elementDisplayed(search_icon,"Favourite search icon  ");
		return value;
	}
	
	public String getFavBillerName() throws Throwable {
		verticalSwipeTillElementDisplayed(favBillerName1_lbl,"Favourite Biller Name ");
		String text=getText(favBillerName1_lbl, "Fav Biller Name ");
		return text;
	}
	
	public String getFavBillerNickname() throws Throwable {
		verticalSwipeTillElementDisplayed(favBillerNickname1_lbl,"Favourite Biller Nickname ");
		String text=getText(favBillerNickname1_lbl, "Fav Biller Nickname ");
		return text;
	}
	
	public String getFavBillerAccountNumber() throws Throwable {
		verticalSwipeTillElementDisplayed(favBillerAccNum1_lbl,"Favourite Biller Account Number ");
		String text=getText(favBillerAccNum1_lbl, "Fav Biller Account Number ");
		return text;
	}
	
	public PayFromPage clickFavouritePayment(){
		click(favBillerName1_lbl,"Favourite Item ");
		return new PayFromPage();
	}
	
}


package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class TransferDashboardPage extends BaseTest{
	
	@iOSXCUITFindBy(id = "pageTitle_Transfer")
	@AndroidFindBy(accessibility  = "pageTitle_Transfer")
	private MobileElement transferTitle_lbl;
	
	@iOSXCUITFindBy(id = "header_icon_arrowBlack_img")
	@AndroidFindBy(accessibility  = "header_icon_arrowBlack_img")
	private MobileElement back_btn;
	
	@iOSXCUITFindBy(id = "list_0_item_index_Recent")
	@AndroidFindBy(accessibility  = "list_0_item_index_Recent")
	private MobileElement recentHeader_lbl;
	
	@iOSXCUITFindBy(id = "list_0_item_index_New Transfer")
	@AndroidFindBy(accessibility  = "list_0_item_index_New Transfer")
	private MobileElement newTransferHeader_lbl;

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
	
	@iOSXCUITFindBy(id = "list_0_item_0_nickName")
	@AndroidFindBy(accessibility  = "list_0_item_0_nickName")
	private MobileElement favNickname1_lbl;
	
	@iOSXCUITFindBy(id = "list_0_item_0_id")
	@AndroidFindBy(accessibility  = "list_0_item_0_id")
	private MobileElement favAccountNumber1_lbl;
	
	@iOSXCUITFindBy(id = "list_0_item_0_id_type")
	@AndroidFindBy(accessibility  = "list_0_item_0_id_type")
	private MobileElement favBankName1_lbl;
	
	@iOSXCUITFindBy(id = "list_Own Account/Loan_txt")
	@AndroidFindBy(accessibility  = "list_Own Account/Loan_txt")
	private MobileElement ownAccountTransferLoan_btn;
	
	@iOSXCUITFindBy(id = "list_Other Accounts_txt")
	@AndroidFindBy(accessibility  = "list_Other Accounts_txt")
	private MobileElement otherAccount_btn;
	
	@iOSXCUITFindBy(id = "list_DuitNow_txt")
	@AndroidFindBy(accessibility  = "list_DuitNow_txt")
	private MobileElement duitNow_btn;
	
	@iOSXCUITFindBy(id = "list_0_search_img")
	@AndroidFindBy(accessibility  = "list_0_search_img")
	private MobileElement search_icon;
	
	
	public Boolean verifyTransferDashboardisplayed() {
		Boolean value=pageDisplayed(transferTitle_lbl,"Transfers Dashboard");
		return value;
	}
	
	
	public Boolean verifyBackButtonDisplayed() {
		Boolean value=elementDisplayed(back_btn,"Back Button");
		return value;
	}
	
	public Boolean verifyRecentSectionDisplayed() {
		Boolean value=elementDisplayed(recentHeader_lbl,"Recent Transfers section");
		return value;
	}
	
	public Boolean verifyNewTransferSectionDisplayed() {
		Boolean value=elementDisplayed(newTransferHeader_lbl,"New Transfer section");
		return value;
	}
	
	public Boolean verifyFavouritesSectionDisplayed() {
		Boolean value=elementDisplayed(favouritesHeader_lbl,"Favourites Payments section");
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
	
	public Boolean verifyOwnAccountLoanTransferIconDisplayed() {
		Boolean value=elementDisplayed(ownAccountTransferLoan_btn,"Own Account/Loan Transfer icon  ");
		return value;
	}
	
	public Boolean verifyOtherAccountsTransferIconDisplayed() {
		Boolean value=elementDisplayed(otherAccount_btn,"Other Accounts Transfer icon  ");
		return value;
	}
	
	public Boolean verifyDuitNowTransferIconDisplayed() throws Throwable {
		scrollToCard();
		Boolean value=elementDisplayed(duitNow_btn,"DuitNow Transfer icon  ");
		return value;
	}
	
	public BankingDashboardPage clickBackbutton(){
		click(back_btn,"Back Button");
		return new BankingDashboardPage();
	}
	
	public AddFavTypePage clickAddNewFavourite(){
		click(addToFav_btn,"Add New Favourite button ");
		return new AddFavTypePage();
	}
	
	public TransferDashboardPage searchFav(String value) throws Throwable {
		verticalSwipeTillElementDisplayed(search_txt,"Favourites Search ");
		click(search_txt,"Search icon ");
		sendKeysAndEnter(searchInput_txt,value,"Search Favourite ");
		return this;
	}
	
	public Boolean verifyFavAccountNameDisplayed() throws Throwable {
		verticalSwipeTillElementDisplayed(favNickname1_lbl,"Favourite Account Name ");
		Boolean value=elementDisplayed(favNickname1_lbl,"Favourite Account Name  ");
		return value;
	}
	

	public Boolean verifyFavBillerAccNumberDisplayed() throws Throwable {
		verticalSwipeTillElementDisplayed(favAccountNumber1_lbl,"Favourite Account Number ");
		Boolean value=elementDisplayed(favAccountNumber1_lbl,"Favourite Account Number  ");
		return value;
	}
	
	public Boolean verifyFavSearchIconDisplayed() {
		Boolean value=elementDisplayed(search_icon,"Favourite search icon  ");
		return value;
	}
	
	public String getFavAccountName() throws Throwable {
		verticalSwipeTillElementDisplayed(favNickname1_lbl,"Favourite Account Name ");
		String text=getText(favNickname1_lbl, "Fav Account Name ");
		return text;
	}
	
	public String getFavBankName() throws Throwable {
		verticalSwipeTillElementDisplayed(favBankName1_lbl,"Favourite Bank Name ");
		String text=getText(favBankName1_lbl, "Fav Bank Name ");
		return text;
	}
	
	
	public String getFavBillerAccountNumber() throws Throwable {
		verticalSwipeTillElementDisplayed(favAccountNumber1_lbl,"Favourite Account Number ");
		String text=getText(favAccountNumber1_lbl, "Fav Account Number ");
		return text;
	}
	
	public TransferFromPage clickFavouritePayment(){
		click(favAccountNumber1_lbl,"Favourite Item ");
		return new TransferFromPage();
	}
	
	public TransferFromPage clickOwnAccountTransferLoanTransferIcon(){
		click(ownAccountTransferLoan_btn,"Own Account Transfer / Loan icon");
		return new TransferFromPage();
	}
	
	public TransferFromPage clickOthersAccountTransferIcon(){
		click(otherAccount_btn,"Other Account icon");
		return new TransferFromPage();
	}
	
	public TransferFromPage clickDuitNowTransfer() throws InterruptedException{
		scrollToCard();
		click(duitNow_btn,"DuitNow Tansfer icon");
		return new TransferFromPage();
	}


}

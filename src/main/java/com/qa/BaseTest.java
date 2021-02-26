package com.qa;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;


import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.ThreadContext;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.internal.TestNGMethod;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;
import com.google.common.base.Function;
import com.google.common.base.Strings;
import com.qa.pages.LoginPage;
import com.qa.reports.ExtentReport;
import com.qa.utils.TestUtils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.InteractsWithApps;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.HideKeyboardStrategy;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.screenrecording.CanRecordScreen;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServerHasNotBeenStartedLocallyException;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class BaseTest {
	protected static ThreadLocal <AppiumDriver> driver = new ThreadLocal<AppiumDriver>();
	protected static ThreadLocal <Properties> props = new ThreadLocal<Properties>();
	protected static ThreadLocal <HashMap<String, String>> strings = new ThreadLocal<HashMap<String, String>>();
	protected static ThreadLocal <String> platform = new ThreadLocal<String>();
	protected static ThreadLocal <String> dateTime = new ThreadLocal<String>();
	protected static ThreadLocal <String> deviceName = new ThreadLocal<String>();
	private static AppiumDriverLocalService server;
	protected JSONObject loginUsers;
	ITestResult result;
	static String isScreenshot;
	static String videoRecord;
	TestUtils utils = new TestUtils();

	public AppiumDriver getDriver() {
		return driver.get();
	}

	public void setDriver(AppiumDriver driver2) {
		driver.set(driver2);
	}

	public Properties getProps() {
		return props.get();
	}

	public void setProps(Properties props2) {
		props.set(props2);
	}

	public HashMap<String, String> getStrings() {
		return strings.get();
	}

	public void setStrings(HashMap<String, String> strings2) {
		strings.set(strings2);
	}

	public String getPlatform() {
		return platform.get();
	}

	public void setPlatform(String platform2) {
		platform.set(platform2);
	}

	public String getDateTime() {
		return dateTime.get();
	}

	public void setDateTime(String dateTime2) {
		dateTime.set(dateTime2);
	}

	public String getDeviceName() {
		return deviceName.get();
	}

	public void setDeviceName(String deviceName2) {
		deviceName.set(deviceName2);
	}

	public BaseTest() {
		PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
	}

	@BeforeMethod(alwaysRun=true)
	public void beforeMethod() {
		if(videoRecord.equalsIgnoreCase("true")) {
			((CanRecordScreen) getDriver()).startRecordingScreen();	
		}

	}

	//stop video capturing and create *.mp4 file
	@AfterMethod(alwaysRun=true)
	public synchronized void afterMethod(ITestResult result) throws Exception {
		if(videoRecord.equalsIgnoreCase("true")) {
		String media = ((CanRecordScreen) getDriver()).stopRecordingScreen();

		Map <String, String> params = result.getTestContext().getCurrentXmlTest().getAllParameters();		
		String dirPath = "videos" + File.separator + params.get("platformName") + "_" + params.get("deviceName") 
		+ File.separator + getDateTime() + File.separator + result.getTestClass().getRealClass().getSimpleName();

		File videoDir = new File(dirPath);

		synchronized(videoDir){
			if(!videoDir.exists()) {
				videoDir.mkdirs();
			}	
		}
		FileOutputStream stream = null;
		try {
			stream = new FileOutputStream(videoDir + File.separator + result.getName() + ".mp4");
			stream.write(Base64.decodeBase64(media));
			stream.close();
			utils.log().info("video path: " + videoDir + File.separator + result.getName() + ".mp4");
		} catch (Exception e) {
			utils.log().error("error during video capture" + e.toString());
		} finally {
			if(stream != null) {
				stream.close();
			}
		}
		}
	}
	@BeforeClass(alwaysRun=true)
	public void beforeClass() throws Exception{
		InputStream datais = null;
		try {
			String dataFileName = "data/loginUsers.json";
			datais = getClass().getClassLoader().getResourceAsStream(dataFileName);
			JSONTokener tokener = new JSONTokener(datais);
			loginUsers = new JSONObject(tokener);
		} catch(Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			if(datais != null) {
				datais.close();
			}
		}


	}
	/*
	@BeforeSuite
	public void beforeSuite() throws Exception, Exception {
		ThreadContext.put("ROUTINGKEY", "ServerLogs");
		server = getAppiumService();
		if(!checkIfAppiumServerIsRunnning(4723)) {
			server.start();
			server.clearOutPutStreams();
			utils.log().info("Appium server started");
		} else {
			utils.log().info("Appium server already running");
		}	
	}
	 */

	public boolean checkIfAppiumServerIsRunnning(int port) throws Exception {
		boolean isAppiumServerRunning = false;
		ServerSocket socket;
		try {
			socket = new ServerSocket(port);
			socket.close();
		} catch (IOException e) {
			System.out.println("1");
			isAppiumServerRunning = true;
		} finally {
			socket = null;
		}
		return isAppiumServerRunning;
	}

	//@AfterSuite
	public void afterSuite() {
		server.stop();
		utils.log().info("Appium server stopped");
	}
	/*
	public AppiumDriverLocalService getAppiumServerDefault() {
		return AppiumDriverLocalService.buildDefaultService();
	}

	public AppiumDriverLocalService getAppiumService() {
		HashMap<String, String> environment = new HashMap<String, String>();
		environment.put("PATH", "/Library/Java/JavaVirtualMachines/jdk1.8.0_231.jdk/Contents/Home/bin:/Users/Om/Library/Android/sdk/tools:/Users/Om/Library/Android/sdk/platform-tools:/usr/local/bin:/usr/bin:/bin:/usr/sbin:/sbin" + System.getenv("PATH"));
		environment.put("ANDROID_HOME", "/Users/Om/Library/Android/sdk");
		return AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
				.usingDriverExecutable(new File("/usr/local/bin/node"))
				.withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"))
				.usingPort(4723)
				.withArgument(GeneralServerFlag.SESSION_OVERRIDE)
				.withEnvironment(environment)
				.withLogFile(new File("ServerLogs/server.log")));
	}
	 */

	@Parameters({"emulator", "platformName", "udid", "deviceName", "systemPort", 
		"chromeDriverPort", "wdaLocalPort", "webkitDebugProxyPort"})
	@BeforeTest(alwaysRun=true)
	public void beforeTest(@Optional("androidOnly")String emulator,String platformName, String udid, String deviceName, 
			@Optional("androidOnly")String systemPort, @Optional("androidOnly")String chromeDriverPort, 
			@Optional("iOSOnly")String wdaLocalPort, @Optional("iOSOnly")String webkitDebugProxyPort) throws Exception {
		setDateTime(utils.dateTime());
		setPlatform(platformName);
		setDeviceName(deviceName);
		URL url;
		InputStream inputStream = null;
		InputStream stringsis = null;
		Properties props = new Properties();
		AppiumDriver driver;

		String strFile = "logs" + File.separator + platformName + "_" + deviceName;
		File logFile = new File(strFile);
		if (!logFile.exists()) {
			logFile.mkdirs();
		}
		//route logs to separate file for each thread
		ThreadContext.put("ROUTINGKEY", strFile);
		utils.log().info("log path: " + strFile);

		try {
			props = new Properties();
			String propFileName = "config.properties";
			String xmlFileName = "strings/strings.xml";

			utils.log().info("load " + propFileName);
			inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
			props.load(inputStream);
			setProps(props);

			utils.log().info("load " + xmlFileName);
			stringsis = getClass().getClassLoader().getResourceAsStream(xmlFileName);
			setStrings(utils.parseStringXML(stringsis));

			DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
			desiredCapabilities.setCapability("platformName", platformName);
			desiredCapabilities.setCapability("deviceName", deviceName);
			desiredCapabilities.setCapability("udid", udid);
			url = new URL(props.getProperty("appiumURL"));

			switch(platformName) {
			case "Android":
				desiredCapabilities.setCapability("automationName", props.getProperty("androidAutomationName"));
				//	
				desiredCapabilities.setCapability("appPackage", props.getProperty("androidAppPackage"));
				desiredCapabilities.setCapability("appActivity", props.getProperty("androidAppActivity"));
				desiredCapabilities.setCapability("noReset", "true");
				desiredCapabilities.setCapability("fullReset", "false");
				if(emulator.equalsIgnoreCase("true")) {
					desiredCapabilities.setCapability("avd", deviceName);
					desiredCapabilities.setCapability("avdLaunchTimeout", 120000);
				}
				desiredCapabilities.setCapability("systemPort", systemPort);
				desiredCapabilities.setCapability("chromeDriverPort", chromeDriverPort);
				//String androidAppUrl = getClass().getResource(props.getProperty("androidAppLocation")).getFile();
				//utils.log().info("appUrl is" + androidAppUrl);
				//desiredCapabilities.setCapability("app", androidAppUrl);

				driver = new AndroidDriver(url, desiredCapabilities);

				break;

			case "iOS":
				desiredCapabilities.setCapability("automationName", props.getProperty("iOSAutomationName"));
				//String iOSAppUrl = getClass().getResource(props.getProperty("iOSAppLocation")).getFile();
				//utils.log().info("appUrl is" + iOSAppUrl);
				desiredCapabilities.setCapability("noReset", true);
				desiredCapabilities.setCapability("bundleId", props.getProperty("iOSBundleId"));
				desiredCapabilities.setCapability("wdaLocalPort", wdaLocalPort);
				desiredCapabilities.setCapability("webkitDebugProxyPort", webkitDebugProxyPort);
				desiredCapabilities.setCapability("JSONSource", "true");
				desiredCapabilities.setCapability("waitForQuiescence", "false");
				//desiredCapabilities.setCapability("app", iOSAppUrl);

				driver = new IOSDriver(url, desiredCapabilities);
				break;

			default:
				throw new Exception("Invalid platform! - " + platformName);
			}
			setDriver(driver);
			utils.log().info("driver initialized: " + driver);
			isScreenshot=props.getProperty("eachStepScreenShot");
			videoRecord=props.getProperty("videoRecording");
		} catch (Exception e) {
			utils.log().fatal("driver initialization failure. ABORT!!!\n" + e.toString());
			throw e;
		} finally {
			if(inputStream != null) {
				inputStream.close();
			}
			if(stringsis != null) {
				stringsis.close();
			}
		}
	}

	public void waitForVisibility(MobileElement e) {
		WebDriverWait wait = new WebDriverWait(getDriver(), TestUtils.WAIT);
		wait.until(ExpectedConditions.visibilityOf(e));
	}

	public void waitForVisibility(WebElement e){
		Wait<WebDriver> wait = new FluentWait<WebDriver>(getDriver())
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);

		wait.until(ExpectedConditions.visibilityOf(e));
	}

	public void clear(MobileElement e) {
		waitForVisibility(e);
		e.clear();
	}

	public void click(MobileElement e) {
		waitForVisibility(e);
		e.click();
	}

	public void click(MobileElement e, String msg) {

		waitForVisibility(e);
		
		
		e.click();
		//screenShot();
				utils.log().info("click on " +msg);
				ExtentReport.getTest().log(Status.INFO,"click on " +msg);
		screenShot();

	}

	public void sendKeys(MobileElement e, String txt) {
		waitForVisibility(e);
		e.sendKeys(txt);
		if(getPlatform().equalsIgnoreCase("iOS")) {
			new TouchAction(getDriver()).press(PointOption.point(113,100)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1))).release().perform();

		}
		screenShot();
	}

	public void sendKeys(MobileElement e, String txt, String msg) {
		waitForVisibility(e);
		utils.log().info("Enter " +msg +"." +"  " +msg +" : " +txt);
		ExtentReport.getTest().log(Status.INFO,"Enter " +msg +"." +"  " +msg +" : " +txt);
		e.clear();
		e.sendKeys(txt);
		if(getPlatform().equalsIgnoreCase("iOS")) {
			new TouchAction(getDriver()).press(PointOption.point(113,100)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1))).release().perform();

		}
		screenShot();

	}

	public void sendKeysWithEnterIos(MobileElement e, String txt, String msg) {
		waitForVisibility(e);
		utils.log().info("Enter " +msg +"." +"  " +msg +" : " +txt);
		ExtentReport.getTest().log(Status.INFO,"Enter " +msg +"." +"  " +msg +" : " +txt);
		if(getPlatform().equalsIgnoreCase("iOS")) {
			e.clear();
			e.sendKeys(txt);
			e.sendKeys(Keys.RETURN);
		}
		else if(getPlatform().equalsIgnoreCase("android")) {
			e.clear();
			e.sendKeys(txt);
		}
		screenShot();

	}

	@SuppressWarnings("deprecation")
	public void sendKeysAndEnter(MobileElement e, String txt, String msg) throws Throwable {
		waitForVisibility(e);
		utils.log().info( msg +"." +"  " +msg +" : " +txt);
		ExtentReport.getTest().log(Status.INFO, msg +"." +"  " +msg +" : " +txt);

		if(getPlatform().equalsIgnoreCase("iOS")) {
			e.clear();
			e.sendKeys(txt);
			screenShot();
			e.sendKeys(Keys.RETURN);
			//String command = "adb -s input keyevent KEYCODE_RETURN"; 
			//Process result = Runtime.getRuntime().exec(command);
			//new TouchAction(getDriver()).press(PointOption.point(113,100)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1))).release().perform();
		}
		else if(getPlatform().equalsIgnoreCase("android")) {
			e.clear();
			e.click();
			getDriver().getKeyboard().sendKeys(txt);
			screenShot();
			getDriver().getKeyboard().pressKey(Keys.ENTER);

		}
		else {
			utils.log().info("Invalid Platform");
			ExtentReport.getTest().log(Status.INFO, "Invalid Platform");
		}
		screenShot();

	}

	public String getAttribute(MobileElement e, String attribute) {
		waitForVisibility(e);
		return e.getAttribute(attribute);
	}

	public String getText(MobileElement e, String msg) {
		waitForVisibility(e);
		String txt = null;
		switch(getPlatform()) {
		case "Android":
			txt = getAttribute(e, "text");
			break;
		case "iOS":
			txt = getAttribute(e, "label");
			if(Strings.isNullOrEmpty(txt)) {
				txt = getAttribute(e, "value");
			}
			break;
		}
		utils.log().info( msg +" is " +txt);
		ExtentReport.getTest().log(Status.INFO, msg +" is " +txt);
		return txt;
	}


	public String getOTPText(MobileElement e, String msg, MobileElement e1) throws Throwable {
		String txt = null;
		int i=0;
		switch(getPlatform()) {
		case "Android":
			while(i<2) {
				System.out.println(i);
				try {

					//Wait<WebDriver> wait = new FluentWait<WebDriver>(getDriver()).withTimeout(Duration.ofSeconds(10))
					//		  .pollingEvery(Duration.ofSeconds(5))
					//		  .ignoring(StaleElementReferenceException.class);
					//wait.until(ExpectedConditions.visibilityOf(e));
					Thread.sleep(1000);
					txt = e.getAttribute("text");
					break;
				}
				catch(Exception E){  
					Thread.sleep(121000);
					click(e1);
				}
				i++;
			}
			// txt = getAttribute(e, "text");
			break;
		case "iOS":
			txt = getAttribute(e, "label");
			break;
		}
		utils.log().info(msg + txt);
		//ExtentReport.getTest().log(Status.INFO, msg);
		return txt;
	}



	public void quitApp() {
		getDriver().quit();
	}
	public void closeApp() {
		((InteractsWithApps) getDriver()).closeApp();
	}

	public void launchApp() {
		((InteractsWithApps) getDriver()).launchApp();
	}

	public MobileElement scrollToElement() {	  
		return (MobileElement) ((FindsByAndroidUIAutomator) getDriver()).findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()" + ".scrollable(true)).scrollIntoView("
						+ "new UiSelector().description(\"test-Price\"));");
	}

	public void iOSScrollToElement(MobileElement element) {
		//RemoteWebElement element = (RemoteWebElement)getDriver().findElement(By.name("test-ADD TO CART"));
		String elementID = element.getId();
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("element", elementID);
		scrollObject.put("direction", "left");
		//	  scrollObject.put("predicateString", "label == 'ADD TO CART'");
		//	  scrollObject.put("name", "test-ADD TO CART");
		scrollObject.put("toVisible", "sdfnjksdnfkld");
		getDriver().executeScript("mobile:scroll", scrollObject);
		screenShot();
	}

	public Boolean verticalSwipeTillElementDisplayed(MobileElement E,String msg) throws InterruptedException {
		int i=1;
		Boolean isDisplayed=false;;
		do {

			WebDriverWait wait = new WebDriverWait(getDriver(), 1);
			try {
				if (wait.until(ExpectedConditions.visibilityOf(E)) != null) {
					Assert.assertTrue(E.isDisplayed());
					utils.log().info(msg +" is displayed");
					ExtentReport.getTest().log(Status.INFO,msg +" is displayed"); 
					isDisplayed=true;

				}

				break;

			} catch (Exception NoSuchElementException) {
				Dimension size = getDriver().manage().window().getSize();

				int device_width = (int) (size.width);
				int device_height = (int) (size.height);
				int startY = (int) (device_height * 0.85);
				int endY = (int) (device_height * 0.5);
				int startX = (int) (device_width / 2);
				int endX = startX;
				TouchAction action=new TouchAction(getDriver());
				action.press(PointOption.point(startX, startY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500))).moveTo(PointOption.point(endX, endY)).release();
				getDriver().performTouchAction(action);
				screenShot();
				i++;
				//utils.log().info("Element Scroll");
				//ExtentReport.getTest().log(Status.INFO,"Element Scroll");  
			}
		} while (i<=4);
		return isDisplayed;
	}

	public void verticalSwipe(MobileElement E,String msg) throws InterruptedException {
		int i=1;
		Thread.sleep(3000);
		do {
			try {
				E.click();
				utils.log().info("Clicked on "+ " " +msg);
				ExtentReport.getTest().log(Status.INFO,"clicked on "+ " " +msg);

				break;

			} catch (Exception NoSuchElementException) {
				Dimension size = getDriver().manage().window().getSize();

				int device_width = (int) (size.width);
				int device_height = (int) (size.height);
				int startY = (int) (device_height * 0.95);
				int endY = (int) (device_height * 0.5);
				int startX = (int) (device_width / 2);
				int endX = startX;
				TouchAction action=new TouchAction(getDriver());
				action.press(PointOption.point(startX, startY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500))).moveTo(PointOption.point(endX, endY)).release();
				getDriver().performTouchAction(action);
				i++;
				utils.log().info("Element Scroll");
				ExtentReport.getTest().log(Status.INFO,"Element Scroll"); 
				screenShot();
			}
		} while (i<=4);
	}
	public void scrollHorizontal() throws InterruptedException {

		Dimension size = getDriver().manage().window().getSize();

		int device_width = (int) (size.width);
		int device_height = (int) (size.height);
		int startY = (int) (device_height * 0.47);
		int endY = startY;
		int startX = (int) (device_width * 0.95);
		int endX = (int) (device_width * 0.10);
		TouchAction action=new TouchAction(getDriver());
		action.press(PointOption.point(startX, startY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500))).moveTo(PointOption.point(endX, endY)).release();
		getDriver().performTouchAction(action);
		screenShot();
		utils.log().info("Element Scroll");
		//ExtentReport.getTest().log(Status.INFO,"Element Scroll");             

	}

	public void scrollToCard() throws InterruptedException {
		Thread.sleep(2000);
		Dimension size = getDriver().manage().window().getSize();

		int device_width = (int) (size.width);
		int device_height = (int) (size.height);
		int startY = (int) (device_height * 0.47);
		int endY = startY;
		int startX = (int) (device_width * 0.95);
		int endX = (int) (device_width * 0.55);
		TouchAction action=new TouchAction(getDriver());
		action.press(PointOption.point(startX, startY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500))).moveTo(PointOption.point(endX, endY)).release();
		getDriver().performTouchAction(action);
		utils.log().info("Element Scroll");
		screenShot();
		ExtentReport.getTest().log(Status.INFO,"Element Scroll");             

	}

	public Boolean elementDisplayed(MobileElement element,String msg) {

		Boolean isDisplayed=false;;
		WebDriverWait wait = new WebDriverWait(getDriver(), 3);
		try {
			if (wait.until(ExpectedConditions.visibilityOf(element)) != null) {
				Assert.assertTrue(element.isDisplayed());
				utils.log().info(msg +" is displayed");
				ExtentReport.getTest().log(Status.INFO,msg +" is displayed"); 
				isDisplayed=true;

			}
		} 
		catch (Exception e) {
			utils.log().info(msg +" is not displayed");
			ExtentReport.getTest().log(Status.INFO,msg +" is not displayed"); 
			isDisplayed=false;
		}
		return isDisplayed;
	}


	public Boolean elementDisplayedWithOutError(MobileElement element) {

		Boolean isDisplayed=false;;
		WebDriverWait wait = new WebDriverWait(getDriver(), 1);
		try {
			if (wait.until(ExpectedConditions.visibilityOf(element)) != null) { 
				isDisplayed=true;

			}
		} 
		catch (Exception e) {
			isDisplayed=false;
		}
		return isDisplayed;
	}

	public Boolean pageDisplayed(MobileElement element,String msg) {
		Boolean isDisplayed=false;
		for(int i=0; i<=2; i++){
			try {


				WebDriverWait wait = new WebDriverWait(getDriver(), 20);
				if (wait.until(ExpectedConditions.visibilityOf(element)) != null) {
					Assert.assertTrue(element.isDisplayed());
					isDisplayed=true;
					screenShot();
					utils.log().info(msg +" is displayed");
					ExtentReport.getTest().log(Status.INFO,msg +" is dipslayed"); 

				}
				else {
					isDisplayed=false;
					utils.log().info(msg +" is not displayed");
					ExtentReport.getTest().log(Status.INFO,msg +" is not displayed"); 
				}
				break;
			}
			catch(Exception e){
				System.out.println(e);

			}
		}

		return isDisplayed;


	}

	public void verifyText(String actualOutput,String data) {	



		if (actualOutput.equalsIgnoreCase(data)) {
			utils.log().info("Verifying Text!  Actual Text is" +actualOutput +"Expected Text is" +data);
			ExtentReport.getTest().log(Status.INFO,"Verifying Text!  : Actual Text : " +actualOutput + "  Expected Text : " +data);
		}

		else if(actualOutput.trim().replaceAll("\\s", "").equalsIgnoreCase(data.trim().replaceAll("\\s", ""))) {
			utils.log().info("Text matches with the given text");
			ExtentReport.getTest().log(Status.INFO,"Verifying Text!  : Actual Text : " +actualOutput + "  Expected Text : " +data);
		} else {
			utils.log().info("#### Text doesnot matches####");
			ExtentReport.getTest().fail("Text does not matches  - Expected: " + data + "\n - Actual: " + actualOutput);
		}

	}

	public void verifyTextContains(String actualOutput,String data) {	



		if (actualOutput.contains(data)) {
			utils.log().info("Verifying Text!  Actual Text is" +actualOutput +"Expected Text is" +data);
			ExtentReport.getTest().log(Status.INFO,"Verifying Text!  : Actual Text : " +actualOutput + "  Expected Text : " +data);
		}
		else {
			utils.log().info("#### Text doesnot matches####");
			ExtentReport.getTest().fail("Text does not matches  - Expected: " + data + "\n - Actual: " + actualOutput);
		}

	}

	public String randomString(String type,int size) 
	{
		String generatedString = null;
		switch(type) {

		case "alphabetic":
			generatedString=RandomStringUtils.randomAlphabetic(size);
			generatedString=generatedString.toLowerCase();

			break;

		case "alphanumeric":
			generatedString=RandomStringUtils.randomAlphanumeric(size);
			generatedString=generatedString.toLowerCase();
			break;

		case "numeric":
			generatedString=RandomStringUtils.randomNumeric(size);
			generatedString=generatedString.trim().replaceFirst("0", "5") ;
			break;  

		case "email":
			generatedString=RandomStringUtils.randomAlphabetic(size);
			generatedString=(generatedString.toLowerCase())+"@gmail.com";
			break;

		case "website":
			generatedString=RandomStringUtils.randomAlphabetic(size);
			generatedString="www."+(generatedString.toLowerCase())+".com";
			break;

		default:
			break;
		}
		return generatedString;
	}

	public void screenShot() {

		switch(isScreenshot) {

		case "false":

			break;


		case "true":
			File file = getDriver().getScreenshotAs(OutputType.FILE);
			BaseTest base = new BaseTest();

			byte[] encoded = null;
			try {
				encoded = Base64.encodeBase64(FileUtils.readFileToByteArray(file));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			Map <String, String> params = new HashMap<String, String>();
			//params = result.getTestContext().getCurrentXmlTest().getAllParameters();

			String imagePath = "Screenshots" + File.separator + params.get("platformName") 
			+ "_" + params.get("deviceName") + File.separator + getDateTime() + File.separator 
			+getDateTime()+ randomString("alphabetic",10) +randomString("numeric",7)+ ".png";

			String completeImagePath = System.getProperty("user.dir") + File.separator + imagePath;

			try {
				FileUtils.copyFile(file, new File(imagePath));
				Reporter.log("This is the sample screenshot");
				Reporter.log("<a href='"+ completeImagePath + "'> <img src='"+ completeImagePath + "' height='400' width='400'/> </a>");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				//ExtentReport.getTest().info("", 
				//		MediaEntityBuilder.createScreenCaptureFromPath(completeImagePath).build());
				ExtentReport.getTest().info("Screenshot", 
						MediaEntityBuilder.createScreenCaptureFromBase64String(new String(encoded, StandardCharsets.US_ASCII)).build());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		}

	}



	@AfterTest
	public void afterTest() {
		getDriver().quit();
	}
}

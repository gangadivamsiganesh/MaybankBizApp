package com.qa.reports;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.qa.BaseTest;
import com.qa.utils.TestUtils;

public class ExtentReport {
    static ExtentReports extent;
    TestUtils utils = new TestUtils();
    static BaseTest base = new BaseTest();
    final static String filePath = "Automation Report_"+base.getDateTime()+".html";
    static Map<Integer, ExtentTest> extentTestMap = new HashMap();
    
    public synchronized static ExtentReports getReporter() {
        if (extent == null) {
        	ExtentHtmlReporter html = new ExtentHtmlReporter("target" + File.separator +"Automation Report_"+base.getDateTime()+".html");
        	html.config().setDocumentTitle("SME_MAYA_BIZ");
        	html.config().setReportName("SME_MAYA");
        	html.config().setTheme(Theme.STANDARD);
            extent = new ExtentReports();
            extent.attachReporter(html);
        }
        
        return extent;
    }
    
    public static synchronized ExtentTest getTest() {
        return (ExtentTest) extentTestMap.get((int) (long) (Thread.currentThread().getId()));
    }

    public static synchronized ExtentTest startTest(String testName, String desc) {
        ExtentTest test = getReporter().createTest(testName, desc);
        extentTestMap.put((int) (long) (Thread.currentThread().getId()), test);
        return test;
    }
}

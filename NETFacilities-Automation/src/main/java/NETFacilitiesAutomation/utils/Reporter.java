package NETFacilitiesAutomation.utils;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import java.io.File;

import static NETFacilitiesAutomation.Main.test;
import static NETFacilitiesAutomation.Main.extent;
import static NETFacilitiesAutomation.utils.utilities.createDirectory;

public class Reporter {
    public static ExtentTest initializeReporter() throws Exception {
        createDirectory("D:\\NETFacilities-Automation", "Report");
        extent = new ExtentReports("D:\\NETFacilities-Automation\\Report\\Automation_Results.html", true);
        extent.loadConfig(new File("D:\\NETFacilities-Automation\\XML-Files\\extent-config.xml"));
        return test;
    }
    public static ExtentTest startReporter(String testName) {
        test = extent.startTest(testName);
        return test;
    }
    public static void endReporter() {
        extent.endTest(test);
    }
    public static void closeReporter() {
        extent.flush();
    }
}
package NETFacilitiesAutomation;
import NETFacilitiesAutomation.Module.Login;
import NETFacilitiesAutomation.Module.Myhome;
import NETFacilitiesAutomation.utils.Reporter;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static ExtentTest test;
    public static ExtentReports extent;
    public static void main(String[] args) throws Exception {
        Reporter.initializeReporter();
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Reporter.startReporter(" Login Screen");
        Login.execute(driver, test);
        Reporter.endReporter();

        Reporter.startReporter("Myhome Screen");
        Myhome.execute(driver, test);
        Reporter.endReporter();
        Reporter.closeReporter();
    }
}
